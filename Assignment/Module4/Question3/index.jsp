<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>  
<!DOCTYPE html>
<html>
<head>
    <title>Student Registration</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            background-color: #f2f2f2;
            margin: 0;
            padding: 0;
            display: flex;
            justify-content: center;
            align-items: center;
            height: 100vh;
        }

        h2 {
            text-align: center;
            color: #333;
        }

        form {
            background-color: #fff;
            border-radius: 8px;
            padding: 20px;
            box-shadow: 0 4px 8px rgba(0, 0, 0, 0.1);
            width: 300px;
        }

        input[type="text"], input[type="email"], input[type="password"] {
            width: 100%;
            padding: 8px;
            margin: 8px 0;
            box-sizing: border-box;
            border: 1px solid #ccc;
            border-radius: 4px;
        }

        input[type="radio"] {
            margin: 0 5px 0 20px;
        }

        input[type="submit"] {
            background-color: #4CAF50;
            color: white;
            padding: 10px;
            border: none;
            border-radius: 4px;
            cursor: pointer;
            width: 100%;
        }

        input[type="submit"]:hover {
            background-color: #45a049;
        }

        label {
            display: block;
            margin-bottom: 5px;
            font-weight: bold;
            color: #333;
        }

        .form-group {
            margin-bottom: 15px;
        }
    </style>
</head>
<body>
    <div>
        <h2>Student Registration Form</h2>
        <form action="submitStudent" method="post">
            <div class="form-group">
                <label for="fname">First Name:</label>
                <input type="text" name="fname" id="fname" required>
            </div>
            
            <div class="form-group">
                <label for="lname">Last Name:</label>
                <input type="text" name="lname" id="lname" required>
            </div>

            <div class="form-group">
                <label for="email">Email:</label>
                <input type="email" name="email" id="email" required>
            </div>

            <div class="form-group">
                <label for="mobile">Mobile:</label>
                <input type="text" name="mobile" id="mobile" required>
            </div>

            <div class="form-group">
                <label>Gender:</label>
                <input type="radio" name="gender" value="Male" required> Male
                <input type="radio" name="gender" value="Female" required> Female
            </div>

            <div class="form-group">
                <label for="password">Password:</label>
                <input type="password" name="password" id="password" required>
            </div>

            <input type="submit" value="Submit">
        </form>
    </div>
</body>
</html>