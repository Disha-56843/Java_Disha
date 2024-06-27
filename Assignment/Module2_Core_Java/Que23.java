package Module2_Core_Java;

/* Create a class to print the area of a square and a rectangle. The class has two methods
with the same name but different number of parameters. The method for printing
area of a rectangle has two parameters which are length and breadth respectively
while the other method for printing area of square has one parameter which is side
of square. */

class Area
{
	public void area(int l, int w)
	{
		int area = l * w;
   	 System.out.println("Area of Reactangle: " + area);
	}
	public void area(int a)
	{
		 int area =  a * a;
    	 System.out.println("Area of Square: " + area);
	}
	
}


public class Que23 {
	
	public static void main(String[] args) {
		
		Area area = new Area();
		
		area.area(5,8);
		area.area(5);
	}

}
