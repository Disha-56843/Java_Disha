package Date04_06;

class A1
{
	void a()
	{
		System.out.println("This is A");
	}
}
class B1 extends A1
{
	void b()
	{
		System.out.println("This is B");
	}
}
class C1 extends B1
{
	void c()
	{
		System.out.println("This is C");
	}
}
class D1 extends C1
{
	void d()
	{
		System.out.println("This is D");
	}
}


public class Multilevelinheritance {

	public static void main(String[] args) 
	{
		D1 d = new D1();
		d.a();
		d.b();
		d.c();
		d.d();
		
	}
	
}
