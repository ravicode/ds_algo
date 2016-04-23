package Sorting;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/*
 Given two arrays A1[] and A2[], sort A1 in such a way that the relative order 
 among the elements will be same as those are in A2. For the elements not present in A2, 
 append them at last in sorted order. 

 Input: A1[] = {2, 1, 2, 5, 7, 1, 9, 3, 6, 8, 8}
 A2[] = {2, 1, 8, 3}
 Output: A1[] = {2, 2, 1, 1, 8, 8, 3, 5, 6, 7, 9}

 * put all A1 is hashmap with no. of occurences
 * traverse thru and print as many time it is thr , remove no. from hashmap
 *
 */

public class SortAccordingToOrderGivenInAnotherArray {

	public static void main(String[] args) {
		int A1[] = { 2, 1, 2, 5, 7, 1, 9, 3, 6, 8, 8 };
		int A2[] = { 2, 1, 8, 3 };

		HashMap<Integer, Integer> mp = new HashMap<Integer,Integer>();

		for (int i = 0; i < A1.length; i++) {
			if (mp.containsKey(A1[i])) {
				mp.put(A1[i], mp.get(A1[i]) + 1);
			} else {
				mp.put(A1[i], 1);
			}
		}

		for (int i = 0; i < A2.length; i++) {
			int count = 0;
			if (mp.containsKey(A2[i])) {
				count = mp.get(A2[i]);

				print(A2[i], count);
				mp.remove(A2[i]);

			}
		}

		int arr[] = new int[mp.size()];

		int i = 0;

		for (Integer t : mp.keySet()) {
			arr[i] = t;
			i++;
		}
		/*
		 * for (Map.Entry<Integer, Integer> entry : mp.entrySet()) { arr[i] =
		 * entry.getKey(); i++; }
		 */

		Arrays.sort(arr);
		for (int k : arr) {

			System.out.println(k);
		}
	}

	static void print(int a, int c) {
		for (int i = 0; i < c; i++)
			System.out.println(a);
	}
}
