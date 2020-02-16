package controller;

import mvc.annotation.Configuration;
import mvc.config.ResourceHandlerRegistry;
import mvc.config.WebConfigurer;

//Controller层--->直接进入页面，不做任何处理（进行页面的跳转）
@Configuration //自定义注解，扫描项目
public class MyConfig extends WebConfigurer{
    @Override
    public void addViewControllers(ResourceHandlerRegistry rg) {
       rg.addViewController("a","/abc"); //通过注解扫描类和方法，根据路径找WEB-INF下的jsp页面
        // 实质上map集合
      // rg.addViewController("hello","/hello");

        //直接向页面展示
        rg.addViewController("reg","/reg")
        .addViewController("login","/login")
        .addViewController("success","/success");

    }
}
