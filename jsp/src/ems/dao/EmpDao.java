package ems.dao;

import ems.entity.Emp;
import ems.mapper.EmpMapper;
import util.Tmp;

import java.sql.SQLException;
import java.util.List;

public class EmpDao {
    public static boolean insert(Emp e) {
        String sql = "insert into "+
                "t_emp(name,salary,gender,edu,hobbies) "+
                "values(?,?,?,?,?);";
        int rs = 0;
        try {
            rs = Tmp.update(sql,e.getName(),e.getSalary(),e.getGender(),e.getEdu(),e.getHobbies());
        } catch (SQLException e1) {
            e1.printStackTrace();
        }
        return rs>0;
    }

    public static void deleteById(Integer id) {
        String sql = "delete from t_emp where id=?";
        try {
            Tmp.update(sql,id);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static Emp selectById(Integer id) {
        String sql = "select id,name,salary,gender,edu,hobbies "+
                "from t_emp where id=?";
        List<Emp>list = null;
        try {
            list = Tmp.query(sql,new EmpMapper(),id);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return list.isEmpty()?null:list.get(0);
    }

    public static boolean update(Emp e) {
        String sql = "update t_emp set name=?,salary=?,gender=?,edu=?,hobbies=? where id=?";
        int rs = 0;
        try {
            rs = Tmp.update(sql,e.getName(),e.getSalary(),e.getGender(),e.getEdu(),e.getHobbies(),e.getId());
        } catch (SQLException e1) {
            e1.printStackTrace();
        }
        return rs>0;
    }

    public static List<Emp> selectAll() {
        String sql = "select id,name,salary,gender,edu,hobbies "+
                "from t_emp";
        List<Emp>list = null;
        try {
            list = Tmp.query(sql,new EmpMapper());
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return list;
    }
}
