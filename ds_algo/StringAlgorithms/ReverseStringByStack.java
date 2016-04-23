package StringAlgorithms;

public class ReverseStringByStack {
	
	private int size;
	private char[]stackArr;
	private int top;
	
	public ReverseStringByStack(int size)
	{
		this.size=size;
		stackArr=new char[size];
		top=-1;
		
	}
	
	
	public int getSize()
	{
		return  size;
	}
	public void push(char element) throws Exception
	{
		if(top==(size-1))
		{
			throw new Exception("Stack OverFlow Error");
		}
		else
		stackArr[++top]=element;
	}
	
	public char pop() throws Exception
	{
		char ele=0;
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
	
	
	public char peek() throws Exception
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
		
		String toReverse="dangaich";
		ReverseStringByStack st=new ReverseStringByStack(toReverse.length());
	//	char arr[]=toReverse.toCharArray();
		
		try
		{
			for(int i=0;i<st.getSize();i++)
			{
				st.push(toReverse.charAt(i));
			}
			
			

	for(int j=0;j<st.getSize();j++)
	{
		System.out.print(st.pop());
	}

		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
	}

}
