package Searching;


public class FindMinMax {
	
	public static void main(String[] args) {
		
				
		
		int a[]={-3, -2, 3, 8, 6,11};
		
		findMinMax(a,a.length);
		findMinMaxOptimized(a,a.length);
		
		
		
		
	}

	
	public static void findMinMax(int a[],int n)
	{
	int min=a[0],max=a[0];
		for(int i=0;i<n;i++)
		{
			if(a[i]<min)
				min=a[i];
			else
			if(a[i]>max)
				max=a[i];
		}
		
		System.out.println("min="+min +" "+ "max="+max);
		
	}
	
	public static void findMinMaxOptimized(int a[],int n)
	{
		int min=-1,max=-1;

		for(int i=0;i<5;i=i+2)
		{
			if(a[i]<a[i+1])
			{
			if(a[i]<min)
				min=a[i];
			else
			if(a[i+1]>max)
				max=a[i+1];
			}
			else
			{
				if(a[i+1]<min)
					min=a[i+1];
				else
				if(a[i]>max)
					max=a[i];
			}
		}
		
		System.out.println("min="+min +" "+ "max="+max);
	}
}
