package task255;
//j. Write a program you have to make a summation of first and last Digit.
//(E.g. 1234 answer:-5)

import java.util.Scanner;

public class Task10 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter any Number: ");
		int num = sc.nextInt();
		int sum=0;
		int lastdigit=0;
		
		lastdigit = num%10;
		sum = (sum*10)+lastdigit;//4
		
		while (num != 0)
		{
			if (num > 9)
				num = num/10;
			else
			{
				lastdigit=num;
				sum=sum+lastdigit;
				num=num/10;
			}
		}
		 System.out.println("Sum of first and last Digit is: "+sum);
	}

}
