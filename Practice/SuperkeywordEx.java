package Date04_06;

class Color
{
	String color ="black";
}
class Color2 extends Color
{
	String color ="blue";

	void show()
	{
		System.out.println(color);
		System.out.println(super.color);
	}
}

public class SuperkeywordEx {

	public static void main(String[] args)
	{
		Color2 c = new Color2();
		c.show();
	}
	
}
