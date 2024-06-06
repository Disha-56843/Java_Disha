package Module1_JavaIntroduction;

import java.util.Scanner;

//7. Write a program to calculate sum of 5 subjects & find the percentage.
//Subject marks entered by user.

public class Que7 {

public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);
	
		System.out.println("Enter the masrks of subject:");
		System.out.print("Subject 1: ");
		int sub1 = sc.nextInt();
		System.out.print("Subject 2: ");
		int sub2 = sc.nextInt();
		System.out.print("Subject 3: ");
		int sub3 = sc.nextInt();
		System.out.print("Subject 4: ");
		int sub4 = sc.nextInt();
		System.out.print("Subject 5: ");
		int sub5 = sc.nextInt();
		
		System.out.println("Sum of 5 subjects: " + (sub1+sub2+sub3+sub4+sub5));
		
		System.out.println("Percentage: " + (sub1+sub2+sub3+sub4+sub5)/5);
		
	}
	
}
