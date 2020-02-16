package day2.request;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Enumeration;

public class Test1 extends HttpServlet{
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("utf8");
        System.out.println(req.getParameter("user"));

        String[]arr = req.getParameterValues("hobbies");
        System.out.println(Arrays.toString(arr));
        System.out.println("应用路径："+req.getContextPath());
        System.out.println("url-pattern:"+req.getServletPath());
        System.out.println("地址栏url:"+req.getRequestURL());
        System.out.println("contextPath+servletPath:"+req.getRequestURI());

        req.setAttribute("abc","hello");
        req.setAttribute("1-2-3","one-two-three");
        req.getAttribute("abc");
        Enumeration<String> e = req.getAttributeNames();
        System.out.println(req.getMethod());
        System.out.println(req.getProtocol());
        System.out.println("===========================");
        e = req.getHeaderNames();
        while (e.hasMoreElements()){
            System.out.println(e.nextElement());
        }
        PrintWriter out = resp.getWriter();
    }
}
