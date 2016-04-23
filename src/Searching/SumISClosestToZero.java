package Searching;
import java.util.Arrays;


public class SumISClosestToZero {
	
	
	static void improvedComplexity(int arr[],int len)
	{
		int closeZero=32768;
		Arrays.sort(arr);  // -80  -10 1 60 70 85
		int pc=Integer.MAX_VALUE,nc=Integer.MIN_VALUE;
		for(int i=0,j=len-1;i<j;)
		{
			int temp=arr[i]+arr[j];
			if(temp>0)
			{
				if(temp<pc)
					pc=temp;
				j--;
			}
			else
			{
				if(temp>nc)
					nc=temp;
				i++;
			}
			
		}
		System.out.println((pc>Math.abs(nc)?nc:pc));
		
	}
	
	public static void main(String[] args) {
		int arr[]={1,60,-10,70,-80,85};
		int closeZero=32768;
		int len=arr.length;
		improvedComplexity(arr,len);
		/*int n1=0,n2=0;
		for(int i=0;i<len;i++)
		{
			for(int j=i+1;j<len;j++)
			{
				int sum=arr[i]+arr[j];
				
				if(Math.abs(sum)<closeZero)
				{
					closeZero=Math.abs(sum);
					n1=arr[i];n2=arr[j];
				}
					
			}
		}
		
		System.out.println("Sum="+closeZero + " n1="+n1+" n2="+n2);
		
		*/
	}

}
