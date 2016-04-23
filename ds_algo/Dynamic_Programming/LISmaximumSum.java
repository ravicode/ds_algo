package Dynamic_Programming;

import java.util.Arrays;

//same as book
/*
 Given an array of n positive integers. Write a program to find 
 the sum of maximum sum subsequence of the given array such that the
 intgers in the subsequence are sorted in increasing order. 
 For example, if input is {1, 101, 2, 3, 100, 4, 5}, then output should be
 106 (1 + 2 + 3 + 100), if the input array is {3, 4, 5, 10}, then output should 
 be 22 (3 + 4 + 5 + 10) 
 and if the input array is {10, 5, 4, 3}, then output should be 10 */

/*This problem is a variation of standard Longest Increasing Subsequence (LIS) problem. 
 * We need a slight change in the Dynamic Programming solution of LIS problem. All we need to 
 * change is to use sum as a criteria instead of length of increasing subsequence.
 */
public class LISmaximumSum {

	static int arr[] = { 1, 101, 2, 3, 100, 4, 5 };

	// static int arr[] = { 3, 4, -1, 0, 6,2,3 };
	static void findMaxSumInLIS() {

		int lis[] = new int[arr.length];

		for (int i = 0; i < lis.length; i++)
			lis[i] = 1;

		int j = 0;
		System.out.println(Arrays.toString(lis));
		for (int i = 1; i < lis.length;) {
			if (arr[j] < arr[i]) 

			{
				if (lis[i] < lis[j] + arr[i])  // this line only changes with LengthOfLIS.

					lis[i] = lis[j] + arr[i];

			}

			j++;

			if (j == i) {
				j = 0;
				i++;
			}
			System.out.println(Arrays.toString(lis));
		}

		int maximumSuminLIS = 0;
		for (int i = 0; i < lis.length; i++) {
			if (lis[i] > maximumSuminLIS)
				maximumSuminLIS = lis[i];

		}

		System.out.println("maximum Sum in LIS=" + maximumSuminLIS);

	}

	public static void main(String[] args) {
		findMaxSumInLIS();
	}

}