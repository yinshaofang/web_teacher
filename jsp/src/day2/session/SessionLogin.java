package day2.session;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
//jsp九大内置对象--》session是第二会话技术，第一会话技术是cookie，不是内置对象，cookie是服务器写到客户端的信息，不是自己产生的
//session是一次会话有效，生命周期30分钟有效 服务器端默认行为
//客户端向服务器端发一次request请求，
//1、当客户端第一次请求头中没有sessionId,服务器端会自动创建session对象，响应给客户端sessionId,客户端一直刷新请求，
// 并携带cookie中存在sessionId，服务器不会再创建session对象（服务器端有很多的session，标记sessionid对应不同的客户端）
// 注意：在30分钟内关闭浏览器，服务器端的session对象是存在的
// 2、如果你再次打开浏览器，请求头中没有sessionid，那么服务器端重新创建session对象，响应给客户端sessionId，
// 并且响应的范围path路径是整个web应用项目路径，session是存在cookie技术中
//面试题:服务器什么时候会创建session对象：1、客户端浏览器发第一次请求时，服务器会自动创建
// 2、浏览器30分钟没有刷新，sessionId过期，服务器会重新创建session对象
//session销毁：超过30分钟session失效，注意:浏览器关闭，不会销毁服务器端的session

public class SessionLogin extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String user = req.getParameter("user");
        req.setAttribute("u",user);
        HttpSession session = req.getSession();//参数默认是true 没有session就创建有就返回    false：有返回没有null
        session.setAttribute("u",user);//把user放入session对象中
        //作用域最大，Tomcat服务器一启动就产生application对象
        this.getServletContext().setAttribute("u",user);
        //转发 一次请求与响应，jsp本质上是servlet request和session是同一个
        req.getRequestDispatcher("/day2/session/success.jsp").forward(req,resp);
    }
}
