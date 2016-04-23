package Recursion;

public class RecursionNthNumber {
	int n=0;
	int num=0;
	
	int returnNumberOfElemnts(int height)
	{
		
		if(height>0)
		{
			//System.out.println(height);
		 num= height+returnNumberOfElemnts(--height);
		 System.out.println(height);
		}
		return num;
	}
	
	public static void main(String[] args) {
		
		RecursionNthNumber num=new RecursionNthNumber();
		int number= num.returnNumberOfElemnts(4);
		System.out.println(number);
		
	}

}
