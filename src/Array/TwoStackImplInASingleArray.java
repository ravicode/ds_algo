package Array;



public class TwoStackImplInASingleArray {
	
	private int size;
	private int[]stackArr;
	private int top1,top2;
	
	public TwoStackImplInASingleArray(int size)
	{
		this.size=size;
		stackArr=new int[size];
		top1=-1;
		top2=size;
	}
	
	public void push1(int element) throws Exception
	{
		
			if(top1<top2)
			{
		stackArr[++top1]=element;
		}
			else
			{
				throw new Exception("Stack OverFlow Error");
			}
		
	}
	
	
	
	public void push2(int element) throws Exception
	{
		
			if(top1<top2)
			{
		stackArr[--top2]=element;
		}
			else
			{
				throw new Exception("Stack OverFlow Error");
			}
		
	}
	
	public int pop1() throws Exception
	{
		int ele=0;
		if(top1>=0)
		{
			ele=stackArr[top1--];
			
		}
		else
		{
		 
			throw new Exception("Stack Underflow Error");
		}
		return ele;
	}
	
	public int pop2() throws Exception
	{
		int ele=0;
		if(top2<size)
		{
			ele=stackArr[top2++];
			
		}
		else
		{
		 
			throw new Exception("Stack Underflow Error");
		}
		return ele;
	}
	

	
	
	public static void main(String args[])
	{
		TwoStackImplInASingleArray st=new TwoStackImplInASingleArray(10);
		
		try
		{
			st.push1(5);
			st.push1(10);
			st.push1(15);
			st.push2(25);
			st.push2(24);
			System.out.println(st.pop1());
			System.out.println(st.pop1());
			System.out.println(st.pop2());
			System.out.println(st.pop2());
			System.out.println(st.pop2());
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
	}

}
