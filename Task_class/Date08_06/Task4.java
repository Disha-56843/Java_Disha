package Date08_06;

import java.util.Scanner;

//4.
//Write a Java program to create a class known as "BankAccount" with methods called deposit() and withdraw(). 
//Create a subclass called SavingsAccount that overrides the withdraw() method to prevent withdrawals if the account balance falls below one hundred.

class BankAccount {
    private double balance;

    // Constructor to initialize the balance
    BankAccount(double startBalance) {
        this.balance = startBalance;
    }

    // Method to deposit money into the account
    void deposit() {
    	
    	Scanner sc = new Scanner(System.in);
    	
    	System.out.print("Enter Deposite Amount: ");
    	double amount = sc.nextDouble(); 
    	
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount + ". \nNew balance: " + balance);
        } else {
            System.out.println("Deposit amount must be positive.");
        }
        
        sc.close();
    }

    // Method to withdraw money from the account
    void withdraw() {
    	
    	Scanner sc = new Scanner(System.in);
    	
    	System.out.print("Enter Withdraw Amount: ");
    	double amount = sc.nextDouble(); 
    	
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrew: " + amount + ". \nNew balance: " + balance);
        } else {
            System.out.println("Insufficiant amount in your account.");
        }
        sc.close();
        
    }

    // Method to get the current balance
    double getBalance() {
        return balance;
    }
}


class SavingsAccount extends BankAccount {

    // Constructor to initialize the balance
    SavingsAccount(double startBalance) {
        super(startBalance);
    }

    // Override the withdraw method to prevent balance from falling below 100
    @Override
    void withdraw() {
    	
    	Scanner sc = new Scanner(System.in);
    	
    	System.out.print("Enter Withdraw Amount: ");
    	double amount = sc.nextDouble(); 
    	
        if (amount > 0 && (getBalance() - amount) >= 100) {
            super.withdraw();
        } else {
            System.out.println("Withdrawal denied. Balance cannot fall below 100.");
        }
        
       sc.close();
    }
}


public class Task4 {
	
	
	    public static void main(String[] args) {
	    	
	    	 // Create a BankAccount instance
	        BankAccount bankAccount = new BankAccount(500);
	        bankAccount.deposit();  // Deposits 200
	        bankAccount.withdraw();  // Withdraws 150
	    	
	    	Scanner sc = new Scanner(System.in);
	    	
	    	System.out.print("Do you want to countinue(Enter Yes or No): ");
	    	String num = sc.next();
			
			switch(num)
			{
				case "yes":
				{
//					 Create a SavingsAccount instance
			        SavingsAccount savingsAccount = new SavingsAccount(bankAccount.getBalance());
			        savingsAccount.deposit();  // Deposits 200
			        savingsAccount.withdraw();  // This should be denied
			        savingsAccount.withdraw();  // This should be allowed	
				}
				break;
				
				case "no":
				{
					break;
				}
				
				default:System.out.println("Enter valid option");
				break;
			
			}
	    	
	       

//	        
	        
	        sc.close();
	    }
	


}
