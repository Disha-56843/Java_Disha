package Module2_Core_Java;

/*  Write a program to print the area and perimeter of a triangle having sides of 3, 4 and
5 units by creating a class named 'Triangle' without any parameter in its constructor. */

class Triangle
{
	double side1;
	double side2;
	double side3;
	
	Triangle()
	{
		this.side1 = 4;
		this.side2 = 5;
		this.side3 = 6;
		
	}
	
	public double Area()
	{
		return 0.5 * (side1 * side2);//  A = ½ (b × h) 
	}
	public double Perimeter()
	{
		 return side1 + side2 + side3; //P= a+b+c
	}
	
	
	
}

public class Que27 {

	public static void main(String[] args) {
		
		Triangle triangle = new Triangle();
		
		System.out.println("Area of the triangle is: " + (int)triangle.Area());
		System.out.println("Perimeter of the triangle is: " + (int)triangle.Perimeter());
		
	}
	
}
