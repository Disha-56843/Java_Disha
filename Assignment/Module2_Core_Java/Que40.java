package Module2_Core_Java;

import java.util.Scanner;

/* W.A.J. P to demonstrate try catch block, take two numbers from the user by
Command line argument and perform the division operation and handle Arithmetic
O/PException in thread main java. Lang. Arithmetic Exception:/ by zero */

public class Que40 {

	public static void main(String[] args) 
	{
	
		Scanner division = new Scanner(System.in);
		
		try {
			
			System.out.print("Enter first number : ");
			double num1 = division.nextInt();
			
			System.out.print("Enter second number : ");
			double num2 = division.nextInt();
			
			double result = num1 / num2;
			System.out.println("Division of num1 and num2 is : " + result);
			
		}
		catch (ArithmeticException e) 
		{
	        System.out.println("Exception in thread main java.lang.ArithmeticException:/ by zero");
		
	        division.close();
		}
		
	}	
	
}
