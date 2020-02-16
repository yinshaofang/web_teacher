package day5.练习;


import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
@WebServlet("/day5/exec/logout")
public class Logout extends HttpServlet{
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getSession().invalidate();//session失效
        resp.setContentType("text/html;charset=UTF-8");//设置字符集
        resp.getWriter().print("欢迎下次光临!");
    }
}
