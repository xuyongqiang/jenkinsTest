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
    <script src="./jquery-3.4.1.min.js"></script>
</head>
<body>
    <li>ajax提交数据接收返回值</li><br/>
    <input type="text" id="username" name="username" placeholder="please input user name" > <br/><br/>
    <input type="password" id="password" name="password" placeholder="please input password"> <br/><br/>
    <input type="submit" id="submit" onclick="login()" value="login">
    <input type="submit" id="submit" onclick="register()" value="register">
    <div>
        <li id="getM"></li>
    </div>
</body>
</html>

<script type="text/javascript">
    function login() {
        console.log("----------");
//        var username = document.getElementsByName("username").;
        var username = document.getElementById("username").value;
        var password = document.getElementById("password").value;
//        var password = document.getElementsByName("password").toString();
        console.log("----------");
        console.log("username: "+username + " password:" + password);
//        $.ajax({
//            type:"post",
//            url:"/getMessage",
//            data:"username=" + username + "&password=" + password,
//            success:function(message){
//                document.getElementById("getM").innerHTML = message;
//            }
//        });

        $.ajax({
            type:"post",
            url:"/getMessage",
            data:"username="+username+"&password="+password,
            success:function(message){
                document.getElementById("getM").innerHTML=message;
                if(1 == eval(message)){
                    pageWithDataFun();
                }
            }
        });
    }

    function register() {
        var username = document.getElementById("username").value;
        var password = document.getElementById("password").value;

        $.ajax({
            type:"post",
            url:"/toRegister",
            data:"username="+username+"&password="+password,
            success:function (message) {
                document.getElementById("getM").innerHTML=message;
            }
        });

    }
    function pageWithDataFun() {
//        var url = "/pageWithData";
//        var params = "username="+username+"&password="+password;
//        var xhr = new XMLHttpRequest();
//        xhr.open("POST", url, true);
//
////Send the proper header information along with the request
//        xhr.setRequestHeader("Content-type", "application/x-www-form-urlencoded");
//
//        xhr.send(params);



        var username = document.getElementById("username").value;
        var password = document.getElementById("password").value;
        $.ajax({
            type:"post",
            url:"/pageWithData",
            data:"username="+username+"&password="+password,
            success:function(message){
                console.log(message);
//                alert(message);
                document.body.innerHTML = message;
            }
        });

//        var params = {
//            "username":username,
//            "password":password
//        };
//
//        httpPost
    }
</script>
