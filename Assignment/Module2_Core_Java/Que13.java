package Module2_Core_Java;

//Write a Java program to print numbers between 1 to 100 which are divisible by 3, 5
//and by both.

public class Que13 {

	public static void main(String[] args) {
		int n=0;
		
		for(n=1; n<=100; n++)
		{
			
			if(n%3==0 || n%5==0) 
			{
				
				System.out.println(n);
				
			}
			
		}
		
	}
	
}
