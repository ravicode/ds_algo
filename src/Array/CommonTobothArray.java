package Array;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

//Write a program to read the integers 24, 16, 86, 65, 42, 38, 82 into one array and 
//the integers 86, 55, 42, 18, 99, 32, 64, 11 into another array 
//and print one array that contain only those integers that are common to both the array.

public class CommonTobothArray {

	public static void main(String[] args) {

		/*
		 * int a1[]={24, 16, 86, 65, 42, 38, 82}; int a2[]={86, 55, 42, 18, 99,
		 * 32, 64, 11};
		 */
		int a1[] = { 1, 2, 3, 7, 9, 82 };
		int a2[] = { 2, 7, 9, 11, 12, 17,19,23,82 };

		Set<Integer> st=commonToBoth1(a1, a2);
		//System.out.println(Arrays.toString(arr));
		
		//System.out.println(s);
	}

	static Set<Integer> commonToBoth1(int ar1[], int ar2[]) {
		int a1 = ar1.length;
		int a2 = ar2.length;
		int count1 = 0, count2 = 0;
		Set<Integer> st =new HashSet<Integer>();
		int arr[] = new int[10];
		int k = 0;
		while (a1 > count1 && a2 > count2) {
			if (ar1[count1] == ar2[count2]) {
				arr[k++] = ar1[count1];
				st.add(ar1[count1]);
				count1++;
				count2++;
			} else {
				if (ar1[count1] < ar2[count2])
					count1++;
				else if (ar2[count2] < ar1[count1])
					count2++;

			}

		}
		System.out.println(Arrays.toString(arr));

		return st;
		//

	}
}