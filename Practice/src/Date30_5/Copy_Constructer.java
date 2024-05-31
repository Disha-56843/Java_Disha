package Date30_5;

public class Copy_Constructer {

	int id;
	String name;
	
	public Copy_Constructer(int id,String name) 
	{
		
		
		this.id=id;
		this.name=name;
	
	}
	
	public Copy_Constructer(Copy_Constructer c1) 
	{
		
		System.out.println(c1.id+" "+c1.name);
	
	}
	void dispaly()
	{
		System.out.println(id+" "+name);
	}
	public static void main(String[] args) 
	{
		Copy_Constructer c1 = new Copy_Constructer(101,"Disha");
		Copy_Constructer c2 = new Copy_Constructer(c1);
		
		c1.dispaly();
		
	}
	
}
