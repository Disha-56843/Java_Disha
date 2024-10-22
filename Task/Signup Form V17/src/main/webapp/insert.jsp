<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <%@ page import="com.dao.Dao" %>
    <%@ page import="com.model.Model" %>
    
    <jsp:useBean id="m" class="com.model.Model" />
    <jsp:setProperty property="*" name="m" />
    
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<%
	
	
		String name = request.getParameter("name");  
	    String email = request.getParameter("email");    
		String password = request.getParameter("password");

		session.setAttribute("name", name);
		session.setAttribute("email", email);
		session.setAttribute("password", password);
		
		if(email==null||email.trim().equals(""))
	    {  
	    	out.print("<p>Please enter Email!</p>");  
	    }		
		if(password==null||password.trim().equals(""))
		{
			out.print("<p>Please enter Password!</p>");  
		}
		
		if (name != null && !name.trim().equals("") && 
		        email != null && !email.trim().equals("") &&
		        password != null && !password.trim().equals("")) {
		        	
			try{
				
				Class.forName("com.mysql.jdbc.Driver");
	    		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/signupv17","root","");  
	    		PreparedStatement ps=con.prepareStatement("select * from user where email=?");  
	    		ps.setString(1, email);
	    		ResultSet rs=ps.executeQuery();  
	      		if(rs.next()) 
	      		{      	
	      			out.println("<h1>Email Id Already exits, try entering new Email Address.</h1>");
	      		}
	      		else {
	      			
	      			RequestDispatcher rd = request.getRequestDispatcher("EmailSendingServlet2");
	      			request.setAttribute("e1", email);
	      			 
	      			rd.forward(request, response);
	      			int status = Dao.signup(m);
	      		}
			}
			catch(Exception e)
			{
				e.printStackTrace();	
			}
		}		
		
	
	%>

</body>
</html>