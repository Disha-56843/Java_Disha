package Module2_Core_Java;
 
/* W.A.J. P to create one thread by extending Thread class in another Class. */

class Thread1 extends Thread
{
	public void run()
	{
		for(int i = 1; i <= 5; i++)
		{
			System.out.println("Count: " + i + " - Thread: " + Thread.currentThread());
			try 
			{
				Thread.sleep(2000);
			} 
			catch (InterruptedException e) 
			{
				// TODO: handle exception
				e.printStackTrace();
			}
		}
	}
}

public class Que45 {

	 public static void main(String[] args) {
			
		  Thread1 Thread = new Thread1();
		  Thread.start();
	}
	
}
