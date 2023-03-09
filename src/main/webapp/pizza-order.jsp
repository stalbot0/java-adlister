<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <%@include file="partials/head.jsp" %>
    <title>Order Pizza</title>
</head>
<body>
<header>
    <h1 class="text-center bg-warning">ORDER A PIZZA PLZ</h1>
</header>
<div class="container w-50 my-3">
    <form action="${pageContext.request.contextPath}/pizza-order" method="POST">
        <div class="container my-2">
            <h2 class="text-center">Choose Your Crust</h2>
            <select class="form-select" aria-label="crust options" id="pizza-crust-type" name="crust">
                <option selected disabled>Choose Crust Type</option>
                <option value="Thin">Thin Crust</option>
                <option value="Thick">Thick Crust</option>
                <option value="Hand-tossed">Hand-Tossed</option>
                <option value="Deep-dish">Deep Dish</option>
            </select>
        </div>
        <div class="container my-2">
            <h2 class="text-center">Choose Your Sauce</h2>
            <select class="form-select" aria-label="sauce options" id="pizza-sauce-type" name="sauce">
                <option selected disabled>Choose Sauce</option>
                <option value="Normal">Normal</option>
                <option value="Extra">Extra</option>
                <option value="Less">Less</option>
                <option value="No Sauce">No Sauce (psychopaths only)</option>
            </select>
        </div>
        <div class="container my-2">
            <h2 class="text-center">Choose Pizza Size</h2>
            <select class="form-select" aria-label="size options" id="pizza-size" name="size">
                <option selected disabled>Choose Size</option>
                <option value="Small">Small (8")</option>
                <option value="Medium">Medium (10")</option>
                <option value="Large">Large (12")</option>
                <option value="Extra Large">Extra Large (16")</option>
            </select>
        </div>
        <div class="container my-4">
            <h2 class="text-center">Choose your toppings</h2>
            <div class="form-check">
                <input class="form-check-input" type="checkbox" value="Pepperoni" id="flexCheckPepperoni" name="toppings">
                <label class="form-check-label" for="flexCheckPepperoni">
                    Pepperoni
                </label>
            </div>
            <div class="form-check">
                <input class="form-check-input" type="checkbox" value="Mushroom" id="flexCheckMushroom" name="toppings">
                <label class="form-check-label" for="flexCheckMushroom">
                    Mushroom
                </label>
            </div>
            <div class="form-check">
                <input class="form-check-input" type="checkbox" value="Sausage" id="flexCheckSausage" name="toppings">
                <label class="form-check-label" for="flexCheckSausage">
                    Sausage
                </label>
            </div>
        </div>
        <h3 class="text-center">Delivery Address</h3>
        <div class="my-1 text-center">
            <input type="text" id="address" name="address" placeholder="Enter Address" class="my-1">
        </div>
        <div class="text-center">
            <input type="submit" value="Submit Order">
        </div>
    </form>
</div>

<%--bootstrap script CDN--%>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/js/bootstrap.bundle.min.js"></script>
</body>
</html>
