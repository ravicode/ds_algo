package Hashing;
import java.util.HashMap;

// http://www.geeksforgeeks.org/find-the-largest-subarray-with-0-sum/
/*
 * Question - This is a type of find largest subarray with zero sum..just replace all the 0's with -1 
 * Solution -
 * We can Use Hashing to solve this problem in O(n) time. 
 * The idea is to iterate through the array and for every element arr[i], calculate sum of elements 
 * form 0 to i (this can simply be done as sum += arr[i]). If the current sum has been seen before,
 *  then there is a zero sum array. Hashing is used to store the sum values, 
 * so that we can quickly store sum and find out whether the current sum is seen before or not.
 */

public class HighestLengthSubStringg_MaxLengthSubArrayWithSum0 {

	static String str = "111100101010001101100001100010101011110000";

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char ch[] = str.toCharArray();

		int chInt[] = new int[ch.length];

		for (int i = 0; i < ch.length; i++) {
			if (ch[i] == '0')
				chInt[i] = -1;
			else
				chInt[i] = 1;

		}
		
		int length = maxLen(chInt);
		System.out.println(length);
	}

	// Returns length of the maximum length subarray with 0 sum
	static int maxLen(int arr[]) {
		// Creates an empty hashMap hM
		HashMap<Integer, Integer> hM = new HashMap<Integer, Integer>();

		int sum = 0; // Initialize sum of elements
		int max_len = 0; // Initialize result

		// Traverse through the given array
		for (int i = 0; i < arr.length; i++) {
			// Add current element to sum
			sum += arr[i];

			if (arr[i] == 0 && max_len == 0)
				max_len = 1;

			if (sum == 0)
				max_len = i + 1;

			// Look this sum in hash table
			Integer prev_i = hM.get(sum);

			// If this sum is seen before, then update max_len
			// if required
			if (prev_i != null)
				max_len = Math.max(max_len, i - prev_i); //it compares maximum length SubArray which have sum =0
			else
				// Else put this sum in hash table
				hM.put(sum, i);
		}

		return max_len;
	}

}
