<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019\8\22 0022
  Time: 11:46
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
     <%--fmt 某个文件，formatDate功能 其实质是java中FormatDateTag类的某个方法实现--%>
    <fmt:formatDate value="${now }" type="date"/><br>
    <fmt:formatDate value="${now }" type="both"/><br>
    <fmt:formatDate value="${now }" type="time"/><br>
    <fmt:formatDate value="${now }" pattern="yyyy/MM/dd HH:mm:ss"/>
</body>
</html>
