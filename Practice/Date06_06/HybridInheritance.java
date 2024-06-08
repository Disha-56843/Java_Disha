package Date06_06;

class A
{
	void a()
	{
		System.out.println("A");
	}
}
class B extends A
{
	void b()
	{
		System.out.println("B");
	}
}
interface C 
{
	void c();
}
class D extends B implements C
{

	void d()
	{
		System.out.println("D");
	}
	
	
	public void c() {
		
		System.out.println("C");
	}
	
}

public class HybridInheritance {

	public static void main(String[] args) 
	{
		D s1 = new D();
		s1.a();
		s1.b();
		s1.c();
		s1.d();
	}
	
}
