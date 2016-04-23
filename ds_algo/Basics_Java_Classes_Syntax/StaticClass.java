package Basics_Java_Classes_Syntax;

public class StaticClass {
	
	static int value;
	
	public int getValue()
	{
		try
		{
			value=value+1;
			return value;
		}catch(Exception e)
		{
			return  0;
		}
		finally
		{
			value=value+1;
		}
	}

	
	public static void main(String[] args) {
		StaticClass t1=new StaticClass();
		System.out.println(t1.getValue());
		System.out.println(t1.value);
	}
}
