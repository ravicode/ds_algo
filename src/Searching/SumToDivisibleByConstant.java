package Searching;

import java.util.Arrays;

//Check whether given array can be grouped in sets of pairs such that sum of each pair is 
//divisible by K.

public class SumToDivisibleByConstant {

	public static void main(String[] args) {

		int arr[] = { 2 ,4 ,5 ,6, 10, 15,  20 };

		Arrays.sort(arr); //  2 4 5 6 10 15  20 

		int key = 10;
		int s = 0;
		boolean f = false;

		for (int i = 0, j = arr.length - 1; i < j;) {

			s = arr[i] + arr[j];
			if (s % key == 0) {
				System.out.println("present"+arr[i]+" "+arr[j]);
				
			}

			if (s > 10)
				j--;
			else
				i++;

		}
		
	}
}
