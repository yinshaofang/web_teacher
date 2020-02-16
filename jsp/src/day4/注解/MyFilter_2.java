package day4.注解;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;
//过滤器
@WebFilter("/day4/ann/hello")
public class MyFilter_2 implements Filter{
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {}

    @Override
    public void doFilter(ServletRequest req, ServletResponse res, FilterChain chain) throws IOException, ServletException {
        System.out.println("222222-----begin------");
        chain.doFilter(req,res);
        System.out.println("222222-----end------");
    }

    @Override
    public void destroy() {}
}
