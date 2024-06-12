package Date08_06;

import java.util.Scanner;

//3. Write a Java program to create a class called Shape with a method called getArea(). 
//Create a subclass called Rectangle that overrides the getArea() method to calculate the area of a rectangle.

abstract class Shape
{
	
	abstract double getArea();
	
}
class Rectangle extends Shape
{
	double l;
	double w;
	
	
	Rectangle()
	{

		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the value of Length: ");
		l = sc.nextDouble();
		System.out.print("Enter the value of Width: ");
		w = sc.nextDouble();
		
		
		sc.close();
	}
	
	@Override
	double getArea() {
		// TODO Auto-generated method stub
		return w*l;
		
	}
}

public class Task3 {
	
	public static void main(String[] args) {
		

		Rectangle r = new Rectangle();
		double A = r.getArea();
		System.out.println("Area of Rectangle is: " + A);
		
	}
	
	

}
