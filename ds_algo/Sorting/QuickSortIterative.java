package Sorting;

import java.util.Arrays;
import java.util.Stack;

public class QuickSortIterative {

	static int partition(int arr[], int l, int h) {
		int x = arr[h];
		int i = (l - 1);
		for (int j = l; j <= h - 1; j++) {
			if (arr[j] <= x) {
				i++;
				{
					int temp = arr[j];
					arr[j] = arr[i];
					arr[i] = temp;

				}
			}
		}

		{
			int temp = arr[h];
			arr[h] = arr[i + 1];
			arr[i + 1] = temp;

		}
		// System.out.println(Arrays.toString(arr));
		return (i + 1);

	} /* A[] --> Array to be sorted, l --> Starting index, h --> Ending index */

	static void quickSortIterative(int arr[], int l, int h) { // Create an
																// auxiliary
																// stack
		Stack<Integer> stack = new Stack<Integer>();
		// initialize top of stack
		// int top = -1; // push initial values of l and h to stack
		stack.push(l);
		stack.push(h);
		// Keep popping from stack while is not empty
		while (!stack.isEmpty()) { // Pop h and l
			h = stack.pop();
			l = stack.pop();
			// Set pivot element at its correct position in sorted array
			int p = partition(arr, l, h);
			// If there are elements on left side of pivot, then push left
			// side to stack
			if (p - 1 > l) {
				stack.push(l);
				stack.push(p - 1);
			} // If there are elements on right side of pivot, then push right
				// side to stack
			if (p + 1 < h) {
				stack.push(p + 1);
				stack.push(h);
			}
		}
	}

	// Driver program to test above functions
	public static void main(String[] args) {
		int arr[] = { 4, 3, 5, 2, 1, 3, 2, 3 };
		int n = arr.length;
		quickSortIterative(arr, 0, n - 1);
		System.out.println(Arrays.toString(arr));
	}

}
