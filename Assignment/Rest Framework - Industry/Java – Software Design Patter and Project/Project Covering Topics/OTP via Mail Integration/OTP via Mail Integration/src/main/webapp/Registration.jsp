<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<!-- Created By CodingNepal -->
<html lang="en" dir="ltr">
   <head>
      <meta charset="utf-8">
      <title>Registration</title>
      <link rel="stylesheet" href="css/style.css">
   </head>
   <body>
   
   	 <%
    
	    response.setHeader("cache-control", "no-cache");
	    response.setHeader("cache-control", "no-store");
	    response.setHeader("pragma", "no-cache");
	    response.setDateHeader("Expires", 0);
    
    %>
   
      <div class="wrapper">
         <div class="title">
            Login Form
         </div> 
         <form action="insert.jsp" method="post">
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
               <input type="password" placeholder="Password" name="password" required>
            </div>
            
            <div class="field">
               <input type="submit" value="Sign Up">
            </div>
            <div class="signup-link">
               Already a member? <a href="Login.jsp">Login</a>
            </div>
         </form>
      </div>
   </body>
</html>