package Module2_Core_Java;

import java.util.Scanner;

/* W.A.J.P to create a custom exception if Customer withdraw amount which is greater
than account balance then program will show custom exception otherwise amount
will deduct from account balance. Account balance is: 2000 Enter withdraw amount:
2500
Sorry, insufficient balance, you need more 500 Rs. To perform this transaction. */


class InsufficientBalanceException extends Exception
{
	private int requiredAmount = 0;
	
	public InsufficientBalanceException(int requiredAmount)
	{
		this.requiredAmount = requiredAmount;
	}
	public int getRequiredAmount()
	{
		return requiredAmount;
	}
	
	public String getMessage()
	{
		return "Sorry, insufficient balance. You need more " + requiredAmount + "Rs. to perform this transaction." ;
	}
}
//BankAccount class to handle account operations
class BankAccount 
{
	
	int accountBalance= 2000;
 	Scanner sc = new Scanner(System.in);
	
	
  int withdrawamount; 



 // Method to withdraw amount
 public void Withdraw() throws InsufficientBalanceException 
 {
	 
//	this.withdrawamount = withdrawamount; 
	 System.out.print("Enter the Amount you want to withdraw: ");
		
		withdrawamount = sc.nextInt();
	 
     if (withdrawamount > accountBalance) 
     {
         throw new InsufficientBalanceException(withdrawamount - accountBalance);
     }
     else 
     {
         accountBalance -= withdrawamount;
         System.out.println("Amount withdrawn successfully. Remaining balance: " + accountBalance);
     }
     sc.close();
 }

}


public class Que42 
{
	
	public static void main(String[] args) 
	{
		
		   // Assuming initial account balance is 2000
		   BankAccount account = new BankAccount();
		   
		   
		   try {
			int withdrawAmount = 2000;
			account.Withdraw();
		} catch (InsufficientBalanceException e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		 }
	   }

}
