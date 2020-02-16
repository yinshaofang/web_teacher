package service;

import entity.User;

import java.sql.SQLException;

public interface UserService {
    //注册
   int regUser(User u) throws SQLException;
}
