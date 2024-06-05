package Module1_JavaIntroduction;

import java.util.Scanner;

//13 .write a program you have to find the factorial of given number.
//5!=5*4*3*2*1

public class Quer13 {

public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
	
		int fact=1; 
		System.out.print("Give a number to find the factorial: ");
		int num = sc.nextInt();//It is the number to calculate factorial
		
		for(int i=1; i <= num; i++)
		{    
		      fact=fact*i;    
		 }    
		  System.out.println("Factorial of " + num + " is: " + fact);    
		  
	}  	
	
}
