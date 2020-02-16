package mapper;

import entity.Data;
import jdbc.tmp.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class DataMapper implements RowMapper<Data>{

    @Override
    public Data mapRow(ResultSet r) throws SQLException {
        Data d = new Data();
        d.setKeyword(r.getString("keyword"));
        d.setMsg(r.getString("msg"));
        return d;
    }
}
