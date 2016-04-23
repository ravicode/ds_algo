package BinarySearch;

/*1. An array is given in which elements are first monotonically 
 * increasing and then 
 decreasing.
 Search an element in the array. 
 Working code was asked which takes care 
 of all the 
 edge cases. 
 Also asked the time complexity of the code.*/

//TC =  0(2logn)

public class BitonicSeries_FindElement {

	static int findElementIncreasing(int arr[], int left, int right, int element) {
		if (right >= left) {
			int mid = (left + right) / 2;
			if (arr[mid] == element)
				return mid;
			else if (arr[mid] < element)
				return findElementIncreasing(arr, mid + 1, right, element);
			else
				return findElementIncreasing(arr, left, mid - 1, element);
		}
		return -1;

	}

	static int findElementDecreasing(int arr[], int left, int right, int element) {
		if (right >= left) {

			int mid = (left + right) / 2;
			if (arr[mid] == element)
				return mid;
			else if (arr[mid] < element)
				return findElementDecreasing(arr, left, mid - 1, element);

			else

				return findElementDecreasing(arr, mid + 1, right, element);
		}
		return -1;

	}

	public static void main(String[] args) {

		int arr[] = { 3, 6, 8, 16, 17, 18, 10, 9 };
		int element = 10;

		int ele = 0;

		int pivot = BitonicSeries_FindPivot.findPivotinBitonic(arr, 0,
				arr.length - 1);

		System.out.println("Pivot Element=" + arr[pivot]);

		if (element == arr[pivot]) {
			System.out.println("Element found at positon=" + pivot);
		} else {

			if (element > arr[0] && element < arr[pivot])
				ele = findElementIncreasing(arr, 0, pivot - 1, element);
			if (ele == -1)
				ele = findElementDecreasing(arr, pivot + 1, arr.length - 1,
						element);
			if (ele >= 0)
				System.out.println("Element found at positon=" + ele);
			else
				System.out.println("No element found");
		}

	}

}
