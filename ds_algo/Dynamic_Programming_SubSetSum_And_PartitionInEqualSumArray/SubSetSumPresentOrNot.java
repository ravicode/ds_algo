package Dynamic_Programming_SubSetSum_And_PartitionInEqualSumArray;

public class SubSetSumPresentOrNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[] = { 2, 3, 7, 8, 10 };
		int sum = 11;

		boolean isPossible = printMatrix(arr, sum);
		if (isPossible)
			System.out.println("yes, sum is present");
		else

			System.out.println("No, sum is not present");

	}

	static boolean printMatrix(int arr[], int sum) {
		// mat[0][0]=true;
		boolean mat[][] = new boolean[arr.length + 1][sum + 1];
		for (int i = 1; i <= sum; i++) {
			mat[0][i] = false;
		}

		for (int i = 0; i <= arr.length; i++) {
			mat[i][0] = true;
		}

		for (int i = 1; i <= arr.length; i++) {
			for (int j = 1; j <= sum; j++) {
				if (arr[i - 1] <= j) {
					if (mat[i - 1][j] == true)
						mat[i][j] = mat[i - 1][j];
					else
						mat[i][j] = mat[i - 1][j - arr[i - 1]];
				} else
					mat[i][j] = mat[i - 1][j];
			}
		}

		/*
		 * for (int i = 0; i <= arr.length; i++) { for (int j = 0; j <= sum;
		 * j++) { System.out.print(mat[i][j] + "  "); } System.out.println(); }
		 */
		if (mat[arr.length][sum]) {
			System.out.println("Variables participated to make sum");
			int j = sum;
			for (int i = arr.length; i >= 0; i--) {
				if (mat[i][sum] == true) {

				} else {
					System.out.println(arr[i]);
					sum = sum - arr[i];
				}
			}
		}
		return mat[arr.length][sum];
	}

}
