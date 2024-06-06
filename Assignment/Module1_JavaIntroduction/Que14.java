package Module1_JavaIntroduction;

import java.util.Scanner;

//14. Write a program you have to print the Fibonacci series up to user given
//number

public class Que14 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		 int n1=0;
		 int n2=1;
		 int n3;
		 int i;
		 System.out.print("Enter the number:");
		 int count= sc.nextInt();    
		 System.out.print(n1+" "+n2);//printing 0 and 1    
		    
		 for(i=2;i<count;++i)//loop starts from 2 because 0 and 1 are already printed    
		 {    
		  n3=n1+n2;    
		  System.out.print(" "+n3);    
		  n1=n2;    
		  n2=n3;    
		 }   
		
	}
	
}
