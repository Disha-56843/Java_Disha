package com.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import com.model.Model;

public class Dao {

	public static Connection getconnect() {
		
		
			Connection con = null;
			
			try 
			{
				Class.forName("com.mysql.jdbc.Driver");
				con = DriverManager.getConnection("jdbc:mysql://localhost:3306/signupv17","root","");
			}
			catch (Exception e) 
			{
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			return con;
		
	}
	
	public static int signup(Model m)
	{
		Connection con = Dao.getconnect();
		
		int status = 0;
		
		try 
		{
			PreparedStatement ps = con.prepareStatement("insert into user(name,email,password) values (?,?,?)");
			ps.setString(1, m.getName());
			ps.setString(2, m.getEmail());
			ps.setString(3, m.getPassword());
			
			
			status = ps.executeUpdate();
		} 
		catch (Exception e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return status;
	}
	
}
