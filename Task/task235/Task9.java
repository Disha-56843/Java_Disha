package task235;
//9. Write a Program to check the given year is leap year or not.

public class Task9 {

	public static void main(String[] args) {
		
		int year = 2004;
		
		if(year % 4 == 0 )
		{
			System.out.println(year +" is a leap year");
		}
		else
		{
			System.out.println(year +" is not a leap year");
		}
	}
	
}
