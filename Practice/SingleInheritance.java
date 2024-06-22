package Date04_06;

class A
{
	void a()
	{
		System.out.println("This is A");
	}
}
class B extends A
{
	void b()
	{
		System.out.println("This is B");
	}
}


public class SingleInheritance {
	
	public static void main(String[] args) 
	{
		B b = new B();
		b.a();
		b.b();
	}

}
