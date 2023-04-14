<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
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
<nav class="navbar navbar-expand-lg navbar-light bg-light">
		<div class="container-fluid">
			<a class="navbar-brand" href="#">Sign Up<img alt=""
				src="https://tse4.mm.bing.net/th?id=OIP.IaWUHQyifxlzXpiltkNltAHaHf&pid=Api&P=0"
				width="80" height="48" class="d-inline-block align text-top"></a>
			<li class="active"><a href="index.jsp">home</a></li>
			<a href="Save.jsp">Save</a>
			<a href="SignIn.jsp">SignIn</a>
		</div>
	</nav>
	
	<div align="center">
	User Name : ${userID}
	</div>
	
	<h1 style="color: green;">Login Successful</h1>
	
</body>
</html>