<%@page import="com.Dao.Dao"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <jsp:useBean id="m" class="com.Model.Employee"/>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<%
		String id = request.getParameter("id");
		int id2 = Integer.parseInt(id);
		Dao.delete(id2, m);
		response.sendRedirect("show.jsp");

	%>

</body>
</html>