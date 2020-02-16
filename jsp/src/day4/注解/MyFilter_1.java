package day4.注解;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;

/**
 * 注意:1、服务器启动，就创建过滤器，比创建Servlet要早
 *      2、配置文件情况时:过滤器如果有多个，按照名称顺序来逐个过滤
 *      3、注解情况时:如果有多个过滤器，先111begin，再222begin-->执行Servlet的内容-->先222end,再111end (类似有先后顺序的防火墙)
 * 过滤器加注解
 */
@WebFilter("/day4/ann/*")
public class MyFilter_1 implements Filter{
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {}

    @Override
    public void doFilter(ServletRequest req, ServletResponse res, FilterChain chain) throws IOException, ServletException {
        System.out.println("11111----begin----");
        chain.doFilter(req,res);
        System.out.println("11111----end----");
    }

    @Override
    public void destroy() {}
}
