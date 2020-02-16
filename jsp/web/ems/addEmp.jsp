<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019\8\23 0023
  Time: 10:30
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <h1>添加员工信息</h1>
    <hr>
    <form action="${pageContext.request.contextPath}/add.emp" method="post">
        <input name="name" placeholder="姓名"><br>
        <input type="number" name="salary" placeholder="工资"><br>
        <input type="radio" name="gender" value="男">男&nbsp;&nbsp;&nbsp;
        <input type="radio" name="gender" value="女">女<br>
        学历:<select name="edu">
            <option value="-1">--请选择--</option>
            <option >大专</option>
            <option >本科</option>
            <option >研究生</option>
        </select><br>

        兴趣：<input type="checkbox" name="hobbies" value="游戏">游戏
        <input type="checkbox" name="hobbies" value="读书">读书
        <input type="checkbox" name="hobbies" value="旅游">旅游<br>

        <input  type="submit" value="添加">
        <input  type="reset" value="重置"><br>

    </form>
</body>
</html>
