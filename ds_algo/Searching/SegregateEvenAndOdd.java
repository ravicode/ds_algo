package Searching;

import java.util.Arrays;

/*Given an array A[], write a function that segregates even and odd numbers. The functions should put all even numbers first, and then odd numbers. 

 Example
 Input = {12, 34, 45, 9, 8, 90, 3}
 Output = {12, 34, 8, 90, 45, 9, 3}*/

public class SegregateEvenAndOdd {

	void segregate() {

	}

	public static void main(String[] args) {

		int input[] = { 12, 34, 45, 9, 8, 90, 3 };
		// int Output[] = {12, 34, 8, 90, 45, 9, 3};

		
		int k = 0;
		for (int i = 0,j = input.length - 1; i < j;) {
			if (input[i] % 2 == 0) {
				i++;
			} else {
				int p = input[j];
				input[j] = input[i];
				input[i] = p;
				j--;
			}

		}

		System.out.println(Arrays.toString(input));
	}
}
