package day5.练习;

import javax.servlet.ServletContext;
import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;
@WebListener
public class CountListener implements HttpSessionListener{
    int count;
    //登录
    public void sessionCreated(HttpSessionEvent e) {
        System.out.println("产生session.....");
        ServletContext sc = e.getSession().getServletContext();
        sc.setAttribute("count",++count);
    }

    @Override//退出
    public void sessionDestroyed(HttpSessionEvent e) {
        System.out.println("销毁session....");
        ServletContext sc = e.getSession().getServletContext();
        sc.setAttribute("count",--count);//-- 
    }
}
