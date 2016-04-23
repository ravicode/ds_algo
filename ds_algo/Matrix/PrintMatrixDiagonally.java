package Matrix;

/*
 * Print a matrix diagonally.
 */



public class PrintMatrixDiagonally {
	static int ROW = 5;
	static int COL = 4;

	static int min(int a, int b) {
		return (a < b) ? a : b;
	}

	// A utility function to find min of three integers
	static int min(int a, int b, int c) {
		return min(min(a, b), c);
	}

	// A utility function to find max of two integers
	static int max(int a, int b) {
		return (a > b) ? a : b;
	}

	// The main function that prints given matrix in diagonal order
	static void diagonalOrder(int matrix[][]) {
		// There will be ROW+COL-1 lines in the output
		for (int line = 1; line <= (ROW + COL - 1); line++) {
			/*
			 * Get column index of the first element in this line of output. The
			 * index is 0 for first ROW lines and line - ROW for remaining lines
			 */
			int start_col = max(0, line - ROW);

			/*
			 * Get count of elements in this line. The count of elements is
			 * equal to minimum of line number, COL-start_col and ROW
			 */
			int count = min(line, (COL - start_col), ROW);

			/* Print elements of this line */
			for (int j = 0; j < count; j++)
				System.out.print(matrix[min(ROW, line) - j - 1][start_col + j]
						+ " ");

			/* Ptint elements of next diagonal on next line */
			System.out.println();
		}
	}

	// Utility function to print a matrix
	static void printMatrix(int matrix[][]) {
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 4; j++)
				System.out.print(matrix[i][j] + " ");
			System.out.println();
			// printf("\n");
		}

	}

	// Driver program to test above functions
	public static void main(String[] args) {

		{
			int M[][] = { { 1, 2, 3, 4 }, 
					{ 5, 6, 7, 8 }, 
					{ 9, 10, 11, 12 },
					{ 13, 14, 15, 16 }, 
					{ 17, 18, 19, 20 }, };
			System.out.println("Given matrix is \n");
			printMatrix(M);

			System.out.println("\nDiagonal printing of matrix is \n");
			diagonalOrder(M);
			// return 0;
		}
	}
}