package Dynamic_Programming_Min_Max_PathSum;

import java.util.Arrays;

public class PathCost {
	static int n = 3;
	static int cost[][] = { { 1, 2, 3 }, 
							{ 4, 8, 2 },
							{ 1, 5, 3 } };

	static int findPath() {

		int index[] = new int[10];
		int j = 0;
		int k1 = 0;
		index[k1++] = cost[0][0];
		for (int i = 0; i < 3 - 1 && j < 2;) {

			if (cost[i + 1][j] < cost[i][j + 1]) {

				if (cost[i + 1][j + 1] < cost[i + 1][j]) {
					i = i + 1;
					j = j + 1;
					index[k1++] = cost[i][j];

				}

				else {
					i = i + 1;

					index[k1++] = cost[i][j];
				}

			} else {

				if (cost[i + 1][j + 1] < cost[i][j + 1]) {

					i = i + 1;
					j = j + 1;
					index[k1++] = cost[i][j];

				} else {

					j = j + 1;
					index[k1++] = cost[i][j];
				}
			}

		}
		index[k1++] = cost[2][2];
		System.out.println(Arrays.toString(index));

		return 1;

	}

	public static void main(String[] args) {
		findPath();
	}
}
