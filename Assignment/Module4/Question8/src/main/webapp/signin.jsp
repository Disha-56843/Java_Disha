<%@page import="com.Dao.Dao"%>
<%@page import="com.Model.User"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <jsp:useBean id="m" class="com.Model.User" />
    <jsp:setProperty property="*" name="m"/>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%
    
	    response.setHeader("cache-control", "no-cache");
	    response.setHeader("cache-control", "no-store");
	    response.setHeader("pragma", "no-cache");
	    response.setDateHeader("Expires", 0);
    
    %>
    
<%
	User status = Dao.signin(m);

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