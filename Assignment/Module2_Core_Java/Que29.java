package Module2_Core_Java;

/* Create an abstract class 'Parent' with a method 'message'. It has two subclasses each
having a method with the same name 'message' that prints "This is first subclass"
and "This is second subclass" respectively. Call the methods 'message' by creating
an object for each subclass. */

abstract class Parent29
{
	
	abstract public void message();
	
}
class Subclass1 extends Parent29
{
	
	public void message() {
		
		System.out.println("This is first subclass");
		
	}
	
}
class Subclass2 extends Parent29
{
	
	public void message() {
		
		System.out.println("This is second subclass");
		
	}
	
}


public class Que29 {
	
	public static void main(String[] args) {
		
		Subclass1 subclass1 = new Subclass1();
		Subclass2 subclass2 = new Subclass2();
		
		subclass1.message();
		subclass2.message();
		
	}

}
