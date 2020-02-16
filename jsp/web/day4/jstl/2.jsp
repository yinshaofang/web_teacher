<%@ page import="day4.bean.User,java.util.*" %><%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019\8\21 0021
  Time: 16:23
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <c:set var="age" value="20"/>
    <%--类似java中的if..else if..else语句--%>
    <c:choose>
        <c:when test="${age<14}">童年</c:when>
        <c:when test="${age<18}">少年</c:when>
        <c:when test="${age<35}">青年</c:when>
        <c:when test="${age<50}">中年</c:when>
        <c:otherwise>老年</c:otherwise>
    </c:choose>

<hr>
    <c:set var="sum" value="0"></c:set>
    <%--for(int i=0;i<10;i++){
    sum =sum+i
    }--%>
    <c:forEach var="i" begin="0" end="10" step="1">
        ${i}<br>
        <c:set var="sum" value="${sum+i}"></c:set>
    </c:forEach>
    总和为：${sum}

    <hr>
    遍历数组:
    <%
        String[]arrs = {"赵雅芝","小苍","小泽"};
        request.setAttribute("arrs", arrs);
    %>

    <c:forEach var="s" items="${arrs }">
        ${s }<br>
    </c:forEach>

<hr>
    集合示例：
    <%
        ArrayList<User>arr = new ArrayList<User>();
        User u1 = new User(1,"a1");
        User u2 = new User(2,"a2");
        arr.add(u1);
        arr.add(u2);
        pageContext.setAttribute("arr", arr);
    %>
    <c:forEach  items="${arr }" var ="tmp">
        id:${tmp.id }<br>
        name:${tmp.name }<br>
    </c:forEach>


    <hr>
    Map示例
    <%
        Map<Integer,User> m = new HashMap<Integer,User>();
        m.put(u1.getId(), u1);
        m.put(u2.getId(), u2);
        pageContext.setAttribute("m", m);
    %>
    <%--varStatus:记录迭代相关信息--%>
    <c:forEach items="${m }" var="e" varStatus="a">
        ${e.key }--${e.value.name}
        <span style="color: red;">索引：${a.index}，当前获取到的成员数:${a.count}</span>
    </c:forEach>
</body>
</html>
