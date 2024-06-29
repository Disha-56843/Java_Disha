package Module2_Core_Java;

/* W.A.J.P to create a class Student with attributes roll no, name, age and course.
Initialize values through parameterized constructor. If age of student is not in
between 15 and 21 then generate user defined exception
"AgeNotWithinRangeException". If name contains numbers or special symbols
raise exception "NameNotValidException". Define the two exception classes.
 */

class AgeNotWithinRangeException extends Exception 
{
    public AgeNotWithinRangeException(String message) 
    {
        super(message);
    }
}

class NameNotValidException extends Exception {
    public NameNotValidException(String message) {
        super(message);
    }
}

class Student
{
	
	int roll;
	String name;
	int age;
	String course;
	
	Student(int roll, String name, int age, String course) throws AgeNotWithinRangeException, NameNotValidException 
	{
	
		this.roll = roll;
		this.name = name;
		this.age = age;
		this.course = course;
		
		
			
			 if (age < 15 || age > 21) {
		            throw new AgeNotWithinRangeException("Age is not within the valid range of 15 to 21.");
		        }
		        if (!name.matches("[a-zA-Z]+")) {
		            throw new NameNotValidException("Name contains invalid characters.");
		        }
			
	}
	
	 public int getRollNo()
	 {
	        return roll;
	 }

	 public String getName() 
	 {
	        return name;
	 }

	 public int getAge() 
	 {
	        return age;
	 }

	 public String getCourse() 
	 {
	        return course;
	 }
	
}

public class Que43 {
	
	public static void main(String[] args) {
		
        try {
            // Creating a Student object with valid data
            Student student = new Student(1, "Disha", 18, "ComputerScience");
//            System.out.println("Student created successfully: " + student.getName());
            System.out.println("Student Details: ");
    		System.out.println("Roll No: " + student.getRollNo());
    		System.out.println("Name: " + student.getName());
            System.out.println("Age: " + student.getAge());
            System.out.println("Course: " + student.getCourse());
            
            System.out.println("----------------------");
            // Creating a Student object with invalid age to trigger AgeNotWithinRangeException
            Student studentWithInvalidAge = new Student(2, "Disha", 22, "Mathematics");
        }
        catch (AgeNotWithinRangeException | NameNotValidException e) 
        {
            System.out.println(e.getMessage());
        }

        try 
        {
        	System.out.println("---------------------");
            // Creating a Student object with invalid name to trigger NameNotValidException
            Student studentWithInvalidName = new Student(3, "Disha123", 19, "Physics");
        } 
        catch (AgeNotWithinRangeException | NameNotValidException e) 
        {
        	
            System.out.println(e.getMessage());
        }
		
	}

}
