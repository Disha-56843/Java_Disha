package com.Dao;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import com.Model.User;


public class Dao {

	public static Connection getconnect()
	{
		Connection con = null;
		
		try 
		{
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jspque7","root","");
		}
		catch (Exception e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return con;
	}
	
	public static int signup(User m)
	{
		int status = 0;
		
		Connection con = Dao.getconnect();
		try 
		{
			PreparedStatement ps = con.prepareStatement("insert into user(fname, lname, email, mobile, password) values (?,?,?,?,?)");
		
			ps.setString(1,m.getFname());
			ps.setString(2,m.getLname());
			ps.setString(3,m.getEmail());
			ps.setString(4,m.getMobile());
			ps.setString(5,m.getPassword());
			
			status = ps.executeUpdate();
		}
		catch (SQLException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return status;
	}
	
//	signin
	
	public static User signin(User m)
	{
		Connection con = Dao.getconnect();
		
		User m2 = null;
		
		
		try 
		{
			PreparedStatement ps = con.prepareStatement("select * from user where email=? and password=?");
			ps.setString(1, m.getEmail());
			ps.setString(2, m.getPassword());
			
			ResultSet set = ps.executeQuery();
			
			if(set.next())
			{
				
				int id = set.getInt(1);
				String email = set.getString(2);
				String password = set.getString(3);
				
				m2 = new User();
				m2.setUid(id);
				m2.setEmail(email);
				m2.setPassword(password);
			}
			else
			{
				System.out.println("Invalid Credentials");
			}
			
		} 
		catch (Exception e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return m2;
	}
}
