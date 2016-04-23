package Dynamic_Programming;

public class OptimalBinarySearchTree {

	/*
	 * A Dynamic Programming based function that calculates minimum cost of a
	 * Binary Search Tree.
	 */
	static int optimalSearchTree(int keys[], int freq[], int n) {
		/* Create an auxiliary 2D matrix to store results of subproblems */
		int mat[][] = new int[n][n];

		/*
		 * mat[i][j] = Optimal cost of binary search tree that can be formed
		 * from keys[i] to keys[j]. cost[0][n-1] will store the resultant cost
		 */

		// For a single key, cost is equal to frequency of the key
		for (int i = 0; i < n; i++)
			mat[i][i] = freq[i];

		// Now we need to consider chains of length 2, 3, ... .
		// L is chain length.
		for (int L = 2; L <= n; L++) {
			// i is row number in cost[][]
			for (int i = 0; i < n - L + 1; i++) {
				// Get column number j from row number i and chain length L
				int j = i + L - 1;
				mat[i][j] = Integer.MAX_VALUE;

				// Try making all keys in interval keys[i..j] as root
				for (int r = i; r <= j; r++) {
					// c = cost when keys[r] becomes root of this subtree
					int c = ((r > i) ? mat[i][r - 1] : 0)
							+ ((r < j) ? mat[r + 1][j] : 0) + sum(freq, i, j);
					if (c < mat[i][j])
						mat[i][j] = c;
				}
			}
		}
		return mat[0][n - 1];
	}

	// A utility function to get sum of array elements freq[i] to freq[j]
	static int sum(int freq[], int i, int j) {
		int s = 0;
		for (int k = i; k <= j; k++)
			s += freq[k];
		return s;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int keys[] = { 10, 12, 16, 21 };
		int freq[] = new int[] { 4, 2, 6, 3 };
		
		/*int keys[] = {10, 12, 20};
	    int freq[] = {34, 8, 50};*/
		int n = freq.length;
		
		System.out.println("Optimal Cost=" + optimalSearchTree(keys, freq, n));
	}

}
