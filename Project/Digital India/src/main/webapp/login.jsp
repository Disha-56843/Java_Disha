<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login</title>

<style type="text/css">
@import
	url('https://fonts.googleapis.com/css?family=Poppins:400,500,600,700&display=swap')
	;

::selection {
	background: #4158d0;
	color: #fff;
}

.wrapper {
	width: 380px;
	background: #fff;
	border-radius: 15px;
	box-shadow: 0px 15px 20px rgba(0, 0, 0, 0.1);
	margin: auto;
}

.wrapper .title {
	font-size: 35px;
	font-weight: 600;
	text-align: center;
	line-height: 100px;
	color: #fff;
	user-select: none;
	border-radius: 15px 15px 0 0;
	background: linear-gradient(-135deg, #1a1a1a, #333333);
}

.wrapper form {
	padding: 10px 30px 50px 30px;
}

.wrapper form .field {
	height: 50px;
	width: 100%;
	margin-top: 20px;
	position: relative;
}

.wrapper form .field input {
	height: 100%;
	width: 100%;
	outline: none;
	font-size: 17px;
	padding-left: 20px;
	border: 1px solid lightgrey;
	border-radius: 25px;
	transition: all 0.3s ease;
}

.wrapper form .field input:focus, form .field input:valid {
	border-color: #4158d0;
}

.wrapper form .field label {
	position: absolute;
	top: 50%;
	left: 20px;
	color: #999999;
	font-weight: 400;
	font-size: 17px;
	pointer-events: none;
	transform: translateY(-50%);
	transition: all 0.3s ease;
}

form .field input:focus ~ label, form .field input:valid ~ label {
	top: 0%;
	font-size: 16px;
	color: #4158d0;
	background: #fff;
	transform: translateY(-50%);
}

form .content {
	display: flex;
	width: 100%;
	height: 50px;
	font-size: 16px;
	align-items: center;
	justify-content: space-around;
}

form .content .checkbox {
	display: flex;
	align-items: center;
	justify-content: center;
}

form .content input {
	width: 15px;
	height: 15px;
	background: red;
}

form .content label {
	color: #262626;
	user-select: none;
	padding-left: 5px;
}

form .content .pass-link {
	color: "";
}

form .field input[type="submit"] {
	color: #fff;
	border: none;
	padding-left: 0;
	margin-top: -10px;
	font-size: 20px;
	font-weight: 500;
	cursor: pointer;
	background: linear-gradient(-135deg, #1a1a1a, #333333);
	transition: all 0.3s ease;
}

form .field input[type="submit"]:active {
	transform: scale(0.95);
}

form .signup-link {
	color: #262626;
	margin-top: 20px;
	text-align: center;
}

form .pass-link a, form .signup-link a {
	color: #4158d0;
	text-decoration: none;
}

form .pass-link a:hover, form .signup-link a:hover {
	text-decoration: underline;
}
</style>

<link
	href='http://fonts.googleapis.com/css?family=Lato:300,400,700,900,400italic'
	rel='stylesheet' type='text/css'>
<link
	href="//maxcdn.bootstrapcdn.com/font-awesome/4.2.0/css/font-awesome.min.css"
	rel="stylesheet">

<link rel="stylesheet" type="text/css" href="css/bootstrap.min.css"
	media="screen">
<link rel="stylesheet" type="text/css" href="css/jquery.bxslider.css"
	media="screen">
<link rel="stylesheet" type="text/css" href="css/font-awesome.css"
	media="screen">
<link rel="stylesheet" type="text/css" href="css/magnific-popup.css"
	media="screen">
<link rel="stylesheet" type="text/css" href="css/owl.carousel.css"
	media="screen">
<link rel="stylesheet" type="text/css" href="css/owl.theme.css"
	media="screen">
<link rel="stylesheet" type="text/css" href="css/ticker-style.css" />
<link rel="stylesheet" type="text/css" href="css/style.css"
	media="screen">

</head>
<body>

	<div>
		<jsp:include page="header.jsp" />

		<div class="wrapper">
			<div class="title">Login</div>
			<form action="signin.jsp">
				<div class="field">
					<input type="text" placeholder="Email Address" name="email"
						required>
				</div>
				<div class="field">
					<input type="password" placeholder="Password" name="password"
						required>
				</div>
				<div class="field">
					<a href="" class="text-dark"> Forgot Password</a>
				</div>
				<div class="field">
					<input type="submit" value="Login">
				</div>
				<div class="signup-link">
					New Here?<a href="Register.jsp"> Create an account</a>
				</div>
			</form>
		</div>

		<jsp:include page="footer.jsp" />
	</div>


</body>
</html>