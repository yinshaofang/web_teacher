package day1.demo1;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/day1/demo1/serv")
public class Serv extends HttpServlet{
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("service....");
        resp.setContentType("text/html;charset=utf8");
        PrintWriter out = resp.getWriter();
        String name = req.getParameter("name");
        System.out.println("得到的参数为："+name);

        try{
            Thread.sleep(2000);
        }catch (Exception e){
            e.printStackTrace();
        }
        int i=1/0;  //500
        out.print("<font color='red'>hello:"+name+"</font>");
    }
}
