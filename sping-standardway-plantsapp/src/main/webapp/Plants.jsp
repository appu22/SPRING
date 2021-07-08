<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Donate Plants</title>
</head>
<body bgcolor="orange">
	<div>
		<form action="plants.do" method="post">
		<h2>Your Informantion</h2>
			<div>
			Donar Name: <input type="text" name="donarName" required="required"><br><br>
			Email-Id :<input type="text" name="email" required="required"><br><br>
			MobileNo :<input type="number" name="mobileNo" required="required"><br><br>
			City :<input type="text" name="city" required="required"><br><br>
			states :<input type="text" name="state" required="required"><br><br>
			Pincode :<input type="number" name="pincode" required="required"><br><br>
			Message :<input type="textArea" name="msg" required="required"><br><br>
			How Many Plants You want Donate <input type="text" name="noOfplantsDonate" required="required">
			<br><br>
			<input type="submit" value ="Submit Form">
			
			</div>

		</form>

	</div>
</body>
</html>