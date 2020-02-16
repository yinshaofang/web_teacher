package day1.demo2_乱码;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintWriter;

public class Test  extends HttpServlet{
    //字节流乱码问题
    protected void 字节流(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        OutputStream out = resp.getOutputStream();
        System.out.println("关公战秦琼".getBytes().length);
        resp.setHeader("content-type","text/html;charset=utf-8");
        out.write("关公战秦琼".getBytes("utf8"));
    }

    protected void 字符流响应乱码(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html;charset=gbk");
        //默认采用iso-8859-1编码格式转为多个字节，存储在响应缓冲区中
//        resp.setCharacterEncoding("utf8");
//        resp.setHeader("content-type","text/html;charset=utf8");

        PrintWriter out = resp.getWriter();
        out.write("哈喽");
        out.println("hello");
    }

    protected void post请求的乱码(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("utf8");
        System.out.println("name="+req.getParameter("n1"));
    }

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("name="+req.getParameter("n1"));
    }
}
