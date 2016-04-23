package Sorting;

public class SelecSort1 {

	/**
	 * @param arr1
	 */
	public static void selecSrt(int arr1[]) {
		int len = arr1.length;

		for (int i = 0; i < len - 1; i++) {
			int min = i;

			for (int j = i + 1; j < len; j++) {

				if (arr1[min] > arr1[j]) {
					min = j;

				}

			}

			int t = arr1[i];
			arr1[i] = arr1[min];
			arr1[min] = t;
		}

		// System.out.println(arr1[0]);
		display(arr1);
	}

	public static void display(int arr2[]) {
		int len = arr2.length;

		for (int i = 0; i < len; i++) {
			System.out.println(arr2[i]);
		}

	}

	public static void main(String[] args) {

		int arr[] = { 2, 11, 4, 13, 15, 6, 7, 1, 10, 17 };

		selecSrt(arr);

	}

}
