package factory.动态代理;

import day1.entity.User;

import java.util.Date;

public class UserDaoProxy implements UserDao{
    UserDao dao;
    @Override
    public void add() {
        System.out.println("执行add方法时间："+new Date());
        dao.add();
    }

    @Override
    public void update() {

    }
}
