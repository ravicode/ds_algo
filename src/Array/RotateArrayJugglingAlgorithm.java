package Array;

//http://www.geeksforgeeks.org/array-rotation/
// 2 types of rotate-  1) rightRotate   2)left Rotate

import java.util.Arrays;

public class RotateArrayJugglingAlgorithm {
	

	int gcd(int a, int b) {
		if (b == 0)
			return a;
		else
			return gcd(b, a % b);
	}

	void leftRotate(int arr[],int d) {
		int n=arr.length;
		int i, j, k, temp;
		for (i = 0; i < gcd(d, n); i++) { /* move i-th values of blocks */
			temp = arr[i];
			j = i;
			while (true) {
				k = j + d;   // first 0 + d  position
				if (k >= n)
					k = k - n;  // when left most  d elements has to shift at right
				if (k == i)
					break;
				arr[j] = arr[k];  // replace 0th with 0+d   , then 0+d  with 0+2d ....and so on 
				j = k;
			}
			arr[j] = temp;
		}
		System.out.println(Arrays.toString(arr));
		} /* UTILITY FUNCTIONS *//* function to print an array */

	public static void main(String[] args) {

		RotateArrayJugglingAlgorithm ra = new RotateArrayJugglingAlgorithm();
		
		int arr[] = { 1, 2, 3, 4, 5,6,8,9,10,11,12};
		ra.leftRotate(arr,2);
		
		//RotateArray.rightRotate(arr,2);
		
		
	}
	
	
}
