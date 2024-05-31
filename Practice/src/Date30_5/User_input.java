package Date30_5;

import java.util.Scanner;

public class User_input {

	int id;
	String name;
	
	public static void main(String[] args)
	{
		
		User_input s1 = new User_input();
		User_input s2 = new User_input();
		
		
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Enter Your Id:");
		s1.id = sc.nextInt();
		
		System.out.println("Enter Your Name:");
		s1.name = sc.next();
		
		System.out.println("\n Your Id is : "+s1.id +" \n Your Name is :"+ s1.name);
		
	}
	
}
