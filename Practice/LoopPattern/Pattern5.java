package LoopPattern;

import java.util.Scanner;

public class Pattern5 {
	public static void main(String[] args) {
		
		int row;
		int column;
		int n;
		
		
		Scanner sc = new Scanner(System.in);
	
		System.out.print("Enter Number for loop: ");
		n = sc.nextInt();
		
		
		for(row = n; row >= 1; row--)
		{
			for(column=1; column <= row; column++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
