<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019\8\21 0021
  Time: 11:23
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" import="day4.bean.User,java.util.*" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <%
        //jsp四大域对象
    //pageContext.setAttribute("msg","信息1");//jsp内置对象，存不了信息,可以直接写在页面上
    request.setAttribute("msg","信息2");
    session.setAttribute("msg","信息3");
    application.setAttribute("msg","信息4");
    %>
<hr>
    <h1>访问作用域</h1>
    <%--注意:1、el表达式中隐式对象，作用域最小，优先级最高
        2、如果pageContext没有设置信息，则在el表达式直接获取request中的信息
    --%>
    ${msg}--pageContext<br>
    ${requestScope.msg}--request<br>
    ${sessionScope.msg}--session<br>
    ${applicationScope.msg}--application<br>

     <%--
      注意:导入包 import="day4.bean.User,java.util.*"
     --%>
    <h1>访问java对象中的数据</h1>
    <%
        User us = new User();
        us.setName("用户1");
        request.setAttribute("user",us);

        //数组
        String[]arr = {"你","我","他"};
        request.setAttribute("arr",arr);

        //集合
        List<String>li = new ArrayList<>();
        li.add("one");
        li.add("two");
        request.setAttribute("list",li);

        //Map
        Map<String,String>m = new HashMap<>();
        m.put("one","一");
        m.put("two","二");
        request.setAttribute("map",m);
    %>

    ${user}--对象本身<br>
    ${user.name}--对象属性,重要<br>
    ${arr[1]}--数组元素<br>
    ${list[1]}--集合元素，重要<br>
    ${map.one}或${map["one"]}--map值
    <%--如果key为:one.b形式时，只能用map["one.b"]形式来获取值--%>

</body>
</html>
