package task255;

import java.util.Scanner;

//g. Write a program to print the number in reverse order.12345

public class Task7 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter any Number: ");
		int num = sc.nextInt();
		int revnum = 0;  
		int remainder = 0;
		while(num > 0)   
		{  
			if(num > 10) 
			{
				remainder = num % 10;
			}
			else
			{
				remainder = num;
			}
			
			revnum = revnum * 10 + remainder;  
			num = num/10;  
		}  
		System.out.println("The reverse of the given number is : " + revnum);  
		
	}

}
