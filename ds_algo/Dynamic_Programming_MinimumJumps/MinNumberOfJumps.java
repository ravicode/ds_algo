package Dynamic_Programming_MinimumJumps;

import java.util.Arrays;

public class MinNumberOfJumps {

	static int minJumps(int arr[], int n) {

		int NoOfjumps[] = new int[n];
		NoOfjumps = new int[] { 99, 99, 99, 99, 99, 99, 99, 99, 99, 99 };
		NoOfjumps[0] = 0;
		int actualJumps[] = new int[n];
		for (int i = 1; i < arr.length; i++) {
			for (int j = 0; j < i; j++) {
				if (arr[j] >= (i - j)) {

					if (NoOfjumps[i] <= NoOfjumps[j] + 1) {

					} else {
						NoOfjumps[i] = NoOfjumps[j] + 1;
						actualJumps[i] = j;
					}

				}

			}

		}

		System.out.println("Minimum number of jumps to reach point");
		System.out.println(Arrays.toString(NoOfjumps));

		System.out
				.println("Actual jumps to reach that point from index position");
		System.out.println(Arrays.toString(actualJumps));

		return NoOfjumps[n - 1];
	}

	public static void main(String[] args) {
		int arr[] = { 2, 3, 1, 1, 2, 4, 2, 0, 1, 1 };  //{ 2, 3, 1, 1, 2, 3, 0, 0, 0, 1 };
		int size = arr.length;
		int minJumps=minJumps(arr, size);
		if(minJumps<99)
		{
		System.out.println("Minimum number of jumps to reach end is="+minJumps);
		}
		else
			System.out.println("No able  to reach end");
	}
}