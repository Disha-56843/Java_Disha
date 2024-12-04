<%@page import="com.Dao.Dao"%>
<%@page import="com.Model.Employee"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	
	<div class="container-xl">
	<div class="table-responsive">
		<div class="table-wrapper">
			<div class="table-title">
				<div class="row">
					<div class="col-sm-6">
						<h2>Manage <b>Employees</b></h2>
					</div>
					<div class="col-sm-6">
						<a href="Registration.jsp" class="btn btn-success" data-toggle="modal"><span>Add New Students</span></a>						
					</div>
				</div>
			</div>
			<table class="table table-striped table-hover" border="1">
				<thead>
					<tr>
						<th>Id</th>
						<th>First Name</th>
						<th>Last Name</th>
						<th>Email</th>
						<th>Phone</th>
						<th>Address</th>
						<th>Gender</th>
						<th colspan="2">Actions</th>
					</tr>
					
					
					<%
						List<Employee>list = Dao.viewdata();
						for(Employee m :list)
						{
							
						
										
					%>
					<tr>
						<td><%=m.getId() %></td>
						<td><%=m.getFname() %></td>
						<td><%=m.getLname() %></td>
						<td><%=m.getEmail() %></td>
						<td><%=m.getMobile() %></td>
						<td><%=m.getAddress() %></td>
						<td><%=m.getGender() %></td>
						<td><a href="edit.jsp?id=<%=m.getId()%>">Edit</a></td>
						<td><a href="delete.jsp?id=<%=m.getId()%>">Delete</a></td>
					</tr>
					
					<%
						}
					%>
					
					
					
					
					
				</thead>
				<tbody>
					
					
					
								
				
				</tbody>
			</table>
			
		</div>
	</div>        
</div>

</body>
</html>