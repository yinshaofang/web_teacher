package day3.listener;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
//获取session 设置session的销毁
public class Test extends HttpServlet{
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("service.....");
        HttpSession session = req.getSession();
        //session.invalidate();//销毁
        session.setMaxInactiveInterval(15);//设置session最大存活的时间 单位是秒

    }
}
