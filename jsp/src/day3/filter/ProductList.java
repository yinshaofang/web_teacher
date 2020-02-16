package day3.filter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
//处理产品展示的页面
public class ProductList extends HttpServlet{
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("调用service获取产品信息...");
        //转发到具体产品展示页面
        req.getRequestDispatcher("/WEB-INF/productList.jsp").forward(req,resp);
    }
}
