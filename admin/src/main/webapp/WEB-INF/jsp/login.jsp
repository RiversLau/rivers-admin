<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c"%>
<!DOCTYPE html>
<html>
<head>
    <title>仁仁德康复 | 登录</title>
    <jsp:include page="common/page_header.jsp"/>
</head>
<body class="hold-transition login-page">
<div class="login-box">
    <div class="login-logo">
        <img src="/resource/img/logo80_2.png"/>
    </div>
    <div class="login-box-body">
        <p class="login-box-msg">
            登录
        </p>
        <form action="/user/login" method="post">
            <div class="form-group has-feedback">
                <input name="username" type="text" class="form-control" placeholder="用户名">
                <span class="glyphicon glyphicon-user form-control-feedback"></span>
            </div>
            <div class="form-group has-feedback">
                <input name="password" type="password" class="form-control" placeholder="密码">
                <span class="glyphicon glyphicon-lock form-control-feedback"></span>
            </div>
            <div class="form-group has-feedback">
                <div class="checkbox icheck">
                    <label>
                        <input id="remember" type="checkbox" checked="checked" name="remember" value="1">&nbsp;&nbsp;&nbsp;记住密码
                    </label>
                </div>
            </div>
            <div class="form-group has-feedback">
                <button type="submit" class="btn btn-primary btn-block">登录</button>
            </div>
        </form>
        <a href="#">系统帮助</a><br>
        <a href="#" class="text-center">忘记密码</a>
    </div>
</div>
<script src="/resource/plugins/jQuery/jquery-2.2.3.min.js"></script>
<script src="/resource/bootstrap/js/bootstrap.min.js"></script>
<script src="/resource/plugins/iCheck/icheck.min.js"></script>
<script>
    $(function () {
        $('input').iCheck({
            checkboxClass: 'icheckbox_square-blue',
            radioClass: 'iradio_square-blue',
            increaseArea: '30%' // optional
        });

        $('#remember').on('ifClicked', function () {
           if($(this).attr("checked", true)) {
               $(this).iCheck('uncheck');
               $(this).attr('checked', false);
               $(this).attr("value", "0");
           } else {
               $(this).iCheck('check');
               $(this).attr('checked', true);
               $(this).attr("value", "1");
           }
        });
    });
</script>
</body>
</html>
