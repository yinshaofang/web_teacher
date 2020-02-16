<%--
  Created by IntelliJ IDEA.
  User: windows
  Date: 2020/1/21
  Time: 14:52
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <script>
        function run() {
            var email =f.email.value;//dom编程新编程，name是成员变量
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
       <input type="text" name="username" placeholder="用户名"><br>
       <input type="password" name="password" placeholder="密码"><br>
       <input type="email" name="email" placeholder="邮箱"><br>
       <input type="submit" value="注册"><br>
   </form>
   <span style="color:red;">${requestScope.msg}</span>
</body>
</html>
