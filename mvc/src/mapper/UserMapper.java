package mapper;

import entity.User;
import jdbc.tmp.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class UserMapper implements RowMapper<User>{
    @Override
    public User mapRow(ResultSet r) throws SQLException {
        User u = new User();
        u.setUsername(r.getString("un"));
        u.setPassword(r.getString("password"));
        u.setEmail(r.getString("email"));
        return u;
    }
}
