package Dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Base64;
import java.util.List;

import Model.Model;

public class Dao {
	
	public static Connection getconnect()
	{
		Connection con = null;
		
		try 
		{
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/library_management_system","root","");
		}
		catch (Exception e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return con;
	}
	
public static List<Model> viewproducts() {
		
		List<Model> productlist = new ArrayList<>();
		
		Connection con = Dao.getconnect();
		
		try {
			
			PreparedStatement ps = con.prepareStatement("select * from books");
			ResultSet set = ps.executeQuery();
			
			
			while(set.next()) {
				
				
				int book_id = set.getInt(1);
				String category = set.getString(2);
				String bname = set.getString(3);
				String author = set.getString(4);
				int quantity = set.getInt(5);
				String price = set.getString(6);
				
				
				
				
				Model pm = new Model();
				
				pm.setBook_id(book_id);
				pm.setCategory(category);
				pm.setBname(bname);
				pm.setAuthor(author);
				pm.setQuantity(quantity);
				pm.setPrice(price);
				
				
				productlist.add(pm);
			}
			
		}
		catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		return productlist;
		
	}

}
