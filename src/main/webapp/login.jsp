<%@ page contentType="text/html;charset=UTF-8"%>
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
    <%@include file="partials/head.jsp" %>
<%--    <jsp:include page="partials/head.jsp">--%>
<%--        --%>
<%--    </jsp:include>--%>
</head>
<body>
<%@include file="partials/nav.jsp" %>
<h1>Login Page</h1>
    <form action="login.jsp" method="POST">
        <div class="w-25">
            <label for="username" class="form-control">Username</label>
            <input id="username" name="username" placeholder="Enter your username" type="text">
        </div>
        <div class="w-25">
            <label for="password" class="form-control">Password</label>
            <input type="password" id="password" name="password" placeholder="Enter password">
        </div>
        <div class="my-3 w-25">
            <input type="submit" value="Submit">
        </div>
    </form>

<%--bootstrap script CDN--%>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/js/bootstrap.bundle.min.js"></script>
</body>
</html>
