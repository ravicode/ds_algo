package Searching;

import java.util.Arrays;

/*Given an array of integers. Segregate all the non-zero numbers at the beginning.
Print the number of non-negative integers and the minimum number of swaps required 
for these operations. 

Eg.  : I/p : 1, 0, 0, -6, 2, 0
        o/p : Number of non-negative integers : 3
                  Minimum number of swaps : 2 */

public class SegregateNonZeroAndNegativeNUmbers {
	
	
	public static void main(String[] args) {
		int arr[]={-11, 0, 0, -6, 2, 0};
		int k=0;
		
		int len=arr.length;
		
		for(int i=0,j=len-1;i<j;)
		{
			if(arr[i]>=0)
				i++;
			else
			{
				int t=arr[i];
				arr[i]=arr[j];
				arr[j]=t;
				
				j--;
			}
			
		/*	
		if (arr[i]!=0)
			{
				i++;
			}
		else
			{
				int t=arr[i];
				arr[i]=arr[j];
				arr[j]=t;
				k++;
			}
			
			if(arr[j]==0)
			{
				j--;
			}
			*/
		}
		
		System.out.println(Arrays.toString(arr));
		
		System.out.println("Min num of swaps="+k);
	}

}
