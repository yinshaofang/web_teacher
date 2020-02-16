package day3.dao;

import day3.entity.Order;
import org.apache.ibatis.annotations.Param;

public interface IOrderDao {
    void insertOrder(Order o);
    /*一对多查询，根据order的id查询order对象及其内部的item对象
    * */
    Order selectById(@Param("id") int id);
}
