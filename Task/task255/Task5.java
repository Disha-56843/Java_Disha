package task255;
//e. Write a program you have to print the Fibonacci series up to user given
//number

public class Task5 {

	public static void main(String[] args) {
		
		 int n1=0;
		 int n2=1;
		 int n3;
		 int i;
		 int count= 10;    
		 System.out.print(n1+" "+n2);//printing 0 and 1    
		    
		 for(i=2;i<count;++i)//loop starts from 2 because 0 and 1 are already printed    
		 {    
		  n3=n1+n2;    
		  System.out.print(" "+n3);    
		  n1=n2;    
		  n2=n3;    
		 }   
		
	}
	
}
