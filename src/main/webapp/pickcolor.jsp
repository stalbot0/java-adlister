<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <%@include file="partials/head.jsp" %>
    <title>Pick Color</title>
</head>
<body>
<form method="post" action="/pickcolor">
    <h3 class="text-center">Pick a Color</h3>
    <div class="my-1 text-center">
        <input type="text" id="pick-color" name="pick-color" placeholder="Enter a Color">
    </div>
    <div class="text-center">
        <input type="submit" value="Submit">
    </div>
</form>

</body>
</html>
