import java.util.Arrays;


public class Generate_Strings {
	static int num=2;
	static   int a[]=new int[num];
	
	public static void main(String[] args) {
		binary(num);
	}
	
	static void binary(int n)
	{
		
		if(n<1)
		{
			//for(int k=0;k<5;k++)
			System.out.println(Arrays.toString(a));

		
		}
		else
		{
			a[n-1]=0;
			binary(n-1);
			a[n-1]=1;
			binary(n-1);
		}
	}
}
