package Searching;

import java.util.HashMap;

public class FindMajorityElement {

	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 4, 5, 6, 2, 7, 2, 2, 2, 8, 2, 9, 2 };

		findMajority(arr);
		findMajorityElementByHashMap(arr);
	}

	static void findMajorityElementByHashMap(int arr[]) {
		HashMap<Integer, Integer> mp = new HashMap<Integer, Integer>();
		int len = arr.length;
		int i = 0;
		for (i = 0; i < len; i++) {
			if (mp.containsKey(arr[i])) {
				mp.put(arr[i], mp.get(arr[i]) + 1);

				if (mp.get(arr[i]) == len / 2)
					break;

			} else
				mp.put(arr[i], 1);

		}

		System.out.println("Majority Element=" + arr[i]);
	}

	static void findMajority(int arr[]) {
		int c = 0, ele = 0;

		for (int i = 0; i < arr.length; i++) {
			if (c == 0) {
				ele = arr[i];
				c = 1;
			} else if (arr[i] == ele) {
				c++;

			} else {
				c--;
			}
		}

		System.out.println(ele);
	}

}
