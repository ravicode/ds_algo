package Dynamic_Programming;

import java.util.Stack;

/*This problem is close to the Longest Common Subsequence (LCS) problem. 
In fact, we can use LCS as a subroutine to solve this problem.
 Following is the two step solution that uses LCS.
 1) Reverse the given sequence and store the reverse in another array say rev[0..n-1]
 2) LCS of the given sequence and rev[] will be the longest palindromic sequence.
 This solution is also a O(n^2) solution.*/

public class LongestPalidromicSubSequenceByLCS {
	
	public static void main(String[] args) {
		char ch1[] = "BDCABA".toCharArray();
		char ch2[] = "ABACDB".toCharArray();  //it is reverse of ch1
		
		Stack<Character> backTrack=new Stack<Character>();

		int arr[][] = new int[ch1.length + 1][ch2.length + 1];

		boolean arrBoolean[][] = new boolean[ch1.length + 1][ch2.length + 1];

		LongestCommonSubsequence.printLcsLength(ch1, ch2, arr, arrBoolean);

		System.out.println("length of LCS=" + arr[ch1.length][ch2.length]);

		LongestCommonSubsequence.printLCS(ch1, ch2, backTrack, arr, arrBoolean);

	}

}
