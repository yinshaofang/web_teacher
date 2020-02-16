package day4;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Enumeration;

@WebServlet("/day4/el/Test")
public class Test extends HttpServlet{
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getServletContext().setAttribute("name",req.getParameter("name"));
        System.out.println(req.getParameterValues("name")[1]);
        req.getRequestDispatcher("/day4/el/suc.jsp").forward(req,resp);
        //resp.sendRedirect(req.getContextPath()+"/day4/el/suc.jsp");
        Enumeration<String> headers = req.getHeaderNames();
        while(headers.hasMoreElements()){
            String key = headers.nextElement();
            String value = req.getHeader(key);
            System.out.println("key:"+key+",value:"+value);
        }
    }
}
