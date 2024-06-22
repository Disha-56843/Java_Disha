package Date18_06;

public class Statickeyword {

	int id;
	String name;
	static String college="Atmiya";
	
	public Statickeyword(int id,String name) 
	{
		
		//this is working as a refrence keyword
		this.id = id;
		this.name = name;
		
	}
	void display()
	{
		System.out.println(id+" "+name+" "+college);
	}
	static void change()
	{
		college ="VVP";
	}
	
	public static void main(String[] args) 
	{
		change();
		
		Statickeyword t1 = new Statickeyword(101,"abcd");
		Statickeyword t2 = new Statickeyword(102,"xyz");
		
		t1.display();
		t2.display();
		
	}
	
}
