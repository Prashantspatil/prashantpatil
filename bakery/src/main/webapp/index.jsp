<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>X-workz</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3"
	crossorigin="anonymous">
<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js"
	integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p"
	crossorigin="anonymous"></script>
</head>
<body>
	<nav class="navbar navbar-expand-lg navbar-light bg-light">
		<div class="container-fluid">
			<a class="navbar-brand" href="#">APTC<img alt=""
				src="C:\Users\Prashant\OneDrive\Pictures\-5jz7b5.jpg" width="80"
				height="48" class="d-inline-block align text-top"></a> <a
				href="index.jsp">Home Page</a>
		</div>
	</nav>
	<h1>Bakery details</h1>
	<form action="dto" method="get">
		Name<input type="text" value="" name="name" /><br> Owner <input
			type="text" value="" name="owner" /><br> Married yes<input
			type="radio" value="yes" name="married" /> No<input type="radio"
			value="no" name="married" /><br> Famous for
		<textarea rows="4" cols="20" name="famousFor"></textarea>
		<br> Wife <input type="text" value="" name="wife" /><br>
		Since <input type="text" value="" name="since" /><br>
		<input type="submit" value="save"> <label>Name :
			${data.name}</label></br> <label>owner : ${data.owner}</label></br> <label>wife
			: ${data.wife}</label></br> <label>married : ${data.married}</label></br> <label>famousFor
			: ${data.famousFor}</label></br> <label>since : ${data.since}</label></br>
	</form>
</body>
</html>