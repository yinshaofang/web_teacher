<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019\8\23 0023
  Time: 11:05
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>

</head>
<body>
<form action="${pageContext.request.contextPath}/modify.emp" method="post">
    <input name="id" readonly value="${emp.id}" ><br>
    <input name="name" value="${emp.name}"><br>
    <input type="number" name="salary" value="${emp.salary}"><br>
    <input type="radio" name="gender" <c:if test="${emp.gender=='男'}">checked</c:if>  value="男">男&nbsp;&nbsp;&nbsp;
    <input type="radio" name="gender" <c:if test="${emp.gender=='女'}">checked</c:if> value="女">女<br>
    学历:<select name="edu">
    <option value="-1">--请选择--</option>
    <option <c:if test="${emp.edu=='大专'}">selected</c:if> >大专</option>
    <option <c:if test="${emp.edu=='本科'}">selected</c:if> >本科</option>
    <option <c:if test="${emp.edu=='研究生'}">selected</c:if> >研究生</option>
</select><br>

    兴趣：<input type="checkbox" name="hobbies" value="游戏" <c:if test="${emp.hobbies.contains('游戏')}">checked</c:if>  >游戏
    <input type="checkbox" name="hobbies" value="读书" <c:if test="${emp.hobbies.contains('读书')}">checked</c:if>  >读书
    <input type="checkbox" name="hobbies" value="旅游" <c:if test="${emp.hobbies.contains('旅游')}">checked</c:if>  >旅游<br>

    <input  type="submit" value="添加">
    <input  type="reset" value="重置"><br>

</form>
</body>
</html>
