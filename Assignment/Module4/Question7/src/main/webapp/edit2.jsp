<%@page import="com.Dao.Dao"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <jsp:useBean id="m" class="com.Model.Students"/>
<jsp:setProperty property="*" name="m"/>  
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<%
		int status = Dao.update(m);
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