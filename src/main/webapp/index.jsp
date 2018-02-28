<%--
  Created by IntelliJ IDEA.
  User: chenwei
  Date: 2017/11/28
  Time: 21:32
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="utf-8">
    <meta name="author" content="陈伟">
    <meta name="viewport" content="width=device-width, initial-scale=1">

    <title>图书管理系统</title>

    <link rel="stylesheet" href="http://cdn.bootcss.com/bootstrap/3.3.0/css/bootstrap.min.css">

    <link href="<%=request.getContextPath()%>/css/cover.css"rel="stylesheet">

</head>
<body>
<div class="site-wrapper">

    <div class="site-wrapper-inner">

        <div class="cover-container">

            <div class="masthead clearfix">
                <div class="inner">
                    <h2 class="masthead-brand">图书管理系统</h2>
                    <ul class="nav masthead-nav">
                        <li class="active"><a href="start.html">主页</a></li>
                        <li><a href="#">关于我们</a></li>
                        <li><a href="#">源码下载</a></li>
                    </ul>
                </div>
            </div>
            <div class="inner cover">
                <h1 class="cover-heading">Welcome</h1>
                <p class="lead">
                    此图书管理系统由软件工程一班陈大官人历时两周呕心历血完成。感谢王涛老师，感谢湛燕老师，
                    感谢Bootstrap开源框架，感谢Goolge，感谢SSM框架，感谢河北大学，感谢中国共产党。
                </p>
                <p class="lead" >
                    <a href="/login" class="btn btn-lg btn-default" >登录</a>
                </p>
            </div>
            <div class="mastfoot">
                <div class="inner">
                    <p>Copyright &copy; 2017 陈伟  All rights reserved.<a target="_blank" href="<%=request.getContextPath()%>/index.jsp">图书管理系统;</a></p>
                </div>
            </div>
        </div>
    </div>
</div>
</body>
</html>
