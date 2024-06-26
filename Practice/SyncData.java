package Date18_06;

class Sender
{
	public void send(String msg)
	{
		System.out.println("sending "+msg);
		
		
			try 
			{
				Thread.sleep(1000);
			}
			catch (InterruptedException e) 
			{
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
		
		System.out.println(msg+" sent");
	}
}

class ThreadSend extends Thread
{
	String msg;
	Thread t;
	Sender sender;
	
	public ThreadSend(String msg,Sender sender) 
	{
		// TODO Auto-generated constructor stub
		
		this.msg=msg;
		this.sender=sender;
	}
	
	@Override
	public void run() 
	{
		// TODO Auto-generated method stub
		//super.run();
		
		synchronized (sender) 
		{
			sender.send(msg);	
		}
		
		
	}
}


public class SyncData {

	public static void main(String[] args) 
	{
		Sender sender = new Sender();
		ThreadSend t1 = new ThreadSend("Hii",sender);
		ThreadSend t2 = new ThreadSend("Byee",sender);
	
		t1.start();
		t2.start();
	}

	
}
