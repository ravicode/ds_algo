package Dynamic_Programming;

public class knapsack01 {

	static int max(int a, int b) {
		return (a > b) ? a : b;
	}
	static int matrix[][];
	// Returns the maximum value that can be put in a knapsack of capacity W
	static int knapSack(int W, int wt[], int val[], int n) {

		

		for (int i = 0; i < n; i++)
			matrix[i][0] = 0;

		for (int j = 0; j < W; j++)
			matrix[0][j] = 0;

		for (int i = 1; i < n + 1; i++) {

			for (int j = 1; j < W + 1; j++) {
				if (j < wt[i - 1])
					matrix[i][j] = matrix[i - 1][j];
				else
					matrix[i][j] = max(val[i - 1]
							+ matrix[i - 1][j - wt[i - 1]], matrix[i - 1][j]);

			}

		}

		for (int i = 0; i < n + 1; i++) {

			for (int j = 0; j < W + 1; j++) {
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();

		}

		

		return matrix[n][W];
	}

	private static void itemsSelected(int W, int[] wt, int[] val, int n,
			int[][] matrix) {
		int j = W;
		for (int i = n; i >= 0; i--) {

			if (j > 0) {
				if (matrix[i][j] == matrix[i - 1][j]) {
					System.out.println("val="+val[i - 2]+"   weight="+wt[i-2]);
					j = j - wt[i - 2];

				} else {

					System.out.println("val="+val[i - 1]+"   weight="+wt[i-1]);
				}
			}
		}
	}

	public static void main(String[] args) {

		{
			int val[] = { 1, 4, 5, 7 };
			int wt[] = { 1, 3, 4, 5 };
			int W = 7;
			int n = 4;
			matrix= new int[n + 1][W + 1];
			System.out.println("maximun value selected="+knapSack(W, wt, val, n));
			
			itemsSelected(W, wt, val, n, matrix);
		}
	}
}
