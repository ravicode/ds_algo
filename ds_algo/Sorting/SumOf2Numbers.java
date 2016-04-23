package Sorting;

import java.util.Arrays;

// find 2 nums from arrays given such that a+b=k;

//1 . sort aray
// 2. take 1st element as 0th element and 2nd element as last element
// if they equal to sum , then print  else if 1st = 2nd < sum , then  1st ++  else 2nd-- 

public class SumOf2Numbers {
	
	public static void main(String[] args) {
		//int arr[]={3,4,6,7};
		
		int k=6;
		int a,b;
		
		int arr1[]={2,1,5};
		Arrays.sort(arr1);
		
		for(int i=0;i<arr1.length;i++)
		{
			a=arr1[i];
			b=k-a;
			
			int k1=binarySearch(arr1,b,0,arr1.length-1);
			if(k1>0)
			{
			//System.out.println(arr1[k1]);
			System.out.println("6="+a+"+"+arr1[k1]);
			//Runtime.getRuntime().exit(0);
			//System.exit(0);
			}
			else
			{
				System.out.println("no element");
			}
			
		}
		
		
	}
	
	
	static int binarySearch(int arr1[],int b,int low,int high)
	{
		if(high==low)
			return low;
		if(high>low)
		{
		
		int mid=(low+high)/2;
		
		if(arr1[mid]==b)
			return mid;
		else
		{
			if(arr1[mid]>b)
				return binarySearch(arr1, b, low, mid-1);
			else
				return binarySearch(arr1, b, mid+1,high);
		}
		
		
	}
	
		return -1;
	}
}