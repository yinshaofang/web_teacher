package day3.demo1;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
//注意：web目录是应用的根目录，src目录编译的class放在web/WEB-INFO/classes文件，
// 注意：WEB-INFO目录是安全，不能被浏览器直接访问的，可以通过转发方式来访问
public class A extends HttpServlet{
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("service.....");
        //转发访问WEB-INFO下的文件 框架会涉及到知识点
        req.getRequestDispatcher("/WEB-INF/a.jsp").forward(req,resp);
    }
}
