package day2.test;
/*
1.建表
创建dept表
    id
    name
* 创建表emp
*   id
*   name
*   salary
*   dept_id
*
* 2.添加两个实体类
* Dept
*   id
*   name
*
* Emp
*   id
*   name
*   salary
*   Dept dept
*
*3.mapper文件
* 3.1 deptMapper.xml
*   insertDept
*
* 3.2 EmpMapper.xml
*   insert into emp (name,salary,dept_id)values(#{name},#{dept.id})//e.getdept().getId()
*   insertEmp(Emp e)
*
* 4.添加接口
*  IDeptDao
*  IEmpDao
*
*===============================================
* 购物车管理
* 一个定单(Order:id,定单编号)有多个明细(Item:id,product,num,order_id)
* 1.建表
*   1.1 t_order
*       id
*       no
*   1.2 t_item
*       id
*       product varchar(40)
*       num int
*       order_id 外键，引用t_order中的id
*
*  2.实体类
*   Order
*       id
*       String no;
*       Set<Item>items = new HashSet<Item>();
*       方法:
*       public void addItem(Item item){
*           item.add(item);
*       }
*
*   3. 配置文件
*       3.1 orderMapper.xml
*       insertOrder(Order o)
*
*       3.2 ItemMapper.xml
*       insertItem
*
*
*    4. 接口
*
*    5. 测试
*
*
*
* */
public class Test3 {
}
