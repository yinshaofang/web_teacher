package controller;

import mvc.annotation.RequestMapping;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
/*
key:/a/regHandle
value:reg
* */
@RequestMapping("a")
public class A {
    @RequestMapping("/regHandle")
    public String reg(HttpServletRequest req, HttpServletResponse resp){
        System.out.println("访问了reg方法");

        return "a";
    }

    @RequestMapping("/loginHandle")
    public String login(HttpServletRequest req, HttpServletResponse resp){
        //转换到/hello.do
       //return "/hello.do";
        return "redirect:/hello.do";
    }
}
