package day4.注解;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * 用注解来代替配置web.xml
 *
 * value：路径
 * initParams:配置参数（多个对象）
 *WebInitParam（键值对）:一个html标签
 */
//@WebServlet(value = "/day4/ann/hello",initParams ={@WebInitParam(name="driver",value = "mysql"),@WebInitParam(name="url",value="locahost")} )
@WebServlet("/day4/ann/hello") //（省略value,如果给一个值，不指定给谁赋值，默认是value,常见）
public class Hello extends HttpServlet{
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("this is my servlet.....");
        ServletConfig cfg = this.getServletConfig();//获取配置
        System.out.println("driver:" + cfg.getInitParameter("driver"));
    }
}
