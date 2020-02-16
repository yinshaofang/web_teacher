package day2.dao;

import day2.entity.Emp;

import java.util.List;

public interface IEmpDao {
    void insertEmp(Emp e);

    List<Emp> selectAllEmp();

}
