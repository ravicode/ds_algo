package BinarySearch;

public class RotatedSortedArray_FindAnElementWithNoDuplicatesThroughPivot {

	/* Driver program to check above functions */
	public static void main(String[] args) {

		{
			// Let us search 3 in below array
			int arr[] = { 5, 6, 7, 8, 9, 10, 1, 2, 3 };
			int pivot = RotatedSortedArray_FindPivot_HowManyTimesSortedArrayIsRotated
					.findPivotIndex(arr, 0, arr.length - 1);
			int key = 8;
			int index = -1;
			if (key == arr[pivot]) {
				index = pivot;
			} else {
				if (key > arr[pivot] && key <= arr[arr.length - 1]) {
					index = BinarySearchIterative.findKey(arr, key, pivot + 1,
							arr.length - 1);

				} else
					index = BinarySearchIterative.findKey(arr, key, 0,
							pivot - 1);
			}
			System.out.println(index);
			// int key = 3;

		}
	}
}