package Dynamic_Programming;

public class EditDistance {

	// Recursive implementation
	static int EditDistanceRecursion(char X[], char Y[], int m, int n) { // Base
																			// cases
		if (m == 0 && n == 0)
			return 0;
		if (m == 0)
			return n;
		if (n == 0)
			return m; // Recurse
		int left = EditDistanceRecursion(X, Y, m - 1, n) + 1;
		int right = EditDistanceRecursion(X, Y, m, n - 1) + 1;
		int corner = EditDistanceRecursion(X, Y, m - 1, n - 1);
		if ((X[m - 1] != Y[n - 1]))
			corner++;
		return min(left, right, corner);
	}

	static int min(int leftCell, int topCell, int cornerCell) {

		int min = Math.min(leftCell, topCell);

		min = Math.min(min, cornerCell);

		return min;

	}

	static int findMinimumDistanceEdits(char ch1[], char ch2[], int mat[][]) {

		for (int i = 0; i < ch1.length + 1; i++)
			mat[i][0] = i;

		for (int j = 0; j < ch2.length + 1; j++)
			mat[0][j] = j;

		for (int i = 1; i < ch1.length + 1; i++) {
			for (int j = 1; j < ch2.length + 1; j++) {
				if (ch1[i - 1] != ch2[j - 1]) {
					int min = min(mat[i - 1][j], mat[i][j - 1],
							mat[i - 1][j - 1]);

					mat[i][j] = min + 1;
				} else
					mat[i][j] = mat[i - 1][j - 1];
			}
		}

		for (int i = 0; i < ch1.length + 1; i++) {
			for (int j = 0; j < ch2.length + 1; j++) {
				System.out.print(mat[i][j] + " ");
			}
			System.out.println();
		}

		return mat[ch1.length][ch2.length];
	}

	private static void EditedCharacters(char[] ch1, char[] ch2, int[][] mat) {
		int j = ch2.length;
		for (int i = ch1.length; i > 0 && j > 0; i--) {
			int min = min(mat[i - 1][j], mat[i][j - 1], mat[i - 1][j - 1]);

			if (min == mat[i - 1][j - 1] && min != mat[i][j]) {
				System.out.println(ch2[j - 1] + "--->" + ch1[i - 1]);

			} else {
				if (min == mat[i][j - 1] && mat[i][j] == min + 1) {
					System.out.println(ch2[j - 1] + " is deleted");
					j = j - 1;
				}

			}
			j = j - 1;

		}
	}

	public static void main(String[] args) {
		String str1 = "agced";
		String str2 = "abcdef";

		// String str1="algorithm";
		// String str2="analysis";

		char ch1[] = str1.toCharArray();
		char ch2[] = str2.toCharArray();

		int mat[][] = new int[ch1.length + 1][ch2.length + 1];
		System.out.println("\n Cost of Edits="
				+ findMinimumDistanceEdits(ch1, ch2, mat) + "\n");

		EditedCharacters(ch1, ch2, mat);

		// System.out.println("\n Recursive Cost of Edits="+EditDistanceRecursion(ch1,ch2,ch1.length,ch2.length)+"\n");

	}
}
