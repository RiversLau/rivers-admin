<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <title>仁仁德康复 | 产品列表</title>
    <jsp:include page="common/page_header.jsp"/>
    <link rel="stylesheet" href="/resource/plugins/datatables/dataTables.bootstrap.css">
</head>
<body class="hold-transition skin-blue sidebar-mini">
<div class="wrapper">
    <jsp:include page="common/top_bar.jsp"/>
    <jsp:include page="common/left_side_bar.jsp"/>

    <div class="content-wrapper">
        <section class="content-header">
            <h1>
                产品管理
            </h1>
            <ol class="breadcrumb">
                <li><a href="#"><i class="fa fa-dashboard"></i>首页</a></li>
                <li class="active">产品管理</li>
            </ol>
        </section>

        <section class="content">
            <div class="row">
                <div class="col-xs-12">
                    <div class="box">
                        <div class="box-header">
                            <h3 class="box-title">产品信息列表</h3>
                        </div>
                        <div class="box-body">
                            <table id="example1" class="table table-bordered table-striped">
                                <thead>
                                <tr>
                                    <th>名称</th>
                                    <th>编码</th>
                                    <th>品牌</th>
                                    <th>售价</th>
                                    <th>市面价</th>
                                    <th>状态</th>
                                    <th>创建时间</th>
                                    <th>更新时间</th>
                                </tr>
                                </thead>
                                <tbody>
                                <tr>
                                    <td>手指固定夹板</td>
                                    <td>KS-3202</td>
                                    <td>科莱瑞迪</td>
                                    <td>378</td>
                                    <td>780</td>
                                    <td>上架</td>
                                    <td>2017-08-30 10:20</td>
                                    <td>2017-08-30 10:20</td>
                                </tr>
                                </tbody>
                            </table>
                        </div>
                    </div>
                </div>
            </div>
        </section>
    </div>
    <jsp:include page="common/copyright_footer.jsp"/>
    <div class="control-sidebar-bg"></div>
</div>
<script src="/resource/plugins/jQuery/jquery-2.2.3.min.js"></script>
<script src="/resource/bootstrap/js/bootstrap.min.js"></script>
<script src="/resource/plugins/datatables/jquery.dataTables.min.js"></script>
<script src="/resource/plugins/datatables/dataTables.bootstrap.min.js"></script>
<script src="/resource/plugins/slimScroll/jquery.slimscroll.min.js"></script>
<script src="/resource/plugins/fastclick/fastclick.js"></script>
<script src="/resource/dist/js/app.min.js"></script>
<script src="/resource/dist/js/demo.js"></script>
<script>
    $(function () {
        $('#example1').DataTable({
            "paging":true,
            "searching":true,
            "autoWidth":true
        });
        $('#example2').DataTable({
            "paging": true,
            "lengthChange": false,
            "searching": false,
            "ordering": true,
            "info": true,
            "autoWidth": false
        });
    });
</script>
</body>
</html>

