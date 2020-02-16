<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019\8\19 0019
  Time: 15:43
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%--权限：application(全局)>session>request--%>
<%="last的req对象中的值:"+request.getAttribute("u")%><br>
<%="last的session对象中的值:"+session.getAttribute("u")%>
<%="last的application对象中的值:"+application.getAttribute("u")%>
</body>
</html>
