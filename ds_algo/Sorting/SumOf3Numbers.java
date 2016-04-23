package Sorting;

import java.util.Arrays;

// problem-10   do it again    o(nlogn)

/*
 * solution 1 (o(n2))
 * Time complexity of the method 1 is O(n^3). 
 * The complexity can be reduced to O(n^2) by sorting the array first, 
 * and then using method 1 of this post in a loop.
1) Sort the input array.
2) Fix the first element as A[i] where i is from 0 to array size – 2. 
After fixing the first element of triplet, 
find the other two elements using method 1 of this post.
 */


/*solution 2 (o(n(logn))
 * 
 * Can be done in O(n log n) 
1 - sort (increasing order)
2 - fix two elements, first element as 1st element and second element as nth element
3 - binary search for (sum - 1st - 2nd), between first and second element
4 - if (sum - 1st - 2nd) found, return true
5 - else if (sum - 1st - 2nd) not found 
6 - check whether binary search terminate at left end or right end
7 - if binary search terminate at left end , make 2nd element as (n-1)th element , repeat step 3.
8 - if binary search terminate at right end , make 1st element as (1+1)th element , repeat step 3.
 * 
 */

public class SumOf3Numbers {
	
	public static void main(String[] args) {
		int arr[]={3,4,6,7};
		
		int k=20;
		int a,b,c;
		
		int arr1[]={1,2,5};
		int arr2[]={11,12,13};     // 3+5+12=20
		Arrays.sort(arr1);
		
		for(int i=0;i<arr.length;i++)
		{
			a=arr[i];
			b=k-a;
			
			int k1=binarySearch(arr1,b,0,arr1.length-1);
			if(k1>0)
			{
			//System.out.println(arr1[k1]);
			System.out.println("8="+a+"+"+arr1[k1]);
			}
			else
			{
				System.out.println("no element");
			}
			
		}
		
		
	}
	
	
	static int binarySearch(int arr1[],int b,int low,int high)
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

}
