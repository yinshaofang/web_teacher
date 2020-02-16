<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019\8\23 0023
  Time: 10:46
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>员工管理系统</title>
</head>
<body>
    <h1>员工列表</h1>
    <a href="${pageContext.request.contextPath}/ems/addEmp.jsp">添加员工</a>
    <hr>
    <table border="1px">
        <tr>
            <th>工号</th>
            <th>姓名</th>
            <th>工资</th>
            <th>操作</th>
        </tr>

        <c:forEach items="${list}" var = "e">
            <tr>
                <td>${e.id}</td>
                <td>${e.name}</td>
                <td>${e.salary}</td>
                <td>
                    <a href="${pageContext.request.contextPath}/ems/showModify.emp?id=${e.id}">修改</a>
                    <a href="${pageContext.request.contextPath}/ems/delete.emp?id=${e.id}">删除</a>
                </td>
            </tr>
        </c:forEach>


    </table>
</body>
</html>
