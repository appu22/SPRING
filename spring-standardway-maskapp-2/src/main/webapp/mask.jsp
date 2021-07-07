<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Spring MVC</title>
</head>
<body bgcolor="lightblue">
	<h2>Welcome To Our Shop</h2>

<pre> standardway to writing  spring mvc projects </pre>
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
</body>

</html>