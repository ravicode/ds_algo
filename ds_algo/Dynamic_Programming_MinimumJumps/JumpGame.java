package Dynamic_Programming_MinimumJumps;
/*Leetcode: Jump Game. 
 Given an array of non-negative integers, you are initially positioned at the first index of the 
 array. 

 Each element in the array represents your maximum jump length at that position. 

 Determine if you are able to reach the last index.*/

public class JumpGame {

	static int arr[] = { 1, 2, 1, 1, 1 };

	public static void main(String[] args) {
		int len = arr.length - 1;
		int t = 0;
		int i = 0;
		int j = 0;
		int numOfJumps = 0;
		for (i = 0; i < len;) {
			j++;
			numOfJumps++;
			t = arr[i];
			while (t > 0) {
				i++;
				t--;
			}
			if (j >= len) {

				break;
			}
		}

		if (i >= len)
			System.out.println("yes , possible to reach last index in jumps="
					+ numOfJumps);
		else
			System.out.println("not possible to reach last index");
	}
}
