package Date06_06;


abstract class A11
{
	void a()
	{
		System.out.println("This is non abstract method");
	}
	
  abstract void a11();
}
class B11 extends A11
{

	void a11() {
		
	}
	
}

public class Abstraction {
	
	public static void main(String[] args) 
	{
		B11 a = new B11();
		a.a();
	}

}
