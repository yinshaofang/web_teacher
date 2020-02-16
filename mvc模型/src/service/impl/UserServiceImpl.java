package service.impl;

import constant.Constant;
import dao.UserDao;
import entity.User;
import factory.ObjectFactory;
import service.UserService;

public class UserServiceImpl implements UserService {
    @Override
    public int regUser(User u) {
        UserDao dao = (UserDao) ObjectFactory.getObject("userDao");
        try {
          User tmp = dao.selectUserByName(u.getUsername());
            return dao.insertUser(u);
        } catch (Exception e) {
            e.printStackTrace();
            return Constant.ERROR;
        }
    }
}
