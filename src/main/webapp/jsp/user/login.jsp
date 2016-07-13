<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head lang="en">
  <meta charset="UTF-8">
  <title>Login Page | Amaze UI Example</title>
  <meta http-equiv="X-UA-Compatible" content="IE=edge">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <meta name="format-detection" content="telephone=no">
  <meta name="renderer" content="webkit">
  <meta http-equiv="Cache-Control" content="no-siteapp" />
  <link rel="alternate icon" type="image/png" href="../../assets/i/favicon.png">
  <link rel="stylesheet" href="../../assets/css/amazeui.min.css"/>

  <style>

    .header {
      text-align: center;
    }
    .header h1 {
      font-size: 200%;
      color: #333;
      margin-top: 30px;
    }
    .header p {
      font-size: 14px;
    }
  </style>
</head>

<body>
<div class="header">
  <div class="am-g">
    <h1>在线考试系统</h1>
  </div>

</div>

  <div class="am-u-lg-6 am-u-md-8 am-u-sm-centered">
      <div class="am-u-md-8 am-u-sm-centered">
        <form method="post" class="am-form" action="/jsp/user/login" >
          <%--用户名--%>
          <div class="am-input-group am-form-group">
            <span class="am-input-group-label"><i class="am-icon-user am-icon-fw"></i></span>
            <input type="text" class="am-form-field" name="userName" placeholder="用户名">
          </div>
          <%--密码--%>
          <div class="am-input-group am-form-group">
            <span class="am-input-group-label"><i class="am-icon-lock am-icon-fw"></i></span>
            <input type="password" class="am-form-field" name="userPwd" placeholder="密码">
          </div>

          <div class="am-cf">
            <input type="submit" name="" value="登 录" class="am-btn am-btn-primary am-btn-sm am-fl">
            <button type="button" onClick="window.location.href='/user/register.jsp'" class="am-btn am-btn-success am-btn-sm am-fl">注册 </button>
            <input type="submit" name="" value="忘记密码" class="am-btn am-btn-default am-btn-sm am-fr">
          </div>



        </form>

        <p>© 2016 -------------------------------------------</p>

</div>
</div>
</body>
</html>
