package Date18_06;

public class TryCatch {

	public static void main(String[] args)
	{
		
		try
		{
			//logic
			int data = 10/0;
			System.out.println(data);
		}
		catch(Exception e)
		{
			//e -> refrence variable
			
//			System.out.println(e); // print in normal black text
			e.printStackTrace(); // print in error or red text
		}
		finally 
		{
			System.out.println("success");
		}
		
		
	}

	
}
