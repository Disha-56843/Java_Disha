package Module2_Core_Java;

import java.util.Scanner;

/* Write a program to print the factorial of a number by defining a method named
'Factorial'. Factorial of any number n is represented by n! And is equal to 1*2*3*.
*(n-1) *n. E.g.-
4! = 1*2*3*4 = 24
3! = 3*2*1 = 6
2! = 2*1 = 2
Also, 1! = 1
0! = 0 */

public class Que32 {

	public static void Factorial()
	{
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the number: ");
		int n = sc.nextInt();
		
		int result = 1;
		
		for(int i = 1; i <= n; i++)
		{
			result *= i;
			
		}
		System.out.println("Factorial of "+ n +" is: "+ result);
		
		sc.close();
	}
	public static void main(String[] args) 
	{
		
		Factorial();
		
	}
	
}
