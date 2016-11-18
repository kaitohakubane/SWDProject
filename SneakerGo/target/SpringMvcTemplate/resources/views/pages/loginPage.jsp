<%--
  Created by IntelliJ IDEA.
  User: Hung
  Date: 11/7/2016
  Time: 8:26 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>SneakerGo Login Page</title>
    <c:import url="/resources/views/common/header.jsp"/>
</head>

<body>

<!-- **********************************************************************************************************************************************************
MAIN CONTENT
*********************************************************************************************************************************************************** -->

<div id="login-page">
    <div class="container">

        <form class="form-login" action="login" method="post">
            <h2 class="form-login-heading">SneakerGo Administrator</h2>
            <div class="login-wrap">
                <input type="text" id="accountID" name="accountID" class="form-control" placeholder="User ID" autofocus>
                <br>
                <input type="password" id="password" name="password" class="form-control" placeholder="Password">
                <label class="checkbox">
		                <span class="pull-right">
		                    <a data-toggle="modal"> Forgot Password?</a>

		                </span>
                </label>
                <button class="btn btn-theme btn-block"><i class="fa fa-lock"></i> SIGN IN</button>
            </div>
        </form>
    </div>
</div>

<%--<!--BACKSTRETCH-->--%>
<%--<!-- You can use an image of whatever size. This script will stretch to fit in any screen size.-->--%>
<%--<script type="text/javascript" src="/resources/js/jquery.backstretch.min.js"></script>--%>
<%--<script>--%>
    <%--$.backstretch("assets/img/login-bg.jpg", {speed: 500});--%>
<%--</script>--%>


</body>
</html>
