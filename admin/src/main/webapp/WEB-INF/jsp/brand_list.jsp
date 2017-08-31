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
        <div class="row-content am-cf">
            <div class="row">
                <div class="am-u-sm-12 am-u-md-12 am-u-lg-12">
                    <div class="widget am-cf">
                        <div class="widget-head am-cf">
                            <div class="widget-title  am-cf">品牌列表</div>
                        </div>
                        <div class="widget-body  am-fr">
                            <div class="am-u-sm-12 am-u-md-6 am-u-lg-3">
                                <div class="am-form-group">
                                    <div class="am-btn-toolbar">
                                        <div class="am-btn-group am-btn-group-xs">
                                            <button type="button" class="am-btn am-btn-default am-btn-success"><span
                                                    class="am-icon-plus"></span> 新增品牌
                                            </button>
                                        </div>
                                    </div>
                                </div>
                            </div>
                            <div class="am-u-sm-12 am-u-md-12 am-u-lg-3">
                                <div class="am-input-group am-input-group-sm tpl-form-border-form cl-p">
                                    <input type="text" class="am-form-field ">
                                    <span class="am-input-group-btn">
                                        <button class="am-btn am-btn-default am-btn-success tpl-table-list-field am-icon-search"
                                                type="button"></button>
                                    </span>
                                </div>
                            </div>

                            <div class="am-u-sm-12">
                                <table width="100%" class="am-table am-table-compact am-table-striped tpl-table-black"
                                       id="example-r">
                                    <thead>
                                    <tr>
                                        <th>品牌名称</th>
                                        <th>状态</th>
                                        <th>创建时间</th>
                                        <th>更新时间</th>
                                        <th>操作</th>
                                    </tr>
                                    </thead>
                                    <tbody>
                                        <c:if test="${pageInfo != null && pageInfo.list != null && !empty pageInfo.list}">
                                            <c:forEach var="brand" items="${pageInfo.list}">
                                                <c:if test="${fn:length(pageInfo.list) % 2 == 1}">
                                                    <tr class="gradeX">
                                                        <td>${brand.name}</td>
                                                        <td>
                                                            <c:if test="${brand.status == 'AVAILABLE'}">
                                                                可用
                                                            </c:if>
                                                            <c:if test="${brand.status == 'FORBIDDEN'}">
                                                                禁用
                                                            </c:if>
                                                            <c:if test="${brand.status == 'DELETED'}">
                                                                删除
                                                            </c:if>
                                                        </td>
                                                        <td>${brand.createTimeStr}</td>
                                                        <td>${brand.updateTimeStr}</td>
                                                        <td>
                                                            <div class="tpl-table-black-operation">
                                                                <a href="javascript:;">
                                                                    <i class="am-icon-pencil"></i> 编辑
                                                                </a>
                                                                <a href="javascript:;" class="tpl-table-black-operation-del">
                                                                    <i class="am-icon-trash"></i> 删除
                                                                </a>
                                                            </div>
                                                        </td>
                                                    </tr>
                                                </c:if>
                                                <c:if test="${fn:length(pageInfo.list) % 2 == 0}">
                                                    <tr class="gradeC">
                                                        <td>${brand.name}</td>
                                                        <td>
                                                            <c:if test="${brand.status == 'AVAILABLE'}">
                                                                可用
                                                            </c:if>
                                                            <c:if test="${brand.status == 'FORBIDDEN'}">
                                                                禁用
                                                            </c:if>
                                                            <c:if test="${brand.status == 'DELETED'}">
                                                                删除
                                                            </c:if>
                                                        </td>
                                                        <td>${brand.createTimeStr}</td>
                                                        <td>${brand.updateTimeStr}</td>
                                                        <td>
                                                            <div class="tpl-table-black-operation">
                                                                <a href="javascript:;">
                                                                    <i class="am-icon-pencil"></i> 编辑
                                                                </a>
                                                                <a href="javascript:;" class="tpl-table-black-operation-del">
                                                                    <i class="am-icon-trash"></i> 删除
                                                                </a>
                                                            </div>
                                                        </td>
                                                    </tr>
                                                </c:if>
                                            </c:forEach>
                                        </c:if>
                                    </tbody>
                                </table>
                            </div>
                            <div class="am-u-lg-12 am-cf">
                                <div class="am-fr">
                                    <ul class="am-pagination tpl-pagination">
                                        <li class="am-disabled"><a href="#">«</a></li>
                                        <li class="am-active"><a href="#">1</a></li>
                                        <li><a href="#">2</a></li>
                                        <li><a href="#">3</a></li>
                                        <li><a href="#">4</a></li>
                                        <li><a href="#">5</a></li>
                                        <li><a href="#">»</a></li>
                                    </ul>
                                </div>
                            </div>
                        </div>
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