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
			<a class="navbar-brand" href="#">Sign Up<img alt=""
				src="https://tse4.mm.bing.net/th?id=OIP.IaWUHQyifxlzXpiltkNltAHaHf&pid=Api&P=0"
				width="80" height="48" class="d-inline-block align text-top"></a>
			<a href="index.jsp">home</a>
		</div>
		<a href="SignIn.jsp"><span class="glyphicon glyphicon-log-in"></span>SignIn</a>
	</nav>
	<div align="center">
	<h1 style="color: green;">${message}</h1>
	<h5 style="color: red;">${message}<br>
	<c:forEach items="${errors}" var="e">${e.message}</c:forEach>
	</h5>
	
	<form action="sign" method="post">
	<table>
	
	<tr>
	<td>User Id</td>
		<td><input type="text" name="userID" id="userName"
			onchange="ValidName()" value="${dto.userID}"> <span id="nameError"
			style="color: red;"></span>
			<span id="displayUserName" style="color: red;"></span>
		</td>
		</tr>
		
		<tr>
		<td>Email Id</td>
		 <td><input type="email" name="emailID"
			id="userEmailID" onchange="ValidEmailId()" value="${dto.emailID}"> <span
			id="emailIDError" style="color: red;"></span>
		<span id="display" style="color: red;"></span>
		</td>
		</tr>
		
		<tr>
		<td>Password</td>
		 <td><input type="password" name="password" id="userPassword" value="${dto.password}"> 
		 <span id="passwordError" style="color: red"></span>
		  <input type="checkbox" onclick="myFunction1()">Show Password
			</td>
			</tr>
			 <tr>
			<td>Confirm Password </td>
			<td><input type="password" name="confirmPassword"
			id="userConfirmPassword" onblur="ValidPassword()" value="${dto.confirmPassword}"><span
			id="passwordCompare" style="color: red"></span>
			<input type="checkbox" onclick="myFunction2()v hn4e">Show ConfirmPassword</td>
			
			</tr>
			
			<tr>
			<td>Mobile</td>
			<td><input type="number" name="mobile" id="userMobile" onchange="ValidMobile()" value="${dto.mobile}">
		<span id="mobileError" style="color: red"></span>
		<span id="displayUserMobile" style="color: red;"></span>
		</td>
		</tr>
		
		<tr>
		<td>Agreement :
		
		<input type="checkbox" name="agreement"
			id="agreementConfirm" onclick="ValidName()">
			</td>
			</tr>
			</table>
		<div><button type="submit" class="btn-btn-success" onclick="ValidName()" disabled="true" id="submitId"
			>SignUp</button>
			
		</div>
	</form>
	</div>
	<h4 style="color: red;">${password}</h4>
	<script>
	
	function myFunction1() {
		var x = document.getElementById("userPassword");
		if(x.type==="password"){
			x.type="text";
		}else{
			x.type="password";
		}
	}
	
	function myFunction2() {
		var x = document.getElementById("userConfirmPassword");
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
		const xhttp = new XMLHttpRequest();
		console.log('Running in ajax');
		console.log(user);
		console.log(uservalue);
		
		xhttp.open("GET", "http://localhost:8080/prashant-Xworkz/userName/"+uservalue);
		xhttp.send();
	
	xhttp.onload = function () {
		console.log(this);
		document.getElementById("displayUserName").innerHTML = this.responseText
	}
	
	var agree = document.getElementById('agreementConfirm');
	console.log(agree.checked);
	if(agree.checked){
		document.getElementById('submitId').disabled = false;
	}
	document.getElementById('nameError').innerHTML = '';
}else{
	console.log('invalid name');
	document.getElementById('submitId').disabled = 'disabled';
	document.getElementById('nameError').innerHTML = 'please enter valid name min 4 & max 30 chars';
}
	}
	
	function ValidEmailId() {
		var userEmail = document.getElementById('userEmailID');
		var userEmailValue = userEmail.value;
		console.log(userEmailValue);
		if(userEmailValue != null && userEmailValue != "" && userEmailValue.length >3 && userEmailValue.length < 45){
			console.log('valid email');
			const xhttp = new XMLHttpRequest();
			console.log('Running in ajax');
			console.log(userEmailValue);
			xhttp.open('GET', "http://localhost:8080/prashant-Xworkz/emailID/"+userEmailValue);
			xhttp.send();
			
			xhttp.onload = function(){
				console.log(this);
				document.getElementById("display").innerHTML = this.responseText
			}
			document.getElementById('emailIDError').innerHTML = '';
		}else{
			console.log('invalid email');
			document.getElementById('emailIDError').innerHTML = 'please enter valid email min 4 & max 30 chars';
		}
		
		}
	
	function ValidMobile() {
		var userMobile = document.getElementById('userMobile');
		var userMobileValue = userMobile.value;
		console.log(userMobileValue);
		if(userMobileValue != null && userMobileValue != "" && userMobileValue.length==10){
			console.log('valid mobile');
			const xhttp = new XMLHttpRequest();
			console.log('Running in ajax');
			console.log(userMobileValue);
			xhttp.open("GET","http://localhost:8080/prashant-Xworkz/mobile/"+userMobileValue);
			xhttp.send();
			xhttp.onload = function () {
				console.log(this);
				document.getElementById("displayUserMobile").innerHTML = this.responseText
			}
			document.getElementById('mobileError').innerHTML = '';
		}else{
			console.log('invalid mobile');
			document.getElementById('mobileError').innerHTML = 'please enter valid mobile';
		}
		
	}
	
	function ValidPassword() {
		var userPassword = document.getElementById('userPassword');
		var userConfirmPassword = document.getElementById('userConfirmPassword');
		var userPasswordValue = userPassword.value;
		var userConfirmPasswordValue = userConfirmPassword.value;
		console.log(userPasswordValue);
		if(userPasswordValue != null && userPasswordValue !="" && userPasswordValue.length > 4 && userPasswordValue.length < 12){
			if(userPasswordValue==userConfirmPasswordValue){
			console.log('both password are same');
			document.getElementById('passwordCompare').innerHTML = '';
		}else{
			console.log('both password are not same');
			document.getElementById('passwordCompare').innerHTML = 'password & confirmpassword must be same';
		}
		console.log('valid password');
		document.getElementById('passwordError').innerHTML = '';
		}else{
		console.log('invalid password');
		document.getElementById('passwordError').innerHTML = 'enter valid password';
	}
	}
	</script> 
	
</body>
</html>