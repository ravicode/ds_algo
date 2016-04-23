package Stack;

public class DecimalToBinaryByRecursion {
	
	private int size;
	private int[]stackArr;
	private int top;
	
	public DecimalToBinaryByRecursion(int size)
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
	
	public int getSize()
	{
		return  size;
	}
	
	public static void main(String args[])
	{
		DecimalToBinaryByRecursion st=new DecimalToBinaryByRecursion(5);
		int num=9;
		int tk=0;
		
		try
		{
			while(num!=0)
			{
				st.push(num%2);
				tk++;
			num=num/2;
			}
			
			

	for(int j=0;j<tk;j++)
	{
		System.out.print(st.pop());
	};
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
	}

}
