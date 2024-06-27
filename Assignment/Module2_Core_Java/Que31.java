package Module2_Core_Java;

/* We have to calculate the percentage of marks obtained in three subjects (each out of
100) by student A and in four subjects (each out of 100) by student B. Create an
abstract class 'Marks' with an abstract method 'getPercentage'. It is inherited by two
other classes 'A' and 'B' each having a method with the same name which returns the
percentage of the students. The constructor of student A takes the marks in three
subjects asits parameters and the marks in foursubjects as its parameters forstudent
B. Create an object for each of the two classes and print the percentage of marks for
both the students. */

abstract class Marks
{
	abstract double getPercentage();
	
}

class StudentA extends Marks
{  
	
	 double sub1;
     double sub2;
     double sub3;
    
   public StudentA(double sub1, double sub2, double sub3)
   {
	   this.sub1 = sub1;
	   this.sub2 = sub2;
	   this.sub3 = sub3;
   }

	@Override
	double getPercentage() {
		
		return (sub1 + sub2 + sub3) / 3.0;
	}
	
}

class StudentB extends Marks
{
	double sub1;
	double sub2;
	double sub3;
	double sub4;
	
	public StudentB(double  sub1, double sub2, double sub3, double sub4)
	{
		this.sub1 = sub1;
		this.sub2 = sub2;
		this.sub3 = sub3;
		this.sub4 = sub4;
	}
	@Override
	double getPercentage() {
		
		return (sub1 + sub2 + sub3 + sub4) / 4.0 ;
	}
}
public class Que31 {
	
	public static void main(String[] args) {
		
		StudentA studentA = new StudentA(90, 80, 70);
		StudentB studentB = new StudentB(90, 80, 70, 60);
		
		System.out.println("Percentage for studen A is: " + studentA.getPercentage() + "%");
		System.out.println("Percentage for student B is: " + studentB.getPercentage() + "%");
		
	}

}
