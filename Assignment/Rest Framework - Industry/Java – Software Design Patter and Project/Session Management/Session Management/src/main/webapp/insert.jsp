<%@page import="java.sql.PreparedStatement"%>
<%@ page import="java.sql.ResultSet"%>
<%@ page import="java.sql.Connection"%>
<%@ page import="java.sql.DriverManager"%>
<%@ page import="Dao.Dao"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <jsp:useBean id="m" class="model.Model" />
    <jsp:setProperty property="*" name="m"/>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	
	<%
	  	
    //get  
  	String email=request.getParameter("email");  
	String password=request.getParameter("password");
	
	//set
	
	session.setAttribute("email", email);
	session.setAttribute("password", password);
		  
		
		
		
	int status = Dao.savedata(m);
	if(status>0)
	{
		response.sendRedirect("show.jsp");
	}
	else
	{
		out.print("Error");
	}
%>

</body>
</html>