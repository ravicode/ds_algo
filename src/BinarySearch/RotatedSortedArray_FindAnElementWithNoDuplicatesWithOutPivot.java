package BinarySearch;

//YoutTube mycodSchool- good explanatin in interviewQuestionsPlaylist 

//1. array has to be strictly unique, and it shouldnt contain any duplicates bcoz if it contains duplicted ,
//it is nt possible to find which half is sorted.
// so if it contains duplicates, we ned to do linear search , that is the best we can do in this case.
public class RotatedSortedArray_FindAnElementWithNoDuplicatesWithOutPivot {

	public static void main(String[] args) {
		int sortedRotated[] = { 12, 14, 18, 21,22,24,26, 3, 6, 8, 9 };
		int index = findElement(sortedRotated, 8, 0, sortedRotated.length - 1);
		if (index > 0)
			System.out.println(index);
		else
			System.out.println("not present");
	}

	public static int findElement(int arr[], int key, int low, int high) {
		while (high >= low) {
			int mid = low + (high - low) / 2;
			if (arr[mid] == key)
				return mid;
			else {
				if (arr[mid] <= arr[high]) { // right half is sorted
					if (key > arr[mid] && key <= arr[high])
						low = mid + 1; // search is right sorted half
					else
						high = mid - 1;
				} else {
					if (arr[low] <= arr[mid]) { // left half is sorted
						if (key >= arr[low] && key < arr[mid])

							high = mid - 1; // search in left sorted half
						else
							low = mid + 1;

					}

				}
			}
		}

		return -1;
	}
}
