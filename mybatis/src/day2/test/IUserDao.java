package day2.test;

import day1.entity.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
//注解方式
public interface IUserDao {
    //sql语句
    @Select("select id,name name,pass,phone,address from t_user where id=#{id}")
    User selectById(Integer id);//方法

    @Select("select id,name,pass,phone,address from t_user where id=#{id}")
    @Results(//返回值
            value = {@Result(id=true,property = "id",column = "id"),
                    @Result(property = "name",column = "name")
    })
    User selectById_2(Integer id);

    @Insert("insert into t_user(name,pass,phone,address) values(#{name},#{pass},#{phone},#{address})")
    void insertUser(User u);
}
