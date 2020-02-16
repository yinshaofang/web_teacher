<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019\8\26 0026
  Time: 9:22
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <script src="${pageContext.request.contextPath}/jquery.js"></script>
</head>
<body>
    <form action="${pageContext.request.contextPath}/day6/up_home" method="post" enctype="multipart/form-data">
        <input type="file" name="file"><br>
        <%--一开始向服务器就请求，就刷新过src,重定向以后就表示再次刷新，服务器用时间参数变化来让页面刷新--%>
        <img src="${src}" style="height: 300px;width: 300px;">
        <input type="submit">
    </form>
</body>
</html>
