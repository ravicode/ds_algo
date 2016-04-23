package Sorting;

import java.util.Arrays;

//counting sort

public class SortArrayWithinARange_BucketSort {
	
	
	
	public static void main(String[] args) {
		
		int arr[]={0,1,1,0,1,2,1,2,0,0,0,1,1};
		
		int ar[]=new int[3];
		
		for(int i=0;i<arr.length;i++)
		{
			ar[arr[i]]++;
		}
		
		
		for(int i=0;i<3;)
		{
			if(ar[i]>0)
			{
				System.out.println(i);
				ar[i]--;
			}
			else 
				i++;
		}
		
	//	System.out.println(Arrays.toString(ar));
	}

}
