<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019\8\28 0028
  Time: 15:31
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <%--相对于web目录--%>
    <script src="${pageContext.request.contextPath}/js/jquery.js"></script>
    <script>
        $(function () {//加载完整个页面再加载jQuery
            $("#key").blur(function () {
                //方法一
                $.get(
                    "${pageContext.request.contextPath}/checkKey_方法1.do",//_方法1去掉
                    {//参数
                        "key":$("#key").val()
                    },
                    function (data) {//回调函数   返回data，4且200时，收到服务器传来的信息
                        $("#err").html(data);
                        //判断
                        if(data.indexOf("key已存在")==-1){
                            $("#sb").attr("disabled",false);//不能提交属性值
                        }else{
                            $("#sb").attr("disabled",true);
                        }
                    }
                );

                //方法二
                $.post(
                    "${pageContext.request.contextPath}/checkKeyJson.do",
                    {
                        "key":$("#key").val()
                    },
                    function (data) {
                        data = data.info;//因为指定json，data是object类型对象，则不用写data=JSON.parse(data).info
                        $("#err").html(data);
                        if(data.indexOf("key已存在")==-1){
                            $("#sb").attr("disabled",false);
                        }else{
                            $("#sb").attr("disabled",true);
                        }
                    },
                    "json"//指定是json格式，不指定默认是text
                );
            });
        });
    </script>
</head>
<body>
    <form action="${pageContext.request.contextPath}/addInfo.do">
        <input name="key" id="key" placeholder="关键字"><span id="err"></span><br>
        <input name="msg" id="msg" placeholder="详细信息"><br>
        <input type="submit" id="sb" value="添加" disabled="disabled">
    </form>
<span>${success}</span>
</body>
</html>
