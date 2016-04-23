package Queue;




//Generic Queue Class


public class QueueImplNode<T> {
	
	private int size;
	private T[]stackArr;
	private int front;
	private int rear;
	
	
	public QueueImplNode(int size)
	{
		this.size=size;
		stackArr=(T[])new Object[size];//new T[];// [size];
		front=-1;
		rear=-1;
		
	}
	
	public void enque(T element) throws Exception
	{
		if(rear==(size-1))
		{
		throw new Exception("Queue OverFlow Error");
		}
		else
		stackArr[++rear]=element;
		
		if(rear==0)
			front=0;
	}
	
	public T deque() throws Exception
	{
		T ele=null;
		if(front==-1)
		{
			throw new Exception("Queue Underflow Error");
		}
		else
		{
	 //ele=stackArr[front++];
			ele=stackArr[front];
			stackArr[front]=null;
			front++;
		// top=top-1;
		}
		return ele;
	}
	
	
	public T front() throws Exception
	{
		
		if(front==-1 && rear==-1)
		{
			throw new Exception("Queue is Empty");
		}
		else
		{
			System.out.println(front);
		return stackArr[front];
		}
		
	}
	
	public boolean isEmpty()
	{
		if(front==size)
			return true;
		else
			return false;
	}
	
	public static void main(String args[])
	{
		QueueImplNode<Integer> st=new QueueImplNode<Integer>(5);
		
		try
		{
			st.enque(5);
			st.enque(10);
			st.enque(15);
			st.enque(25);
			st.enque(24);

			System.out.println(st.deque());
			/*st.deque();
			st.deque();


			System.out.println(st.front());*/
	
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
	}

}
