s<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
  String path = request.getContextPath();
  String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<html>

<head>
  <base href="<%=basePath%>">
  <meta http-equiv="Content-Type" content="text/html;charset=UTF-8">
  <title>用户管理</title>
  <link rel="stylesheet" type="text/css" href="<%=basePath%>/static/css/master.css">
</head>

<body>
<div class="warp">
  <div class="head">
    <div class="title">
      <h2>管理平台</h2>
    </div>
    <div></div>
  </div>
  <div class="content">
    <div class="nav">
      <ul>
        <li>
          平台概况
        </li>
        <li>
          内容管理
        </li>
        <li>
          用户管理
        </li>
      </ul>
    </div>
    <div class="main">
      <div class="main-head">
        <h3>用户管理</h3>
      </div>
      <div class="main-content">
        <div class="title">
          <a class="addBtn" id="addBtn" href="<%=basePath%>/rest/student/studentAdd">新增</a>
        </div>
        <div class="table">
          <table  id="show_list">

          </table>
        </div>
      </div>
    </div>
  </div>
  <script type="text/javascript" src="<%=basePath%>/static/js/jquery-1.8.3.js"></script>
  <script type="text/javascript" src="<%=basePath%>/static/js/student.js"></script>
</body>

</html>

