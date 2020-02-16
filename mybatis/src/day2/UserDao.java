package day2;

import day1.entity.User;

import java.util.List;

public interface UserDao {
    List<User> selectByParam(User u);
    List<User> selectByParam_2(User u);
    List<User> selectByParam_3(User u);
    void updateByParm(User u);
    List<User> selectByParam_4(User u);
    void updateByTrim(User u);
    List<User> selectByIds(List<Integer> list);
}
