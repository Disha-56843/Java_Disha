package Module2_Core_Java;

/* W.A.J. P to create one thread by implementing Runnable interface in Class */

class Runnable1 implements Runnable{
	// Run method, which will be executed when the the starts
	public void run()
	{
		for(int i = 1; i <= 5; i++) {
			System.out.println("Number: " + i + " - Thread: " + Thread.currentThread());
			try {
				// Adding a delay to simulate some work in the thread
			  Thread.sleep(2000);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
				
			}
		}
	}
}

public class Que44 {

	public static void main(String[] args) {
		// Creating an instance of the class that implements runnable
    	Runnable1 Runnable = new Runnable1();
    	
    	// Crating a thread and passing the instance of runnable to its constructors
    	Thread myThread = new Thread(Runnable);
    	
    	// Starting the thread
    	myThread.start(); 
	}
	
}
