<%--
  Created by IntelliJ IDEA.
  User: One
  Date: 2016/5/8
  Time: 0:05
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>ResetPwd</title>
    <script type="text/javascript"
            src="<%=request.getContextPath()%>/js/jquery-2.1.4.min.js"></script>
</head>
<body>
    <form>
        E-Mail  :<input type="text" name="email" type="text"/><br/>
        用户名  ：<input id="username" name="username" type="text"/><br/>
        <input type="button" value="Sure" onclick="resetPwd()">
    </form>
<script>
    function resetPwd(){
        var info=$("form").serialize();
        $.get("resetPwd.htm",info,
            function(data){
                if(data==1){
                    alert('请前往邮箱重置密码！')
                }
            }
        )
    }
</script>
</body>
</html>
