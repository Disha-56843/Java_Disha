package Date30_5;

public class ConstuctorEx4 {

	int id;
	String name;
	
	public ConstuctorEx4(int id,String name) 
	{
		this.id = id;
		this.name = name;
	}
	
	void display()
	{
		System.out.println(id+" "+name);
	}
	public static void main(String[] args) 
	{
		ConstuctorEx4 c1 = new ConstuctorEx4(101,"Disha");
		c1.display();
		
	}
	
}
