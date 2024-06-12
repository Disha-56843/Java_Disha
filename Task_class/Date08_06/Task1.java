package Date08_06;

import java.util.Scanner;

//1.
//Write a Java program that requires the user to enter a single character from the alphabet. Print Vowel or Consonant, depending on user input. 
//If the user input is not a letter (between a and z or A and Z), or is a string of length > 1, print an error message.
//
//Test Data
//Input an alphabet: p
//Expected Output :
//Input letter is Consonant

public class Task1 {

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
