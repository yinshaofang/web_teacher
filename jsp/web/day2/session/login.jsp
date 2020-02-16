<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019\8\19 0019
  Time: 14:24
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>session例子</title>
</head>
<body>
<%--每次action就是一次新的请求--%>
<form action="<%=request.getContextPath()%>/day2/session/login">
    <input name="user">
    <input type="submit">
</form>
</body>
</html>
