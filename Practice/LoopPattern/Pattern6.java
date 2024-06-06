package LoopPattern;

import java.util.Scanner;

//import java.util.Scanner;

public class Pattern6 {
	
	static int n ;
	
	public static void main(String[] args) {
		
		int i; 
		int j;

		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter Number for loop: ");
		n = sc.nextInt();
		
		for(i = 1; i <= n; i++)
		{
			for(j = 1; j <= i; j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		for(i = 5; i >= 1; i--)
		{
			for(j = 1; j <= i; j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		
		
	}

}
