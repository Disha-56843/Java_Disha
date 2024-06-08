package Date04_06;

import java.util.Scanner;

public class Encapsualtion {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter Your Firstname: ");
		String fname = sc.next();
		
		System.out.print("Enter Your Lastname: ");
		String lname = sc.next();
		
		System.out.print("Enter Your Email: ");
		String email = sc.next();
		
		System.out.print("Enter Your Password: ");
		String pass = sc.next();	
		
		Model mo = new Model();
		mo.setFname(fname);
		mo.setLname(lname);
		mo.setEmail(email);
		mo.setPass(pass);
		
		
		//-------------LOGIN--------------
		System.out.println("Enter login informations");
		System.out.print("Enter Your Email: ");
		String email1 = sc.next();
		
		System.out.print("Enter Your Password: ");
		String pass1 = sc.next();
		
		if(email1.equals(mo.getEmail()) && pass1.equals(mo.getPass()))
		{
			System.out.println("Logged in Succesfully");
		}
		else
		{
			System.out.println("Invalid Credentials");
		}
		
	}
	
}
