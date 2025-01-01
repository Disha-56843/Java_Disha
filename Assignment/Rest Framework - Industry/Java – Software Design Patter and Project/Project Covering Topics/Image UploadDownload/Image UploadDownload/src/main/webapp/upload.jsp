<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	 <h3>Upload Image:</h3>
    <form action="UploadServlet" method="post" enctype="multipart/form-data">
        <input type="file" name="image" accept="image/*" required />
        <br />
        <input type="submit" value="Upload Image" />
    </form>
</body>
</html>