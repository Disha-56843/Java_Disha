package Module2_Core_Java;

/* Create a class named 'Rectangle' with two data members 'length' and 'breadth' and
two methods to print the area and perimeter of the rectangle respectively. Its
constructor having parameters for length and breadth is used to initialize the length
and breadth of the rectangle. Let class 'Square' inherit the 'Rectangle' class with its
constructor having a parameter for its side (suppose s) calling the constructor of its
parent class as 'super (s, s)'. Print the area and perimeter of a rectangle and a square. */

class Rectangle 
{
//	Dta member
	int length;
	int breadth;
	
	Rectangle(int length, int breadth)
	{
		this.length = length;
		this.breadth = breadth;
	}
	public int area()
	{
		return length * breadth;
	}
	public int perimeter()
	{
		return 2 * (length + breadth);
	}
	
}

class Square extends Rectangle
{
	
	Square(int side)
	{
		super(side, side);
	}
	
}

public class Que26 {
	
	public static void main(String[] args) {
		
		Rectangle rectangle = new Rectangle(5, 8);
		Square square = new Square(5);
		
		System.out.println("Area of Rectangle is: " + rectangle.area());
		System.out.println("Perimeter of Rectangle is: " + rectangle.perimeter());
		
		System.out.println("Area of Square is: " + square.area());
	    System.out.println("Perimeter of Square is: " + square.perimeter());
		
		
	}

}
