package Module2_Core_Java;

import java.util.Scanner;

// Write a Java program that takes the user to provide a single character from the
//alphabet. Print Vowel or Consonant, depending on the user input. If the user input
//is not a letter (between a and z or A and Z), or is a string of length > 1, print an error
//message.


public class Que2 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter an alphabet : ");
		String alphabet = sc.next();
		
		
		if(alphabet.length() == 1 && Character.isLetter(alphabet.charAt(0)))
		{
			char ch = Character.toLowerCase(alphabet.charAt(0));
					if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
					{
						System.out.println("Vowel");
					}
					else
					{
						System.out.println("Consonant");
					}
		}
		else if(!Character.isLetter(alphabet.charAt(0)))
		{
			 System.out.println("Error: Input must be a letter between a-z or A-Z.");	
		}
		else
		{
			System.out.println("Error : Please Enter single alphabet");
		}
		
		sc.close();
	}

}
