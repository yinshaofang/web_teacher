<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019\8\16 0016
  Time: 11:33
  To change this template use File | Settings | File Templates.

  pageEncoding='utf' -指的是类似workspace中的格式
  buffer='8kb'表示jsp缓冲区 默认8k
  autoFlush='true' 自动刷新，false:表示满了就不刷新，但一般不到8k
  isErrorPage='true':表示此页面是服务器出问题的指定错误跳转页面上 服务器出现异常 5XX
  isELIgnored="false":是否忽略el表达式
--%>
<%@ page contentType="text/html;charset=UTF-8" import="java.util.*,java.io.*"
         pageEncoding="utf-8" buffer="8kb" autoFlush="true" isErrorPage="true"  isELIgnored="false" %>

<html>
<head>

</head>
<body>
    <%
        int a = 10;
        System.out.println("hello,I'm java code");
    %>
    <%="abc"%>
    <%=a%>
    <%out.print(a);%>
    <%!
    int m = 20;
    public static void func(){
        System.out.println("hello");
    }
    %>
<%--fffff--%>
    <hr style="color: red">
    <%
        for(int i = 0;i<4;i++){%>
          <h1>hello<%=i%></h1>
    <%}
    %>

</body>
</html>
