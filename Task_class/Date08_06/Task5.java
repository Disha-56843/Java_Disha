package Date08_06;
//5.
//Write a program that accepts three numbers from the user and prints "increasing" if the numbers are in increasing order, "decreasing" 
//if the numbers are in decreasing order, and "Neither increasing or decreasing order" otherwise.
//
//Test Data
//Input first number: 1524
//Input second number: 2345
//Input third number: 3321
//Expected Output :
//
//Increasing order

import java.util.Scanner;

public class Task5 {

	 public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        System.out.print("Input first number: ");
	        double firstNumber = sc.nextDouble();

	        System.out.print("Input second number: ");
	        double secondNumber = sc.nextDouble();

	        System.out.print("Input third number: ");
	        double thirdNumber = sc.nextDouble();

	        // Check the order of the numbers
	        if (firstNumber < secondNumber && secondNumber < thirdNumber) {
	            System.out.println("Increasing order");
	        } else if (firstNumber > secondNumber && secondNumber > thirdNumber) {
	            System.out.println("Decreasing order");
	        } else {
	            System.out.println("Neither increasing nor decreasing order");
	        }
	        sc.close();
	 }
	
}
