package Searching_ArrangeElements;

import java.util.Arrays;

/*2.) You are given an array of both negative and positive integers. 
 * You need to rearrange the array such that positive and negative numbers alternate.
 *  Also, the order should be same as previous array and only O(1) auxiliary space can 
 *  be used and time complexity boundation O(n).
 eg. -2 3 4 5 -1 -6 7 9 1
 result � 3 -2 4 -1 5 -6 7 9 1.*/
//do it again

public class ArrangePositiveAndNegativeinAlternativelyInOnTime {

	public static void main(String[] args) {

		int arr[] = { -2, 3, 4, 5, -1, -6, 7, 9, 1, -10, -13,-67,-89,1 };
		int count = 0;
		for (int i = 0, j = arr.length - 1; i < j;) {
			count++;
			if (i % 2 == 0) {
				if (arr[i] < 0)
					i++;
				else {
					if (arr[j] < 0) {
						int t = arr[i];
						arr[i] = arr[j];
						arr[j] = t;
						i++;
						
					} else
						j--;
				}

			}

			else if (i % 2 == 1) {
				if (arr[i] > 0)
					i++;
				else {
					if (arr[j] > 0) {
						int t = arr[i];
						arr[i] = arr[j];
						arr[j] = t;
						i++;
						

					}else
						j--;
				

				}

			}

		}
		System.out.println(count);
		System.out.println(Arrays.toString(arr));

	}

}
