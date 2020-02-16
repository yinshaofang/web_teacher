package dao;

import entity.User;

import java.sql.SQLException;

public interface UserDao {
    int insertUser(User u)throws Exception;

    User selectUserByName(String username) throws SQLException;
}
