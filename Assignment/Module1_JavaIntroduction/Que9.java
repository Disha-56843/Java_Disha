package Module1_JavaIntroduction;

import java.util.Scanner;

//9. Write a Program to check the given year is leap year or not.

public class Que9 {
	
public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the year to check if it is leap year or not: ");
		int year = sc.nextInt();
		
		if(year % 4 == 0 )
		{
			System.out.println(year +" is a leap year");
		}
		else
		{
			System.out.println(year +" is not a leap year");
		}
	}

}
