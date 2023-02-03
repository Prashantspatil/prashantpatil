<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Majestic Pride</title>
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
	<h1>page to table</h1>
	<form action="casino" method="post">
		<div class="mb-3">
			<label for="casinoName" class="form-label">Name</label> <input
				type="text" class="form-control" id="" placeholder="enter casinoName" name="name">
		</div>
		<div class="mb-3">
			<label for="cruiseName" class="form-label">Cruise</label> <input
				type="text" class="form-control" name="cruise"
				id="cruiseName" placeholder="enter cruiseName">
		</div>
		<div class="mb-3">
			<label for="entryFee" class="form-label">Fees</label> <input
				type="text"  class="form-control" name="entryFee"
				id="entryFee" placeholder="enter entryFee">
		</div>
		<div class="mb-3">
		<label>freeFood</label>
		<input type="radio" value="true" name="freeFood">yes 
		<input type="radio" value="false" name="freeFood">no
		</div>
		<div class="mb-3">
		<label>freeAlcohol</label>
		<input type="radio" value="true" name="freeAlcohol">yes 
		<input type="radio" value="false" name="freeAlcohol">no
		</div>
		<div>
		<button type="submit" value="send" class="btn btn-dark">gameOn</button>
		</div>
	</form>
</body>
</html>