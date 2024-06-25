package Module2_Core_Java;

import java.util.Scanner;

//Write a Java program to count the letters, spaces, numbers and other characters of an input string.

public class Que9 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the string: ");
		String str = sc.nextLine();
		
		char ch[] = str.toCharArray();
		int letters = 0;
		int sp=0;
		int num=0;
		int oth=0;
		
		for(int i=0;i<str.length();i++) {
			if(Character.isLetter(ch[i]))
			{
				letters++;
			}
			else if(Character.isSpaceChar(ch[i]))
			{
				sp++;
			}
			else if(Character.isDigit(ch[i]))
			{
				num++;
			}
			else
			{
				oth++;
			}
		}
			System.out.println("Your string is: "+str);
			System.out.println("Total letters in your string are: "+letters);
			System.out.println("Total Spaces in your string  are: "+sp);
			System.out.println("Total Numbers in your string  are: "+num);
			System.out.println("Others are: "+ oth);

			sc.close();
			
	}


}
