package controller;

import mvc.annotation.Configuration;
import mvc.config.ResourceHandlerRegistry;
import mvc.config.WebConfigurer;

@Configuration
public class MyConfig extends WebConfigurer{
//直接进入页面，不作任何处理
    @Override
    public void addViewControllers(ResourceHandlerRegistry rg) {
        rg.addViewController("reg","/reg")
        .addViewController("login","/login")
        .addViewController("success","/success");
    }
}
