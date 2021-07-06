<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Mask Application</title>
</head>
<style>
body {
	
}

form {

	text-align: center;
	background-color: #00ffff;
	width: 350px;
	height: 200px;
	padding-top: 50px;
	padding-right: 30px;
	padding-bottom: 50px;
	padding-left: 80px;
	/*	background-image:  url('WEB-INF/img/mask-1.png');*/
	/* url ("<c:url value='/resources/images/mask-2.jpg' />");*/
	/* background-repeat: no-repeat;
	background-attachment: fixed;
	background-size: cover; */
}

img {
	width: 70px;
}

h2 {
	background-color: Tomato;
	width: 200px;
	height: 45px;
}
</style>
<body>

	<h2>Mask Order</h2>
	<form action="mask.do" method="post">
		<div>
		Buyer Name : <input type="text" name="buyerName"><br> <br>
			Mask Name : <input type="text" name="maskName" required="required">
			<br> <br> Mask Price : <input type="number" name="price"
				required="required"><br> <br> Quantity : <input
				type="number" name="qty" required="required"><br> <br>
			<input type="submit" value="Order Mask">
		</div>
	</form>

	<!-- <img alt="mask-1" src="WEB-INF/img/mask-1.png"> -->
	<img alt="mask-2" src="WEB-INF/img/mask-2.jpg">


</body>
</html>












