package Date08_06;
//2.
//Write a Java program to make such a pattern like a right angle triangle with the number increased by 1.
//
//The pattern like :
//
//1
//2 3
//4 5 6
//7 8 9 10 

public class Task2 {

	public static void main(String[] args) {
		
		int n = 1;
		
		
		for(int i = 0; i < 5; i++)
		{
			
			for(int j = 1; j <= i; j++)
			{
				
				System.out.print(n);
				++n;
			}
			
			System.out.println();
		}
		
	}
	
}
