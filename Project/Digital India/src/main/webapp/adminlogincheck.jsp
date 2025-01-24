<%@page import="Dao.Dao"%>
<%@page import="model.Adminmodel"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<%
				String user_id = request.getParameter("user_id");
				String password = request.getParameter("password");
					
				Adminmodel m = new Adminmodel();
				m.setUser_id(user_id);
				m.setPassword(password);
				
				Adminmodel m2 = Dao.adminlogin(m);
				
				if(m2!=null)
				{
					
					session.setAttribute("admin", true);
					session.setAttribute("username", user_id);
					response.sendRedirect("admindashboard.jsp");
				}
				else
				{
					
				
			%>
					<br>
					<b><p style="color:red;font-family: sans-serif; font-size: 25px;">Login Failed!! Please Try Again</p></b>
					<br>
					<br>
				<%@ include file="adminlogin.jsp"%>
				<%
				}
				%>
		
					
					
	

</body>
</html>