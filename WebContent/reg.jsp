<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Register</title>
<link rel="stylesheet" type="text/css" href="style.css">
</head>
<body>
	<div class="main">
		<ul>
			<li><a href="home.html" style="color: blue">HOME</a></li>
			<li><a href="about.html">ABOUT US</a></li>
			<li><a href="infra.html">INFRASTRUCTURE</a></li>
			<li><a href="academics.html">ACADEMICS</a></li>
			<li><a href="adm1.html">ADMISSIONS</a></li>
			<li><a href="contact.html">CONTACT US</a></li>
		</ul>

		<div class="image">
			<img src="niit.jpg" alt="HTML5 Icon" width="100" height="50">
			<h1>NIIT Schools</h1>
		</div>
	</div>
	<br>
	<h1>ADMISSIONS</h1>
	<form action="./RegisterServlet" method="post">
		<fieldset style="width: 300px">
			<center>
				<h2>Parent's Register</h2>
				<label> Student's Name : </label> <input type="text" required
					name="sname" /><br>
				<br> <label> Parent's Name : </label> <input type="text"
					required name="pname" /><br>
				<br> <label>Parent's Email : </label> <input type="text"
					required name="email" /><br>
				<br> <label> Mobile Number : </label> <input type="text"
					required name="mobile" /><br>
				<br> <label> Password : </label> <input type="password"
					required name="pass" /><br>
				<br> <input type="submit" value="REGISTER" /><br>
				<br> <label> Already Registered? </label> <a href="login.jsp"
					style="color: pink">Login</a><br>
			</center>
	</form>
	</fieldset>
</body>
</html>
