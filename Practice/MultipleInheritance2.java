package Date06_06;

interface X1
{
	void x();
	
}
interface Y1
{
	void y();
}

class Z1 implements X1,Y1
{

	@Override
	public void y() {
	
		System.out.println("y");
	}

	@Override
	public void x() {
		// TODO Auto-generated method stub
		System.out.println("x");
	}
	
}

public class MultipleInheritance2 {

public static void main(String[] args) {
		
		Z1 z = new Z1();
		z.x();
		z.y();
		
		
	}
	
}
