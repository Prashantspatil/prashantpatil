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
		</div>
</nav>

<nav class="navbar navbar-expand">
<div class="container-fluid">
<a href="Save.jsp"><span class="glyphicon glyphicon-user"></span>
Save</a> <a href="SignIn.jsp"><span 
class="glyphicon glyphicon-log-in"></span>SignIn</a>
</div>
</nav>

<div align="center">
        <form action="reset" method="post">
        Email ID <br>
        <input type="email" name="emailID" id="emailID" onchange="ValidEmailID()"> <br>
        <span id="display" style="color: red;"></span> <br>
        <button type="submit" class="btn btn-success">ReSet</button>
        </form>
        
        <div>
        <span style="color: red;">${msg}</span>
      <!--    <span style="color: green;">${reset}</span> -->
        </div>
</div>

<script>
         function ValidEmailID() {
			var userEmail = document.getElementById('emailID');
			var userEmailValue = userEmail.value;
			console.log(userEmailValue);
			if(userEmailValue != null && userEmailValue !="" && userEmailValue.length >3 && userEmailValue.length < 45){
				console.log('valid emailID');
				document.getElementById("emailError").innerHTML = '';
			}else{
				console.log('invalid emailID');
				document.getElementById("emailError").innerHTML = 'enter valid emailID';
			}
		}
</script>

</body>
</html>