package day3.test;

import day3.dao.IOrderDao;
import day3.dao.ITemDao;
import day3.entity.Item;
import day3.entity.Order;
import org.apache.ibatis.session.SqlSession;
import util.Util;

import java.util.Random;

public class OrderTest {
    static SqlSession session = Util.getSession();
    static IOrderDao orderDao = session.getMapper(IOrderDao.class);
    static ITemDao iTemDao = session.getMapper(ITemDao.class);

    //产生订单号
    static String getNo(){
        Random r = new Random();
        StringBuilder sb = new StringBuilder();
        for(int i =0;i<4;i++){
            if(r.nextBoolean()){
                sb.append((char)('a'+r.nextInt(26)));
            }else{
                sb.append((char)('A'+r.nextInt(26)));
            }
        }
        return sb.toString();
    }

    public static void insert() {
        Order order = new Order();
        order.setNo(getNo());

        Item i1 = new Item();
        i1.setProduct("电视");
        i1.setNum(2);
        i1.setOrder(order);

        Item i2 = new Item();
        i2.setProduct("空调");
        i2.setNum(3);
        i2.setOrder(order);

        orderDao.insertOrder(order);//3个order对象都是内存中的同一个 id

          //注意顺序，先插入order 所以有了id的值
        iTemDao.insertItem(i1);
        iTemDao.insertItem(i2);
        session.commit();
    }

    static void searchWithSession(SqlSession session){
        ITemDao itemDao = session.getMapper(ITemDao.class);
        System.out.println(itemDao.selectById(5));
    }

    public static void main1(String[] args) {
        //searchWithSession(session);
        System.out.println(orderDao.selectById(3));//一对多查询
    }

    public static void main(String[] args) throws InterruptedException {
        SqlSession session = Util.getSession();
        searchWithSession(session);

        Item i3 = new Item();
        i3.setProduct("冰箱");
        i3.setNum(3);
        ITemDao iTemDao = session.getMapper(ITemDao.class);
        iTemDao.insertItem(i3);
        session.commit();//同一个session执行增删改会清空该session的缓冲区。session不会相互影响

        Thread.sleep(500);
        System.out.println("======================================================");
        searchWithSession(session);
    }
}
