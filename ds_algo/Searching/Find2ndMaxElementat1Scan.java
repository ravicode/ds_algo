package Searching;

/*
 1. Logical question. Given a prime number �p�. Prove that p^2-1 is always divisible by 24.
 2. Find 2nd maximum element in a given array in one iteration. 
 */
public class Find2ndMaxElementat1Scan {

	public static void main(String[] args) {

		int arr[] = { 1, 54, 8, 99, 84, 23 };

		int max = 0, max1 = 0;
		for (int i = 0; i < arr.length; i++) {
		
			if (arr[i] > max) {
				max1 = max;
				max = arr[i];

			} else {
				if (arr[i] > max1)
					max1 = arr[i];
			}

		}

		System.out.println(max1);
	}

}
