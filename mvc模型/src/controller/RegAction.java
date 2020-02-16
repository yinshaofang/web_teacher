package controller;

import constant.Constant;
import entity.User;
import factory.ObjectFactory;
import mvc.annotation.RequestMapping;
import org.apache.commons.beanutils.BeanUtils;
import service.UserService;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.lang.reflect.InvocationTargetException;
import java.sql.SQLException;
import java.util.Map;

@RequestMapping("")
public class RegAction {
    @RequestMapping("/regHandle")
    public  String reg(HttpServletRequest req, HttpServletResponse resp) throws InvocationTargetException, IllegalAccessException {
        System.out.println("访问了reg方法");
        User user = new User();
        Map<String, String[]> map = req.getParameterMap();//复选框有多个name值
        BeanUtils.populate(user, map);//遍历map  注意：NoClassDefFoundError:一定是少加jar包
        // System.out.println(user);
        UserService service = (UserService) ObjectFactory.getObject("userService");
        int flag = 0;
        try {
            flag = service.regUser(user);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        String msg = "";
        if (flag == Constant.USER_EXISTS) {
            msg = "用户已经存在！";
        } else if (flag == Constant.EMAIL_EXISTS) {
            msg = "邮箱已经存在";
        } else if (flag == Constant.SUCCESS) {
            //1、调用service进行注册
            // 2、如果成功，重定向到login.jsp,同时把错误原因送到页面上
            return "redirect:/login.do";//login.do --》可以被ServletConfig拦截  login不会被拦截 直接
        } else {
            msg = "服务器忙,稍后再试...";
        }
        req.setAttribute("msg",msg);
        //return "/reg.do";//需要被Servlet拦截 再转发
        return "reg";//不需要拦截
    }
}
