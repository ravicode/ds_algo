package BinarySearch;

public class FindOccurencesInSortedArray_2nd_way {

	static int findfirst(int arr[], int start, int end, int no) {
		while (start <= end) {
			
			int mid = (start + end) / 2;
			if ((mid == start && arr[mid] == no || arr[mid] > arr[mid - 1])
					&& arr[mid] == no) {
				// System.out.println("no found i");
				return mid;
			} else if (no > arr[mid])
				start = mid + 1;
			else
				end = mid - 1;

		}

		return -1;

	}

	static int findlast(int arr[], int start, int end, int no) {
		while (end >= start) {
			int mid = (start + end) / 2;
			if ((mid == end && arr[mid] == no || arr[mid] < arr[mid + 1])
					&& arr[mid] == no)
				return mid;
			else if (no < arr[mid])
				end = mid - 1;
			else
				start = mid + 1;
		}

		return -1;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]={ 4, 4, 4, 5, 5, 5,5,5,5,5,5,5,5, 6, 7, 8, 9, 9 };//{1,5,8,9,9,9};
		int num = 5;
		int i = findfirst(arr, 0, arr.length - 1, num);
		int j = findlast(arr, 0, arr.length - 1, num);
		int nn = j - i + 1;
		System.out.println("occ=" + nn);

	}

}