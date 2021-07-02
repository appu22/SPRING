<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>spring model view controller</title>
</head>
<body>
	<h1>Welcome to spring MVC</h1>
	<form action="mobile.do">
		<div>
		Mobile Name : <input type="text" name="mn"/><br><br>
		Mobile Price : <input type="text" name="pr"/><br><br>
		Mobile Ram  : <input type="text" name="ram"/><br><br>
		
		<input type="submit" value="submit">
		</div>
		
	</form>
	<h2>${ResponceMeassage}</h2>
</body>
</html>