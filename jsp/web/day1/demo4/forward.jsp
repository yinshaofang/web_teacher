<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019\8\16 0016
  Time: 15:58
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <h1>this is forward.jsp</h1>
    <%--转发（iso900001）会有乱码，request必须设置utf-8--%>
    <%
        request.setCharacterEncoding("utf-8");
    %>
    <jsp:forward page="/day1/demo4/test.jsp">
        <%--转发带的参数，类似request.setAttribute("")设置--%>
        <jsp:param name="name" value="哈哈"/>
    </jsp:forward>
</body>
</html>
