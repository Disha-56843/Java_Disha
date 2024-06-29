package Module2_Core_Java;

/*  W.A.J.P to create the validate method that takes integer value as a parameter. If the
age is less than 18, then throw an Arithmetic Exception otherwise print a message
welcome to vote.
O/P- Enter your age: 16
Exception in thread main java. Lang. Arithmetic Exception: not valid */

public class Que41 {

	public static void Validate(int age)
	{	
	
		if(age < 18)
		{
			throw new ArithmeticException("Age is not valid");
		}
		else
		{
			System.out.println("Welcome to vote.");
		}
	
	}
	
	public static void main(String[] args)
	{
			
		
		
		try
		{
		
			Validate(16);	
		
		}
		catch (ArithmeticException e) 
		{
				// TODO: handle exception
				System.out.println("Error: Age is less than 18. Cannot vote.");
		}
		catch (Exception e)
		{
				// Handle any other unexpected exception
				e.printStackTrace();
		}
	
	}
}
