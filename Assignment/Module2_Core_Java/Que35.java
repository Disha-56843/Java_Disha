package Module2_Core_Java;

/* Create a class named 'Shape' with a method to print "This is this is shape". Then
create two other classes named 'Rectangle', 'Circle' inheriting the Shape class, both
having a method to print "This is rectangular shape" and "This is circular shape"
respectively. Create a subclass 'Square' of 'Rectangle' having a method to print
"Square is a rectangle". Now call the method of 'Shape' and 'Rectangle' class by the
object of 'Square' class. */

//Define the base class named 'Shape'
class Shape35 
{
 // Method to print "This is shape"
 public void printShape() {
     System.out.println("This is shape");
 }
}


//Define the class 'Rectangle' inheriting from 'Shape'
class Rectangle35 extends Shape35 
{
 // Method to print "This is rectangular shape"
 public void printRectangle() 
 {
	 
     System.out.println("This is rectangular shape");
     
 }
 
}

//Define the class 'Circle' inheriting from 'Shape'
class Circle extends Shape35 
{
 // Method to print "This is circular shape"
 public void printCircle()
 {
	 
     System.out.println("This is circular shape");
 
 }
 
}


//Define the class 'Square' inheriting from 'Rectangle'
class Square35 extends Rectangle35 
{
 // Method to print "Square is a rectangle"
 public void printSquare() 
 {
	 
     System.out.println("Square is a rectangle");
     
 }

}




public class Que35 {

	
	 public static void main(String[] args) 
	 {
	     // Create an instance of Square
	     Square35 square = new Square35();
	     
	     // Call the method of 'Shape' class using Square instance
	     square.printShape();
	     
	     // Call the method of 'Rectangle' class using Square instance
	     square.printRectangle();
	 }
	
}
