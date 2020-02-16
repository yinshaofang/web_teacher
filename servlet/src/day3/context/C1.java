package day3.context;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Enumeration;

public class C1 extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        ServletContext ctx = this.getServletContext();
        //作用1：获取应用路径
        System.out.println(ctx.getContextPath());

        //作用2：
        //获取全局参数
        Enumeration<String> e=ctx.getInitParameterNames();
        while(e.hasMoreElements()){
            String name = e.nextElement();
            System.out.println("name:" + name + ",value:" + ctx.getInitParameter(name));
        }

        //作用3：作为域对象，在不同servlet之间共享数据
        resp.sendRedirect(ctx.getContextPath()+"/day3/context/c2?name=abc&pass=123");
        String[]arr = {"a1","a2"};
        ctx.setAttribute("user",arr);

        //作用4:读取资源文件
        String path = ctx.getRealPath("/WEB-INF/classes/a.txt");

        InputStream is = ctx.getResourceAsStream("/WEB-INF/classes/a.txt");
        InputStreamReader isr = new InputStreamReader(is);
        BufferedReader br = new BufferedReader(isr);
        System.out.println(br.readLine());
        System.out.println(path);
    }
}
