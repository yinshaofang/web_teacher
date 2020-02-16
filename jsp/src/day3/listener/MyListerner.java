package day3.listener;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.ServletRequestEvent;
import javax.servlet.ServletRequestListener;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;
//监听器-->用来监听某种对象的创建与销毁或属性值的变化
//监听三个域对象：application（一次创建与销毁） session和request（多次实现和销毁）
// 利用反射技术，服务器启动后 application直接调用MyListerner的contextInitialized()方法等。。。
public class MyListerner implements ServletContextListener,HttpSessionListener,ServletRequestListener{

    @Override
    public void contextInitialized(ServletContextEvent e) {
        e.getServletContext();

        System.out.println("application被创建");
    }

    @Override
    public void contextDestroyed(ServletContextEvent servletContextEvent) {
        System.out.println("application被销毁");
    }
    @Override
    public void sessionCreated(HttpSessionEvent e) {
        //可能会执行多次，session对象会多次产生
        System.out.println("session创建了");
        e.getSession();//获取session
    }

    @Override
    public void sessionDestroyed(HttpSessionEvent httpSessionEvent) {
        //多次被销毁
        System.out.println("session被销毁");
    }
    @Override//request多次创建和销毁
    public void requestInitialized(ServletRequestEvent servletRequestEvent) {
        System.out.println("request被创建。。。");
    }

    @Override
    public void requestDestroyed(ServletRequestEvent servletRequestEvent) {
        System.out.println("request被销毁...");
    }


}
