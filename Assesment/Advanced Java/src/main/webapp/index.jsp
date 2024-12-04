<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>

<style type="text/css">
    @import url('https://fonts.googleapis.com/css?family=Poppins:400,500,600,700&display=swap');
	*{
	  margin: 0;
	  padding: 0;
	  box-sizing: border-box;
	  font-family: 'Poppins', sans-serif;
	}
	html,body{
	  display: grid;
	  height: 100%;
	  width: 100%;
	  place-items: center;
	  background: #f2f2f2;
	  /* background: linear-gradient(-135deg, #c850c0, #4158d0); */
	}
	::selection{
	  background: #4158d0;
	  color: #fff;
	}
	.col-sm-6{
		font-size: large;
	}

	
      </style>
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
						<a href="Registration.jsp" class="btn btn-success" data-toggle="modal"><span>Add New Employee</span></a>						
					<span>||</span>
						<a href="show.jsp" class="btn btn-success" data-toggle="modal"><span>View Employee</span></a>						
					</div>
				</div>
			</div>
			
		</div>
	</div>        
</div>
</body>
</html>