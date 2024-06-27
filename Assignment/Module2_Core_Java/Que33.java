package Module2_Core_Java;

/* We have to calculate the area of a rectangle, a square and a circle. Create an abstract
class 'Shape' with three abstract methods namely 'RectangleArea' taking two
parameters, 'SquareArea' and 'CircleArea' taking one parameter each. The
parameters of 'RectangleArea' are its length and breadth, that of 'SquareArea' is its
side and that of 'CircleArea' is its radius. Now create another class 'Area' containing
all the three methods 'RectangleArea', 'SquareArea' and 'CircleArea' for printing the
area of rectangle, square and circle respectively. Create an object of class 'Area' and
call all the three methods. */

abstract class Shape
{
	abstract void RectangleArea(double length, double breadth);
	
	abstract void SquareArea(double side);
	
	abstract void CircleArea(double radius);
	
}

class Area33 extends Shape
{

	@Override
	void RectangleArea(double length, double breadth) {
		// TODO Auto-generated method stub
		System.out.println("Area of Reactanle is: "+ (length * breadth));//rectangle = length × width
		
	}

	@Override
	void SquareArea(double side) {
		// TODO Auto-generated method stub
		System.out.println("Area of Square is: "+ (side * side));//A=a*a
		
	}

	@Override
	void CircleArea(double radius) {
		// TODO Auto-generated method stub
		System.out.println("Area of Circle is: "+ (3.14 * (radius * radius)));// A=π(r*r)
	}
	
}

public class Que33 {
	
	public static void main(String[] args) {
		
		Area33 area = new Area33();
		
		area.RectangleArea(5.0, 8.0);
		area.SquareArea(6.0);
		area.CircleArea(4.0);
		
	}

}
