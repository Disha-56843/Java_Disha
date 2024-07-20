package Core_Java_Assessment_Test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;


public class Operations {
	
		//Class to perform Insert
		public void addBook(Scanner scanner) 
	    {


	        System.out.println("============Select category:===============");
	        System.out.println("1. Computer");
	        System.out.println("2. Electronics");
	        System.out.println("3. Electrical");
	        System.out.println("4. Civil");
	        System.out.println("5. Mechanical");
	        System.out.println("6. Architecture");
	        System.out.println("7. Back to main menu");
	        System.out.println("===========================================");
	        
	        
	        System.out.print("Enter book Category:");
	        String cat = scanner.next();
	        System.out.print("Enter book title: ");
	        String title = scanner.next();
	        System.out.print("Enter book author: ");
	        String authorname = scanner.next();
	        System.out.print("Enter book Quantity: ");
	        String qty = scanner.next();
	        System.out.print("Enter book Price: ");
	        String prc = scanner.next();
	        System.out.println("============================================");

	        
	      //data for connection
	        String db ="library_management_system";
			String host="jdbc:mysql://localhost:3306/";
			String url = host+db;
			
			try 
			{
				Class.forName("com.mysql.jdbc.Driver");
				Connection con = DriverManager.getConnection(url,"root","");
				
				String category = cat.toString();
				String bname = title.toString();
				String author = authorname.toString();
				String quantity = qty.toString();
				String price = prc.toString();
				
				String sql = "insert into books values (null,'"+category+"','"+bname+"','"+author+"','"+quantity+"','"+price+"')";

				//query run
				Statement stmt = con.createStatement();
				int data = stmt.executeUpdate(sql);
				
				if(data>0)
				{
					  System.out.println("\nBook added successfully.");
				}
				else
				{
					System.out.println("Error");
				}
			}
			catch (Exception e) {
				
				e.printStackTrace();
				
			}

	      
	    }
		
//		Class to perform Delete
	    public void deleteBook(Scanner scanner) {
	       
	        
	        System.out.print("Enter book Id to delete: ");
			int id = scanner.nextInt();
			
			//data for connection
			String db ="library_management_system";
			String host="jdbc:mysql://localhost:3306/";
			String url = host+db;
			
			try 
			{
				Class.forName("com.mysql.jdbc.Driver");
				Connection con = DriverManager.getConnection(url,"root","");
				
				String sql = "delete from books where book_id='"+id+"'";
				
				Statement stmt = con.createStatement();
				
				int data = stmt.executeUpdate(sql);
				
				if(data>0)
				{
					System.out.println("Book deleted successfully.");
				}
				else
				{
					System.out.println("Error");
				}
				
			}
			catch (Exception e1)
			{
				// TODO Auto-generated catch block
				 System.out.println("Book not found.");
				e1.printStackTrace();
			}
			

	       
	    }

//	    Class to perform search
	    public void searchBook(Scanner scanner) 
	    {
	     
	    	 System.out.println("\n==========================================");
	    	 System.out.println("1. Search by ID");
	    	 System.out.println("2. Search by Name");
	    	 System.out.println("========================================\n\n");
	    	 
	    	 System.out.print("Enter Your choice:");
	    	 int searchchoice = scanner.nextInt();
	    	
	    	//data for connection
	    	 String db ="library_management_system";
	 		 String host="jdbc:mysql://localhost:3306/";
	 		 String url = host+db;
	    	 
	         switch (searchchoice) {
	             case 1:
	             {
	            
	            	try 
	         		{
	         			Class.forName("com.mysql.jdbc.Driver");
	         			Connection con = DriverManager.getConnection(url,"root","");
	         			
	         			System.out.println("****Search Books By ID**** \n");
	         			System.out.print("Enter the book id: ");
	         			int id = scanner.nextInt();
	         			
	         			String sql = "select * from books where book_id='"+id+"'";
	        			Statement stmt = con.createStatement();

	        			ResultSet set = stmt.executeQuery(sql);
	             	
	         			System.out.println("\n The Book is available");
	         			System.out.println("=======================================");
	         			
	         			while(set.next())
	         			{
	         				int book_id = set.getInt(1);
	         				String category = set.getString(2);
	         				String bname = set.getString(3);
	         				String author = set.getString(4);
	         				int quantity = set.getInt(5);
	         				int price = set.getInt(6);
	         				
	         				System.out.println("Id: " + book_id);
	         				System.out.println("Category:" + category);
	         				System.out.println("Name: "+ bname);
	         				System.out.println("Author: "+ author);
	         				System.out.println("Quantity: "+ quantity);
	         				System.out.println("Price: "+ price);
	         			}
	         			
	         			
	         		}
	            	catch (Exception e) {
						// TODO: handle exception
	            		e.printStackTrace();
					}
	                break;
	             }
	             case 2:
	             {
	            	 try 
	          		{
	          			Class.forName("com.mysql.jdbc.Driver");
	          			Connection con = DriverManager.getConnection(url,"root","");
	          			
	          			System.out.println("****Search Books By Name**** \n");
	          			System.out.print("Enter the book name: ");
	          			String name = scanner.next();
	          			
	          			String sql = "select * from books where bname='"+name+"'";
	         			Statement stmt = con.createStatement();

	         			ResultSet set = stmt.executeQuery(sql);
	              	
	          			System.out.println("\n The Book is available");
	          			System.out.println("=======================================");
	          			while(set.next())
	          			{
	          				
	          				int book_id = set.getInt(1);
	          				String category = set.getString(2);
	          				String bname = set.getString(3);
	          				String author = set.getString(4);
	          				int quantity = set.getInt(5);
	          				int price = set.getInt(6);
	     				
	          				System.out.println("Id: " + book_id);
	          				System.out.println("Category:" + category);
	          				System.out.println("Name: "+ bname);
	          				System.out.println("Author: "+ author);
	          				System.out.println("Quantity: "+ quantity);
	          				System.out.println("Price: "+ price);
	          				
	          			
	          			}
	          			
	          		}
	             	catch (Exception e) {
	 					// TODO: handle exception
	             		e.printStackTrace();
	 				}
	                 break;
	             }
	             default:
	             {
	            	 System.out.println("Invalid option. Please try again.");
	            	 break;
	             }
	         }
	    
	}

//	    Class to perform View
	    public void viewAllBooks() 
	    {
	    	String db ="library_management_system";
			String host="jdbc:mysql://localhost:3306/";
			String url = host+db;
			
			try 
			{
				Class.forName("com.mysql.jdbc.Driver");
				Connection con = DriverManager.getConnection(url,"root","");
				String sql = "select * from books";
				Statement stmt = con.createStatement();

				ResultSet set = stmt.executeQuery(sql);
//				System.out.println("\nId\tCategory\tName\tAuthor\tQuantity\tPrice\n");
				
				while(set.next())
				{
//					int book_id = set.getInt(1);
//	  				String category = set.getString(2);
//	  				String bname = set.getString(3);
//	  				String author = set.getString(4);
//	  				int quantity = set.getInt(5);
//	  				int price = set.getInt(6);
//					
//	  				System.out.println(+ book_id+ "\t" + category + "\t\t" + bname + "\t" + author + "\t  " + quantity + "\t\t" + price);
//	  				System.out.println();
					

	  				int book_id = set.getInt(1);
	  				String category = set.getString(2);
	  				String bname = set.getString(3);
	  				String author = set.getString(4);
	  				int quantity = set.getInt(5);
	  				int price = set.getInt(6);
					
	  				System.out.println("Id : " + book_id);
	  				System.out.println("Category : " + category);
	  				System.out.println("Name : "+ bname);
	  				System.out.println("Author : "+ author);
	  				System.out.println("Quantity : "+ quantity);
	  				System.out.println("Price : "+ price);
	  				System.out.println();
				}
				
				
			}
			catch (Exception e) 
			{
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	    }
	    
//	    Class to perform Edit/Update
	    public void editbook(Scanner scanner)
	    {
					
					String db ="library_management_system";
					String host="jdbc:mysql://localhost:3306/";
					String url = host+db;
					
					try 
					{
						Class.forName("com.mysql.jdbc.Driver");
						Connection con = DriverManager.getConnection(url,"root","");
						
						System.out.print("Enter book Id to Edit: ");
						int id = scanner.nextInt();
						
						String sql ="select * from books where book_id='"+id+"'";
						
						Statement stmt = con.createStatement();
						ResultSet set = stmt.executeQuery(sql);
						
						if(set.next())
						{
						
							
							try 
							{
								Class.forName("com.mysql.jdbc.Driver");
								Connection con1 = DriverManager.getConnection(url,"root","");
										
										
								System.out.print("Enter book Category:");
						        String cat = scanner.next();
						        System.out.print("Enter book title: ");
						        String title = scanner.next();
						        System.out.print("Enter book author: ");
						        String authorname = scanner.next();
						        System.out.print("Enter book Quantity: ");
						        String qty = scanner.next();
						        System.out.print("Enter book Price: ");
						        String prc = scanner.next();
								        
								String sql1 ="update books set category='"+cat+"',bname='"+title+"',author='"+authorname+"',quantity='"+qty+"',price='"+prc+"' where book_id='"+id+"'";
										
								Statement stmt1 = con1.createStatement();
								int data = stmt1.executeUpdate(sql1);
										
								if(data>0)
								{
									System.out.println("Book Edited Sucessfully");
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
				catch (Exception e) 
				{
					// TODO: handle exception
					e.printStackTrace();
				}
					
	    	
	    }

//	    Class to perform Change Password
	    public void changePassword(Scanner scanner) 
	    {
	    	

			String db ="library_management_system";
			String host="jdbc:mysql://localhost:3306/";
			String url = host+db;
			
			try 
			{
				Class.forName("com.mysql.jdbc.Driver");
				Connection con = DriverManager.getConnection(url,"root","");
				
				System.out.println("=========================================");
				System.out.print("Enter Old Password: ");
				String password = scanner.next();
				
				String sql ="select * from password where password='"+password+"'";
				
				Statement stmt = con.createStatement();
				ResultSet set = stmt.executeQuery(sql);
				
				if(set.next())
				{
				
					
					try 
					{
						Class.forName("com.mysql.jdbc.Driver");
						Connection con1 = DriverManager.getConnection(url,"root","");
								
								
						System.out.print("Enter New Password:");
				        String newpassword = scanner.next();
				       
						        
						String sql1 ="update password set password='"+newpassword+"'";
								
						Statement stmt1 = con1.createStatement();
						int data = stmt1.executeUpdate(sql1);
								
						if(data>0)
						{
							System.out.println("Password change sucessfully");
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
		catch (Exception e) 
		{
			// TODO: handle exception
			e.printStackTrace();
		}
			
	
	    	
	    }
	   
	    
	
}
