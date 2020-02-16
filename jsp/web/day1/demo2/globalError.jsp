<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019\8\16 0016
  Time: 14:34
  To change this template use File | Settings | File Templates.
--%>
<%--注意：只有异常处理页面才能有isErrorPage，其他页面不可用--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isErrorPage="true" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <%=exception.getMessage()%>
</body>
</html>
