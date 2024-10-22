
<%@ page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" %>
    
    <%@ page import="Dao.Dao" %>
    <%@ page import="Model.Model" %>


<html>
<head>
    <title>Product List</title>
</head>
<body>
    
    <h2>Product List</h2>
    <table border="1">
        <tr>
            <th>CATEGORY</th>
            <th>Name</th>
            <th>AUTHOR</th>
            <th>QUANTITY</th>
            <th>Price</th>
        </tr>
		
		<%
                        
            List<Model> list = Dao.viewproducts();
                        
            for (Model m : list)
                {
        %>
        <tr>
            <td><%= m.getCategory() %></td>
            <td><%= m.getBname() %></td>
            <td><%= m.getAuthor() %></td>
            <td><%= m.getQuantity() %></td>
            <td><%= m.getPrice() %></td>
            
        </tr>
        
        <% } %>
    </table>
</body>
</html>
