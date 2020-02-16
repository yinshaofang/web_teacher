package day1.app;

import day1.entity.User;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.util.List;

public class Test1 {
    public static void main(String[] args) {
        //1.创建buider对象，用来读取配置文件
        SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();
        SqlSessionFactory factory = builder.build(Test1.class.getResourceAsStream("mb-config.xml"));

        //2.获取sqlSession对象：是mybatis的核心对象，也叫会话对象
        SqlSession session = factory.openSession();

        //3.执行操作,selectOne查询出一行内容，selectList查询出多行内容
        User u = (User)session.selectOne("day1.dao.UserDao.selectById",1);//查询一行
        List list = session.selectList("day1.dao.UserDao.selectAll");//查询多行
        System.out.println(list);
        session.close();//关闭session

    }
}
