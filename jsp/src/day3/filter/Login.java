package day3.filter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
//处理登录页面的Servlet
public class Login extends HttpServlet{
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String name = req.getParameter("name");
        req.getSession().setAttribute("name",name);
        //登录成功以后，重定向到ProductList的Servlet，在web.xml中需要配置路径
        resp.sendRedirect(req.getContextPath()+"/day3/filter/product.do");
    }
}
