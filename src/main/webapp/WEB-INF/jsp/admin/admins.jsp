<%--
  Created by IntelliJ IDEA.
  User: chenwei
  Date: 2017/11/29
  Time: 14:41
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html lang="zh-cn">
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
    <meta name="viewport" content="width=device-width,initial-scale=1.0,maximum-scale=1.0,user-scalable=no">
    <title>管理员</title>
    <meta name="description" content="">
    <meta name="keywords" content="">
    <!-- Bootstrap -->
    <link rel="stylesheet" href="http://cdn.bootcss.com/bootstrap/3.3.0/css/bootstrap.min.css">
    <link href="" rel="stylesheet">
</head>
<body>
<div class="container">

    <h1>系统管理员-图书管理</h1>
    <hr/>

    <table width="100%">
        <tbody>
        <tr valign="top">
            <td width="145px" style="padding-left: 20px">
                <ul class="nav nav-pills nav-stacked" style="width:120px">
                    <li role="presentation" style="width:100%"><a href="/admin/books">管理全部图书</a></li>
                    <li role="presentation" style="width:100%"><a href="#">管理全部类别</a></li>
                    <li role="presentation" style="width:100%"><a href="/admin/cards">管理借阅证</a></li>
                    <li role="presentation" style="width:100%" class="active" ><a href="/admin/admins">管理管理员</a></li>
                    <li role="presentation" style="width:100%"><a href="#">借阅归还图书</a></li>
                    <li role="presentation" style="width:100%"><a href="#">查询借阅信息</a></li>
                </ul>
            </td>

            <td align="left" style="padding-left: 10px;padding-right: 10px">
                <div>
                    <h3 style="display: inline">所有管理员 <a href="/admin/admins/add" type="button" class="btn btn-primary btn-sm">添加</a></h3>
                    <div style="position: relative;float: right;display: inline">
                        <form action="/admin/admins/select" method="post">
                            <div class="input-group" style="margin-right: 10px;width: 200px">
                                <input class="form-control" name="searchAdminsByName" placeholder="搜索管理员.." required=""/>
                                <span class="input-group-btn ">
                                    <button class="btn btn-default" type="submit">
                                    <span class="glyphicon glyphicon-search"></span>
                                    </button>
                                </span>
                            </div>
                        </form>
                    </div>
                </div>
                <br/>

                <%--如果书籍列表为空--%>
                <c:if test="${empty adminList}">
                    <div class="alert alert-warning" role="alert">
                        <span class="glyphicon glyphicon-info-sign" aria-hidden="true"></span>管理员列表为空，请<a href="/admin/admins/add" type="button" class="btn btn-primary btn-sm">添加</a>
                    </div>
                </c:if>

                <%--如果书籍列表非空--%>
                <c:if test="${!empty adminList}">
                    <table class="table table-bordered table -striped">
                        <tr>
                            <th>管理员ID</th>
                            <th>用户名</th>
                            <th>密码</th>
                            <th>类型</th>
                            <th>操作</th>
                        </tr>


                        <c:forEach items="${adminList}" var="admin">
                            <tr>
                                <td>${admin.adminId}</td>
                                <td>${admin.adminName}</td>
                                <td>${admin.adminPassword}</td>
                                <td>${admin.userType}</td>
                                <td>
                                    <a href="/admin/admins/show/${admin.adminId}" type="button" class="btn btn-sm btn-success">详情</a>
                                    <a href="/admin/admins/update/${admin.adminId}" type="button" class="btn btn-sm btn-warning">修改</a>
                                    <a href="/admin/admins/delete/${admin.adminId}" type="button" class="btn btn-sm btn-danger">删除</a>
                                </td>
                            </tr>
                        </c:forEach>
                    </table>
                </c:if>
            </td>
        </tr>
        </tbody>
    </table>
</div>


<!-- Bootstrap core JavaScript
================================================== -->
<!-- jQuery文件。务必在bootstrap.min.js 之前引入 -->
<script src="http://cdn.bootcss.com/jquery/1.11.1/jquery.min.js"></script>
<!-- 最新的 Bootstrap 核心 JavaScript 文件 -->
<script src="http://cdn.bootcss.com/bootstrap/3.3.0/js/bootstrap.min.js"></script>
</body>
</html>
