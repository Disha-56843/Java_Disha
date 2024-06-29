package Module2_Core_Java;

/* W.A.J.P to create 2 threads and execute that threads by providing sleep time as
2000ms and check the execution */

class RunnableTask implements Runnable 
{
    @Override
    public void run()
    {
        try
        {
            // Print the name of the current thread and sleep for 2000 ms
            System.out.println(Thread.currentThread().getName() + " is running");
            Thread.sleep(2000);
            System.out.println(Thread.currentThread().getName() + " has finished execution");
        }
        catch (InterruptedException e) 
        {
            e.printStackTrace();
        }
    }
}

public class Que46 {
	
	public static void main(String[] args) 
	{
        // Create the first thread
        Thread thread1 = new Thread(new RunnableTask(), "Thread-1");
        // Create the second thread
        Thread thread2 = new Thread(new RunnableTask(), "Thread-2");

        // Start both threads
        thread1.start();
        thread2.start();
    }

}
