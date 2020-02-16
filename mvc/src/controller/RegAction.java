package controller;

import com.mysql.jdbc.EscapeTokenizer;
import constant.Constant;
import entity.User;
import factory.ObjectFactory;
import mvc.annotation.RequestMapping;
import org.apache.commons.beanutils.BeanUtils;
import service.UserService;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.lang.reflect.InvocationTargetException;
import java.util.Map;

@RequestMapping("")
public class RegAction {
    @RequestMapping("/regHandle")
    public String reg(HttpServletRequest req, HttpServletResponse resp) throws InvocationTargetException, IllegalAccessException {
        System.out.println("访问了reg方法");
        User user = new User();
        Map<String,String[]> map = req.getParameterMap();
        BeanUtils.populate(user,map);

        UserService service = (UserService) ObjectFactory.getObject("userService");
        int flag = service.regUser(user);
        String msg="";
        if(flag== Constant.USER_EXISTS){
            msg = "用户名已经存在";
        }else if(flag==Constant.EMAIL_EXISTS){
            msg="邮箱已经存在";
        }else if(flag==Constant.SUCCESS){
            return "redirect:/login.do";
        }else {
            msg = "服务器忙，稍后再试....";
        }
        req.setAttribute("msg",msg);
        //return "/reg.do";
        return "reg";
    }
}
