package Module2_Core_Java;

import java.util.Scanner;

//Write a Java program that reads a positive integer and count the number of digits the number.
//Example: Input an integer number less than ten billion: 125463 Number of digits in the number: 6

public class Que8 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int in = 0;
		
		System.out.print("Enter Positive integer: ");
		int n = sc.nextInt();
		
		while(n != 0)
		{
			
			n = n/10;
			in++;
			
		}
		
		System.out.println("Nnumber of digits in the entered integer are: " + in);
		
		sc.close();
	}
	
}
