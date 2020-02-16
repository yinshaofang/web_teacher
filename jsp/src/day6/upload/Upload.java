package day6.upload;

import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;
import java.io.IOException;

@WebServlet("/day6/upload")
@MultipartConfig//该注解可让当前servlet处理enctype="multipart/form-data"
public class Upload extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("utf-8");//post请求会乱码
        //获取一个文件上传项
        Part p = req.getPart("f");
        //获取所有文件项
        req.getParts();
        String tmp = p.getHeader("Content-Disposition");
        String fileName = tmp.split("\"")[3];
        p.write("C:\\Users\\windows\\Desktop\\笔记"+fileName);
        System.out.println(tmp);
        resp.sendRedirect(req.getContextPath()+"/day6/upload.jsp");
    }
}
