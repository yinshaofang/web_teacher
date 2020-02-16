<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019\8\26 0026
  Time: 11:05
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <script>
        function f1() {
            img.src="${pageContext.request.contextPath}/day6/code/show?id="+new Date().getTime();
        }
    </script>
</head>
<body>
    <a href="javascript:;">
        <img id="img" alt="加载中..." src="${pageContext.request.contextPath}/day6/code/show" onclick="f1();"><br>
    </a>
</body>
</html>
