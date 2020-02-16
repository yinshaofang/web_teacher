package day1.dao;

import day1.entity.User;
import org.apache.ibatis.annotations.Param;

//面向接口编程，实现类就是mapper
public interface IUserDao {
    User selectById(Integer id);
    User selectByIdAndName(Integer id,String name);
    //用来标识在xml的占位符中要用userid和username 一般不建议使用
    User selectByIdAndName_2(@Param("userid") Integer id, @Param("username") String name);
}
