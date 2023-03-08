<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<%
    String username = request.getParameter("username");
    String password = request.getParameter("password");
    if (username != null && username.equals("admin") && password != null && password.equals("password")) {
        response.sendRedirect("/profile.jsp");
    }
%>
<head>
    <title>Login</title>
    <%@include file="partials/head.jsp"%>
</head>
<body>
<%@include file="partials/nav.jsp"%>
<h1>Login Page</h1>
<form action="/login.jsp" method="POST">
    <div>
        <label for="username">Username</label>
        <input id="username" name="username" placeholder="Enter your username" type="text">
    </div>
    <div>
        <label for="password">Password</label>
        <input type="password" id="password" name="password" placeholder="Enter password" type="text">
    </div>
    <div>
        <input type="submit" value="Submit">
    </div>
</form>

<%--bootstrap script CDN--%>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/js/bootstrap.bundle.min.js"></script>
</body>
</html>
