package Searching;

import java.util.Arrays;

//Given an array of (unsorted) integers, arrange them 
//such that a < b > c < d > e... etc.

public class ArrangeIncreasingDecreasing {

	public static void main(String[] args) {

		int arr[] = { 2, 3, 5, 1, 6, 7, 9, 0 };

		Arrays.sort(arr);
		for (int i = 0; i < arr.length - 3; i += 2) {

			int t = arr[i + 2];
			arr[i + 2] = arr[i + 1];
			arr[i + 1] = t;
		}

		display(arr);

	}

	public static void display(int a[]) {
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
	}

	public static void swapDigits(int a[], int i, int j) {
		int temp = a[i];
		a[i] = a[j];
		a[j] = temp;
	}
}
