<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019\8\27 0027
  Time: 9:20
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <script>
        function f1() {
            var user = {"name":"admin","age":25,"gender":"男"};
            //三种常见的json用法
            console.log(typeof user,user,user["name"],user['age'],user.gender);
        }
        function f2() {
            var user = {"name":{"firstName":"李","lastName":"四"},"age":25};
            //获取json中的值
            console.log(user["name"]["firstName"],user.name.lastName);
        }

        function f3() {
            var user = {"name":"admin","age":25,"gender":"男"};
            var people = {"id":"123","user":user};
            console.log(people["user"]["gender"])
        }

        function f4() {
            var user=[{"name":"admin","age":25},{"n":"a1","age":25}];
            //通过数组下标访问json
            console.log(user[0].name,user[0]["age"])
        }

        //string转为json  场景：后台发给前台的json格式的字符串
        function f5() {
            var user = "{\"name\":\"admin\",\"age\":25}";
            console.log(typeof user,user);
            user = JSON.parse(user);//js推荐使用 注意必须是双引号 1、安全 2、语法严格
            //user = eval("("+user+")");//1、拼接字符串  2、语法松散  3、不安全
            console.log(typeof user,user);
            //eval("alert('hello');");不安全，不仅解析字符串还会执行脚本
            JSON.parse("alert('hello');");//安全，严格语法检查
        }
    </script>
</head>
<body>
    <a href="javascript:;" onclick="f1();">f1方法</a>
    <a href="javascript:;" onclick="f2();">value是json1</a>
    <a href="javascript:;" onclick="f3();">value是json2</a>
    <a href="javascript:;" onclick="f4();">集合</a>
    <a href="javascript:;" onclick="f5();">字符串转json对象</a>
</body>
</html>
