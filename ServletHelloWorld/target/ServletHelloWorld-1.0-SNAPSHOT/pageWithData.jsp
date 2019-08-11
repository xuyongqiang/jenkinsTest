<%--
  Created by IntelliJ IDEA.
  User: nero.xu
  Date: 2019/6/1
  Time: 14:57
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>欢迎页面</title>
</head>
<body>
<tr><%=request.getAttribute("username").toString()%>欢迎登录！！！<br/><br/>
    your password is <%=request.getAttribute("password").toString()%><br/><br/></tr>
</body>
</html>
