package Dynamic_Programming;

import java.util.Arrays;

//LIS 
public class LengthOfLongestIncreasingSubsequence {
	/*static int arr[] = { 10, 22, 9, 33, 21, 50, 41, 60 }; 
	*/
	
	
	static int[] findLIS(int arr[])
	{
		
		int lis[]=new int[arr.length];
		
		for(int i=0;i<lis.length;i++)
			lis[i]=1;
		
		int j=0;
		//System.out.println(Arrays.toString(lis));
		for(int i=1;i<lis.length;)
		{
			if(arr[j]<arr[i])
			{
				if(lis[i]<lis[j]+1)  //+1 is added , so that it can be used when both are equals also,
					lis[i]=lis[j]+1;     //other wise if(lis[i]<=lis[j]) is also fine and does the same 
				
			}
			
				j++;
			
			if(j==i)
			{
				j=0;
				i++;
			}
			//System.out.println(Arrays.toString(lis));
		}
		
		//System.out.println(Arrays.toString(lis));
		int lengthofLIS=0;
		for(int i=0;i<lis.length;i++)
		{
			if(lis[i]>lengthofLIS)
				lengthofLIS=lis[i];
		
		}
		
		System.out.println("Length of LIS="+lengthofLIS);
		return lis;	
		
	}
	
	public static void main(String[] args) {
		 int arr[] = { 3, 4, -1, 0, 6,2,3 }; 
		findLIS(arr);
	}

}
