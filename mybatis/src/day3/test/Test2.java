package day3.test;

import day3.dao.ITemDao;
import org.apache.ibatis.session.SqlSession;
import util.Util;

public class Test2 {
    public static void main1(String[] args) throws InterruptedException {
        SqlSession s1 = Util.getSession();
        SqlSession s2 = Util.getSession();

        ITemDao dao1 = s1.getMapper(ITemDao.class);
        System.out.println(dao1.selectById(6));
        System.out.println("==================================");
        s1.commit();

        ITemDao dao2 = s2.getMapper(ITemDao.class);
        Thread.sleep(1000);
        System.out.println("dao1==dao2 ?" + (dao1 == dao2));
        System.out.println(dao2.selectById(6));
        System.out.println("第三次================");
        System.out.println(dao2.selectById(6));

    }

    public static void main(String[] args) {

        SqlSession s1 = Util.getSession();
        ITemDao dao1 = s1.getMapper(ITemDao.class);
        SqlSession s2 = Util.getSession();
        ITemDao dao2 = s2.getMapper(ITemDao.class);


        System.out.println(dao1.selectById(6));
        s1.commit();


        System.out.println("第二次查询");
        System.out.println(dao2.selectById(6));

    }
}
