package Module1_JavaIntroduction;
//17 .Write a program to find out the max from given number
//(E.g. No: -1562 Max number is 6 )

import java.util.Scanner;

public class Que17 {
	
public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
	
		System.out.println("Enter any Number: ");
		int num = sc.nextInt();
		int maxnum = 0;
		int temp ;
		
		while(num > 0)
		{
			temp = num % 10;
			if (temp > maxnum)
			{
				maxnum = temp;
			}
			num = num / 10;
		}
		System.out.println("max from given number is : " + maxnum);
		
	}

}
