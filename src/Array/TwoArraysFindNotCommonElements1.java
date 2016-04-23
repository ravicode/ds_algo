package Array;


//find common in 3 sorted arsys .. take 2 once 

// o(n1+n2);

import java.util.Arrays;

public class TwoArraysFindNotCommonElements1 {

	public static void main(String[] args) {
		int ar1[] = { 1, 5, 10, 20, 40, 80 };
		int ar2[] = { 6, 7, 20, 80, 100 };
		int ar3[] = { 3, 4, 15, 20, 30, 70, 120 };

		int arr[]= findCommonin2Arrays(ar1,ar2);
		System.out.println(Arrays.toString(arr));
		
		arr= findCommonin2Arrays(arr,ar3);
		System.out.println(Arrays.toString(arr));
		
		// we can use hashmap or hashset to store final common elements , and then run aloop of max array length and then
		// print all the elements from all 3 arrays given above where elemetns are nt equal to elements
		// present in hashset or hashmap.
		
	}
	
	
	static int[] findCommonin2Arrays(int ar1[],int ar2[])
	{
		int arr[]=new int[5];
		
		int i=0,j=0;
		int n1=ar1.length-1,n2=ar2.length-1;
		int k=0;
		
		while(i<n1 && j<n2)
		{
			
			if(ar1[i]<ar2[j])
				i++;
			
			if(ar2[j]<ar1[i])
				j++;
			
			if(ar1[i]==ar2[j])
			{
				arr[k++]=ar1[i];
				i++;j++;
			}
			
		}
		
		
		
		return arr;
	}
}
