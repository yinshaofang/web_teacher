package day1.cookie;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


public class C extends HttpServlet{
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String contextPath = req.getContextPath();
        String servletPath = req.getServletPath();
        String urlPath = req.getRequestURI();
        System.out.println("ser:"+servletPath+",con:"+contextPath+",url:"+urlPath);

        if(urlPath.contains("add")){
            //把其服务器的路径或其直系父类的路径发到客户端
            add(req,resp);
        }else if(urlPath.contains("select")){
            select(req,resp);
        }else if(urlPath.contains("delete")){
            delete(req,resp);
        }else if(urlPath.contains("modify")){
            modify(req,resp);
        }

    }

    private void modify(HttpServletRequest req, HttpServletResponse resp) {
        Cookie c = new Cookie("username","hello");//修改用户  传递给客户端
        resp.addCookie(c);
    }

    private void delete(HttpServletRequest req, HttpServletResponse resp) {
        //删除autoLogin的cookie
        //cookie服务器不能删除客户端的cookie，设置值覆盖原来的cookie
        Cookie c = new Cookie("autLogin","214u");
        c.setPath("/jsp/day1");//设置父路径，否则改不了
        c.setMaxAge(0);//在客户端只能存活时间设置为0（等同删除）
        resp.addCookie(c);//返给客户端
    }

    private void select(HttpServletRequest req, HttpServletResponse resp) {
        Cookie[]arr = req.getCookies();
        for(Cookie c:arr){
            System.out.println(c.getName() + ":" + c.getValue());
        }
    }

    private void add(HttpServletRequest req, HttpServletResponse resp) {
        //把其服务器的路径或其直系父类的路径发到客户端 客户端可以查看到路径
        Cookie c = new Cookie("username","admin");
        resp.addCookie(c);
        c = new Cookie("pass","123");
        c.setPath("/jsp/day1/exception/Test1");
        resp.addCookie(c);

        c = new Cookie("autLogin","true");
        c.setPath("/jsp/day1");
        resp.addCookie(c);
    }
}
