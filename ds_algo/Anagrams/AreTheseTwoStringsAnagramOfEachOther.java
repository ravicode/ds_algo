package Anagrams;

import java.util.Arrays;

/*Given two strings, find whether they are anagrams of each other. 
 * (too easy).
 Its here.. http://www.geeksforgeeks.org/check-whether-two-strings-are-anagram-of-each-other/

 */

//n logn --  by quicksort
// by count store in array - O(n)
public class AreTheseTwoStringsAnagramOfEachOther {
	public static void main(String[] args) {

		// int arr[]={4,2,1,3};

		boolean flag = true;

		String str1 = "accde";
		char arr1[] = str1.toCharArray();
		quickSort(arr1, 0, arr1.length - 1);
		String str2 = "cadec";
		char arr2[] = str2.toCharArray();
		quickSort(arr2, 0, arr2.length - 1);

		// System.out.println(arr[0]);
		System.out.println(Arrays.toString(arr1));
		System.out.println(Arrays.toString(arr2));

		for (int i = 0; i < arr1.length; i++) {
			if (arr1[i] != arr2[i]) {
				flag = false;
				break;
			}

		}

		if (!flag)
			System.out.println("not anagrams");
		else
			System.out.println("anagrams");
	}

	static void quickSort(char arr[], int left, int right) {
		if (left < right) {
			int pivot = partition(arr, left, right);
			quickSort(arr, left, pivot - 1);
			quickSort(arr, pivot + 1, right);
		}

	}

	static int partition(char arr[], int left, int right) {
		int pivot = arr[right];
		int i = left - 1;

		for (int j = left; j <= right; j++) {
			if (arr[j] <= pivot) {
				i++;

				char t = arr[j];
				arr[j] = arr[i];
				arr[i] = t;
			}
		}

		/*
		 * { int t=arr[right]; arr[right]=arr[i+1]; arr[i+1]=t; }
		 */
		return (i);
	}

}
