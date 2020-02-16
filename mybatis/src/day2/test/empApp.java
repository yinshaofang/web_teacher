package day2.test;

import day2.dao.IDeptDao;
import day2.dao.IEmpDao;
import day2.entity.Dept;
import day2.entity.Emp;
import org.apache.ibatis.session.SqlSession;
import util.Util;

public class empApp {
    public static void main(String[] args) {
        SqlSession session = Util.getSession();
        Class c = IDeptDao.class;
        System.out.println("==================================="+c.getName());//获取名字
        IDeptDao deptDao = session.getMapper(IDeptDao.class);//对象
        IEmpDao empDao = session.getMapper(IEmpDao.class);

        //插入dept
        Dept d = new Dept();
        d.setName("研发4部");
        deptDao.insertDept(d);
        System.out.println("插入的部门信息----"+d);

        Emp e1 = new Emp();
        e1.setName("钱鹏飞");
        e1.setSalary(10000.0);
        e1.setDept(d);

        Emp e2 = new Emp();
        e2.setName("高乐刚");
        e2.setSalary(5000.0);
        e2.setDept(d);

        empDao.insertEmp(e1);
        empDao.insertEmp(e2);
        System.out.println("===========所有员工信息如下================");
        System.out.println(empDao.selectAllEmp());
        session.commit();
        session.close();

    }
}
