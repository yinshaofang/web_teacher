<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019\8\21 0021
  Time: 13:55
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    application中的name:----${name}<br>
    request请求中的参数name:${param.name}<br>
    request请求中的参数name:${paramValues.name[1]}<br>
    请求头信息${header.referer}---${header.host}
</body>
</html>
