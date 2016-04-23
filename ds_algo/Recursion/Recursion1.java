package Recursion;

public class Recursion1 {
	
	int print(int n)
	{
		if(n==0)
			return 0;
		else
		{
			System.out.println(n);
			return print(n-1);
		}
	}
	
	public static void main(String[] args) {
		Recursion1 r1=new Recursion1();
		r1.print(4);
	}

}
