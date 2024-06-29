package Module2_Core_Java;

/* W.A.J.P to start the same Thread twice by calling start () method twice. Test
ThreadTwice1 t1=new TestThreadTwice1(); t1.start (); t1.start (); */



public class Que47 extends Thread
{
	
	public void run() {
        System.out.println("Thread is running.");
    }

	public static void main(String[] args) {
	
		
		Que47 t1 = new Que47();
        t1.start(); // This will start the thread and print "Thread is running..."
        
        // Attempting to start the same thread again will throw an IllegalThreadStateException
        try {
            t1.start(); // This will throw an exception
        } 
        catch (IllegalThreadStateException e) 
        {
            System.out.println("Exception caught: " + e);
        }
		
	}
	
}
