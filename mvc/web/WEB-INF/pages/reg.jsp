<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019\8\27 0027
  Time: 15:27
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <script>
        function run() {
           var email = f.email.value;
           if(/^.+@.+\.[a-zA-Z]{2,4}$/.test(email)){
               return true;
           }
            alert("邮箱格式不合理");
            return false;
        }
    </script>
</head>
<body>
    <form id="f" method="post" action="${pageContext.request.contextPath}/regHandle.do" onsubmit="return run();">
        <input name="username" placeholder="用户名"><br>
        <input type="password" name="password" placeholder="密码"><br>
        <input name="email" placeholder="邮箱"><br>
        <input type="submit" value="注册">
    </form>
    <span style="color: red;">${requestScope.msg}</span>
</body>
</html>
