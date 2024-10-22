<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<html lang="en">
  <head>
  	<title>Sign Up 07</title>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

	<link href="https://fonts.googleapis.com/css?family=Lato:300,400,700&display=swap" rel="stylesheet">

	<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css">
	
	<link rel="stylesheet" href="css/style.css">

<script type="text/javascript">

	
function validateForm()
{
	 var name = document.forms["registrationForm"]["name"].value;
	 var email = document.forms["registrationForm"]["email"].value;
	 var phone= document.forms["registrationForm"]["phone"].value;
	 var password = document.forms["registrationForm"]["password"].value;
	 var repassword = document.forms["registrationForm"]["repassword"].value;
	 
	 if(name =="" || email =="" || password =="")
		 {
		    alert('All Fields are mandatory!!');
		    return false;
		 }
	 if(password!=repassword)
		 {
		    alert('Password and Repassword mismatched!!')
		    return false;
		 }
	 else
		 {
		    return true;
		 }
	 if(isAlphabet(name, "Please enter letters only for your Fullname!!"))
	   {
		 return true;
	   }
	 if(emailValidator(email, "Please enter a valid Email!!"))
	  {
		 return true;
	  }
	 if(lengthRestriction(password, 1,10))
		 {
		   return true;
		 }
	 if(isEquals(repassword, "Password and Repeat Password mismatched!!"))
		 {
		   return true;
		 }
	 else
		 {
		   return false;
		 }
}

// Validating phone number
function isNumeric(elem, helperMsg)
{
	var numericExpression = /^[0-9]+$/;
	if(elem.value.match(numericExpression))
    {
		return true;
	}
	else
	{
		alert(helperMsg);
		elem.focus();
		return false;
	}
}

// Validating password and confirmPassword
function isEquals(elem, helperMsg)
{
	 if(repassword.equals(password))
		 {
		    return true;
		 }
	 else
		 {
		    alert(helperMsg);
		    elem.focus();
		    return false;
		 }
}

// Validating Name Field
function isAlphabet(elem, helperMsg)
{
	 var alphaExp = /^[a-zA-Z]+$/;
	  if(elem.value.match(alphaExp))
		  {
		     return true;
		  }
	  else 
		  {
		     alert(helperMsg);
		     elem.focus();
		     return false;
		  }
}

// Length Restriction
function lengthRestriction(elem, min, max)
{
	 var uInput = elem.value;
	 if(uInput.length >= min && uInput.length <= max)
		 {
		    return true;
		 }
	 else
		 {
		    alert("Please enter between " + min+ " and " +max+ "characters");
		    elem.focus();
		    return false;
		 }
}
// Email validator
 function emailValidator(elem, helperMsg)
{
 var emailExp = /^[\w\-\.\+]+\@[a-zA-Z0-9\.\-]+\.[a-zA-z0-9]{2,4}$/;
  if(elem.value.match(emailExp)){
 	return true;
   }
   else
   {
      alert(helperMsg);
      elem.focus();
       return false;
   }
 }

 function verifyEmail()
 {
	 var email = document.forms["registrationForm"]["email"].value;
	 $.ajax({
		 type: 'POST', url: 'validatorAjax.jsp', data: {email: email},
		 success: function (response) 
		 {
			 if(response === "available")
				 {
				    alert("Email is available.");
				 }
			 else if(response === "unavailable")
				 {
				    alert("Email already exists, try entering another Email.")
				 }
		 }
	 });
 }

	
</script>


	</head>
	<body>
	<section class="ftco-section">
		<div class="container">
			<div class="row justify-content-center">
				<div class="col-md-6 text-center mb-5">
					<h2 class="heading-section">Sign Up #07</h2>
				</div>
			</div>
			<div class="row justify-content-center">
				<div class="col-md-7 col-lg-5">
					<div class="login-wrap p-4 p-md-5">
		      	<div class="img" style="background-image: url(images/bg.jpg);"></div>
		      	<h3 class="text-center mb-4">Create Your Account</h3>
			<form action="insert.jsp" method="post" class="signup-form" onsubmit="return validateForm()">
		      		<div class="form-group mb-3">
		      			<label class="label" for="name">Full Name</label>
		      			<input type="text" class="form-control" placeholder="John Doe" name="name">
		      		</div>
		      		<div class="form-group mb-3">
		      			<label class="label" for="email">Email Address</label>
		      			<input type="text" class="form-control" placeholder="johndoe@gmail.com" name="email">
		      		</div>
	            <div class="form-group mb-3">
	            	<label class="label" for="password">Password</label>
	              <input id="password-field" type="password" class="form-control" placeholder="Password" name="password">
	              <span toggle="#password-field" class="fa fa-fw fa-eye field-icon toggle-password"></span>
	            </div>
	            <div class="form-group">
	            	<button type="submit" class="form-control btn btn-primary submit px-3">Sign Up</button>
	            </div>
	          </form>
	          <p>I'm already a member! <a data-toggle="tab" href="#signin">Sign In</a></p>
	        </div>
				</div>
			</div>
		</div>
	</section>

	<script src="js/jquery.min.js"></script>
  <script src="js/popper.js"></script>
  <script src="js/bootstrap.min.js"></script>
  <script src="js/main.js"></script>

	</body>
</html>

