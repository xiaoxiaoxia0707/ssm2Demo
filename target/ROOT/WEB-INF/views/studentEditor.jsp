<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2017/3/22
  Time: 13:19
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path + "/";
%>
<html>
<head>
    <base href="<%=basePath%>">
    <meta content="text/html;charset=utf-8" http-equiv="Content-Type">
    <title>
        用户管理
    </title>
    <link href="<%=basePath%>/static/css/master.css" rel="stylesheet" type="text/css">
    </link>
    </meta>
</head>
<body>
<div class="warp">
    <div class="head">
        <div class="title">
            <h2>
                管理平台
            </h2>
        </div>
        <div>
        </div>
    </div>
    <div class="content">
        <div class="main">
            <div class="main-head">
                <h3>
                    用户管理
                </h3>
            </div>
            <div class="main-content">
                <div class="title">
                    <h6>
                        编辑用户
                    </h6>
                </div>
                <div class="user-form">
                    <div><input id="id" type="hidden" value=""/></div>
                    <div>
                        <label>
                            姓名：
                            <input id="name" type="text" value=""/>
                        </label>
                    </div>
                    <div>
                        <label>
                            学院：
                            <input id="address" type="text" value=""/>
                        </label>
                    </div>
                    <div>
                        <label>
                            专业：
                            <input id="sex" type="text" value="">
                            </input>
                        </label>
                    </div>
                    <div>
                        <input id="submitBtn" type="button" value="提交">
                        </input>
                    </div>
                </div>
            </div>
        </div>
    </div>
    <script src="<%=basePath%>/static/js/jquery-1.8.3.js" type="text/javascript">
    </script>
    <script src="<%=basePath%>/static/js/edit-student.js" type="text/javascript">
    </script>

</div>
</body>
</html>
