package Queue;

import java.util.Stack;

public class QueueWith2Stacks {
	 Stack<Integer> stack1=new Stack<Integer>();
	 Stack<Integer> stack2=new Stack<Integer>();
	
	public  void enQueue(int element) throws Exception
	{
	/*	if(stack1.size()>5)
		{
		throw new Exception("Stack OverFlow Error");
		}
		else*/
		stack1.push(element);
	}
	
	public  int deQueue() throws Exception
	{
		int ele=0;
		while(!stack1.isEmpty())
			stack2.push(stack1.pop());
		
		if(stack2.isEmpty())
		{
			throw new Exception("Stack Underflow Error");
		}
		else
		{
		ele=stack2.pop();
		}
		
		
		while(!stack2.isEmpty())
			stack1.push(stack2.pop());
		return ele;
			

	}
	
	
	
	public static void main(String[] args) {
		
		QueueWith2Stacks qs=new QueueWith2Stacks();
		try
		{
			qs.enQueue(6);
			qs.enQueue(10);
			qs.enQueue(15);
			qs.enQueue(25);
			qs.enQueue(24);
			//st.enQueue(24);

			System.out.println(qs.deQueue());
			System.out.println(qs.deQueue());
			qs.enQueue(30);
			
			System.out.println(qs.deQueue());
			System.out.println(qs.deQueue());
			System.out.println(qs.deQueue());
			
			
			System.out.println(qs.deQueue());
			
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
	}

}
