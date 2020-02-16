<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019\8\29 0029
  Time: 14:20
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <script src="${pageContext.request.contextPath}/js/jquery.js"></script>
    <script>
        $(function () {
           $("#btn").click(function () {
               $.ajax({
                   url:"http://192.168.1.115:80/${pageContext.request.contextPath}/p.do",//跨域请求
                   type:"get",
                   dataType:"jsonp",//默认是text
                   success:function (data) {//获取是服务器端的rs内容，hello
                       $("#text").val(data.info);
                   }
               });
           }) ;
        });
    </script>
</head>
<body>
    <textarea id="text" style="width:400px;height:100px;"></textarea><br>
    <input id="btn" type="button" value="跨域">
</body>
</html>
