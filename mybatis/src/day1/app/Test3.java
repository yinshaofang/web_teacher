package day1.app;

import day1.dao.IUserDao;
import day1.entity.User;
import org.apache.ibatis.session.SqlSession;
import util.Util;

//接口方式
public class Test3 {
    public static void main(String[] args) {
        //工具类
        SqlSession session = Util.getSession();
        //mapper自动实现IUser类，获取mapper配置文件
        IUserDao dao = session.getMapper(IUserDao.class);
        User u = dao.selectById(1);
        u = dao.selectByIdAndName(1,"admin");
        u = dao.selectByIdAndName_2(1,"admin");
        System.out.println(u);
    }
}
