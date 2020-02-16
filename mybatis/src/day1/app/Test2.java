package day1.app;

import day1.entity.User;
import org.apache.ibatis.session.SqlSession;
import util.Util;

import java.util.List;
//封装的工具
public class Test2 {
    //模糊查询
    public static void select(String[] args) {
        SqlSession session = Util.getSession();
        List list = session.selectList("day1.dao.UserDao.selectByName","%m%");
        System.out.println(list);
        Util.closeSession(session);
    }
    //插入数据
    public static void main(String[] args) {
        SqlSession session = Util.getSession();
        User u = new User();
        u.setName("tom");
        u.setPass("123");
        u.setPhone("139");
        u.setAddress("南京");
        session.insert("day1.dao.UserDao.inserUser",u);//插入数据
        System.out.println(u);
        session.commit();//提交到数据库
        Util.closeSession(session);

    }
}
