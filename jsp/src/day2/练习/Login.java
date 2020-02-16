package day2.练习;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class Login extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String name = req.getParameter("name");
        String pass = req.getParameter("pass");
        String rm = req.getParameter("rm");
        System.out.println("name:" + name + ",pass:" + pass + ",rm:" + rm);

        //用户名或密码不正确
        if(!("admin".equals(name)&&"123".equals(pass))){
            req.setAttribute("errMsg","用户名或密码不正确");
            //转发一次请求与响应 同一个页面中request对象相同 可以获取错误信息
            req.getRequestDispatcher("/day2/练习/login.jsp").forward(req,resp);
            return;
        }

        if(rm!=null){
            Cookie cn = new Cookie("name",name);
            Cookie cp = new Cookie("pass",pass);
            cn.setMaxAge(7*24*60*60);
            cp.setMaxAge(7*24*60*60);
            resp.addCookie(cn);
            resp.addCookie(cp);
        }
        //重定向是两次请求与响应，获取不了request对象，如果想要获取错误信息
        //一次会话 可以把错误信息放在session中
        resp.sendRedirect(req.getContextPath()+"/day2/练习/success.jsp");
    }
}
