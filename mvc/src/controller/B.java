package controller;

import mvc.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@RequestMapping("")
public class B {
    @RequestMapping("/hello")
    public String hello(HttpServletRequest req, HttpServletResponse resp){
        System.out.println("进入hello方法中...");
        return "hello";
    }
    @RequestMapping("/abc")
    public void a(HttpServletRequest req, HttpServletResponse resp){
        System.out.println("进入a方法中...");
    }
}
