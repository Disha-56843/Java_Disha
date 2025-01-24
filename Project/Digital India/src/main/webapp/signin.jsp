<%@page import="Dao.Dao"  %>
<%@page import="model.Model" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <jsp:useBean id="m" class="model.Model" />
    <jsp:setProperty property="*" name="m"/>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
</head>
<body>

<%
    
	    response.setHeader("cache-control", "no-cache");
	    response.setHeader("cache-control", "no-store");
	    response.setHeader("pragma", "no-cache");
	    response.setDateHeader("Expires", 0);
    
    %>
    
<%
	Model status = Dao.signin(m);

	if(status!=null)
	{
		session.setAttribute("project",true);
		session.setAttribute("email",m.getEmail());
		session.setAttribute("password", m.getPassword());
		
		response.sendRedirect("index.jsp");
	}
	else
	{
		out.print("login fail");
	}
	

%>

</body>
</html>