<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
  <%@include file="partials/head.jsp"%>
    <title>Title</title>
</head>
<body>
<h1>outcome</h1>
<%--use JSTL if-else for message = correct or message = incorrect--%>
<%--choose, when, otherwise--%>
<c:choose>
  <c:when test="${param.pick-number == randomNum}">
    <h1>${win}</h1>
  </c:when>

  <c:otherwise>
    <h1>${lose}</h1>
  </c:otherwise>
</c:choose>

<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/js/bootstrap.bundle.min.js"></script>
</body>
</html>
