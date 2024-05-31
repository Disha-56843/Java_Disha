package Date30_5;

public class ConstuctorEx3 {

	int id;
	String name;
	
	//parameterized constructor
	public ConstuctorEx3(int i,String n) 
	{
		id = i;
		name = n;
	}
	void display()
	{
		System.out.println(id+" "+name);
	}
	public static void main(String[] args) 
	{
		ConstuctorEx3 c1 = new ConstuctorEx3(101,"Disha");
		c1.display();
		
	}
	
}
