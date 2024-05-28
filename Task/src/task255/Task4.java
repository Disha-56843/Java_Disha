package task255;
//d .write a program you have to find the factorial of given number.
//5!=5*4*3*2*1

public class Task4{

	public static void main(String[] args) {
		
		int fact=1; 
		int num=4;//It is the number to calculate factorial
		
		for(int i=1; i <= num; i++)
		{    
		      fact=fact*i;    
		 }    
		  System.out.println("Factorial of " + num + " is: " + fact);    
		  
	}  	
	
	
}
