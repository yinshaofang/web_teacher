<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019\8\19 0019
  Time: 16:35
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%-- 写encodeURL()方法：只创建一次session，禁用cookie时，防止多次提交到服务器，再重新创建session对象--%>
    <form action="<%=response.encodeURL(request.getContextPath()+"/day2/url")%>">
        <input name="name" placeholder="用户名"><br>
        <input type="submit" value="登录">
    </form>
</body>
</html>
