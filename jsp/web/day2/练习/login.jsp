<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019\8\19 0019
  Time: 11:11
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <script src="<%=request.getContextPath()%>/jquery.js"></script>
    <script src="<%=request.getContextPath()%>/jquery.cookie.js"></script>
    <script>
        $(function () {
            var name=$.cookie("name");
            var pass = $.cookie("pass");
            if(name&&pass){//说明用户名及密码不为null
                $("input[name=name]").val(name);
                $("input[name=pass]").val(pass);
                $("form").submit();
            }
        })
    </script>
</head>
<body>
    <form action="<%=request.getContextPath()%>/day2/login">
        <input name="name" placeholder="用户名"><br>
        <input name="pass" placeholder="密码"><br>
        <input type="submit" value="登录">
        <input type="checkbox" name="rm">七天免登录<br>
        <span style="color: red">
            <%
                session.setAttribute("a","aa");
                //通过request对象获取服务器的错误信息
                String err = (String)request.getAttribute("errMsg");
            %>
            <%=err==null?"":err%>
        </span>

    </form>
</body>
</html>
