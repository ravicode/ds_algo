package Sorting;

import java.util.Arrays;

public class ShellSort {

	static void shellSort(int arr[]) {
		int k=0;
		for (int inc = arr.length / 2; inc > 0; inc /= 2) 
		{
			//int inc=1;
			for (int i = inc; i < arr.length; i++) {
				for (int j = 0; j <= i; j += inc) {
					if (arr[i] > arr[j]) {
						int temp = arr[j];
						arr[j] = arr[i];
						arr[i] = temp;
						k++;
					}
				//	k++;
				}
			}
		}
		// System.out.println(arr[0]);
		System.out.println(k);
		System.out.println(Arrays.toString(arr));
	}

	public static void main(String[] args) {
		int[] arr = new int[] { 3, 2, 5, 4, 1,8,9,10 };
		shellSort(arr);

	}
}
