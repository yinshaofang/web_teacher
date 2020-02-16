<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019\8\20 0020
  Time: 9:11
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <%
        // 统计有多少会话  application对象作用域全局，Tomcat服务器启动，生命周期就开始，指导关闭
        int count;
        Object c = application.getAttribute("count");
        if(c==null){
            count=1;//第一次是null 设置为1
        }else{
            count=(Integer)c;//强制转型
        }
        out.print("自服务器启动后，此页面已经被访问了"+count+"次");
        application.setAttribute("count",++count);//自增
    %>

    <%--out：jsp内置对象，不同于response.getWrite(),类似PrintWrite，不同是out是先写入到缓冲区--%>
    <%="hello" %>
    <%out.print("aaa"); %>
    <%--getWriter()不写入缓冲区，就直接打印到页面，区别out先进入缓冲区--%>
    <%response.getWriter().print("bbbb"); %>
    <%out.print("ccc"); %>
<%-- 注意：web目录是应用的根目录，src目录编译的class放在web/web-info/classes，注意web-info目录是安全，不能被浏览器访问的 --%>
</body>
</html>
