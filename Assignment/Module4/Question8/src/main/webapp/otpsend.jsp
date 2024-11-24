<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="UTF-8" />
    <meta http-equiv="X-UA-Compatible" content="IE=edge" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <title>OTP Verification Form</title>
    <link rel="stylesheet" href="css/otpsent.css" />
    <!-- Boxicons CSS -->
    <link href="https://unpkg.com/boxicons@2.1.4/css/boxicons.min.css" rel="stylesheet" />
    <script src="script.js" defer></script>
  </head>
  <body>
    <div class="container">
      <header>
        <i class="bx bxs-check-shield"></i>
      </header>
      <h4>Enter OTP Code</h4>
    
      <form action="otpcheck.jsp" >
      
        <div class="input-field">
         
          <input type="text" name="otp" />
           <input type="text" name="otp2" />
            <input type="text" name="otp3" />
             <input type="text" name="otp4" />
          
        </div>
        
        <button type="submit">Verify OTP</button>
      
      </form>
    </div>
  </body>
</html>