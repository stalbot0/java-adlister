<%@ page contentType="text/html;charset=UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
    <title>Login</title>
    <%@include file="partials/head.jsp" %>
    <%--    <jsp:include page="partials/head.jsp">--%>
    <%--        --%>
    <%--    </jsp:include>--%>
</head>
<body>
<%@include file="partials/nav.jsp" %>
<div class="container">
    <h1>Login!</h1>
    <form action="login" method="POST">
        <div class="form-group w-25 my-1">
            <label for="username" class="form-control w-50">Username</label>
            <input id="username" name="username" placeholder="Enter your username" type="text">
        </div>
        <div class="form-group w-25 my-1">
            <label for="password" class="form-control w-50">Password</label>
            <input type="password" id="password" name="password" placeholder="Enter password">
        </div>
        <div class="my-3 w-25">
            <input type="submit" value="Submit">
        </div>
    </form>
</div>
<%--bootstrap script CDN--%>
<%@include file="partials/script_bootstrap.jsp"%>
</body>
</html>
