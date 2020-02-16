package ems.controller;

import ems.dao.EmpDao;
import ems.entity.Emp;
import ems.util.Util;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet("*.emp")
public class EmpServlet extends HttpServlet{
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
       //处理响应乱码设置
        resp.setContentType("text/html;charset=utf8");
        req.setCharacterEncoding("utf8");//处理post请求乱码
        String path = req.getRequestURI();//获取整个路径
        if(path.contains("add")){
            Emp e = Util.getEmp(req);
            EmpDao.insert(e);//调用dao中的插入方法
        }else if(path.contains("delete")){
            String id = req.getParameter("id");
            EmpDao.deleteById(Integer.valueOf(id));//删除方法
        }else if(path.contains("showModify")){//查询
            String id = req.getParameter("id");
            Emp e = EmpDao.selectById(Integer.valueOf(id));
            req.setAttribute("emp",e);
            req.getRequestDispatcher("/ems/showModifyEmp.jsp").forward(req,resp);
            return;//不准在Servlet中两次转发
        }else if(path.contains("modify")){//修改
            Emp e = Util.getEmp(req);//获取
            EmpDao.update(e);
        }
        List<Emp>list = EmpDao.selectAll();
        req.setAttribute("list",list);
        System.out.println("servlet中查出的数据："+list);
        req.getRequestDispatcher("/ems/empList.jsp").forward(req,resp);
    }
}
