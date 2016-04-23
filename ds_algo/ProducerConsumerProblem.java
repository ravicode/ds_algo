import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;


public class ProducerConsumerProblem {

	public static void main(String[] args) {
		
		BlockingQueue b=new LinkedBlockingQueue();
		
		Thread t1=new Thread(new Producer(b));
		
		Thread t2=new Thread(new Consumer(b));
		
		t1.start();
		t2.start();
		
	}
}


class Consumer implements Runnable
{
BlockingQueue sharedvar;

Consumer(BlockingQueue sharedvar)
{
	this.sharedvar=sharedvar;
}
	
	@Override
	public void run() {
		
		while(true)
		{
			try {
				
				System.out.println("consumer"+sharedvar.take());
				
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
}


class Producer implements Runnable
{
BlockingQueue sharedvar;

 Producer(BlockingQueue sharedvar)
{
	this.sharedvar=sharedvar;
}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
	for(int i=0;i<10;i++)
	{
		try
		{
	
		System.out.println("produces="+i);
		sharedvar.put(i);
		}catch(Exception e)
		{
			
		}
		
	}
		
	}
}