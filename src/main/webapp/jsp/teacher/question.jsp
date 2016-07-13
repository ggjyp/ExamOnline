<%@page pageEncoding="UTF-8" contentType="text/html; charset=UTF-8" %>
<html class="no-js fixed-layout">
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <title>jyp的在线考试系统</title>
    <meta name="description" content="教师管理界面">
    <meta name="keywords" content="index">
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
                    <span class="am-icon-users"></span> 教师 <span class="am-icon-caret-down"></span>
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
                <li><a href="admin-index.html"><span class="am-icon-home"></span> 试题管理</a></li>
                <li><a href="#"><span class="am-icon-table"></span> 考试管理</a></li>
                <li><a href="#"><span class="am-icon-table"></span> 成绩管理</a></li>
                <li><a href="#"><span class="am-icon-sign-out"></span> 注销</a></li>
            </ul>
        </div>
    </div>
    <!-- sidebar end -->

    <!-- content start -->
    <div class="admin-content">
        <div class="admin-content-body">
        <!--导航条-->

            <div class="am-cf am-padding">
                <div class="am-fl am-cf"><strong class="am-text-primary am-text-lg">试题管理</strong> / <small>试题列表</small></div>
            </div>
        <!--把主内容放在这里-->
        <div class="am-u-sm-12 am-u-md-6">
            <div class="am-btn-toolbar">
                <div class="am-btn-group am-btn-group-xs">
                    <button type="button" onClick="window.location.href='./questionAdd'"  class="am-btn am-btn-default" ><span class="am-icon-plus"></span> 新增</button>
                </div>
            </div>
        </div>
            <hr>
        <%--基于BootstrapTable插件的科目分页页面，只实现了表格部分，后期还需要再编写完整页面--%>
        <div class="am-g">
            <div class="row">
                <div class="col-sm-12">
                    <div class="animated fadeInRightBig">
                        <!--添加内容区域-->
                        <div class="am-u-sm-12">
                            <!--添加题目表-->
                            <!--data-toggle="table"是启用bootstrap Table插件的标识-->
                            <table  id="questionTable" data-toggle="table" >
                                <thead>
                                <tr>
                                    <%--data-field的值为Entity类的属性值，不是数据库字段--%>
                                    <th data-field="questionId" >试题ID</th>
                                    <%--科目名称来自QuestionSubject辅助类--%>
                                    <th data-field="subjectName">科目名称</th>
                                    <th data-field="questionBody">试题内容</th>
                                    <th data-field="questionDifficulty">试题难度</th>
                                    <th data-field="questionScore">试题分数</th>
                                    <th data-field="answer">正确答案</th>
                                    <th data-field="action" data-formatter="actionFormatter" data-events="actionEvents">操作</th>

                                </tr>
                                </thead>
                            </table>
                        </div>
                        <!--添加题目表结束,无需添加底部分页的组件-->
                    </div>
                </div>
            </div>
        </div>
        <!-- 内容结束-->
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
<script src="http://apps.bdimg.com/libs/bootstrap/3.3.0/js/bootstrap.min.js"></script>
<script src="http://cdn.bootcss.com/bootstrap-table/1.9.1/bootstrap-table.min.js"></script>
<script src="http://cdn.bootcss.com/bootstrap-table/1.9.1/locale/bootstrap-table-zh-CN.min.js"></script>
<!--<![endif]-->
<script src="/assets/js/amazeui.min.js"></script>
<script src="/assets/js/app.js"></script>
<script type="text/javascript">9
function initTable() {
    //先销毁表格
    $('#questionTable').bootstrapTable('destroy');
    //初始化表格,动态从服务器加载数据
    $("#questionTable").bootstrapTable({
        method: "post",  //使用post请求到服务器获取数据
        url: "/jsp/teacher/questionList", //获取数据的Servlet地址
        striped: true,  //表格显示条纹
        pagination: true, //启动分页
        pageSize: 10,  //每页显示的记录数
        pageNumber:1, //当前第几页
        pageList: [5, 10, 15, 20, 25],  //记录数可选列表
        search: false,  //是否启用查询
        showColumns: true,  //显示下拉框勾选要显示的列
        showRefresh: true,  //显示刷新按钮
        sidePagination: "server", //表示服务端请求
        //设置为undefined可以获取pageNumber，pageSize，searchText，sortName，sortOrder
        //设置为limit可以获取limit, offset, search, sort, order
        queryParamsType : "undefined",
        queryParams: function queryParams(params) {   //设置查询参数
            var param = {
                pageNumber: params.pageNumber,
                pageSize: params.pageSize,
            };
            return param;
        },
    });
}

$(document).ready(function () {
    //调用函数，初始化表格
    initTable();

    //当点击查询按钮的时候执行
    $("#search").bind("click", initTable);
});

function actionFormatter(value, row, index) {
    return [
        '<div class="am-btn-toolbar">' +
        '<div class="am-btn-group am-btn-group-xs">' +
        '<button class="am-btn am-btn-default am-btn-xs am-text-secondary edit"><span class="am-icon-pencil-square-o"></span> 编辑</button>' +
        '<button class="am-btn am-btn-default am-btn-xs am-text-danger am-hide-sm-only delete"><span class="am-icon-trash-o"></span> 删除</button>' +
        '</div>'+
        '</div>'
    ].join('');
}

window.actionEvents = {
    'click .edit': function (e, value, row, index) {
        //获取当前行对象
        var obj = jQuery.parseJSON(JSON.stringify(row));
        window.location.href='/jsp/teacher/questionEdit?questionId='+obj.questionId
        //注：这个是异步的，不适合跳转场合
//        $.get("/jsp/admin/subject/edit", { subjectId: obj.subjectId}, function(xhr ){
//        });
    },
    'click .delete': function (e, value, row, index) {
        var r=confirm("确认删除该试题?");
        if (r==true)
        {
            $.ajax({ //一个Ajax过程
                type: "post", //以post方式与后台沟通
                url :"/jsp/teacher/questionDelete", //与此页面沟通
                dataType:'json',//返回的值以 JSON方式 解释
                data:JSON.parse(JSON.stringify(row)), //发给的数据
                success: function(json){//如果调用成功
                    if(json.flag){
                        initTable();
                    }else {
                        alert("删除失败");
                    }
                }
            });
        }
        else
        {
            return;
        }
    }
};
</script>
</body>
</html>
