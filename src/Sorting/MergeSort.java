package Sorting;

//nice explanation youtube mycodeschool playlist

public class MergeSort {
	// static int[] numbers;
	// private int[] helper;

	private void mergesort(int numbers[], int low, int high) {
		// check if low is smaller then high, if not then the array is sorted
		if (low < high) {
			// Get the index of the element which is in the middle
			int middle = (low + high) / 2;
			// Sort the left side of the array
			mergesort(numbers, low, middle);
			// Sort the right side of the array
			mergesort(numbers, middle + 1, high);
			// Combine them both
			merge(numbers, low, middle, high);
		}
	}

	private void merge(int numbers[], int low, int middle, int high) {

		// Copy both parts into the helper array

		int[] helper = new int[numbers.length];
		for (int i = low; i <= high; i++) {
			helper[i] = numbers[i];
		}

		int i = low; // loop from low to middle
		int j = middle + 1; // loop from middle+1 to high
		int k = low;
		// Copy the smallest values from either the left or the right side back
		// to the original array
		while (i <= middle && j <= high) {
			if (helper[i] <= helper[j]) {
				numbers[k] = helper[i];
				i++;
			} else {
				numbers[k] = helper[j];
				j++;
			}
			k++;
		}
		// Copy the rest of the left side of the array into the target array, only 1 below of 2 whiles be executed
		while (i <= middle) {
			numbers[k] = helper[i];
			k++;
			i++;
		}

		// Copy the rest of the right side of the array into the target array
		while (j <= high) {
			numbers[k] = helper[j];
			k++;
			j++;
		}

	}

	public static void main(String[] args) {

		int numbers[] = new int[] { 45, 23, 11, 89, 77, 98, 4, 28, 65, 43 };
		MergeSort ms = new MergeSort();
		int len = numbers.length;
		ms.mergesort(numbers, 0, len - 1);

		for (int i = 0; i < len; i++) {
			System.out.print(numbers[i]+" ");
		}

	}
}
