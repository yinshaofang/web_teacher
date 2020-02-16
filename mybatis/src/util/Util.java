package util;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
//工具类
public class Util {
    static SqlSessionFactory factory;
    //静态代码块
    static {
        SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();
        factory=builder.build(Util.class.getClassLoader().getResourceAsStream("mb-config.xml"));
    }
    //获取连接
    public static SqlSession getSession(){
        return factory.openSession();
    }
    //关闭方法
    public static void closeSession(SqlSession session){
        if(session!=null){
            session.close();
        }
    }
}
