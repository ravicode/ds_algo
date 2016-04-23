package Dynamic_Programming;

//same as book

/*This problem is close to the Longest Common Subsequence (LCS) problem. 
In fact, we can use LCS as a subroutine to solve this problem.
 Following is the two step solution that uses LCS.
 1) Reverse the given sequence and store the reverse in another array say rev[0..n-1]
 2) LCS of the given sequence and rev[] will be the longest palindromic sequence.
 This solution is also a O(n^2) solution.*/

/*Given a string, find the longest substring which is palindrome. 
 For example, if the given string is �forgeeksskeegfor�,
 the output should be �geeksskeeg�.*/

public class LongestPalidromicSubSequence {

	static int lps(char str[]) {
		int n = str.length;
		int i, j, length;
		int mat[][] = new int[n][n]; // Create a table to store results of
										// subproblems
		// Strings of length 1 are palindrome of lentgh 1
		for (i = 0; i < n; i++)
			mat[i][i] = 1;
		// Build the table. Note that the lower diagonal values of table are
		// useless and not filled in the process. The values are filled in a
		// manner similar to Matrix Chain Multiplication DP solution

		// length is length of substring

		for (length = 2; length <= n; length++) {
			for (i = 0; i < n - length + 1; i++) {
				j = i + length - 1;
				if (str[i] == str[j] && length == 2)    //  0 1 2 3 4 5  a g b d b a
					mat[i][j] = 2;
				else if (str[i] == str[j]) {
					mat[i][j] = mat[i + 1][j - 1] + 2;    // b = b , then mat[2,4]= 2+mat[2+1][4-1];
					// System.out.println(str[i+1]);
					// max=cl;
				} else {
					mat[i][j] = Math.max(mat[i][j - 1], mat[i + 1][j]);  // mat[0,2]=max(mat[0,1],mat[1,2])

				}
			}
		}
		// sSystem.out.println(max);
		return mat[0][n - 1];
	}

	// Driver program to test above functions

	public static void main(String[] args) {

		// char seq[] = "GEEKSFORGEEKS".toCharArray();//seeks

		char seq[] = "agbdba".toCharArray();
		int n = seq.length;
		System.out.println("The length of the LPS is =" + lps(seq));
	}
}