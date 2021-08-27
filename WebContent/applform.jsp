<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Application Form</title>
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
	<form action="./ApplServlet" method="post">
		<center>
			<fieldset style="width: 400px">
				<br>
				<center>
					<h2>
						<u>APPLICATION FORM</u>
					</h2>
					<br> <label> Student's Name : </label> <input type="text"
						required name="sname" /><br>
					<br> <label> Father's Name : </label> <input type="text"
						required name="fname" /><br>
					<br> <label>Mother's Name : </label> <input type="text"
						required required name="mname" /><br>
					<br> <label> Gender : </label> <input type="radio"
						name="gender" />Male <input type="radio" name="gender" />Female<br>
					<br> <label>Date of Birth : </label> <input type="date"
						id="date" required name="dob" /><br>
					<br> <label>Address : </label> <input type="text" required
						name="addr" /><br>
					<br> <label>Aadhar Number : </label> <input type="text"
						required name="aadhar" /><br>
					<br> <label>Nationality : </label> <input type="text" required
						name="nation" /><br>
					<br> <label>Blood Group : </label> <input type="text" required
						name="blood" /><br>
					<br> <label> Mother Tongue : </label> <input type="text"
						required name="lang" /><br>
					<br> <input type="submit" value="SUBMIT" /><br>
					<br>
				</center>
			</fieldset>
		</center>
	</form>

</body>
</html>