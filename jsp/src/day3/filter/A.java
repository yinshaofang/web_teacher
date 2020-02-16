package day3.filter;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
/**过滤器：是web规范中的一种类型,用于在servlet执行前或后添加一些附加功能:
 字符集设置：不用在每个servlet中设置字符编码
 权限控制：没有权限就不能执行某种操作
 登录校验：有些功能如果没登录就不能执行

用户先登录页面 -》登录模块 --》过滤器（检查用户必须登录权限、设置字符集）--》产品展示模块（产品展示页面不能被浏览器访问）

 */
public class A implements Filter{
    FilterConfig cfg;
    //在服务器启动时，会自动产生Filter实例，并调用init
    public void init(FilterConfig filterConfig) throws ServletException {
        System.out.println("过滤器的init方法被执行....");
        this.cfg = filterConfig;
    }

    @Override //HttpServletRequest是ServletRequest的子类，Tomcat想拦截其他的协议不仅是Http协议 所以用ServletRequest
    public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain) throws IOException, ServletException {
        System.out.println("do filter被执行了");
        String ecode = cfg.getInitParameter("encode");
        System.out.println("编码设置为:" + ecode);
        //过滤器重要作用是解决编码问题可以用于post请求，Tomcat8已经解决了get请求乱码
        req.setCharacterEncoding(ecode);//需要在web.xml中配置utf-8,不然抛异常，页面报错500
        HttpServletRequest request = (HttpServletRequest)req;
        //从session中获取name值
        String name = (String)request.getSession().getAttribute("name");
        //判断是否登录
        if(name==null){//未登录
             //服务器内部的转发
            req.getRequestDispatcher("/day3/filter/login.jsp").forward(req,resp);
        }else{//已登录  在浏览器不关闭（一次会话）中，可以打开多个过滤的那个页面
            chain.doFilter(req,resp);//一个或多个过滤器，必须通过才能访问其过滤的Servlet
        }
    }

    @Override
    public void destroy() {
        System.out.println("====================过滤器将要被销毁=======================");
    }
}
