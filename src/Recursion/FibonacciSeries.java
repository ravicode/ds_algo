package Recursion;


public class FibonacciSeries {
	
	
	public static int fibonacci(int n)
	{
	if(n<=1) return 1;
	
	return fibonacci(n-1)+fibonacci(n-2);
	}	
	
	
	
	public static void main(String[] args) {
		
		int k=4;
		int n=0;
		for(int i=0;i<=k;i++)
		{
			System.out.println(fibonacci(i));
			
		}
		
	}

}
