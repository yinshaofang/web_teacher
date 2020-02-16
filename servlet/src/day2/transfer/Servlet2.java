package day2.transfer;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class Servlet2 extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("servet2.....");
        System.out.println("servlet2收到的参数为："+req.getAttribute("abc"));
        int a = 1/0;
        resp.getWriter().write("this is response");
    }
}
