package dao.impl;

import dao.UserDao;
import entity.User;
import jdbc.tmp.Tmp;
import mapper.UserMapper;

import java.sql.SQLException;
import java.util.List;

public class UserDaoImpl implements UserDao{

    @Override
    public int insertUser(User u) throws Exception {
        String sql = "insert into t_user (username,password,email) values(?,?,?)";
        return Tmp.update(sql,u.getUsername(),u.getPassword(),u.getEmail());
    }

    @Override
    public User selectUserByName(String username) throws SQLException {
        String sql = "select username un,password,email from t_user where username=?";
        List<User> list =  Tmp.query(sql,new UserMapper(),username);
        return list.isEmpty()?null:list.get(0);
    }

    @Override
    public User selectUserByEmail(String email) throws SQLException {
        String sql = "select username un,password,email from t_user where email=?";
        List<User> list =  Tmp.query(sql,new UserMapper(),email);
        return list.isEmpty()?null:list.get(0);
    }
}
