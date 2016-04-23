/*
 * Question:- 
 Given a sorted array (sorted in non-decreasing order) of positive numbers,
 find the smallest value that cannot be represented as sum of elements of any subset of given set.
 */



public class FindNumberWhichIsNotSubsetSum {

	// Returns the smallest number that cannot be represented as sum
	// of subset of elements from set represented by sorted array arr[0..n-1]
	static int findSmallest(int arr[], int n) {
		int res = 1; // Initialize result

		// Traverse the array and increment 'res' if arr[i] is
		// smaller than or equal to 'res'.
		for (int i = 0; i < n && arr[i] <= res; i++)
			res = res + arr[i];

		return res;
	}

	public static void main(String[] args) {

		int arr1[] = { 1, 3, 4, 5 };
		int n1 = arr1.length;
		System.out.println(findSmallest(arr1, n1));

		int arr2[] = { 1, 2, 6, 10, 11, 15 };
		int n2 = arr2.length;
		System.out.println(findSmallest(arr2, n2));

		int arr3[] = { 1, 1, 1, 1 };
		int n3 = arr1.length;
		System.out.println(findSmallest(arr3, n3));

		int arr4[] = { 1, 1, 3, 4 };
		int n4 = arr1.length;
		System.out.println(findSmallest(arr4, n4));

	}

}
