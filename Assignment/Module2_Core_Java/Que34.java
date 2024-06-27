package Module2_Core_Java;

import java.util.Scanner;

/*Write a program which will ask the user to enter his/her
marks (out of 100). Define a method that will display grades according to the marks
entered as below:
Marks Grade
1-100 A
1-90 B
1-80 B
1-70 C
1-60 D
41-50 DD
40 Fail */



public class Que34 {

	public static void Displaygrade() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter your marks (Out of 100): ");
		int mark = sc.nextInt();
		
		if(mark >= 91 && mark <= 100)
		{
			System.out.println("Your marks is: " + mark + " Grade is: A " );
		}
		else if (mark >= 81 && mark <= 90) 
		{
			System.out.println("Your marks is: " + mark + " Grade is: B " );
		}
		else if (mark >= 71 && mark <= 80) 
		{
			System.out.println("Your marks is: " + mark + " Grade is: C " );
		}
		else if (mark >= 51 && mark <= 70) 
		{
			System.out.println("Your marks is: " + mark + " Grade is: D " );
		}
		else if (mark >= 35 && mark <= 50) 
		{
			System.out.println("Your marks is: " + mark + " Grade is: E " );
		}
		else 
		{
			System.out.println("Your marks is: " + mark + " Fail " );
		}
		
		sc.close();
	}
	
	public static void main(String[] args) {
		
		Displaygrade();
		
	}
	
}
