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
    String fname=request.getParameter("fname");  
  	String email=request.getParameter("email");  
	String password=request.getParameter("password");
	
	//set
	session.setAttribute("fname", fname);
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
		
			try
	    	{  
	    		Class.forName("com.mysql.jdbc.Driver");
	    		
	    		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/digitalindia", "root", "");
				PreparedStatement ps = con.prepareStatement("select * from users where email=?");
	    		ps.setString(1, email);
	    		ResultSet rs = ps.executeQuery();
	    		
	      		if(rs.next()) {      	
	      			out.println("<h1>Email Id Already exits, try entering new Email Address.</h1>");   	
	    	
	      		}
	      		else
	      		{
						int number11 = 1 + (int)(9* Math.random());
						int number22 = 1 + (int)(9* Math.random());
						int number33 = 1 + (int)(9* Math.random());
						int number44 = 1 + (int)(9* Math.random());
						
						session.setAttribute("fname",fname);
						session.setAttribute("email",email);
						session.setAttribute("password",password);
						
						
						session.setAttribute("n1",number11);
						session.setAttribute("n2",number22);
						session.setAttribute("n3",number33);
						session.setAttribute("n4",number44);
		
						System.out.print(number11+" "+number22+" "+number33+" "+number44);
						System.out.print(fname);
						
						RequestDispatcher rd = request.getRequestDispatcher("EmailSendingServlet2");
						 request.setAttribute("e1", email);
						session.setAttribute("n1",number11);
						session.setAttribute("n2",number22);
						session.setAttribute("n3",number33);
						session.setAttribute("n4",number44);
					    rd.forward(request, response);
				     
						out.println("<p>This Email Id Is Available</p>"); 
				}
								
							
	    	}catch(Exception e){
					e.printStackTrace();
					
	    	}
%>

</body>
</html>