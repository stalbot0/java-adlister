<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <jsp:include page="/WEB-INF/partials/head.jsp">
        <jsp:param name="title" value="Viewing All The Ads" />
    </jsp:include>
</head>
<body>
<jsp:include page="/WEB-INF/partials/navbar.jsp" />

<div class="container">
    <h1>Here Are all the ads!</h1>

    <c:forEach var="ad" items="${ads}">
        <div class="col-md-6 my-5">
            <h2><c:out value="${ad.title}"></c:out></h2>
            <div><c:out value="${ad.description}"></c:out></div>
            <div>Price: $<c:out value="${ad.price}"></c:out>USD</div>
        </div>
    </c:forEach>
</div>

</body>
</html>
