var table = $("#exampleTableToolbar");

table.bootstrapTable({
    url: "/jsp/admin/subjectList",//具体请求地址
    method: 'post',//请求方式
    cache: false,                      //是否使用缓存，默认为true，所以一般情况下需要设置一下这个属性（*）
    pagination: true,                  //是否显示分页（*）
    search: false,//是否开启搜索框
    showRefresh: false,//是否显示刷新框
    sidePagination: "server",          //分页方式：client客户端分页，server服务端分页（*）
    queryParams: queryParams,//传递参数（*）
    pageSize: 10,                      //每页的记录行数（*）
    showColumns: !0//是否显示columns按钮
    // uniqueId: "ID"//主键id
});

//题目表参数传递
function queryParams(params) {
    return {
        limit:params.limit,//每页数据条数
        offset:params.offset//当前页偏移
    };
}