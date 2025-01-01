<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>


<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>login</title>

    <!-- Bootstrap CSS CDN  -->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet"
        integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
    <!-- External CSS  -->
    <link rel="stylesheet" href="CSS/style.css">
    <link rel="stylesheet" href="CSS/style1.css">
    <link rel="stylesheet" href="CSS/media.css">

    <!-- Bootstrap JS CDN  -->
    <script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.10.2/dist/umd/popper.min.js"
        integrity="sha384-7+zCNj/IqJ95wo16oMtfsKbZ9ccEh31eOz1HGyDuCQ6wgnyJNSYdrPa03rtR1zdB"
        crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.min.js"
        integrity="sha384-QJHtvGhmr9XOIpI6YVutG+2QOK9T+ZnN4kzFN1RtK3zEFEIsxhlmWl5/YESvpZ13"
        crossorigin="anonymous"></script>

    <!-- Bootstrap icon CDN  -->
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.10.5/font/bootstrap-icons.css">

    <!-- Fontawsome CDN  -->
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.4.2/css/all.min.css"
        integrity="sha512-z3gLpd7yknf1YoNbCzqRKc4qyor8gaKU1qmn+CShxbuBusANI9QpRohGBreCFkKxLhei6S9CQXFEbbKuqLg0DA=="
        crossorigin="anonymous" referrerpolicy="no-referrer" />

</head>
<body>


<%
    
	    response.setHeader("cache-control", "no-cache");
	    response.setHeader("cache-control", "no-store");
	    response.setHeader("pragma", "no-cache");
	    response.setDateHeader("Expires", 0);
    
    %>

<jsp:include page="header.jsp"/>
    <section id="account mt-5">
      <div class="container mt-5">
        <div class="border border border-end-0 border-start-0 border-top-0 border-dark text-center">
          <span class="text-secondary pe-5">SIGN IN</span>
          <span><a href="signup.jsp"> REGISTER</a></span>
        </div>
        <form action="signin.jsp">
          <label for="" class="mt-5">Username or Email Address *</label><br>
          <input type="text" placeholder="Your Username" class="w-100" name="email" id="">
          <label for="" class="mt-5">Password *</label><br>
          <input type="text" placeholder="Your Password" class="w-100" name="password" id="">
        <input type="checkbox" name="" class="mt-5" id=""> Remember me <a href="" class="text-dark">Forgot Password</a>
          <input type="submit" class="bg-dark text-white w-100 mt-5" value="Login">
</form>
<hr class="w-100 mt-5">
      </div>
    </section>


    <jsp:include page="footer.jsp" />
</body>
</html>