package Module2_Core_Java;

import java.util.Scanner;

//Write a Java program that accepts an integer (n) and computes the value of n+nn+nnn.
//Example: Input number: 5
//		 5 + 55 + 555


public class Que11 {
	
	 public static void main(String[] args) {
	        // Create a Scanner object for reading input
	        Scanner scanner = new Scanner(System.in);

	        // Prompt the user to enter an integer
	        System.out.print("Enter an integer: ");
	        int n = scanner.nextInt();

	        // Compute the values of n, nn, and nnn
	        int nn = Integer.parseInt("" + n + n);
	        int nnn = Integer.parseInt("" + n + n + n);

	        // Calculate the result
	        int result = n + nn + nnn;

	        // Print the result
	        
	        System.out.print("Result: " + n +" + "+ nn+" + "+ nnn +"... = "+ result);

	        // Close the scanner
	        scanner.close();
	    }

}
