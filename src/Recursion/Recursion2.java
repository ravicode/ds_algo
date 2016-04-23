package Recursion;


public class Recursion2 {
	
	int print(int n)
	{
		if(n==0)
			return 0;
		
			print(n-1);
			System.out.println(n);
			return 0;
		
	}
	
	public static void main(String[] args) {
		Recursion2 r1=new Recursion2();
		r1.print(4);
	}

}

