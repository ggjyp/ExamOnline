// $.ajax({ //一个Ajax过程
//     type: "post", //以post方式与后台沟通
//     url :"/jsp/user/register/check_username", //与此页面沟通
//     dataType:'json',//返回的值以 JSON方式 解释
//     data: 'userName='+obj.value, //发给的数据
//     success: function(json){//如果调用成功
//         if(json.flag){
//             alert("yes!.");
//         }else {
//             alert("no!.");
//         }
//     }
// });

function editOnClick (obj) {
    alert("编辑按钮被点击，row=" + obj.value)
}