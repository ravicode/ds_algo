package Searching;

import java.util.HashMap;

/*
 * Given an array, find number of pairs which equal to a given sum.
 */

/*
 *  (Use Hash Map)
This method works in O(n) time if range of numbers is known.
Let sum be the given sum and A[] be the array in which we need to find pair.

1) Initialize Binary Hash Map M[] = {0, 0, �}
2) Do following for each element A[i] in A[]
   (a)	If M[x  - A[i]] is set then print the pair (A[i], x � A[i])
   (b)	Set M[A[i]]
 */
public class FindPairsOfNumbersEqualToGivenSumHashMap {

	
	static HashMap<Integer,Integer> mp=new HashMap<Integer, Integer>();
	
	static void initializehash(int arr[])
	{
		for(int i:arr)
		{
			mp.put(i, i);
		}
	}
	
	static void findNumberOfPairs(int arr[],int num)   //o(n)  o(n)
	{
		int count=0;
		for(int i:arr)
		{
			if(mp.containsKey(num-i))
				count++;
			
		}
		
		System.out.println("Number of pairs="+count/2);
	}
	
	public static void main(String[] args) {
		int arr[] = {20, 8, 9,1,2};
		initializehash(arr);
		findNumberOfPairs(arr,10);
	}
}
