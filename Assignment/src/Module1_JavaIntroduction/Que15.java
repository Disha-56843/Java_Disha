package Module1_JavaIntroduction;

import java.util.Scanner;

//15. write a program you have to print the table of given number.

public class Que15 {

	public static void main(String[] args) 
		{	
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter number: ");
        // multiplication table.
        int num = sc.nextInt();
 
        // looping from 1 to 10 to print the multiplication
       
        for (int i = 1; i <= 10; i++) {
            System.out.println(num + " * " + i + " = "
                               + num * i);
        }
		
	}
	
}
