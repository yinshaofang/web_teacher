package day2.test;

import day1.entity.User;
import day2.UserDao;
import org.apache.ibatis.session.SqlSession;
import util.Util;

public class Test2 {
    public static void main(String[] args) {
        SqlSession session = Util.getSession();
        IUserDao dao = session.getMapper(IUserDao.class);
        //System.out.println(dao.selectById(1));
        User u = new User();
        u.setName("hello");
        dao.insertUser(u);
        session.commit();
        session.close();
    }
}
