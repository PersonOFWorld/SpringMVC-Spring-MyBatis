<%--
  Created by IntelliJ IDEA.
  User: somoOne
  Date: 2016/4/12
  Time: 19:22
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<body>
<h2>Index</h2>
<button onclick="login()">Login</button>
<button onclick="information()">InformationsPage</button>
</body>
</html>
<script type="text/javascript">
    function login(){
        window.location.href="intoLoginPage.htm";
    }
    function information(){
        window.location.href="myInfo.htm";
    }
</script>
