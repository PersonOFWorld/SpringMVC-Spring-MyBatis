<%--
  Created by IntelliJ IDEA.
  User: somoOne
  Date: 2016/4/12
  Time: 19:23
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Sign</title>
</head>
<body>
<form action="userLogin.htm" method="post">
    <input type="text" name = "email" value=""><br/>
    <input type="password" name="pwd" value=""><br/>
    <input type="submit" name="submit" value="Submit">
    <input type="button" name="submit" onclick="forgetPwd()" value="Forget PWD">
</form>
<script>
    function forgetPwd(){
        window.location.href="forgetPwd.htm";
    }
</script>
</body>
</html>
