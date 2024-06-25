package Module2_Core_Java;

import java.util.Scanner;

//Write a Java program that takes a year from user and print whether that year is a leap
//year or not.

public class Que3 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a year to check whether that year is a leap year or not: ");
		int year = sc.nextInt();
		
		if(year % 4 == 0)
		{
			System.out.println(year + " is a leap year");
		}
		else
		{
			System.out.println(year + " is not a leap year");
		}
	
		sc.close();
	}

}
