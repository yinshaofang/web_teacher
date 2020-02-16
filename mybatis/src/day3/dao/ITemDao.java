package day3.dao;

import day3.entity.Item;

public interface ITemDao {
    void insertItem(Item i);
    Item selectById(int id);
}
