package Dynamic_Programming;

/*There are n stairs, a person standing at the bottom wants to reach the top.
 *  The person can climb either 1 stair or 2 stairs at a time. 
 *  Count the number of ways, the person can reach the top.

 */

// bottom up approach
//fibonaaci series DP problem
public class CountWaysToReachNthStair {

	// Returns number of ways to reach n'th stair
	static int step[];

	static int countWays(int n) {

		/*
		 * if (n <= 1) return 1;
		 */
		step[0] = step[1] = 1; // base cases
		if (step[n] != 0)
			return step[n];
		else
			step[n] = countWays(n - 1) + countWays(n - 2);

		return step[n];
	}

	// Driver program to test above functions
	public static void main(String[] args) {

		// int s = 4, m = 2;
		int numberofStairs = 5;
		step = new int[numberofStairs + 1];
		System.out.println("Nuber of ways =" + countWays(numberofStairs));
	}
}