<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <%@include file="../partials/head.jsp" %>
    <title>Index</title>
</head>
<body>
<h1 class="text-center">List of Ads</h1>
<ul>
    <c:forEach var="ad" items="${ads}">
        <li class="container-fluid my-4">
            <h3>Title: ${ad.title}, <strong>${ad.price}</strong></h3>
            <div>Description: ${ad.description}</div>
            <div>Please contact ${ad.user.name} at ${ad.user.phoneNumber} for more information</div>
        </li>
    </c:forEach>
</ul>

<%@include file="../partials/script_bootstrap.jsp" %>
</body>
</html>
