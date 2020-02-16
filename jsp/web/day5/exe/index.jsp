<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019\8\22 0022
  Time: 9:19
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <h1>当前系统在线人数：${applicationScope.count}</h1>
    <%-- 注意：经常用${pageContext.request.contextPath} 不用jsp表达式--%>
    <a href="${pageContext.request.contextPath}/day5/exec/logout">退出系统</a>
</body>
</html>
