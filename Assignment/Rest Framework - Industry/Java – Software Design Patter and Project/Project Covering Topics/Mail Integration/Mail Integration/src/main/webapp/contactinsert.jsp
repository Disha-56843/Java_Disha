<%@page import="Dao.Dao"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
     <jsp:useBean id="m" class="model.Contactmodel"/>
	 <jsp:setProperty property="*" name="m"/>   
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<%

	int status = Dao.contactinsert(m);
	
	if(status>0)
	{
		
	%>
	
	<form  action="https://api.web3forms.com/submit"  method="post" >
			
			<input type="hidden" name="access_key" value="9888d340-3c2e-4dc2-887f-08db53383d10">
			
			<div class="form-group input-group">
				<div class="input-group-prepend">
					<span class="input-group-text"> <i class="fa fa-user"></i>
					</span>
				</div>
				<input name="name" class="form-control" placeholder="Full name"
					type="hidden" id="name" value="<%= m.getName()%>">
			</div>
			
			<div class="form-group input-group">
				<div class="input-group-prepend">
					<span class="input-group-text"> <i class="fa fa-user"></i>
					</span>
				</div>
				<input name="email" class="form-control" placeholder="Email"
					type="hidden" id="email" value="<%=m.getEmail()%>">
			</div>
			
			<div class="form-group input-group">
				<div class="input-group-prepend">
					<span class="input-group-text"> <i class="fa fa-user"></i>
					</span>
				</div>
				<input name="number" class="form-control" placeholder="Email"
					type="hidden" id="email" value="<%=m.getNumber()%>">
			</div>
			
			<div class="form-group input-group">
				<div class="input-group-prepend">
					<span class="input-group-text"> <i class="fa fa-user"></i>
					</span>
				</div>
				<input name="subject" class="form-control" placeholder="feedback"
					type="hidden" id="feedback" value="<%=m.getSubject()%>">
			</div>
			
			<div class="form-group input-group">
				<div class="input-group-prepend">
					<span class="input-group-text"> <i class="fa fa-user"></i>
					</span>
				</div>
				<input name="message" class="form-control" placeholder="feedback"
					type="hidden" id="feedback" value="<%=m.getMessage()%>">
			</div>
			
			<!-- form-group// -->
			<div class="form-group">
				<button type="submit" class="btn btn-primary btn-block">
					Send Email
				</button>
			</div>
			
		</form>
		<span id="tops"></span>
		</article>
	</div>
	
	
	
	<% 	
		//response.sendRedirect("");
	}
	

	%>

</body>
</html>