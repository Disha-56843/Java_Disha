<%@page import="com.Dao.Dao"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <jsp:useBean id="m" class="com.Model.Employee"/>
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
    String fname=request.getParameter("fname");
	String lname=request.getParameter("lname");
    String email=request.getParameter("email");  
    String mobile=request.getParameter("mobile");
    String gender=request.getParameter("gender");
	String password=request.getParameter("password");
	
	
	//set
	session.setAttribute("fname", fname);
	session.setAttribute("lname", lname);
	session.setAttribute("email", email);
	session.setAttribute("mobile", mobile);
	session.setAttribute("gender", gender);
	session.setAttribute("password", password);
	
	
	
	if(fname==null||email.trim().equals(""))
    {  
    	out.print("<p>Please enter first name!</p>");  
    }
	if(email==null||email.trim().equals(""))
    {  
    	out.print("<p>Please enter Email!</p>");  
    }
	if(mobile==null||mobile.trim().equals(""))
	{
		out.print("<p>Please enter Phone!</p>");  
	}
	
	if(password==null||password.trim().equals(""))
	{
		out.print("<p>Please enter Password!</p>");  
	}
	
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