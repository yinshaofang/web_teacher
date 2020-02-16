package controller;

import mvc.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 键值对 放到map中
 * 注解原理通过反射实现的
 * key:/a/regHandle
 * value:reg方法
 */
@RequestMapping("/a")
public class A {
    @RequestMapping("/regHandle")
    public  String reg(HttpServletRequest req, HttpServletResponse resp){
        System.out.println("访问了reg方法");//localhost/mvc/a/regHandle.do
        //不经过DispatcherServlet拦截，实质是上服务器内部转发，WEB-INF/pages/a.jsp页面
        return "a";
    }
    @RequestMapping("/loginHandle")
    public String login(HttpServletRequest req, HttpServletResponse resp){
        //被DispatcherServlet拦截后有三种情况：
        //情况一：转发到/hello.do 实质上是再转发一次  rg.addViewController("hello","/hello");
       //情况二：如果MyConfig中没有rg.addViewController("hello","/hello"); 则再扫描其他类中/hello
      // return "/hello.do";
        //情况三:重定向
        return "redirect:/hello.do";
    }
}
