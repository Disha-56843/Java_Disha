package Module1_JavaIntroduction;
//18. Write a program make a summation of given number(E.g. 1523 answer :-11)

import java.util.Scanner;

public class Que18 {

static int n;
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter any Number: ");
		int num = sc.nextInt();
		int sum = 0;


	    while(num != 0){
	        sum += num % 10;
	        num = num / 10;
	    }
	 
	    //output
	    System.out.println("Sum: "+sum);
	 
	    
      
	}
	
}
