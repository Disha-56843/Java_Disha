package Module2_Core_Java;

/* Create a class named 'Print Number' to print various numbers of different data types
by creating different methods with the same name 'printn' having a parameter for
each data type. */

class PrintNumber{
	
	//Print integer
	public void printn(int n)
	{
		System.out.println("Printing integer: " + n);
	}
	//Print string
	public void printn(String s)
	{
		System.out.println("Printing string: " + s);
	}
	//Print double
	public void printn(double n)
	{
		System.out.println("Printing double: " + n);
	}
	//Print float
	public void printn(float n)
	{
		System.out.println("Printing float: " + n);
	}
	//Print long
	public void printn(long n)
	{
		System.out.println("Printing long: " + n);
	}
	//Print short
	public void printn(short n)
	{
		System.out.println("Printing short: " + n);
	}
	//Print byte
	public void printn(byte n)
	{
		System.out.println("Printing byte: " + n);
	}
	//Print char
	public void printn(char ch)
	{
		System.out.println("Printing char: " + ch);
	}
	//Print boolean
	public void printn(boolean b)
	{
		System.out.println("Printing boolean: " + b);
	}
	
}

public class Que21 {

	public static void main(String[] args) {
		
		PrintNumber p = new PrintNumber();
		
		 p.printn(7);
		 p.printn("Disha");
	 	 p.printn(7.2);
		 p.printn(5.4f);
		 p.printn(743924479L);
		 p.printn((short) 55);
		 p.printn((byte) 2);
		 p.printn('D');
		 p.printn(true);
		
	}
	
}
