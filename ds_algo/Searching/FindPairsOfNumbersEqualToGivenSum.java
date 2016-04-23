package Searching;


/*
 Given a sorted array a[] find the pairs of number that add up to x.
 For eg: a[]={1,2,4,5,8,15,18,22} x=20
 Output: (2,18) , (5,15)*/

/*
 * /*
 * Given an integer array find two numbers with sum equal to K.
one more question�

o(nlogn) o(1)sorted array
o(n)  o(n)  hashmap
 */
 

public class FindPairsOfNumbersEqualToGivenSum {

	public static void main(String[] args) {
		int a[] = { 1, 2, 4, 5, 8, 15, 18, 22 };
		int x = 20;
		for (int i = 0, j = a.length - 1; i <= j;) {
			int sum = a[i] + a[j];
			if (sum == x) {
				System.out.println("(" + a[i] + "," + a[j] + ")");
				i++;
				j--;
			} else {
				if (sum > x)
					j--;
				else
					i++;
			}

		}
	}

}
