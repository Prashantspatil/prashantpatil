<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Sign In</title>
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
        
        <div align="center">UserID : ${userID}</div>
        <div align="center">
                <form action="updatePassword" method="post">
                        <table>
                               <tr>
                                   <td>UserID</td>
                                   <td><input type="text" name="userID" value="${userID}" readonly="readonly"></td>
                               </tr>
                               
                               <tr>
                                   <td>New Password</td>
                                   <td><input type="password" name="password" id="userPassword">
                                           <span id="passwordError" style="color: red;"></span>
                                           <input type="checkbox" onclick="myFunction1()">Show Password</td>
                               </tr>
                               
                               <tr>
                                   <td>ConfirmPassword</td>
                                   <td><input type="password" name="confirmPassword"
                                   id="userConfirmPassword" onblur="ValidPassword()"> <span
                                    id="passwordCompare" style="color: red;"></span> <input
                                    type="checkbox" onclick="myFunction2()">Show ConfirmPassword</td>
                               </tr>
                               
                        </table>
                        <button type="submit" class="btn btn-success">Update</button>
                </form>
        </div>
        
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
                
                function ValidPassword() {
					var userPassword = document.getElementById('userPassword');
					var userConfirmPassword = document.getElementById('userConfirmPassword');
					var userPasswordValue = userPassword.value;
					var userConfirmPasswordValue = userConfirmPassword.value;
					console.log(userPasswordValue);
					if(userPasswordValue != null && userPasswordValue != "" && userPasswordValue.length >3 && userPasswordValue.length < 45){
						if(userPasswordValue==userConfirmPasswordValue){
							console.log('both passwords are matching');
							document.getElementById('passwordCompare').innerHTML = '';
						}else{
							console.log('both passwords are not matching');
							document.getElementById('passwordCompare').innerHTML = 'password & confirmpassword not matching';
						}
						console.log('valid password');
						document.getElementById('passwordError').innerHTML = '';
					}else{
						console.log('invalid password');
						document.getElementById('passwordError').innerHTML = 'please enter valid password';
					}
				}
                
        </script>
        
</body>
</html>