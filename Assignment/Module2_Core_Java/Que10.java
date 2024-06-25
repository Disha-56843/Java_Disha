package Module2_Core_Java;

import java.util.Scanner;

//Write a Java program to print the ASCII value of a given character

public class Que10 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter any character: ");
		char ch = sc.next().charAt(0);
		
		int ASCII = ch;
		System.out.println("ASCII value of "+ ch +" is: "+ ASCII);
		
		sc.close();
	}

}
