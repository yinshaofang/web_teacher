package day2.url;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
//url重写技术：当客户端浏览器第一次访问服务器端但禁用cookie时，服务器端会创建session对象，产生sessionId，
// 但sessionId在客户端用不了
public class url extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String name = req.getParameter("name");//获取客户端的name
        req.getSession().setAttribute("name",name);//放到session对象中
        String id = req.getSession().getId();//获取sessionId
        System.out.println(id);
        //禁用cookie时
        //resp.sendRedirect(req.getContextPath()+"/day2/url/2.jsp");
        //1、方法一：重定向时，让客户端把servlet中的sessionId转给2.jsp,那么2的jsp就获取到session的值了。
        //resp.sendRedirect(req.getContextPath()+"/day2/url/2.jsp"+";jsessionid="+id);//分号不可丢
        //2、方法二：encodeURL()：返回出一个新的字符串等价于方法一（防止方法一拼写出问题）
        resp.sendRedirect(resp.encodeURL(req.getContextPath()+"/day2/url/2.jsp"));//重定向
    }
}
