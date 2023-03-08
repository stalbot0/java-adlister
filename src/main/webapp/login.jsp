

<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
    <title>Login</title>
</head>
<body>
<h1>Login Page</h1>
<form action="/login.jsp" method="POST">
    <div>
        <label for="username">Username</label>
        <input id="username" placeholder="Enter your username" type="text">
    </div>
    <div>
        <label for="password">Password</label>
        <input id="password" placeholder="Enter password" type="text">
    </div>
    <div>
        <input type="submit" value="Submit">
    </div>
</form>

<%
    String username = request.getParameter("username");
    String password = request.getParameter("password");
    if (username != null && username.equals("admin") && password != null && password.equals("password")) {
        response.sendRedirect("/profile.jsp");
    }
%>
</body>
</html>
