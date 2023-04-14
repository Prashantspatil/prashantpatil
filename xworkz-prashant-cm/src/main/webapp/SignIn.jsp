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
			<a href="index.jsp">home</a>
			</div>
			</nav>
			
			<div align="center">
			<h4 style="color: red;">${match}</h4>
			<h4 style="color: red;">${msg}</h4>
			<h4 style="color: red;">${timeout}</h4>
			
			<form action="signIn" method="post">
			<table>
			
			<tr>
			<td>User ID</td>

		<td><input type="text" name="userID" id="userName"onchange="ValidName()">
			 <span id="nameError" style="color: red"></span> 
			 <span id="displayUserName" style="color: red"></span>
		</td>
		</tr>
			
			<tr>
			<td>Password</td>
			<td><input type="password" name="password" id="userPassword" onblur="ValidPassword()">
				<span id="passwordError" style="color: red"></span> 
				<input type="checkbox" onclick="myFunction()">Show Password
	       </td>
		</tr>
		  
		  </table>
		  <div> 
		  <button type="submit" class="btn btn-success">signIn</button> 
		  </div>
		  </form>
		  
		  <a href="Save.jsp">New Registration</a> <br>
		  <a href="ResetPassword.jsp">Forgot Password</a>
		  
		  </div>
		  <script>
		  
		  function myFunction() {
				var x = document.getElementById("userPassword");
				if(x.type==="password"){
					x.type="text";
				}else{
					x.type="password";
				}
			}
		  
		  function ValidName() {
				var user = document.getElementById('userName');
				var uservalue = user.value;
				console.log(uservalue);
				if(uservalue != null && uservalue != "" && uservalue.length >3 && uservalue.length < 30){
					console.log('valid name');
					document.getElementById('nameError').innerHTML ='';
				}else{
					console.log('invalid name');
					document.getElementById('nameError').innerHTML = 'please enter valid name min 4 & max 30 chars';
				}
		  }
		  
		  </script>
	
	
</body>
</html>