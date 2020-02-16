package day2.test;

import day1.entity.User;
import day2.UserDao;
import org.apache.ibatis.session.SqlSession;
import util.Util;

import java.util.ArrayList;
import java.util.List;

public class Test1 {
    public static void main(String[] args) {
        SqlSession session = Util.getSession();
        UserDao dao = session.getMapper(UserDao.class);
        User u = new User();//创建对象
        u.setId(1);//赋值
        u.setPass("1234");
        //System.out.println(dao.selectByParam_4(u));
        //dao.updateByTrim(u);
        //session.commit();
        //dao.updateByParm(u);


        List<Integer> ids = new ArrayList<>();
        ids.add(1);
        ids.add(2);
        ids.add(3);
        dao.selectByIds(ids);
        session.close();
    }
}
