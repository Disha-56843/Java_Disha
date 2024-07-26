package Module3_Module_Java_RDBMS_Database;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;

public class Que_2 implements ActionListener 
{
	
	JFrame frame;
	JLabel l1,l2,l3,l4,l5,l6;
	JTextField tf1,tf2,tf3,tf4;
	JRadioButton jrb1,jrb2;
	JButton btn1,btn2,btn3,btn4,btn5,btn6;
	JTable jt;
	
	 

	public Que_2() {
		// TODO Auto-generated constructor stub
		
//		String db ="registration";
//		String host="jdbc:mysql://localhost:3306/";
//		String url = host+db;
		
//		Object[][] data = null;
		
//		try {
//			
//				Class.forName("com.mysql.jdbc.Driver");
//				Connection con = DriverManager.getConnection(url,"root","");
//			
//				String sql = "select * from registration";
//				Statement stmt = con.createStatement();
//
//				ResultSet set = stmt.executeQuery(sql);
//			
//			
//
//				while(set.next())
//				{
//					String id = String.valueOf(set.getInt(1));
//					String name = set.getString(2);
//					String gender = set.getString(3);
//					String address = set.getString(4);
//					String contact = set.getString(5);
//					
//					String data[]={id,name,gender,address,contact};	
		String data[][]={
//					{1,id,},    
					{"102","Jai","780000"},    
					{"101","Sachin","700000"}
//				}
			};   
//			}
//		catch(Exception e)
//		{
//			e.printStackTrace();
//		}

//	String column[]={"S.No","ID","NAME","Gender","Address","Contact"}; 
		String column[]={"S.No","ID","NAME"}; 
		
		
		frame = new JFrame("REGISTRATION FRAME");
		
		l1 = new JLabel("Registration Form");
		l1.setBounds(52, 16, 129, 14);
		
		l2 = new JLabel("Id");
		l2.setBounds(10, 56, 49, 14);
		
		l3 = new JLabel("Name");
		l3.setBounds(10, 96, 49, 14);
		
		l4 = new JLabel("Gender");
		l4.setBounds(10, 136, 49, 14);
		
		l5 = new JLabel("Address");
		l5.setBounds(10, 176, 49, 14);
		
		l6 = new JLabel("Contact");
		l6.setBounds(10, 216, 49, 14);
		
		tf1 = new JTextField();
		tf1.setBounds(93, 56, 96, 20);
		
		tf2 = new JTextField();
		tf2.setBounds(93, 96, 96, 20);
		
		tf3 = new JTextField();
		tf3.setBounds(93, 176, 96, 20);
		
		tf4 = new JTextField();
		tf4.setBounds(93, 216, 96, 20);
		
		jrb1 = new JRadioButton("Male");
		jrb1.setBounds(90, 136, 55, 23);
		
		jrb2 = new JRadioButton("Female");
		jrb2.setBounds(150, 136, 97, 23);
		
		ButtonGroup bg = new ButtonGroup();
		bg.add(jrb1);
		bg.add(jrb2);
		
		btn1 = new JButton("Exit");
		btn1.setBounds(10, 259, 89, 23);
		
		btn2 = new JButton("Register");
		btn2.setBounds(110, 259, 89, 23);
		
		btn3 = new JButton("Delete");
		btn3.setBounds(10, 299, 89, 23);
		
		btn4 = new JButton("Update");
		btn4.setBounds(110, 299, 89, 23);
		
		btn5 = new JButton("Reset");
		btn5.setBounds(60, 330, 89, 23);
		
		btn6 = new JButton("Refresh Table");
		btn6.setBounds(380, 329, 259, 23);
		
		
		
		
		JTable jt = new JTable(data,column);
		
		
		JScrollPane sp = new JScrollPane(jt);
		sp.setBounds(250,16,520,310);
		
		btn1.addActionListener(this);
		btn2.addActionListener(this);
		btn3.addActionListener(this);
		btn4.addActionListener(this);
		
		frame.add(sp);
		frame.add(l1);
		frame.add(l2);
		frame.add(l3);
		frame.add(l4);
		frame.add(l5);
		frame.add(l6);
		frame.add(tf1);
		frame.add(tf2);
		frame.add(tf3);
		frame.add(tf4);
		frame.add(jrb1);
		frame.add(jrb2);
		frame.add(btn1);
		frame.add(btn2);
		frame.add(btn3);
		frame.add(btn4);
		frame.add(btn5);
		frame.add(btn6);
		frame.setSize(800, 400);
		frame.setLayout(null);
		frame.setVisible(true);
		
	}
	
	public static void main(String[] args) 
	{
	
		new Que_2();
		
	}

	@Override
	public void actionPerformed(ActionEvent e) 
	{
		// TODO Auto-generated method stub
		

		// Data Update
		if(e.getSource() == btn1)
		{
			frame.setVisible(false);
		}
		
		// Data insert or register 
		if(e.getSource() == btn2)
		{
			//data for connection
			String db ="registration";
			String host="jdbc:mysql://localhost:3306/";
			String url = host+db;
			
			try {
				Class.forName("com.mysql.jdbc.Driver");
				Connection con = DriverManager.getConnection(url,"root","");
				
				String id2 = tf1.getText().toString();
				int id = Integer.parseInt(id2);
				String name = tf2.getText().toString();
				String gender = null;
				String address = tf3.getText().toString();
				String contact = tf4.getText().toString();
				
				
				if(jrb1.isSelected())
				{
					 gender = jrb1.getText().toString();
				}
				else if(jrb2.isSelected())
				{
					 gender = jrb2.getText().toString();
				}
				
				String sql = "insert into registration values ('"+id+"','"+name+"','"+gender+"','"+address+"','"+contact+"')";
				
				//query run
				Statement stmt = con.createStatement();
				int data = stmt.executeUpdate(sql);
				
				if(data>0)
				{
					System.out.println("Registration completed");
					
				}
				else
				{
					System.out.println("Error");
				}
				
			} 
			catch (Exception e1) 
			{
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}	
		
		// Data delete
		if(e.getSource() == btn3)
		{
			String id = tf1.getText().toString();
			int id2 = Integer.parseInt(id);
			
			String db ="registration";
			String host="jdbc:mysql://localhost:3306/";
			String url = host+db;
			
			try {
				Class.forName("com.mysql.jdbc.Driver");
				Connection con = DriverManager.getConnection(url,"root","");
				
				String sql = "delete from registration where id='"+id2+"'";
				Statement stmt = con.createStatement();
				
				int data = stmt.executeUpdate(sql);
				
				if(data>0)
				{
					
					System.out.println("Data deleted successfully");
					
				}
				else
				{
					System.out.println("Error");
				}
				
			} 
			catch (Exception e1) 
			{
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			
		}
		
		// Data Update
		if(e.getSource() == btn4)
		{
			
			String db ="registration";
			String host="jdbc:mysql://localhost:3306/";
			String url = host+db;
		
			try 
			{
				Class.forName("com.mysql.jdbc.Driver");
				Connection con = DriverManager.getConnection(url,"root","");
			
				String id = tf1.getText().toString();
				int id2 = Integer.parseInt(id);
			
				String sql ="select * from registration where id='"+id2+"'";
			
				Statement stmt = con.createStatement();
				ResultSet set = stmt.executeQuery(sql);
			
				if(set.next())
				{
					int id1 = set.getInt(1);
					String name = set.getString(2);
					String gender = set.getString(3);
					String address = set.getString(4);
					String contect = set.getString(5);
					
					tf2.setText(name);
					tf3.setText(address);
					tf4.setText(contect);
					
					try 
					{
							Class.forName("com.mysql.jdbc.Driver");
							Connection con1 = DriverManager.getConnection(url,"root","");
							
							String uname = tf2.getText().toString();
							String ugender = null;
							String uaddress = tf3.getText().toString();
							String ucontact = tf4.getText().toString();
							
							
							if(jrb1.isSelected())
							{
								 ugender = jrb1.getText().toString();
							}
							else if(jrb2.isSelected())
							{
								 ugender = jrb2.getText().toString();
							}
							
							String sql1 ="update registration set name='"+uname+"',gender='"+ugender+"',address='"+uaddress+"',contact='"+ucontact+"' where id='"+id1+"'";
							
							Statement stmt1 = con1.createStatement();
							int data = stmt1.executeUpdate(sql1);
							
							if(data>0)
							{
								
								System.out.println("Data updated successfully");
							}
							else
							{
								System.out.println("Error");
							}
					}
					catch (Exception e1) 
					{
							// TODO Auto-generated catch block
							e1.printStackTrace();
					}
					
				}		
		
			}
			catch (Exception e2) {
				// TODO: handle exception
				
				e2.printStackTrace();
			}
			
		}					
	}
	
}
