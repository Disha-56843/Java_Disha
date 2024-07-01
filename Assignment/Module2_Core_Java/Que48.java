package Module2_Core_Java;

/* W.A.J.P to create 2 threads and make one thread as Daemon Thread by using set
Daemon () method of Thread class and check whether the thread is set daemon or
not by using is Daemon () method.
TestDaemonThread2 t1=new TestDaemonThread2();
TestDaemonThread2 t2=new TestDaemonThread2(); t1.start();
t1.setDaemon(true);//will throw exception here t2.start(); */

public class Que48 {

	public static void main(String[] args) {
        // Creating two thread instances of TestDaemonThread2
        TestDaemonThread2 thread1 = new TestDaemonThread2();
        TestDaemonThread2 thread2 = new TestDaemonThread2();
        
        // Setting the first thread as a daemon thread
        thread1.setDaemon(true);

        // Starting the first thread
        thread1.start();
        
        // Starting the second thread
        thread2.start();
        
        // Checking and printing if the first thread is a daemon thread
        System.out.println("Is Thread 1 daemon? " + thread1.isDaemon());
        
        // Checking and printing if the second thread is a daemon thread
        System.out.println("Is Thread 2 daemon? " + thread2.isDaemon());
    }
}

// Defining the TestDaemonThread2 class by extending the Thread class
class TestDaemonThread2 extends Thread {
    // Overriding the run method to define the task of the thread
    public void run() {
        // Printing the status of the thread
    	try 
		{
			Thread.sleep(2000);
		} 
		catch (InterruptedException e) 
		{
			// TODO: handle exception
			e.printStackTrace();
		}
        System.out.println("Thread " + Thread.currentThread().getName() + " is running.");
        
    }
	
}
