package day2.生命周期;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Enumeration;

@WebServlet(name = "Said")
public class Said extends HttpServlet {
    //@Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("这是我自己的service");
        ServletConfig config=this.getServletConfig();
        System.out.println(config.getInitParameter("blackIp"));
        System.out.println("用户IP:"+req.getRemoteAddr());
        //获取所有key的枚举器
        Enumeration<String> e = config.getInitParameterNames();
        while(e.hasMoreElements()){
            String name=e.nextElement();
            String value=config.getInitParameter(name);
            System.out.println(name + ":" + value);
        }
    }

    @Override
    public void init() throws ServletException {
        System.out.println("hello world");
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("这是一个get请求.,,...");
    }

    @Override
    public void destroy() {
        System.out.println("==============================================我被销毁了....");
    }
}
