package day3.context;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class C2 extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println(req.getParameter("name"));
        System.out.println(req.getParameter("pass"));
        ServletContext ctx = getServletContext();
        String[]arr = (String[])ctx.getAttribute("user");
        for(String t:arr){
            System.out.println(t);
        }
        ctx.removeAttribute("a1");

    }
}
