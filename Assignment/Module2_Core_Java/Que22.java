package Module2_Core_Java;

/* Create a class to print an integer and a character with two methods having the same
name but different sequence of the integer and the character parameters. For
example, if the parameters of the first method are of the form (int n, char c), then
that of the second method will be of the form (char c, int n).
 */

class A
{
	public void print(int n, char c)
	 {
		 System.out.println("Printing integer first, then character: " + n + " " + c);
	 }
	 
	 public void Print(char c, int n)
	 {
		 System.out.println("Printing character first, then integer: " + c + " " + n);
	 }
}

public class Que22 {

	public static void main(String[] args) {
		
		A a = new A();
		
		a.Print('A',10);
		a.print(10, 'B');
		
	}
	
}
