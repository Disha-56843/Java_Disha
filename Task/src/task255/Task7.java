package task255;
//g. Write a program to print the number in reverse order.12345

public class Task7 {
	
	public static void main(String[] args) {
		

		int num = 12345;
		int reverse = 0;  
		while(num != 0)   
		{  
	
			int remainder = num % 10;  
			reverse = reverse * 10 + remainder;  
			num = num/10;  
		}  
		System.out.println("The reverse of the given number is: " + reverse);  
		
	}

}
