package Searching_ArrangeElements;


import java.util.Arrays;

/*
 Given a set of integers, negative as well as non negative, You need to rearrange them such that negative and non negative integers at alternate positions.
 Constraints: order of all the negative and nonnegative integers must be the same as before if there are more negative integers, the integers in excess should occur at the end of the array and same goes for the non negative integers in case they are more in number. 

 eg: -5,-2,5,2,4,7,1,8,0,-8
 output: -5,5,-2,2,-8,4,7,1,8,0Again, for the input, you can use the above mentioned technique.

 */
public class ArrangeNegativeAndPositiveNumberAlternativelySinglePass_TwoPass {

	static void arrange_SinglePass(int arr[]) {
		int n = arr.length - 1;

		for (int i = 0, j = n; i < j;) {

			if (arr[i] > 0) {

				if (arr[j] > 0) {
					j--;
				}

				if (arr[j] < 0) {

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
					j = n;
				}
			}

		}
		System.out.println("----single pass---------");
		System.out.println(Arrays.toString(arr));
	}

	static void arrange_TwoIPass(int arr[]) {

		int k = 0;
		for (int i = 0, j = arr.length - 1; i < j;) {
			if (arr[i] > 0)
				i++;
			else {
				int t = arr[i];
				arr[i] = arr[j];
				arr[j] = t;
			}

			if (arr[j] < 0)
				j--;
			k = j;
		}
		System.out.println("\n\n\n");
		System.out.println("------positive then negatives--------");
		System.out.println(Arrays.toString(arr));
		for (int i = 1, j = k + 1; i <= k; i = i + 2, j = j + 2) {
			int t = arr[i];
			arr[i] = arr[j];
			arr[j] = t;

		}

		System.out.println();
		System.out.println("--------Alternate positive Negatives---------");

		System.out.println(Arrays.toString(arr));
	}

	public static void main(String[] args) {
		int arr[] = { -2, 3, 4, 5, -1, -6, 7, 9, 1, -10, -13 };
		System.out.println(Arrays.toString(arr));
		arrange_SinglePass(arr);
		arrange_TwoIPass(arr);
	}

}
