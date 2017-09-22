<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <title>仁仁德康复|产品管理-品牌管理</title>
    <meta name="description" content="这是一个 index 页面">
    <meta name="keywords" content="index">
    <jsp:include page="common/page_header.jsp"/>
</head>

<body data-type="widgets">
<script src="/resource/js/theme.js"></script>
<div class="am-g tpl-g">
    <jsp:include page="common/top_bar.jsp"/>
    <jsp:include page="common/theme.jsp"/>
    <jsp:include page="common/left_side_bar.jsp"/>

    <!-- 内容区域 -->
    <div class="tpl-content-wrapper">
        <div class="row">
            <div class="am-u-sm-12 am-u-md-12 am-u-lg-12">
                <div class="widget am-cf">
                    <div class="widget-head am-cf">
                        <div class="widget-title am-fl">新增品牌</div>
                    </div>
                    <div class="widget-body am-fr">

                        <form class="am-form tpl-form-border-form tpl-form-border-br">

                            <div class="am-form-group">
                                <label for="user-logo" class="am-u-sm-3 am-form-label">品牌Logo</label>
                                <div class="am-u-sm-9">
                                    <div class="am-form-group am-form-file">
                                        <div class="tpl-form-file-img">
                                            <img src="" alt="" hidden>
                                        </div>
                                        <button type="button" class="am-btn am-btn-danger am-btn-sm">
                                            <i class="am-icon-cloud-upload"></i> 选择图片</button>
                                        <input id="user-logo" type="file" multiple="">
                                    </div>
                                </div>
                            </div>

                            <div class="am-form-group">
                                <label for="user-name" class="am-u-sm-3 am-form-label">品牌名称</label>
                                <div class="am-u-sm-9">
                                    <input type="text" class="tpl-form-input" id="user-name" placeholder="请输入品牌名称">
                                </div>
                            </div>

                            <div class="am-form-group">
                                <label for="user-status" class="am-u-sm-3 am-form-label">状态</label>
                                <div class="am-u-sm-9">
                                    <select data-am-selected id="user-status" style="display: none;">
                                        <option value="a">有效</option>
                                        <option value="b">无效</option>
                                    </select>
                                </div>
                            </div>

                            <div class="am-form-group">
                                <label for="user-intro" class="am-u-sm-3 am-form-label">品牌简介</label>
                                <div class="am-u-sm-9">
                                    <textarea class="" rows="10" id="user-intro" placeholder="请输入品牌简介"></textarea>
                                </div>
                            </div>

                            <div class="am-form-group">
                                <div class="am-u-sm-9 am-u-sm-push-3">
                                    <button type="button" class="am-btn am-btn-primary tpl-btn-bg-color-success ">提交</button>
                                </div>
                            </div>
                        </form>
                    </div>
                </div>
            </div>
        </div>
    </div>
</div>
</div>
<jsp:include page="common/page_footer.jsp"/>
<script src="/resource/js/amazeui.datatables.min.js"></script>
<script src="/resource/js/dataTables.responsive.min.js"></script>
</body>
</html>