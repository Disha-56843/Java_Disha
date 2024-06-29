package Module2_Core_Java;

import java.util.Scanner;

/* Take two numbers from the user and perform the division operation and handle
Arithmetic Exception. O/P- Enter two numbers: 10 0
Exception in thread main java.lang.ArithmeticException:/ by zero */

public class Que37 {

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		try
		{
			System.out.print("Numerator: ");
			int n = sc.nextInt();
			
			System.out.print("Denominator: ");
			int d = sc.nextInt();
			
			int data = n/d;
			System.out.println(data);
			
		}
		catch (ArithmeticException e) 
		{
			
			System.out.println("Error: Division by zero is not possible.");
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		sc.close();
	}
	
}
