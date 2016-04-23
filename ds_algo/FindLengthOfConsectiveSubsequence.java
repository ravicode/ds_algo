//we can sort this is descending order and then can add number 
// with multiplies by their positions values in arrays
import java.util.HashSet;
import java.util.Set;

public class FindLengthOfConsectiveSubsequence {

	// Returns length of the longest consecutive subsequence
	static int findLongestConseqSubseq(int arr[], int n) {
		Set<Integer> S = new HashSet<Integer>();
		int ans = 0;

		// Hash all the array elements
		for (int i = 0; i < n; ++i)
			S.add(arr[i]);

		// check each possible sequence from the start
		// then update optimal length
		for (int i = 0; i < n; ++i) {
			// if current element is the starting
			// element of a sequence
			if (!S.contains(arr[i] - 1)) {  //previous elements dosnt count again
				// Then check for next elements in the
				// sequence
				int j = arr[i];
				int count = 0;

				while (S.contains(j)) {
					count++;
					j++;
				}

				// update optimal length if this length
				// is more
				if (ans < count)
					ans = count;
			}
		}
		return ans;
	}

	// Testing program
	public static void main(String args[]) {
		int arr[] = { 3, 9, 5, 10, 4, 20, 2 };
		int n = arr.length;
		System.out.println("Length of the Longest consecutive subsequence is "
				+ findLongestConseqSubseq(arr, n));
	}
}
