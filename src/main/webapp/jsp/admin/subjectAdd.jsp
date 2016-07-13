<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html class="no-js fixed-layout">
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <title>Amaze UI Admin form Examples</title>
    <meta name="description" content="这是一个form页面">
    <meta name="keywords" content="form">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta name="renderer" content="webkit">
    <meta http-equiv="Cache-Control" content="no-siteapp" />
    <link rel="icon" type="image/png" href="assets/i/favicon.png">
    <link rel="apple-touch-icon-precomposed" href="assets/i/app-icon72x72@2x.png">
    <meta name="apple-mobile-web-app-title" content="Amaze UI" />
    <link rel="stylesheet" href="http://apps.bdimg.com/libs/bootstrap/3.3.0/css/bootstrap.min.css">
    <link rel="stylesheet" href="/assets/css/amazeui.min.css"/>
    <link rel="stylesheet" href="/assets/css/admin.css">
    <link href="http://cdn.bootcss.com/bootstrap-table/1.9.1/bootstrap-table.min.css" rel="stylesheet"/>
</head>
<body>
<!--[if lte IE 9]>
<p class="browsehappy">你正在使用<strong>过时</strong>的浏览器，Amaze UI 暂不支持。 请 <a href="http://browsehappy.com/" target="_blank">升级浏览器</a>
    以获得更好的体验！</p>
<![endif]-->

<header class="am-topbar am-topbar-inverse admin-header">
    <div class="am-topbar-brand">
        <strong>在线考试系统</strong> <small>made by jyp</small>
    </div>

    <button class="am-topbar-btn am-topbar-toggle am-btn am-btn-sm am-btn-success am-show-sm-only" data-am-collapse="{target: '#topbar-collapse'}"><span class="am-sr-only">导航切换</span> <span class="am-icon-bars"></span></button>

    <div class="am-collapse am-topbar-collapse" id="topbar-collapse">

        <ul class="am-nav am-nav-pills am-topbar-nav am-topbar-right admin-header-list">
            <li><a href="javascript:;"><span class="am-icon-envelope-o"></span> 收件箱 <span class="am-badge am-badge-warning">5</span></a></li>
            <li class="am-dropdown" data-am-dropdown>
                <a class="am-dropdown-toggle" data-am-dropdown-toggle href="javascript:;">
                    <span class="am-icon-users"></span> 管理员 <span class="am-icon-caret-down"></span>
                </a>
                <ul class="am-dropdown-content">
                    <li><a href="#"><span class="am-icon-user"></span> 资料</a></li>
                    <li><a href="#"><span class="am-icon-cog"></span> 设置</a></li>
                    <li><a href="#"><span class="am-icon-power-off"></span> 退出</a></li>
                </ul>
            </li>
            <li class="am-hide-sm-only"><a href="javascript:;" id="admin-fullscreen"><span class="am-icon-arrows-alt"></span> <span class="admin-fullText">开启全屏</span></a></li>
        </ul>
    </div>
</header>

<div class="am-cf admin-main">
    <!-- sidebar start -->
    <div class="admin-sidebar am-offcanvas" id="admin-offcanvas">
        <div class="am-offcanvas-bar admin-offcanvas-bar">
            <ul class="am-list admin-sidebar-list">
                <li><a href="admin-index.html"><span class="am-icon-home"></span> 人员管理</a></li>
                <li><a href="admin-table.html"><span class="am-icon-table"></span> 学科管理</a></li>
                <li><a href="#"><span class="am-icon-sign-out"></span> 注销</a></li>
            </ul>

        </div>
    </div>
    <!-- sidebar end -->

    <!-- content start -->
    <div class="admin-content">
        <!--导航条-->
        <div class="admin-content-body">
            <div class="am-cf am-padding">
                <div class="am-fl am-cf"><strong class="am-text-primary am-text-lg">学科管理</strong> / <small>新增学科</small></div>
            </div>

        <!--把主内容放在这里-->
            <div class="am-tabs am-margin" data-am-tabs>
                <ul class="am-tabs-nav am-nav am-nav-tabs">
                    <li class="am-active"><a href="#tab1">学科信息</a></li>
                </ul>

                <div class="am-tabs-bd">
                    <div class="am-tab-panel am-fade am-in am-active" id="tab1">
                        <form class="am-form" action="/jsp/admin/subject/add" method="post">
                            <div class="am-g am-margin-top">
                                <div class="am-u-sm-4 am-u-md-2 am-text-right">
                                    学科名称
                                </div>
                                <div class="am-u-sm-8 am-u-md-4">
                                    <input type="text" class="am-input-sm" name="subjectName">
                                </div>
                                <div class="am-hide-sm-only am-u-md-6">*必填，不可重复</div>
                            </div>

                            <div class="am-margin">
                                <button type="submit" class="am-btn am-btn-primary am-btn-xs">提交保存</button>
                                <button type="button" class="am-btn am-btn-primary am-btn-xs" onClick="window.location.href='/jsp/admin/subject'">放弃保存 </button>
                            </div>
                        </form>
                    </div>
                </div>

            </div>



        <!-- 主内容结束-->
    </div>
    <!-- content end -->
    </div>
</div>


<!--[if lt IE 9]>
<script src="http://libs.baidu.com/jquery/1.11.1/jquery.min.js"></script>
<script src="http://cdn.staticfile.org/modernizr/2.8.3/modernizr.js"></script>
<script src="assets/js/amazeui.ie8polyfill.min.js"></script>
<![endif]-->

<!--[if (gte IE 9)|!(IE)]><!-->
<script src="http://apps.bdimg.com/libs/jquery/2.1.1/jquery.min.js"></script>
<!--<![endif]-->
<script src="/assets/js/amazeui.min.js"></script>
<script src="/assets/js/app.js"></script>
</body>
</html>
