package factory.动态代理;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class JdkProxy implements InvocationHandler{
    UserDao dao;//被代理的类
    public JdkProxy(UserDao dao) {
        this.dao = dao;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println(method.getName()+"被执行了-----日志记录");
        return method.invoke(dao,args);
    }
}
