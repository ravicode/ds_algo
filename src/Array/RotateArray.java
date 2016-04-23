package Array;

import java.util.Arrays;

// TC= ( number of rotations * array length )

public class RotateArray {

	

	static void rightRotate(int arr[],int d) {
		
		for (int rot = 0; rot < d; rot++) {
			int t = arr[0];
			int k = 0;
			for (k = 1; k < arr.length; k++) {

				int p = arr[k];
				arr[k] = t;
				t = p;

			}

			if (k == arr.length) {

				arr[0] = t;

			}
		}
		System.out.println(Arrays.toString(arr));
	}

	public static void main(String[] args) {

		RotateArray ra = new RotateArray();
		int arr[] = { 1, 2, 3, 4, 5, 6, 7 };
		ra.rightRotate(arr,2);
	}
}
