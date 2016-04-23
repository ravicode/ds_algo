package Matrix;

public class FindRowWithMaxNumberOf1 {
	static void findMax1Row(int arr[][]) {
		int max1 = 0, max2 = 0, maxRow = 0;
		int count = 0;
		int j = 3;
		int i = 0;
		while (i < 4 && j >= 0) {
			if (arr[i][j] == 1) {
				count++;

				j--;
				if (count > max1) {
					max1 = count;
					maxRow = i;
				}

			} else if (arr[i][j] == 0) {
				count = 0;
				i++;
				j = 3;

			}

		}

		// System.out.println("Count=" + count);
		System.out.println("max Count=" + count + " Row=" + maxRow);
	}

	public static void main(String[] args) {
		int mat[][] = { { 0, 0, 0, 1 }, { 0, 1, 1, 1 }, { 1, 1, 1, 1 },
				{ 0, 0, 0, 0 } };
		findMax1Row(mat);
		/*
		 * System.out.println("Index of row with maximum 1s is" +
		 * rowWithMax1s(mat));
		 */

	}

}
