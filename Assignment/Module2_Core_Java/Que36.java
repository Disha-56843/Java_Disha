package Module2_Core_Java;

import java.util.Scanner;

/* W.A.J.P to demonstrate try catch block */

public class Que36 {

	public static void main(String[] args)
	{
		 Scanner sc = new Scanner(System.in);
		   
		try
		{
			System.out.print("Denominator: ");
			int d = sc.nextInt();
			int data = 10/d;
			System.out.println(data);
		
		}
		catch(Exception e)
		{

//			System.out.println("Error: Division by zero is not defined. "); 
			e.printStackTrace();

		}
		
		sc.close();
	}
	
}
