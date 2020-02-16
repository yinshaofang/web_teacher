<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019\8\22 0022
  Time: 9:33
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <style>
        span{
            color: red;
        }
    </style>
</head>
<body>
    <c:forEach var="i" begin="10" end="100" step="2" varStatus="st">
        <c:choose>
            <c:when test="${st.count%3==0}">
                <span>${i}</span><br>
            </c:when>
            <c:otherwise>
                ${i}&nbsp;
            </c:otherwise>
        </c:choose>
    </c:forEach>
</body>
</html>
