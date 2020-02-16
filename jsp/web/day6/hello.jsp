<%@ taglib prefix="myfn" uri="/myfn" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="mt" uri="/myTag" %>
<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019\8\23 0023
  Time: 13:59
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <c:set var="n" value="5"></c:set>
    <c:set var="v" value="how are you?"></c:set>
    ${myfn:show("这是我的自定义el函数")}
    <hr>

    <mt:msg num="10" value="hello"></mt:msg>
    <hr>
    <mt:msg num="${n}" value="${v}"></mt:msg>
</body>
</html>
