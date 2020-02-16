package controller;

import mvc.annotation.Configuration;
import mvc.config.ResourceHandlerRegistry;
import mvc.config.WebConfigurer;

@Configuration
public class MyConfig extends WebConfigurer{
    @Override
    public void addViewControllers(ResourceHandlerRegistry r) {
        r.addViewController("add","/add")
        .addViewController("query","/query")//响应到query.jsp
        .addViewController("jp","/jp");
    }
}
