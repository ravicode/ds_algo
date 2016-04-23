package Searching_ArrangeElements;
import java.util.Arrays;

/*Given an array of positive and negative numbers, arrange them in an alternate fashion
 *  such that every positive number is followed by negative and vice-versa maintaining the order
 *   of appearance.
 Number of positive and negative numbers need not be equal. If there are more positive numbers 
 they appear at the end of the array. If there are more negative numbers, they too appear in the
  end of the array.

 Example: 

 Input:  arr[] = {1, 2, 3, -4, -1, 4}
 Output: arr[] = {-4, 1, -1, 2, 3, 4}*/

public class ArrangePositiveAndNegativeNumberMaintainingTheOrder {

	static void printAlterNate(int arr[], int n) {
		int k = 0;
		// int arr[] = {1, 2, 3, -4, -1, 4}
		for (int i = 0, j = n; i < j;) {

			if (arr[i] > 0) {

				if (arr[j] > 0) {
					j--;
				}

				if (arr[j] < 0 && j > i) {

					int t = arr[++i];
					arr[i] = arr[j];
					arr[j] = t;
					j = n;
				}

			} else if (arr[i] < 0) {

				if (arr[j] < 0) {
					j--;
				}

				if (arr[j] > 0) {
					int t = arr[++i];
					arr[i] = arr[j];
					arr[j] = t;
j=n;
				}
			}

		}

	}

	public static void main(String[] args) {
		int arr[] = { -2, 3, 4, 5, -1, -6, 7, 9, 1, -10, -13,-67,-89,1 };

		printAlterNate(arr, arr.length - 1);

		System.out.println(Arrays.toString(arr));
	}

}
