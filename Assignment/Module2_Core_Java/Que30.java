package Module2_Core_Java;

/* Create an abstract class 'Bank' with an abstract method 'getBalance'. $100, $150 and
$200 are deposited in banks A, B and C respectively. 'BankA', 'BankB' and 'BankC'
are subclasses of class 'Bank', each having a method named 'getBalance'. Call this
method by creating an object of each of the three classes. */

abstract class Bank
{
	abstract void getBalance();
}
class BankA extends Bank
{
	
	void getBalance() 
	{
		System.out.println("100$ has been deposited in BankA.");
		
	}
	
}
class BankB extends Bank
{

	
	void getBalance() 
	{
		System.out.println("150$ has been deposited in BankB.");
		
	}
	
}
class BankC extends Bank
{
    
	void getBalance() 
	{
		System.out.println("200$ has been deposited in BankC.");
		
	}
	
}

public class Que30 {

	 public static void main(String[] args) {
			
    	 BankA  bankA = new BankA();
    	 bankA.getBalance();
    	 
    	 BankB bankB = new BankB();
    	 bankB.getBalance();
    	 
    	 BankC bankC = new BankC();
    	 bankC.getBalance();
	}
	
}
