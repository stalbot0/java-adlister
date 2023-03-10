<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
  <%@include file="partials/head.jsp"%>
    <title>Title</title>
</head>
<body>
<%--use JSTL if-else for message = correct or message = incorrect--%>
<%--choose, when, otherwise--%>
<c:choose>
  <c:when test="${outcome.equals('win')}">
    <h3 class="container text-center">${message}</h3>
  </c:when>

  <c:otherwise>
    <h3 class="container text-center">${message}</h3>
  </c:otherwise>
</c:choose>

<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/js/bootstrap.bundle.min.js"></script>
</body>
</html>
