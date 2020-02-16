<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019\8\21 0021
  Time: 14:59
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" import="day4.bean.User" language="java" %>
<%--
   jstl标签是el表达式高级用法
   jstl标签需要添加jar包 jstl.jar 和standard.jar
   步骤:1、在WEB-INF中创建lib,复制
        2、File->Project Structure-->Libraries ->+ 添加
       3、导入一个el标签库 taglib
 --%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <%
        //添加一个数据
        application.setAttribute("app","hello");
        pageContext.setAttribute("name","admin",PageContext.REQUEST_SCOPE);//指定存到el隐形域request中
        User u = new User();
        u.setName("波斯猫");
        request.setAttribute("u",u);
        request.removeAttribute("name");//删除
    %>

    <%--向4个域对象中存入值
     var：类似key ，value：值--%>
    <c:set scope="request" var="i" value="abc"/>
    ${app}<br>
    ${name}<br>
    ${u.name}<br>
    <%--修改域中保存的bean中的属性值 property：属性名  value：属性值--%>
    <c:set target="${u}" property="name" value="贵宾狗"></c:set>
    ${u.name}<br>

    <hr>
    <%
        int a = 10;
        if(a>=10){
            out.print("a>=10");
        }else{
            out.print("a<=10");
        }
    %>
    <hr>
    <%--向4个域对象中存入值--%>
    <c:set var="i" value="hello"/>
    <c:set var="age" value="20"/>

    <%--第二种写法:
    scope表示var变量要保存到哪个域中
    var:用来保存test中判断的结果
     注意:ge 大于等于
    --%>
    <c:if test="${requestScope.age ge 18}" scope="application" var="x">
    <%--第一种写法：<c:if test="${age >= 18}">--%>
        已经成年
    </c:if>
    ${applicationScope.x}

</body>
</html>
