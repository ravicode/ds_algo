package Searching_ArrangeElements;

import java.util.Arrays;

//Given an array of elements arrange the elements such that the odd elements are in the odd position and even elements are in the even position.

public class ArrangeOddAtOddAndEvenAtEven {

	static void arrange_SinglePass(int arr[]) {
		int n = arr.length - 1;
int count=0;
		for (int i = 0, j = n; i < j;) {
			count++;
			if (i % 2 == 0) {
				if (arr[i] % 2 == 0) {

					i++;
				} else {
					if (arr[j] % 2 == 0) {

						int t = arr[i];
						arr[i] = arr[j];
						arr[j] = t;
						i++;

					} else
						j--;

				}
			} else if (i % 2 == 1) {
				if (arr[i] % 2 == 1) {

					i++;
				} else {
					if (arr[j] % 2 == 1) {

						int t = arr[i];
						arr[i] = arr[j];
						arr[j] = t;
						i++;

					} else
						j--;

				}
			}
		}
		System.out.println(count);
		System.out.println("----single pass---------");
		System.out.println(Arrays.toString(arr));
	}

	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8,9,11,13,5,78,42 };
		System.out.println(Arrays.toString(arr));
		arrange_SinglePass(arr);

	}

}
