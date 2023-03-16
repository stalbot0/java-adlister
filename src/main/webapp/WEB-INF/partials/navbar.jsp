<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<nav class="navbar navbar-default">
    <div class="container-fluid bg-light">
        <!-- Brand and toggle get grouped for better mobile display -->
        <div class="navbar-header">
            <a class="navbar-brand" href="/ads">Adlister</a>
        </div>
        <div class="nav navbar-nav navbar-right">
            <c:choose>
                <c:when test="${sessionScope.user == null}">
                    <ul>
                        <li><a href="/login">Login</a></li>
                        <li><a href="/register">Register For Our Site</a></li>
                    </ul>
                </c:when>
                <c:otherwise>
                    <ul>
                        <li><a href="/profile">Profile</a></li>
                        <li><a href="/ads">View Ads</a></li>
                        <li><a href="/ads/create">Create An Ad</a></li>
                        <li><a href="/logout">Logout</a></li>
                    </ul>
                </c:otherwise>

            </c:choose>
        </div>
    </div><!-- /.navbar-collapse -->
    </div><!-- /.container-fluid -->
</nav>
