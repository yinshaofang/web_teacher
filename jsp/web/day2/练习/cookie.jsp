<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019\8\19 0019
  Time: 9:28
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <title>Title</title>
    <script src="<%=request.getContextPath()%>/jquery.js"></script>
    <script src="<%=request.getContextPath()%>/jquery.cookie.js"></script>
    <script>
        function get() {
            var key=$("#key").val();
            var val = $.cookie(key);
            msg.innerHTML=val;
        }

        function set() {
            var key = $("#key").val();
            var value=$("#val").val();
            $.cookie(key,value);
        }
    </script>
</head>
<body>
    <input id="key" placeholder="请输入key"><br>
    <input id="val" placeholder="请输入value"><br>
    <button onclick="get();">获取</button>
    <button onclick="set();">设置</button>
    <span id="msg" style="color:red;"></span>
</body>
</html>
