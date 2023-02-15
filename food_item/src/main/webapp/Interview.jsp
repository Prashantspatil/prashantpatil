<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>X-workz</title>
<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/css/bootstrap.min.css"
	integrity="sha384-TX8t27EcRE3e/ihU7zmQxVncDAy5uIKz4rEkgIXeMed4M0jlfIDPvg6uqKI2xXr2"
	crossorigin="anonymous">
<script src="https://code.jquery.com/jquery-3.5.1.slim.min.js"
	integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj"
	crossorigin="anonymous"></script>
</head>
<body>
<nav class="navbar navbar-light bg-dark">
		<div class="container-fluid">
			<a class="navbar-brand" href="#"> <img
				src="https://x-workz.in/static/media/Logo.cf195593dc1b3f921369.png"
				alt="" width="80" height="48" class="d-inline-block align-text-top">
			</a> <a href="index.jsp">home</a>
		</div>
	</nav>
	<h1>page to attend interview</h1>
	<form action="attend" method="post">
		<div class="mb-3">
			<label for="attendeeName" class="form-label">Name</label> <input
				type="text" class="form-control" id="" placeholder="enter attendeeName" name="name">
		</div>
		<div>
			<select class="form-select" aria-label="default select example"
				name="company">
				<option selected>Select Company</option>
				<option value="TCS">TCS</option>
				<option value="Infosys">Infosys</option>
				<option value="wipro">wipro</option>
			</select>
		</div>
		<div class="mb-3">
			<label for="position" class="form-label">Role</label> <input
				type="text" class="form-control" id="" placeholder="enter role" name="role">
		</div>
		<div>
		<button type="submit" value="send" class="btn btn-dark">order</button>
		</div>
		</form>
</body>
</html>