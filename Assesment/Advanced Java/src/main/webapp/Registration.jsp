<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<!-- Created By CodingNepal -->
<html lang="en" dir="ltr">
<head>
<meta charset="utf-8">
<title>Login Form Design | CodeLab</title>
<link rel="stylesheet" href="style.css">
<style type="text/css">
    @import url('https://fonts.googleapis.com/css?family=Poppins:400,500,600,700&display=swap');
	*{
	  margin: 0;
	  padding: 0;
	  box-sizing: border-box;
	  font-family: 'Poppins', sans-serif;
	}
	html,body{
	  display: grid;
	  height: 100%;
	  width: 100%;
	  place-items: center;
	  background: #f2f2f2;
	  /* background: linear-gradient(-135deg, #c850c0, #4158d0); */
	}
	::selection{
	  background: #4158d0;
	  color: #fff;
	}
	.wrapper{
	  width: 380px;
	  background: #fff;
	  border-radius: 15px;
	  box-shadow: 0px 15px 20px rgba(0,0,0,0.1);
	}
	.wrapper .title{
	  font-size: 35px;
	  font-weight: 600;
	  text-align: center;
	  line-height: 100px;
	  color: #fff;
	  user-select: none;
	  border-radius: 15px 15px 0 0;
	  background: linear-gradient(-135deg, #c850c0, #4158d0);
	}
	.wrapper form{
	  padding: 10px 30px 50px 30px;
	}
	.wrapper form .field{
	  height: 50px;
	  width: 100%;
	  margin-top: 20px;
	  position: relative;
	}
	.wrapper form .field input{
	  height: 100%;
	  width: 100%;
	  outline: none;
	  font-size: 17px;
	  padding-left: 20px;
	  border: 1px solid lightgrey;
	  border-radius: 25px;
	  transition: all 0.3s ease;
	}
	.wrapper form .field input:focus,
	form .field input:valid{
	  border-color: #4158d0;
	}
	.wrapper form .field label{
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
	form .field input:focus ~ label,
	form .field input:valid ~ label{
	  top: 0%;
	  font-size: 16px;
	  color: #4158d0;
	  background: #fff;
	  transform: translateY(-50%);
	}
	form .content{
	  display: flex;
	  width: 100%;
	  height: 50px;
	  font-size: 16px;
	  align-items: center;
	  justify-content: space-around;
	}
	form .content .checkbox{
	  display: flex;
	  align-items: center;
	  justify-content: center;
	}
	form .content input{
	  width: 15px;
	  height: 15px;
	  background: red;
	}
	form .content label{
	  color: #262626;
	  user-select: none;
	  padding-left: 5px;
	}
	form .content .pass-link{
	  color: "";
	}
	form .field input[type="submit"]{
	  color: #fff;
	  border: none;
	  padding-left: 0;
	  margin-top: -10px;
	  font-size: 20px;
	  font-weight: 500;
	  cursor: pointer;
	  background: linear-gradient(-135deg, #c850c0, #4158d0);
	  transition: all 0.3s ease;
	}
	form .field input[type="submit"]:active{
	  transform: scale(0.95);
	}
	form .signup-link{
	  color: #262626;
	  margin-top: 20px;
	  text-align: center;
	}
	form .pass-link a,
	form .signup-link a{
	  color: #4158d0;
	  text-decoration: none;
	}
	form .pass-link a:hover,
	form .signup-link a:hover{
	  text-decoration: underline;
	}
      </style>
      
      <script type="text/javascript">

	
function validateForm()
{
	 var name = document.forms["registrationForm"]["name"].value;
	 var email = document.forms["registrationForm"]["email"].value;
	 var phone= document.forms["registrationForm"]["phone"].value;
	 var password = document.forms["registrationForm"]["password"].value;
	 var repassword = document.forms["registrationForm"]["repassword"].value;
	 
	 if(name =="" || email =="" || phone =="" || password =="" || repassword =="")
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
	 if(isNumeric(phone, "Please enter a valid Mobile Number!!"))
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
      <div class="wrapper">
         <div class="title">
            Login Form
         </div>
         <form name="registrationForm"  action="insert.jsp" onsubmit="return validateForm()">
            <div class="field">
               <input type="text" placeholder="First Name" name="fname" required>
            </div>
            <div class="field">
               <input type="text" placeholder="Last Name" name="lname" required>
            </div>
            <div class="field">
               <input type="text" placeholder="Email Address" name="email" required>
            </div>
            <div class="field">
               <input type="text" placeholder="Mobile" name="mobile" required>
            </div>
            <div class="field">
               <input type="text" placeholder="Address" name="address" required>
            </div>
            <div class="">
               <label>Gender:</label>
               <label>Male</label>
               <input type="radio" value="male" name="gender">
                <label>Female</label>
               <input type="radio" value="female" name="gender">
            </div>
            <div class="field">
               <input type="password" placeholder="Password" name="password" required>
            </div>
			<div class="field">
               <input type="password" placeholder="Confirm Password" name="password" required>
            </div>
            <div class="field">
               <input type="submit" value="Login">
            </div>
            <div class="signup-link"><a href="show.jsp">Show Registration</a>
            </div>
         </form>
      </div>
      
      
   </body>
</html>