<%--
  Created by IntelliJ IDEA.
  User: windows
  Date: 2020/1/20
  Time: 14:38
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>首页</title>
    <!-- 1 引入bootstrap中的css样式 -->
    <link rel="stylesheet" href="bootstrap-3.3.7/css/bootstrap.min.css">
    <!-- 2引入bootstrap核心jQuery文件 -->
    <script type="text/javascript" src="bootstrap-3.3.7/js/jquery-1.11.1.min.js"></script>
    <!-- 3引入bootstrap核心JavaScript文件 -->
    <script type="text/javascript" src="bootstrap-3.3.7/js/bootstrap.js"></script>
    <style>
        .content {
            text-align: center;
            margin-top: 20px;
        }

        footer {
            background-color: #eee;
            padding-top: 25px;
            color: white;
        }
        .form1{
            margin-right: 150px;
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
            <!-- 模态框主页面 -->
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
        <ul class="nav navbar-nav">
            <li><a href="index.jsp"><span class="glyphicon glyphicon-home" aria-hidden="true"></span>首页</a></li>
            <li><a href=""><span class="glyphicon glyphicon-signal" aria-hidden="true"></span>排行</a></li>
            <li><a href=""><span class="glyphicon glyphicon-book" aria-hidden="true"></span>攻略</a></li>
            <li><a href="about.jsp"><span class="glyphicon glyphicon-menu-hamburger" aria-hidden="true"></span>关于</a></li>
        </ul>
        <form class="navbar-form navbar-right">
            <!-- 模态框按钮 -->
            <button type="button" class="btn btn-default" data-toggle="modal" data-target="#exampleModal"
                    data-whatever="">登录</button>
            <button type="button" class="btn btn-default" data-toggle="modal" data-target="#exampleModal"
                    data-whatever="">注册</button>
            <button type="button" class="btn btn-e" onclick="location.href='list.jsp'">后台管理</button>
        </form>
    </div>
</nav>
<!-- 导航结束 -->
<!-- 轮播图开始 -->
<div id="carousel-example-generic" class="carousel slide" data-ride="carousel">
    <!-- Indicators -->
    <ol class="carousel-indicators">
        <li data-target="#carousel-example-generic" data-slide-to="0" class="active"></li>
        <li data-target="#carousel-example-generic" data-slide-to="1"></li>
        <li data-target="#carousel-example-generic" data-slide-to="2"></li>
    </ol>

    <!-- Wrapper for slides -->
    <div class="carousel-inner" role="listbox">
        <div class="item active">
            <img src="img/tour1.jpg" alt="t1">
            <div class="carousel-caption">
                带你去旅行
            </div>
        </div>
        <div class="item">
            <img src="img/tour2.jpg" alt="t2">
            <div class="carousel-caption">
                带你去旅行
            </div>
        </div>
        <div class="item">
            <img src="img/tour3.jpg" alt="t3">
            <div class="carousel-caption">
                带你去旅行
            </div>
        </div>

    </div>

    <!-- Controls 左右开关 -->
    <a class="left carousel-control" href="#carousel-example-generic" role="button" data-slide="prev">
        <span class="glyphicon glyphicon-chevron-left" aria-hidden="true"></span>
        <span class="sr-only">Previous</span>
    </a>
    <a class="right carousel-control" href="#carousel-example-generic" role="button" data-slide="next">
        <span class="glyphicon glyphicon-chevron-right" aria-hidden="true"></span>
        <span class="sr-only">Next</span>
    </a>
</div>
<!-- 轮播图结束 -->
<!-- 内容开始 -->
<div class="well content">
    <button type="button" class="btn btn-success">热门旅游</button>
    <button type="button" class="btn btn-danger">国内旅游</button>
    <button type="button" class="btn btn-info">国外旅游</button>
    <button type="button" class="btn btn-warning">自助旅游</button>
    <button type="button" class="btn btn-primary">自驾旅游</button>
    <button type="button" class="btn btn-danger">油轮签证</button>
    <button type="button" class="btn btn-default">主题旅游</button>
</div>
<div class="container content">
    <div class="row">
        <div class="col-sm-6 col-md-3">
            <div class="thumbnail">
                <img src="img/s1.jpg" alt="图片飞月球了">
                <div class="caption">
                    <h5><a href="">曼谷-芭提雅6日游</a></h5>
                    <p>包团特惠，超丰富景点，升级1晚周五，无自费，更送600元/成人自费券
                    </p>
                </div>
            </div>
        </div>
        <div class="col-sm-6 col-md-3">
            <div class="thumbnail">
                <img src="img/s2.jpg" alt="图片飞月球了">
                <div class="caption">
                    <h5><a href="">富山-大阪-东京8日游</a></h5>
                    <p>暑假亲自，2天自由，无导游安排自费项目，全程不强迫购物
                    </p>
                </div>
            </div>
        </div>
        <div class="col-sm-6 col-md-3">
            <div class="thumbnail">
                <img src="img/s4.jpg" alt="图片飞月球了">
                <div class="caption">
                    <h5><a href="">马尔代夫双鱼岛Olhuceli4晚6日自助游</a></h5>
                    <p>
                        上海出发，酒包含：早晚餐+快艇，全程不强迫购物
                    </p>
                </div>
            </div>
        </div>
        <div class="col-sm-6 col-md-3">
            <div class="thumbnail">
                <img src="img/s3.jpg" alt="图片飞月球了">
                <div class="caption">
                    <h5><a href="">法瑞意德12日游</a></h5>
                    <p>4至5星，金色列车，少女峰，部分THE MALL
                    </p>
                </div>
            </div>
        </div>
    </div>
    <div class="row">
        <div class="col-sm-6 col-md-3">
            <div class="thumbnail">
                <img src="img/s5.jpg" alt="图片飞月球了">
                <div class="caption">
                    <h5><a href="">曼谷-芭提雅6日游</a></h5>
                    <p>包团特惠，超丰富景点，升级1晚周五，无自费，更送600元/成人自费券
                    </p>
                </div>
            </div>
        </div>
        <div class="col-sm-6 col-md-3">
            <div class="thumbnail">
                <img src="img/s6.jpg" alt="图片飞月球了">
                <div class="caption">
                    <h5><a href="">富山-大阪-东京8日游</a></h5>
                    <p>暑假亲自，2天自由，无导游安排自费项目，全程不强迫购物
                    </p>
                </div>
            </div>
        </div>
        <div class="col-sm-6 col-md-3">
            <div class="thumbnail">
                <img src="img/s7.jpg" alt="图片飞月球了">
                <div class="caption">
                    <h5><a href="">马尔代夫双鱼岛Olhuceli4晚6日自助游</a></h5>
                    <p>
                        上海出发，酒包含：早晚餐+快艇，全程不强迫购物
                    </p>
                </div>
            </div>
        </div>
        <div class="col-sm-6 col-md-3">
            <div class="thumbnail">
                <img src="img/s8.jpg" alt="图片飞月球了">
                <div class="caption">
                    <h5><a href="">法瑞意德12日游</a></h5>
                    <p>4至5星，金色列车，少女峰，部分THE MALL
                    </p>
                </div>
            </div>
        </div>
    </div>
</div>
<!-- 巨幕 -->
<div class="jumbotron content">
    <h1>Hello, world!<small>随心去旅行</small></h1>
    <p>This is a simple hero unit, a simple jumbotron-style component for calling extra attention to featured
        content or information.</p>
    <p><a class="btn btn-primary btn-lg" href="#" role="button">了解更多...</a></p>
</div>
<div class="container">
    <div class="media">
        <div class="media-left media-middle">
            <a href="#">
                <img class="media-object" src="img/hot1.jpg" alt="图片飞了">
            </a>
        </div>
        <div class="media-body">
            <h4 class="media-heading">海南双飞5日游</h4>
            含盐城接送，全程挂牌四星酒店，一价全含，零自费“自费项目”免费送,包团特惠，超丰富景点，升级1晚周五，无自费，更送600元/成人自费券,
            暑假亲自，2天自由，无导游安排自费项目，全程不强迫购物,上海出发，酒包含：早晚餐+快艇，全程不强迫购物,4至5星，金色列车，少女峰，部分THE MALL.
        </div>
    </div>
    <div class="media">
        <div class="media-left media-middle">
            <a href="#">
                <img class="media-object" src="img/hot2.jpg" alt="图片飞了">
            </a>
        </div>
        <div class="media-body">
            <h4 class="media-heading">厦门双飞5日游</h4>
            含盐城接送，全程挂牌四星酒店，一价全含，零自费“自费项目”免费送,包团特惠，超丰富景点，升级1晚周五，无自费，更送600元/成人自费券,
            暑假亲自，2天自由，无导游安排自费项目，全程不强迫购物,上海出发，酒包含：早晚餐+快艇，全程不强迫购物,4至5星，金色列车，少女峰，部分THE MALL.
        </div>
    </div>
    <div class="media">
        <div class="media-left media-middle">
            <a href="#">
                <img class="media-object" src="img/hot3.jpg" alt="图片飞了">
            </a>
        </div>
        <div class="media-body">
            <h4 class="media-heading">桂林双飞5日游</h4>
            含盐城接送，全程挂牌四星酒店，一价全含，零自费“自费项目”免费送,包团特惠，超丰富景点，升级1晚周五，无自费，更送600元/成人自费券,
            暑假亲自，2天自由，无导游安排自费项目，全程不强迫购物,上海出发，酒包含：早晚餐+快艇，全程不强迫购物,4至5星，金色列车，少女峰，部分THE MALL.
        </div>
    </div>
    <div class="media">
        <div class="media-left media-middle">
            <a href="#">
                <img class="media-object" src="img/hot4.jpg" alt="图片飞了">
            </a>
        </div>
        <div class="media-body">
            <h4 class="media-heading">西藏双飞5日游</h4>
            含盐城接送，全程挂牌四星酒店，一价全含，零自费“自费项目”免费送,包团特惠，超丰富景点，升级1晚周五，无自费，更送600元/成人自费券,
            暑假亲自，2天自由，无导游安排自费项目，全程不强迫购物,上海出发，酒包含：早晚餐+快艇，全程不强迫购物,4至5星，金色列车，少女峰，部分THE MALL.
        </div>
    </div>
    <div class="media">
        <div class="media-left media-middle">
            <a href="#">
                <img class="media-object" src="img/hot5.jpg" alt="图片飞了">
            </a>
        </div>
        <div class="media-body">
            <h4 class="media-heading">大理双飞5日游</h4>
            含盐城接送，全程挂牌四星酒店，一价全含，零自费“自费项目”免费送,包团特惠，超丰富景点，升级1晚周五，无自费，更送600元/成人自费券,
            暑假亲自，2天自由，无导游安排自费项目，全程不强迫购物,上海出发，酒包含：早晚餐+快艇，全程不强迫购物,4至5星，金色列车，少女峰，部分THE MALL.
        </div>
    </div>
    <div class="media">
        <div class="media-left media-middle">
            <a href="#">
                <img class="media-object" src="img/hot6.jpg" alt="图片飞了">
            </a>
        </div>
        <div class="media-body">
            <h4 class="media-heading">蒙古草原双飞5日游</h4>
            含盐城接送，全程挂牌四星酒店，一价全含，零自费“自费项目”免费送,包团特惠，超丰富景点，升级1晚周五，无自费，更送600元/成人自费券,
            暑假亲自，2天自由，无导游安排自费项目，全程不强迫购物,上海出发，酒包含：早晚餐+快艇，全程不强迫购物,4至5星，金色列车，少女峰，部分THE MALL.
        </div>
    </div>
    <div class="media">
        <div class="media-left media-middle">
            <a href="#">
                <img class="media-object" src="img/hot7.jpg" alt="图片飞了">
            </a>
        </div>
        <div class="media-body">
            <h4 class="media-heading">青海湖双飞5日游</h4>
            含盐城接送，全程挂牌四星酒店，一价全含，零自费“自费项目”免费送,包团特惠，超丰富景点，升级1晚周五，无自费，更送600元/成人自费券,
            暑假亲自，2天自由，无导游安排自费项目，全程不强迫购物,上海出发，酒包含：早晚餐+快艇，全程不强迫购物,4至5星，金色列车，少女峰，部分THE MALL.
        </div>
    </div>
    <div class="media">
        <div class="media-left media-middle">
            <a href="#">
                <img class="media-object" src="img/hot8.jpg" alt="图片飞了">
            </a>
        </div>
        <div class="media-body">
            <h4 class="media-heading">九寨沟双飞5日游</h4>
            含盐城接送，全程挂牌四星酒店，一价全含，零自费“自费项目”免费送,包团特惠，超丰富景点，升级1晚周五，无自费，更送600元/成人自费券,
            暑假亲自，2天自由，无导游安排自费项目，全程不强迫购物,上海出发，酒包含：早晚餐+快艇，全程不强迫购物,4至5星，金色列车，少女峰，部分THE MALL.
        </div>
    </div>
</div>
<div class="alert alert-danger content" role="alert">
    <a href=""><img src="img/headline.jpg" alt=""></a>
    <h3><a href="#" class="alert-link">世界那么大，我想去看看！</a>Well done!</h3>
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





<script type="text/javascript">
    //模态框
    $('#exampleModal').on('show.bs.modal', function (event) {
        var button = $(event.relatedTarget) // Button that triggered the modal
        var recipient = button.data('whatever') // Extract info from data-* attributes
        // If necessary, you could initiate an AJAX request here (and then do the updating in a callback).
        // Update the modal's content. We'll use jQuery here, but you could use a data binding library or other methods instead.
        var modal = $(this)
        modal.find('.modal-title').text('New message to ' + recipient)
        modal.find('.modal-body input').val(recipient)
    })

    //定时器
    $('.carousel').carousel({
        interval: 1000
    })
</script>
</body>

</html>