package Core_Java_Assessment_Test;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.*;

public class LibraryManagementSystem 
{

	
   
    
    public static Object password = null;

	public static void main(String[] args) 
    {
    	
    	
    	
    	String db ="library_management_system";
    	String host="jdbc:mysql://localhost:3306/";
    	String url = host+db;

		 Scanner scanner = new Scanner(System.in);
    	
    	System.out.print("Enter password: ");
        String inputPassword = scanner.nextLine();
    	
    	try
    	{
    		Class.forName("com.mysql.jdbc.Driver");
    		Connection con = DriverManager.getConnection(url,"root","");
    		
    		String sql = "select password from password where password='"+inputPassword+"'";
			Statement stmt = con.createStatement();

			ResultSet set = stmt.executeQuery(sql);
    		

    	        
    	        Operations operations = new Operations();
    	        
    	        
    	        
    	        // Check if entered password matches the stored password
    	        if (set.next()) 
    	        {
    	        	String password = set.getString(1);
    	        	
    	        	if(password.equals(inputPassword))
    	        	{
    	        	
    	            boolean exit = false;
    	            
    	    		
    	    		
    	            
    	            while (!exit) 
    	            {
    	            	
    	                // Display main menu
    	            	System.out.println();
    	            	System.out.println("===============================================");
    	                System.out.println("Library Management System Menu:");
    	                System.out.println("===============================================");
    	                System.out.println("1. Add Book");
    	                System.out.println("2. Delete Book");
    	                System.out.println("3. Search Book");
    	                System.out.println("4. View Books List");
    	                System.out.println("5. Edit Book Record");
    	                System.out.println("6. Change Password");
    	                System.out.println("7. Close Application");
    	                System.out.println("================================================");
    	                System.out.print("\nEnter your choice: ");
    	                
    	                int choice = scanner.nextInt();
    	                System.out.println();

    	                // switch case to choose anything from above menu
    	                switch (choice) {
    	                    case 1:
    	                    {
    	                    	operations.addBook(scanner);
    	                        break;
    	                    }
    	                    case 2:
    	                    {
    	                    	operations.deleteBook(scanner);
    	                        break;
    	                    }
    	                    case 3:
    	                    {
    	                    	operations.searchBook(scanner);
    	                        break;
    	                    }
    	                    case 4:
    	                    {
    	                    	operations.viewAllBooks();
    	                        break;
    	                    }
    	                    case 5:
    	                    {
    	                    	operations.editbook(scanner);
    	                        break;
    	                    }
    	                    case 6:
    	                    {
    	                    	operations.changePassword(scanner);
    	                        break;
    	                    }
    	                    case 7:
    	                    {
    	                        	System.out.println("Exiting...");
    	                        	try 
    	                        	{
    	                        		Thread.sleep(3000);
    	                        	} 
    	                        	catch (InterruptedException e) 
    	                        	{
    	                        		e.printStackTrace();
    	                        	}
    	                        
    	                        	exit = true;
    	                        	break;
    	                        
    	                    }
    	                    default:
    	                    {
    	                        System.out.println("Invalid option. Please try again.");
    	                    }
    	                }
    	            }
    	        } 
    	}
    	        else 
    	        {
    	            System.out.println("Incorrect password. Access denied.");
    	        }
    	        
    	        scanner.close();
    	        
    	    
    		
    	}
    	catch(Exception e)
    	{
    		e.printStackTrace();
    	}
    	
       scanner.close();
    }

	
  
	
}
