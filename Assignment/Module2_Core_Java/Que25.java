package Module2_Core_Java;

/* Create a class named 'Member' having the following members:
1. Data members
2. Name
3. Age
4. Phone number
5. Address
6. Salary
It also has a method named 'printSalary' which prints the salary of the members. */

class Member
{
	// Data members
		String name;
		int age;
		long pNumber;
		String address;
		int Salary;
		
		   // Parameterized constructor
		   Member(String name, int age, long pNumber, String address, int Salary) {
			   
			   this.name = name;
			   this.age = age;
			   this.pNumber = pNumber;
			   this.address = address;
			   this.Salary = Salary;
		}
		   
		   void printSalary()
		   {
			   System.out.println("Salary of " + name + " is: "+ Salary);
		   }
}

public class Que25 {

	public static void main(String[] args) {
		
		Member member1 = new Member("Disha" , 22 , 8796537286l , "abc colony" , 65000);
		member1.printSalary();
		
		Member member2 = new Member("Miral" , 22, 9876543210l , "xyz socity" , 65000);
	    member2.printSalary();
	    
	}
	
}
