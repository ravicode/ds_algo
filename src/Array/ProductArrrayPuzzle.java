package Array;

import java.util.Arrays;

/*
 Given an array arr[] of n integers, construct a Product Array prod[] (of same size) 
 such that prod[i] is equal to the product of all the elements of arr[] except arr[i].
 Solve it without division operator and in O(n).

 Example:
 arr[] = {10, 3, 5, 6, 2}
 prod[] = {180, 600, 360, 300, 900}

 Algorithm:
 1) Construct a temporary array left[] such that left[i] contains product of all elements on left of arr[i] excluding arr[i].
 2) Construct another temporary array right[] such that right[i] contains product of all elements on on right of arr[i] excluding arr[i].
 3) To get prod[], multiply left[] and right[].*/

public class ProductArrrayPuzzle {

	public static void main(String[] args) {
		int arr[] = { 10, 3, 5, 6, 2 };
		int left[] = new int[arr.length];
		int right[] = new int[arr.length];
		int len=arr.length-1;
		left[0]=1;
		right[len-1]=1;
		
		for (int i = 1; i < arr.length; i++) {
			left[i]=arr[i-1]*left[i-1];
			

		}

		System.out.println(Arrays.toString(left));

		for (int i = len-2; i >=0; i--) {
			right[i]=arr[i+1]*right[i+1];

		}

		System.out.println(Arrays.toString(right));

		for (int i = 0; i < len; i++) {
			arr[i] = left[i] * right[i];
		}
		System.out.println(Arrays.toString(arr));
	}

}
