package Sorting_Merge_Sorted_Arrays_LL;

import java.util.Arrays;
/*
given two arrays in sorted form. 
The first array has some empty space equal to the size
of second array at its end. You have to merge both array in the smartest possible way in the 
first array. With constraint that auxiliary space O(1).

Ex � arr1[9] = {2,4,5,7,8,_,_,_,_};
arr2[4] = {3,6,8,9};
after merging arr1 should be = {2,3,4,5,6,7,8,8,9};

*/

/*
 * /*Given 2 arrays one of size n and another of size (n+k) but having k values filled, 
I was asked to merge the two into the second array without using any extra space. 
I quickly gave her the logic and we moved on to the next question.*/
 

public class Merge2SortedArrays {
	
	
	public static void main(String[] args) {
		int arr1[] = new int[]{2,4,5,7,8,0,0,0,0};
		int arr2[] = {3,6,9,10};
		int i=arr1.length-arr2.length-1; //4
		int j=arr2.length-1;//3
		for(int k=8;k>0 && i>=0 && j>=0;k--)
		{
			if(arr1[i]>arr2[j])
			{
				arr1[k]=arr1[i];
				i--;
				
			}
			else
			{
				arr1[k]=arr2[j];
				j--;
			}
			
			
			
		}
		System.out.println(Arrays.toString(arr1));
		}
		

}
