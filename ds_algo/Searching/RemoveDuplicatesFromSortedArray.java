package Searching;

import java.util.Arrays;

/*
 Given a sorted array with duplicates, move the distinct elements to the top 

 Ex: 1,1,2,3,4,4,5 -> 1,2,3,4,5*/
public class RemoveDuplicatesFromSortedArray {

	public static void main(String[] args) {
		int arr[] = { 1, 1, 2, 3, 4, 4, 4, 5 };
		int len = arr.length;
		int j = 0;

		int arr1[] = new int[arr.length];

		for (int i = 0; i < len; i++) {
			arr1[arr[i]]++;
		}

		for (int i = 0; i < len; i++) {
			if (arr1[i] > 0) {
				System.out.println(i);
				//arr1[i]--;
			}
		}

	}

}
