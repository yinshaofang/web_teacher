<%@ taglib prefix="myfn" uri="/myfn" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="mt" uri="/myTag" %>
<%--
  Created by IntelliJ IDEA.
  User: windows
  Date: 2020/1/20
  Time: 15:36
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
      <%--atl+enter导包--%>
      <%--自定义el函数--%>
      ${myfn:show("这是我的自定义el函数!")}
     <%--el表达式--%>
     <c:set var="n" value="5"></c:set>
     <c:set var="v" value="hello"></c:set>
     <hr>
     <%--自定义el表达式--%>
     <mt:msg num="${n}" value="${v}"></mt:msg>
</body>
</html>
