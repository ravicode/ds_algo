package Heap;
import java.util.Arrays;

public class FindKSmallestElementByBubbleSort {
	static int k = 4;

	public static void main(String[] args) {
		int arr[] = { 90, 55, 5, 4, 30, 8, 9, 2, 89, 35, 21, 11 };

		findBubbleSort(arr, arr.length);
	}

	static void findBubbleSort(int arr[], int len) {
		for (int i = 0; i < k; i++) {
			for (int j = 0; j < len-1; j++) {

				if (arr[j] < arr[j+1]) {
					int t = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = t;
				}
			}

		}

		System.out.println(Arrays.toString(arr));
	}
}
