<%--
  Created by IntelliJ IDEA.
  User: windows
  Date: 2020/1/20
  Time: 14:35
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>后台管理</title>
    <!-- 1 引入bootstrap中的css样式 -->
    <link rel="stylesheet" href="bootstrap-3.3.7/css/bootstrap.min.css">
    <!-- 2引入bootstrap核心jQuery文件 -->
    <script type="text/javascript" src="bootstrap-3.3.7/js/jquery-1.11.1.min.js"></script>
    <!-- 3引入bootstrap核心JavaScript文件 -->
    <script type="text/javascript" src="bootstrap-3.3.7/js/bootstrap.js"></script>
    <style>
        footer {
            background-color: #eee;
            padding-top: 25px;
            color: white;
        }

        .form1 {
            margin-right: 150px;
        }

        .form-inline {
            margin-top: 30px;
            margin-bottom: 20px;
        }

    </style>
</head>

<body>
<!-- 导航开始 -->
<nav class="navbar navbar-default">
    <div class="container">
        <div class="navbar-header">
            <a class="navbar-brand" href="#">
                <strong>多多旅行社</strong>
            </a>
            <form class="navbar-form navbar-left form1" role="search">
                <div class="form-group">
                    <input type="text" class="form-control" placeholder="请输入你想要去的地方">
                </div>
                <button type="submit" class="btn btn-default">搜索</button>
            </form>
            <!-- 模态框开始 -->
            <div class="modal fade" id="exampleModal" tabindex="-1" role="dialog"
                 aria-labelledby="exampleModalLabel">
                <div class="modal-dialog" role="document">
                    <div class="modal-content">
                        <div class="modal-header">
                            <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span
                                    aria-hidden="true">&times;</span></button>
                            <h4 class="modal-title" id="exampleModalLabel"></h4>
                        </div>
                        <div class="modal-body">
                            <form>
                                <div class="form-group">
                                    <label for="recipient-name" class="control-label">姓名:</label>
                                    <input type="text" class="form-control" id="recipient-name"
                                           placeholder="请输入用户名">
                                </div>
                                <div class="form-group">
                                    <label for="recipient-name" class="control-label">密码:</label>
                                    <input type="password" class="form-control" id="recipient-name"
                                           placeholder="请输入密码">
                                </div>
                            </form>
                        </div>
                        <div class="modal-footer">
                            <button type="button" class="btn btn-default" data-dismiss="modal">关闭</button>
                            <button type="button" class="btn btn-primary">保存</button>
                        </div>
                    </div>
                </div>
            </div>
        </div>
        <!-- 模态框结束 -->
        <ul class="nav navbar-nav">
            <li><a href="index.jsp"><span class="glyphicon glyphicon-home" aria-hidden="true"></span>首页</a></li>
            <li><a href=""><span class="glyphicon glyphicon-signal" aria-hidden="true"></span>排行</a></li>
            <li><a href=""><span class="glyphicon glyphicon-book" aria-hidden="true"></span>攻略</a></li>
            <li><a href="about.jsp"><span class="glyphicon glyphicon-menu-hamburger"
                                           aria-hidden="true"></span>关于</a></li>
        </ul>
        <form class="navbar-form navbar-right">
            <!-- 模态框按钮 -->
            <button type="button" class="btn btn-default" data-toggle="modal" data-target="#exampleModal"
                    data-whatever="">登录</button>
            <button type="button" class="btn btn-default" data-toggle="modal" data-target="#exampleModal"
                    data-whatever="">注册</button>
            <button type="button" class="btn btn-default" onclick="location.href='index.jsp'">前台管理</button>
        </form>
    </div>
</nav>
<!-- 导航结束 -->
<!-- 内容开始 -->
<div class="main">
    <div class="container">
        <!-- 面板 -->
        <div class="panel panel-primary">
            <div class="panel-heading">后台管理</div>
            <div class="panel-body">
                <!-- 标签页 -->
                <div>
                    <!-- Nav tabs -->
                    <ul class="nav nav-tabs" role="tablist">
                        <li role="presentation" class="active">
                            <a href="#home" aria-controls="home" role="tab" data-toggle="tab">管理员</a></li>
                        <li role="presentation"><a href="#profile" aria-controls="profile" role="tab"
                                                   data-toggle="tab">员工管理</a></li>
                        <li role="presentation"><a href="#messages" aria-controls="messages" role="tab"
                                                   data-toggle="tab">用户管理</a></li>
                        <li role="presentation"><a href="#settings" aria-controls="settings" role="tab"
                                                   data-toggle="tab">订单管理</a></li>
                    </ul>
                    <!-- Tab panes -->
                    <div class="tab-content">
                        <div role="tabpanel" class="tab-pane active" id="home">
                            <form class="form-inline">
                                <div class="form-group">
                                    <label for="exampleInputName2">编号:</label>
                                    <input type="text" class="form-control" id="exampleInputName2"
                                           placeholder="请输入查询编号">
                                </div>
                                <div class="form-group">
                                    <label for="exampleInputEmail2">姓名:</label>
                                    <input type="email" class="form-control" id="exampleInputEmail2"
                                           placeholder="请输入姓名">
                                </div>
                                <button type="button" class="btn btn-success btn-sm">查询</button>
                                <button type="button" class="btn btn-success btn-sm"
                                        onclick="location.href='add.jsp'">新增</button>
                                <button type="button" class="btn btn-success btn-sm"
                                        onclick="location.href='modify.jsp'">修改</button>
                            </form>
                            <table class="table table-striped table-bordered table-hover table-condensed col-sm-4 col-xs-12">
                                <tr>
                                    <th></th>
                                    <th>编号</th>
                                    <th>姓名</th>
                                    <th>性别</th>
                                    <th>年龄</th>
                                    <th>地址</th>
                                    <th>操作</th>
                                </tr>
                                <tr class="success">
                                    <td>
                                        <form action="">
                                            <input type="checkbox">
                                        </form>
                                    </td>
                                    <td>0001</td>
                                    <td>张三</td>
                                    <td>男</td>
                                    <td>20</td>
                                    <td>江苏省南京市鼓楼区</td>
                                    <td>
                                        <a class="btn btn-success btn-sm" href="#" role="button">详细</a>
                                        <a class="btn btn-success btn-sm" href="#" role="button">删除</a>
                                        <a class="btn btn-success btn-sm" href="#" role="button"
                                           onclick="location.href='modify.jsp'">修改</a>
                                    </td>
                                </tr>
                                <tr class="warning">
                                    <td>
                                        <form action="">
                                            <input type="checkbox">
                                        </form>
                                    </td>
                                    <td>0002</td>
                                    <td>张三1</td>
                                    <td>男</td>
                                    <td>20</td>
                                    <td>江苏省南京市鼓楼区</td>
                                    <td>
                                        <a class="btn btn-success btn-sm" href="#" role="button">详细</a>
                                        <a class="btn btn-success btn-sm" href="#" role="button">删除</a>
                                        <a class="btn btn-success btn-sm" href="#" role="button">修改</a>
                                    </td>
                                </tr>
                                <tr class="success">
                                    <td>
                                        <form action="">
                                            <input type="checkbox">
                                        </form>
                                    </td>
                                    <td>0003</td>
                                    <td>张三2</td>
                                    <td>男</td>
                                    <td>20</td>
                                    <td>江苏省南京市鼓楼区</td>
                                    <td>
                                        <a class="btn btn-success btn-sm" href="#" role="button">详细</a>
                                        <a class="btn btn-success btn-sm" href="#" role="button">删除</a>
                                        <a class="btn btn-success btn-sm" href="#" role="button">修改</a>
                                    </td>
                                </tr>
                                <tr class="warning">
                                    <td>
                                        <form action="">
                                            <input type="checkbox">
                                        </form>
                                    </td>
                                    <td>0002</td>
                                    <td>张三1</td>
                                    <td>男</td>
                                    <td>20</td>
                                    <td>江苏省南京市鼓楼区</td>
                                    <td>
                                        <a class="btn btn-success btn-sm" href="#" role="button">详细</a>
                                        <a class="btn btn-success btn-sm" href="#" role="button">删除</a>
                                        <a class="btn btn-success btn-sm" href="#" role="button">修改</a>
                                    </td>
                                </tr>
                                <tr class="success">
                                    <td>
                                        <form action="">
                                            <input type="checkbox">
                                        </form>
                                    </td>
                                    <td>0003</td>
                                    <td>张三2</td>
                                    <td>男</td>
                                    <td>20</td>
                                    <td>江苏省南京市鼓楼区</td>
                                    <td>
                                        <a class="btn btn-success btn-sm" href="#" role="button">详细</a>
                                        <a class="btn btn-success btn-sm" href="#" role="button">删除</a>
                                        <a class="btn btn-success btn-sm" href="#" role="button">修改</a>
                                    </td>
                                </tr>
                                <tr class="warning">
                                    <td>
                                        <form action="">
                                            <input type="checkbox">
                                        </form>
                                    </td>
                                    <td>0002</td>
                                    <td>张三1</td>
                                    <td>男</td>
                                    <td>20</td>
                                    <td>江苏省南京市鼓楼区</td>
                                    <td>
                                        <a class="btn btn-success btn-sm" href="#" role="button">详细</a>
                                        <a class="btn btn-success btn-sm" href="#" role="button">删除</a>
                                        <a class="btn btn-success btn-sm" href="#" role="button">修改</a>
                                    </td>
                                </tr>
                                <tr class="success">
                                    <td>
                                        <form action="">
                                            <input type="checkbox">
                                        </form>
                                    </td>
                                    <td>0003</td>
                                    <td>张三2</td>
                                    <td>男</td>
                                    <td>20</td>
                                    <td>江苏省南京市鼓楼区</td>
                                    <td>
                                        <a class="btn btn-success btn-sm" href="#" role="button">详细</a>
                                        <a class="btn btn-success btn-sm" href="#" role="button">删除</a>
                                        <a class="btn btn-success btn-sm" href="#" role="button">修改</a>
                                    </td>
                                </tr>
                            </table>
                            <!-- 分页 -->
                            <nav aria-label="Page navigation" class="navbar-left">
                                <ul class="pagination">
                                    <li>
                                        <a href="#" aria-label="Previous">
                                            <span aria-hidden="true">&laquo;</span>
                                        </a>
                                    </li>
                                    <li><a href="#">1</a></li>
                                    <li><a href="#">2</a></li>
                                    <li><a href="#">3</a></li>
                                    <li><a href="#">4</a></li>
                                    <li><a href="#">5</a></li>
                                    <li><a href="#">6</a></li>
                                    <li><a href="#">7</a></li>
                                    <li><a href="#">8</a></li>
                                    <li><a href="#">9</a></li>
                                    <li><a href="#">10</a></li>
                                    <li>
                                        <a href="#" aria-label="Next">
                                            <span aria-hidden="true">&raquo;</span>
                                        </a>
                                    </li>
                                </ul>
                            </nav>
                        </div>
                        <div role="tabpanel" class="tab-pane" id="profile">
                            <form class="form-inline">
                                <div class="form-group">
                                    <label for="exampleInputName2">编号:</label>
                                    <input type="text" class="form-control" id="exampleInputName2"
                                           placeholder="请输入查询编号">
                                </div>
                                <div class="form-group">
                                    <label for="exampleInputEmail2">姓名:</label>
                                    <input type="email" class="form-control" id="exampleInputEmail2"
                                           placeholder="请输入姓名">
                                </div>
                                <button type="button" class="btn btn-success btn-sm">查询</button>
                                <button type="button" class="btn btn-success btn-sm"
                                        onclick="location.href='add.jsp'">新增</button>
                            </form>
                            <table class="table table-striped table-bordered table-hover table-condensed">
                                <tr>
                                    <th>编号</th>
                                    <th>姓名</th>
                                    <th>性别</th>
                                    <th>年龄</th>
                                    <th>地址</th>
                                    <th>操作</th>
                                </tr>
                                <tr class="success">
                                    <td>0001</td>
                                    <td>张三</td>
                                    <td>男</td>
                                    <td>20</td>
                                    <td>江苏省南京市鼓楼区</td>
                                    <td>
                                        <a class="btn btn-success btn-sm" href="#" role="button">详细</a>
                                        <a class="btn btn-success btn-sm" href="#" role="button">删除</a>
                                        <a class="btn btn-success btn-sm" href="#" role="button"
                                           onclick="location.href='modify.jsp'">修改</a>
                                    </td>
                                </tr>
                                <tr class="warning">
                                    <td>0002</td>
                                    <td>张三1</td>
                                    <td>男</td>
                                    <td>20</td>
                                    <td>江苏省南京市鼓楼区</td>
                                    <td>
                                        <a class="btn btn-success btn-sm" href="#" role="button">详细</a>
                                        <a class="btn btn-success btn-sm" href="#" role="button">删除</a>
                                        <a class="btn btn-success btn-sm" href="#" role="button">修改</a>
                                    </td>
                                </tr>
                                <tr class="success">
                                    <td>0003</td>
                                    <td>张三2</td>
                                    <td>男</td>
                                    <td>20</td>
                                    <td>江苏省南京市鼓楼区</td>
                                    <td>
                                        <a class="btn btn-success btn-sm" href="#" role="button">详细</a>
                                        <a class="btn btn-success btn-sm" href="#" role="button">删除</a>
                                        <a class="btn btn-success btn-sm" href="#" role="button">修改</a>
                                    </td>
                                </tr>
                                <tr class="warning">
                                    <td>0002</td>
                                    <td>张三1</td>
                                    <td>男</td>
                                    <td>20</td>
                                    <td>江苏省南京市鼓楼区</td>
                                    <td>
                                        <a class="btn btn-success btn-sm" href="#" role="button">详细</a>
                                        <a class="btn btn-success btn-sm" href="#" role="button">删除</a>
                                        <a class="btn btn-success btn-sm" href="#" role="button">修改</a>
                                    </td>
                                </tr>
                                <tr class="success">
                                    <td>0003</td>
                                    <td>张三2</td>
                                    <td>男</td>
                                    <td>20</td>
                                    <td>江苏省南京市鼓楼区</td>
                                    <td>
                                        <a class="btn btn-success btn-sm" href="#" role="button">详细</a>
                                        <a class="btn btn-success btn-sm" href="#" role="button">删除</a>
                                        <a class="btn btn-success btn-sm" href="#" role="button">修改</a>
                                    </td>
                                </tr>
                                <tr class="warning">
                                    <td>0002</td>
                                    <td>张三1</td>
                                    <td>男</td>
                                    <td>20</td>
                                    <td>江苏省南京市鼓楼区</td>
                                    <td>
                                        <a class="btn btn-success btn-sm" href="#" role="button">详细</a>
                                        <a class="btn btn-success btn-sm" href="#" role="button">删除</a>
                                        <a class="btn btn-success btn-sm" href="#" role="button">修改</a>
                                    </td>
                                </tr>
                                <tr class="success">
                                    <td>0003</td>
                                    <td>张三2</td>
                                    <td>男</td>
                                    <td>20</td>
                                    <td>江苏省南京市鼓楼区</td>
                                    <td>
                                        <a class="btn btn-success btn-sm" href="#" role="button">详细</a>
                                        <a class="btn btn-success btn-sm" href="#" role="button">删除</a>
                                        <a class="btn btn-success btn-sm" href="#" role="button">修改</a>
                                    </td>
                                </tr>
                            </table>
                            <!-- 分页 -->
                            <nav aria-label="Page navigation" class="navbar-left">
                                <ul class="pagination">
                                    <li>
                                        <a href="#" aria-label="Previous">
                                            <span aria-hidden="true">&laquo;</span>
                                        </a>
                                    </li>
                                    <li><a href="#">1</a></li>
                                    <li><a href="#">2</a></li>
                                    <li><a href="#">3</a></li>
                                    <li><a href="#">4</a></li>
                                    <li><a href="#">5</a></li>
                                    <li><a href="#">6</a></li>
                                    <li><a href="#">7</a></li>
                                    <li><a href="#">8</a></li>
                                    <li><a href="#">9</a></li>
                                    <li><a href="#">10</a></li>
                                    <li>
                                        <a href="#" aria-label="Next">
                                            <span aria-hidden="true">&raquo;</span>
                                        </a>
                                    </li>
                                </ul>
                            </nav>
                        </div>
                        <div role="tabpanel" class="tab-pane" id="messages">正在录入...</div>
                        <div role="tabpanel" class="tab-pane" id="settings">正在录入...</div>
                    </div>
                </div>
            </div>
        </div>
    </div>
</div>
<!-- 内容结束 -->
<!-- 底部开始 -->
<footer>
    <div class="container">
        <div class="row">
            <div class="col-md-4 col-sm-4 col-xs-12">
                <!-- <div class="thumbnail"> -->
                <dl>
                    <dt><a href="">合作伙伴</a></dt>
                    <dd><a href="">途牛旅游网</a></dd>
                    <dd><a href="">驴妈妈旅游网</a></dd>
                    <dd><a href="">携程旅游</a></dd>
                </dl>
                <!-- </div> -->
            </div>
            <div class="col-md-4 col-sm-4 col-xs-12">
                <!-- <div class="thumbnail"> -->
                <dl>
                    <dt><a href="">旅游FAQ</a></dt>
                    <dd><a href="">旅游合同签订方式？</a></dd>
                    <dd><a href="">儿童价是基于什么制定的？</a></dd>
                    <dd><a href="">旅游的线路品质怎么界定的？</a></dd>
                    <dd><a href="">单房差是什么？</a></dd>
                    <dd><a href="">旅游保险有哪些种类？</a></dd>
                </dl>
                <!-- </div> -->
            </div>
            <div class="col-md-4 col-sm-4 col-xs-12">
                <!-- <div class="thumbnail"> -->
                <dl>
                    <dt><a href="">联系方式</a></dt>
                    <dd><a href="">微博：yoghurtduoduo.com/</a></dd>
                    <dd><a href="">邮件：lunbo@hzn.com</a></dd>
                    <dd><a href="">地址：江苏南京鼓楼金山大厦B座6A层</a></dd>
                </dl>
                <!-- </div> -->
            </div>
        </div>
    </div>
</footer>
<!-- 底部结束 -->
</body>

</html>