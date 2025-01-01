package com.Dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.Model.Students;

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
	
	public static int savedata(Students m)
	{
		int status = 0;
		
		Connection con = Dao.getconnect();
		try 
		{
			PreparedStatement ps = con.prepareStatement("insert into student(fname, lname, email, mobile, gender, password) values (?,?,?,?,?,?)");
		
			ps.setString(1,m.getFname());
			ps.setString(2,m.getLname());
			ps.setString(3,m.getEmail());
			ps.setString(4,m.getMobile());
			ps.setString(5,m.getGender());
			ps.setString(6,m.getPassword());
			
			status = ps.executeUpdate();
		}
		catch (SQLException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return status;
	}
	
	public static List<Students>viewdata()
	{
		Connection con = Dao.getconnect();
		List<Students>list = new ArrayList<>();
		try 
		{
			PreparedStatement ps = con.prepareStatement("select * from student");
			ResultSet set = ps.executeQuery();
			
			while(set.next())
			{
				int id = set.getInt(1);
				String fname = set.getString(2);
				String lname = set.getString(3);
				String email = set.getString(4);
				String mobile = set.getString(5);
				String gender = set.getString(6);
				String password = set.getString(7);
			
				Students m = new Students();
				m.setId(id);
				m.setFname(fname);
				m.setLname(lname);
				m.setEmail(email);
				m.setMobile(mobile);
				m.setGender(gender);
				m.setPassword(password);
			
				list.add(m);
			}
			
		}
		catch (SQLException e)		
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
		return list;
	}
	
	public static int delete(int id, Students m)
	{
		Connection con = Dao.getconnect();//connection call
		
		int status = 0;
		
		try 
		{
			PreparedStatement ps = con.prepareStatement("delete from student where id =?");
			
			ps.setInt(1,id);
	
			
			status = ps.executeUpdate();//run
			
		} 
		catch (Exception e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		return status;
	}
	
	public static Students Edit(int id)
	{
		Connection con = Dao.getconnect();//connection call
		
		int status = 0;
		Students m =null;
		try 
		{
			PreparedStatement ps = con.prepareStatement("select * from student where id=?");
			ps.setInt(1,id);
			
			ResultSet set = ps.executeQuery();
			
			if(set.next())
			{
				int id2 = set.getInt(1);
				String fname = set.getString(2);
				String lname = set.getString(3);
				String email = set.getString(4);
				String mobile = set.getString(5);
				String gender = set.getString(6);
			
				 m = new Students();
				m.setId(id2);
				m.setFname(fname);
				m.setLname(lname);
				m.setEmail(email);
				m.setMobile(mobile);
				m.setGender(gender);
			}
			
		} 
		catch (Exception e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return m;
	}
	//update
	public static int update(Students m)
	{
		Connection con = Dao.getconnect();//connection call
		
		int status = 0;
		
		try 
		{
			PreparedStatement ps = con.prepareStatement("update student set fname=?, lname=?, email=?, mobile=?, gender=? where id=?");
			ps.setString(1, m.getFname());
			ps.setString(2, m.getLname());
			ps.setString(3, m.getEmail());
			ps.setString(4, m.getMobile());
			ps.setString(5, m.getGender());
			ps.setInt(6, m.getId());
			
			
			status = ps.executeUpdate();//run
		} 
		catch (Exception e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return status;
	}
}
