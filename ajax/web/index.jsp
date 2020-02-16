<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019\8\28 0028
  Time: 11:05
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <script>

        function f() {
            //1.产生对象
            var xhr = new XMLHttpRequest();

            //2.注册回调函数
            xhr.onreadystatechange=function () {
                console.log("=================="+xhr.readyState);
                if(xhr.readyState==4){
                  console.log(xhr.status);//302  200 500 404
                  //当服务器响应的状态码为200，表示成功
                    if(xhr.status==200){
                        var rs = xhr.responseText;
                        msg.innerHTML=rs;
                    }else{
                        msg.innerHTML="<font color='red'>要访问的内容出错</font>"
                    }
                }else{
                    msg.innerHTML="正在进行校验....";//0 1 2 3 状态
                }
            };

            //3.建立连接
            var name = document.getElementById("name").value;//获取值
            xhr.open("get","${pageContext.request.contextPath}/day1/demo1/serv?name="+name);

            //4.发送请求
            xhr.send();

        }
    </script>
  </head>
  <body>
    <a href="javascript:;" onclick="f();">hello</a>
    <input id="name"><br>
    <span id="msg"></span><br>
  </body>
</html>
