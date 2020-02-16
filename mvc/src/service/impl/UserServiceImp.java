package service.impl;

import constant.Constant;
import dao.UserDao;
import entity.User;
import factory.ObjectFactory;
import service.UserService;
//select password from t_user where username=?
public class UserServiceImp implements UserService {
    @Override
    public int regUser(User u) {
        UserDao dao = (UserDao) ObjectFactory.getObject("userDao");
        try {
            User tmp = dao.selectUserByName(u.getUsername());
            if(tmp!=null){
                return Constant.USER_EXISTS;
            }

            tmp=dao.selectUserByEmail(u.getEmail());
            if(tmp!=null){
                return Constant.EMAIL_EXISTS;
            }

            return dao.insertUser(u)>0?Constant.SUCCESS:Constant.ERROR;
        } catch (Exception e) {
            e.printStackTrace();
            return Constant.ERROR;
        }
    }
}
