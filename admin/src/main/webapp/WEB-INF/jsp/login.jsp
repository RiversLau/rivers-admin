<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <title>仁仁德康复|登录</title>
    <meta name="description" content="这是一个 index 页面">
    <meta name="keywords" content="index">
    <jsp:include page="common/page_header.jsp"/>
</head>

<body data-type="login">
<script src="/resource/js/theme.js"></script>
<div class="am-g tpl-g">
    <jsp:include page="common/theme.jsp"/>
    <div class="tpl-login">
        <div class="tpl-login-content">
            <div class="tpl-login-logo">

            </div>
            <form action="/user/login" method="post" class="am-form tpl-form-line-form">
                <div class="am-form-group">
                    <input type="text" class="tpl-form-input" name="username" placeholder="请输入账号">
                </div>
                <div class="am-form-group">
                    <input type="password" class="tpl-form-input" name="password" placeholder="请输入密码">
                </div>
                <div class="am-form-group tpl-login-remember-me">
                    <input id="remember-me" type="checkbox">
                    <label for="remember-me">
                        记住密码
                    </label>
                </div>
                <div class="am-form-group">
                    <button type="submit" class="am-btn am-btn-primary am-btn-block tpl-btn-bg-color-success tpl-login-btn">提交
                    </button>
                </div>
            </form>
        </div>
    </div>
</div>
<jsp:include page="common/page_footer.jsp"/>
</body>
</html>