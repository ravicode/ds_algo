package Dynamic_Programming_SubSetSum_And_PartitionInEqualSumArray;

/*
 * Question:- 
 * /*
 Partition problem is to determine whether a given set can be partitioned into 
 two subsets such that the sum of elements in both subsets is same. 
 */
 
//http://www.geeksforgeeks.org/dynamic-programming-set-18-partition-problem/

public class IsArrayDividePossibleIn2EqualSumParts_PartitionProblem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[] = { 1, 5, 9, 5, 2};
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}

		if (sum % 2 == 0) {
			int sumPresent = sum / 2;

			boolean isPossible = SubSetSumPresentOrNot.printMatrix(arr,
					sumPresent);

			if (isPossible)
				System.out.println("yes, this half sum is present");
			else
				System.out.println("No, this half sum is not present");

		} else
			System.out
					.println("Not possible to divide array in 2 equal sum parts , sum is odd");

	}

}
