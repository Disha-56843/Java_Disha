package Dao;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Base64;
import java.util.List;

import model.Contactmodel;

public class Dao {

	public static Connection getconnect()
	{
		Connection con = null;
		
		try 
		{
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jspcrud","root","");
		}
		catch (Exception e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return con;
	}
	

	//Contact
	public static int contactinsert(Contactmodel m)
	{
		int status = 0;
		
		Connection con = Dao.getconnect();
		try 
		{
			PreparedStatement ps = con.prepareStatement("insert into contact(name,email,number,subject,message,Status) values (?,?,?,?,?,?)");
		
			ps.setString(1,m.getName());
			ps.setString(2,m.getEmail());
			ps.setString(3,m.getNumber());
			ps.setString(4,m.getSubject());
			ps.setString(5,m.getMessage());
			ps.setString(6, "Pending");
			
			status = ps.executeUpdate();
		}
		catch (SQLException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
		return status;
	}
	
	
}