package LoopPattern;

import java.util.Scanner;

public class Pattern4 {
	public static void main(String[] args) {
	
		int row;
		int coloum;
		int space;
		int loop;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter Number for loop: ");
		row = sc.nextInt();
		
		
		for(loop=1;loop<=row;loop++)
		{
			for(space=0;space != (row-loop);space++)
			{
				System.out.print(" ");
			}

			for (coloum=row ;coloum > space;coloum--)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		
	}	
}
