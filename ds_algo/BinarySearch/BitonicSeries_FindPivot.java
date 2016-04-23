package BinarySearch;

//q-37 narsimha

public class BitonicSeries_FindPivot {

	static int findPivotinBitonic(int arr[], int left, int right) {
		if (left == right)
			return left;
		else if (left == right - 1) {
			if (arr[left] >= arr[right])

				return left;
			else
				return right;

		} else {
			if (right > left) {
				int mid = (left + right) / 2;
				// /System.out.println("1");
				if (arr[mid - 1] < arr[mid] && arr[mid] > arr[mid + 1])
					return mid;
				else if (arr[mid - 1] < arr[mid] && arr[mid] < arr[mid + 1])
					return findPivotinBitonic(arr, mid + 1, right);
				else if (arr[mid - 1] > arr[mid] && arr[mid] > arr[mid + 1])
					return findPivotinBitonic(arr, left, mid - 1);
			}
		}
		return -1;

	}

	public static void main(String[] args) {
		int arr[] = { -5, -3, -2, 0, 4, 5, 10, 11, 9, 7, 0 };

		int index = findPivotinBitonic(arr, 0, arr.length - 1);
		if (index > 0)
			System.out.println("bitonic pivot=" + arr[index]);
		else
			System.out.println("not present");
	}

}
