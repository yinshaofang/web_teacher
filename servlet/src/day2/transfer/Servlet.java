package day2.transfer;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class Servlet extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("访问了servlet...");
        req.setAttribute("abc","it's lunch time!");
        //重定向
        resp.sendRedirect("/servlet/day2/transfer/s2");
        //req.getRequestDispatcher("/day2/transfer/s2").forward(req,resp);
    }
}
