package Date12_06;

public class Overloading {

	int cal(int a,int b)
	{
		return a+b;
	}
	float cal(float a,float b)
	{
		return a*b;
	}
	
	public static void main(String[] args) 
	{
		
		Overloading o1 = new Overloading();
		System.out.println(o1.cal(6,5));
		System.out.println(o1.cal(7.0F,2.0F));
	}
	
}
