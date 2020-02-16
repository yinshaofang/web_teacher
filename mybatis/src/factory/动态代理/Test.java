package factory.动态代理;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class Test {
    public static void main1(String[] args) {
        UserDao imp = new UserDaoImpl();
        UserDaoProxy proxy = new UserDaoProxy();
        proxy.dao = imp;
        proxy.add();
    }

    public static void main(String[] args) {
        UserDao dao = new UserDaoImpl();
        //dao.add();
        System.out.println("动态代理的调用");
        Class c = dao.getClass();
        /*{
            InvocationHandler a= new JdkProxy(dao);
            UserDao proxy = new UserDao(){
                void add(){
                    a.invoke(this,add方法,add方法的参数);
                }
            }
         */
        UserDao proxy = (UserDao)Proxy.newProxyInstance(c.getClassLoader(),c.getInterfaces(),new InvocationHandler(){
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                System.out.println(method.getName()+"被执行了-----日志记录");
                return method.invoke(dao,args);
            }
        });
        proxy.add();
    }
}
