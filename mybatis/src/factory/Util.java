package factory;

import org.apache.ibatis.session.*;

import java.sql.Connection;

public class Util {
    private static SqlSessionFactory sf;
    private static ThreadLocal<SqlSession>threadLocal;
    static {
        try {
            threadLocal = new ThreadLocal<>();
            sf = new SqlSessionFactoryBuilder().build(Util.class.getClassLoader().getResourceAsStream("mb-config.xml"));
        }catch(Exception e){
            e.printStackTrace();
            throw new ExceptionInInitializerError("Util类初始化错误");
        }
    }
    public static  SqlSession getSession(){
        SqlSession session = threadLocal.get();
        try{
            if(session==null){
                session = sf.openSession();
                threadLocal.set(session);
            }
        }catch (Exception e){
            throw new RuntimeException("获取sqlsession失败",e);
        }
        return session;
    }

    public static void closeSession(){
        SqlSession s = threadLocal.get();
        if(s!=null){
            s.close();
            threadLocal.remove();
        }
    }

}
