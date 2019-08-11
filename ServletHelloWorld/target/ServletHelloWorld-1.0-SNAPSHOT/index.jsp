<%--
  Created by IntelliJ IDEA.
  User: nero.xu
  Date: 2019/6/1
  Time: 14:12
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <li>ajax提交数据接收返回值</li><br/>
    <input type="text" id="username" name="username" placeholder="please input user name" > <br/><br/>
    <input type="password" id="password" name="password" placeholder="please input password"> <br/> <br/>
    <input type="submit" onclick="ajaxFun()" value="commit">
    <div>
        <li id="getM"></li>
    </div>
</body>
</html>

<script type="text/javascript">
    function ajaxFun() {
        var username = document.getElementById("username").nodeValue;
        var password = document.getElementById("password").nodeValue;

        console.log(username + " " + password);
        $.ajax({
            type:"post",
            url:"/getMessage",
            data:"username=" + username + "&password=" + password,
            success:function(message){
                document.getElementById("getM").innerHTML = message;
            }
        });
    }
</script>
