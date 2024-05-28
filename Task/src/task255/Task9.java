package task255;
//i. Write a program make a summation of given number(E.g. 1523 answer :-11)

public class Task9 {

	static int n;
	
	public static void main(String[] args) {
		
		int num;
		int sum = 0;
		 
	    num = 12345;

	    System.out.println("The number is = "+num);

	    //loop to find sum of digits
	    while(num!=0){
	        sum += num % 10;
	        num = num / 10;
	    }
	 
	    //output
	    System.out.println("Sum: "+sum);
	 
	    
        
	}
	
}
