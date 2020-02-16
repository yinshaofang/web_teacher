package factory;

import org.apache.ibatis.session.SqlSession;

import java.io.BufferedReader;

import java.io.InputStreamReader;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.HashMap;
import java.util.Map;

public class ObjectFactory {
    static Map<String,Object> objs = new HashMap<>();
    static {
        BufferedReader br;
        try {
            br = new BufferedReader(new InputStreamReader(ObjectFactory.class.getClassLoader().getResourceAsStream("objects-mybatis.txt")));
            String s;
            while((s=br.readLine())!=null){
                String[]entry = s.split("=");
                if(entry.length!=2){
                    continue;
                }
                String key = entry[0].trim();
                String value = entry[1].trim();
                Class<?> c = Class.forName(value);

                //当class对象是接口类型时，则直接向map中添加class类型对象
                if(c.isInterface()){
                    objs.put(key,c);
                    continue;
                }
                objs.put(key,c.newInstance());
            }
        } catch (Exception e) {
            e.printStackTrace();
            throw new ExceptionInInitializerError("对象工厂初始化错误!"+e);
        }
    }

    public static Object getObject(String key){
        Object obj = objs.get(key);
        if(obj instanceof Class){
            SqlSession session = Util.getSession();
            //秘书类对象
            Object dao = session.getMapper((Class)obj);
            //代理类(老板)对象
            Object daoProxy = Proxy.newProxyInstance(dao.getClass().getClassLoader(),new Class[]{(Class)obj},new InvocationHandler(){
                public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                    Object result=null;
                    try{
                        result = method.invoke(dao,args);
                    }catch (Exception e){
                        e.printStackTrace();
                        throw new RuntimeException("数据库访问失败",e);
                    }
                    return result;
                }
            });
            return daoProxy;
        }
        return obj;
    }
}
