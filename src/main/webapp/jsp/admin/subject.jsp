<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <link rel="stylesheet" href="http://apps.bdimg.com/libs/bootstrap/3.3.0/css/bootstrap.min.css">
    <link href="http://cdn.bootcss.com/bootstrap-table/1.9.1/bootstrap-table.min.css" rel="stylesheet"/>
    <script src="http://apps.bdimg.com/libs/jquery/2.1.1/jquery.min.js"></script>
    <script src="http://apps.bdimg.com/libs/bootstrap/3.3.0/js/bootstrap.min.js"></script>
    <script src="http://cdn.bootcss.com/bootstrap-table/1.9.1/bootstrap-table.min.js"></script>
    <script src="http://cdn.bootcss.com/bootstrap-table/1.9.1/locale/bootstrap-table-zh-CN.min.js"></script>
    <%--<script src=/static/js/subjectList.js></script>--%>
    <script type="text/javascript">9
        function initTable() {
            //先销毁表格
            $('#cusTable').bootstrapTable('destroy');
            //初始化表格,动态从服务器加载数据
            $("#cusTable").bootstrapTable({
                method: "post",  //使用get请求到服务器获取数据
                url: "/jsp/admin/subjectList", //获取数据的Servlet地址
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
    </script>
</head>
<body>
<%--基于BootstrapTable插件的科目分页页面，只实现了表格部分，后期还需要再编写完整页面--%>
<div class="wrapper wrapper-content">
    <div class="row">
        <div class="col-sm-12">
            <div class="animated fadeInRightBig">
                <!--添加内容区域-->
                <div class="ibox-content">
                    <h4 class="example-title">题目列表</h4>
                    <div class="btn-group hidden-xs"  role="group" id="exampleToolbar">
                        <button type="button" class="btn btn-outline btn-default">
                            <i class="glyphicon glyphicon-plus" aria-hidden="true"></i>
                        </button>
                    </div>
                    <!--添加题目表-->
                    <!--data-toggle="table"是启用bootstrap Table插件的标识-->
                    <table  id="cusTable" data-toggle="table" >
                        <thead>
                        <tr>
                            <%--data-field的值为Entity类的属性值，不是数据库字段--%>
                            <th data-field="subjectId" >科目ID</th>
                            <th data-field="subjectName">科目名称</th>
                            <th data-field="subjectCreateDate">创建时间</th>
                        </tr>
                        </thead>
                    </table>
                </div>
                <!--添加题目表结束,无需添加底部分页的组件-->

            </div>
        </div>
    </div>
</div>
</body>
</html>
