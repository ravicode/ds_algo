package Recursion;

public class Recursion_factorial {
	
	public static void main(String[] args) {
		System.out.println(print(5));
	}

	
	static int print(int n)
	{
		int a=0;
		if(n==0 || n==1)
			return 1;
		else
		{
			//System.out.println(n);
			a=n*print(n-1);
			return a;
		}
			
		
	}
}
