<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019\8\16 0016
  Time: 15:32
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <h1>this is 1.jsp</h1><br>
    <%
        int i=20;
    %>
    <%--include指令是直接copy另一个页面所有的内容，注意不能定义相同的属性或方法，会报错，只编译和执行一次，在效率上好--%>
    <%--<%@ include file="2.jsp"%>--%>
    <%--include动作，区别于include指令，一次性执行多个页面的结果， request共享获取所有页面的数据  在开发上建议用，但编译和执行多次效率差点--%>
    <jsp:include page="2.jsp"></jsp:include>
    <%=request.getAttribute("name")%>
    <%=i%>
</body>
</html>
