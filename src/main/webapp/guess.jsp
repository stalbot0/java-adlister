<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
    <%@include file="partials/head.jsp" %>
    <title>Guessing Game</title>
</head>
<body>
<div class="container">
    <form method="post" action="/guess">
        <div class="text-center my-1">
            <label for="guess-number" class="fs-3"><strong>I'm thinking of a number between 1 and 3. Take a guess!</strong></label>
        </div>
        <div class="text-center my-1">
            <input type="text" id="guess-number" name="guess-number" placeholder="Enter your guess" class="text-center">
        </div>
        <div class="text-center my-1">
            <input type="submit" value="Submit">
        </div>
    </form>
</div>

<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/js/bootstrap.bundle.min.js"></script>
</body>
</html>
