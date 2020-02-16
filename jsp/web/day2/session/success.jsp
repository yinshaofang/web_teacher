<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019\8\19 0019
  Time: 14:30
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>

</head>
<body>
<%--jsp本质上是servlet request和session是同一个 --%>
<%="req对象中的值:"+request.getAttribute("u")%><br>
<%="session对象中的值:"+session.getAttribute("u")%>
<%--超链接每次点击一次就重新请求， 造成request不是同一个，而session是同一个会话，sessionId是一样--%>
<a href="<%=request.getContextPath()%>/day2/session/last.jsp">to last.jsp</a>
</body>
</html>
