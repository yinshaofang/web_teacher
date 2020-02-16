package day6.upload;

import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;
import java.io.IOException;
import java.util.Date;

@WebServlet("/day6/up_home")
@MultipartConfig//该注解可让当前servlet处理enctype="multipart/form-data"
public class Up_home extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("utf-8");
        //获取一个文件上传项
        Part p = req.getPart("file");
        String tmp = p.getHeader("Content-Disposition");
        String fileName = tmp.split("\"")[3];
        String path = this.getServletContext().getRealPath("/"+fileName);// / 代表的是web目录(即项目目录)
        // C:\Users\windows\IdeaProjects\web_teacher\out\artifacts\jsp_war_exploded\dog3.jpg
        System.out.println("文件真实路径："+path);
        p.write(path);
        //把路径放在session中，注意jsp不能直接访问服务器的图片，再重定向（即再次需要刷新）
        // 图片上传成功，页面不能加载出图片方法：1、服务器：再重定向（即再次需要刷新），加个时间参数id可以让浏览器刷新
                                       //   2、js通过random生成一个随机数来改变src的值，让其重新加载
        req.getSession().setAttribute("src",req.getContextPath()+"/"+fileName+"?id="+new Date().getTime());
        resp.sendRedirect(req.getContextPath()+"/day6/up/a.jsp");
    }
}
