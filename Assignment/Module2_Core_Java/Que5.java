package Module2_Core_Java;

import java.util.Scanner;

//Write a program in Java to input 5 numbers from keyboard and find their sum and average using for loop.

public class Que5 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		
		int sum = 0;
		double avg;
		
		
		for(int i=1; i <=5; i++)
		{
			System.out.print("Enter number "+ i + ": " );
			int n = sc.nextInt();
			
			sum += n;
		}
		
		System.out.println("\nSum:" + sum);
		
		avg = sum/5;
		System.out.println("Average: " + avg);
		
		sc.close();
	}

}
