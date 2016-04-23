package Stack;

public class StackImpl {
	
	private int size;
	private int[]stackArr;
	private int top;
	
	public StackImpl(int size)
	{
		this.size=size;
		stackArr=new int[size];
		top=-1;
		
	}
	
	public void push(int element) throws Exception
	{
		if(top==(size-1))
		{
		throw new Exception("Stack OverFlow Error");
		}
		else
		stackArr[++top]=element;
	}
	
	public int pop() throws Exception
	{
		int ele=0;
		if(top==-1)
		{
			throw new Exception("Stack Underflow Error");
		}
		else
		{
		 ele=stackArr[top--];
		// top=top-1;
		}
		return ele;
	}
	
	
	public int peek() throws Exception
	{
		
		if(top==-1)
		{
			throw new Exception("Stack is Empty");
		}
		else
		
		return stackArr[top];
	}
	
	
	
	public static void main(String args[])
	{
		StackImpl st=new StackImpl(5);
		
		try
		{
			st.push(5);
			st.push(10);
			st.push(15);
			st.push(25);
			st.push(24);

			st.pop();
			st.pop();
			st.pop();
			st.pop();

			System.out.println(st.peek());
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
	}

}
