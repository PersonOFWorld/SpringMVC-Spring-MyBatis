<%--
  Created by IntelliJ IDEA.
  User: One
  Date: 2016/5/7
  Time: 12:48
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Sigin</title>
    <script type="text/javascript"
            src="<%=request.getContextPath()%>/js/jquery-2.1.4.min.js"></script>
</head>
<body>
<div margin:0px sauto;text-align:center;>
    <form id="form1">
        E-mail  ：<input id="email" name="email" type="text"/><br/>
        用户名  ：<input id="username" name="username" type="text"/><br/>
        密  码 ：<input id="pwd" name="password" type="password"/><br>
        再输一次：<input id="pwdre" name="repassword" type="password"/><br>
        <input type="button" name="g" onClick="singIn();" value="Submit" />
    </form>
</div>
<script>
    function singIn(){
     /*   $.ajax({ //请求登录处理页
            type:"post",
            url: "signin.do", //登录处理页
            //传送请求数据
            data: { email: "email" },
            success: function (strValue) { //登录成功后返回的数据
                alert('Success');
            }
        })*/
        var info=$("form").serialize();
        /*alert(info),*/
        $.post("signin.do", info,
                function(data){
                    alert("Signin Success");
                    window.location.href = "./intoLoginPage.htm";
                });
    }

</script>
</body>
</html>
