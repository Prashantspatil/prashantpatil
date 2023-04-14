<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%> 
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Sign Up</title>
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
<body>
	<nav class="navbar navbar-expand-lg navbar-light bg-light">
		<div class="container-fluid">
			<a class="navbar-brand" href="#">ISRO<img alt=""
				src="https://tse4.mm.bing.net/th?id=OIP.IaWUHQyifxlzXpiltkNltAHaHf&pid=Api&P=0"
				width="80" height="48" class="d-inline-block align text-top"></a>
			<a href="index.jsp">home</a>
		</div>
	</nav>
	<c:forEach items="${error}" var="e">
	<br>
	<span style="color: red;">${e.message}</span>
	</c:forEach>
	<div><span style="color: green;">${message}</span></div>
	<form action="sign" method="get">
	<h1>Satellite Update Page</h1>
	
	
		User Id : <input type="text" name="userID"><br> Email Id
		: <input type="text" name="emailID"><br> Password : <input
			type="text" name="password"><br> Confirm Password : <input
			type="text" name="confirmPassword"><br> Mobile : <input
			type="text" name="mobile"><br> Agreement : <input
			type="checkbox" name="agreement"> <input type="submit" value="send"
			class="btn-btn-primery">
	</form>
</body>
</html>