package ems.mapper;

import ems.entity.Emp;
import util.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class EmpMapper implements RowMapper<Emp>{
    @Override
    public Emp mapRow(ResultSet rs) throws SQLException {
        return new Emp(rs.getInt("id"),rs.getString("name"),rs.getDouble("salary"),rs.getString("gender"),rs.getString("edu"),rs.getString("hobbies"));
    }
}
