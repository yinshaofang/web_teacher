package controller;

import mvc.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@RequestMapping("")
public class B {
    @RequestMapping("/hello")
    public String hello(HttpServletRequest req, HttpServletResponse resp){
        System.out.println("进入到hello方法中...");
        //再次转发到hello.jsp
        return "hello";
    }
    @RequestMapping("/aaa")
    public void a(HttpServletRequest req, HttpServletResponse resp){
        System.out.println("进入到a方法中...");
        //再次转发到hello.jsp
    }

}
