package Module2_Core_Java;

import java.util.Scanner;

//Write a Java program to Take three numbers from the user and print the greatest
//number.

public class Que1 {
	
	public static void main(String[] args) 
	{
		
			Scanner sc = new Scanner(System.in);
			System.out.print("Enter number 1: ");
			int num1 = sc.nextInt();
			System.out.print("Enter number 2: ");
			int num2 = sc.nextInt();
			System.out.print("Enter number 3: ");
			int num3 = sc.nextInt();
			 if(num1>num2 && num1>num3)
			 {
				 System.out.println(num1+" is the greatest number.");
			 }
			 else if(num2>num1 && num2>num3)
			 {
				 System.out.println(num2+" is the greatest number.");
			 }
			 else
			 {
				 System.out.println(num3+" is the greatest number.");
			 }
			 sc.close();
		
	}

}
