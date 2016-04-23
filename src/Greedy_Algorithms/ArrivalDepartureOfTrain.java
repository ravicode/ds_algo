package Greedy_Algorithms;
import java.util.Arrays;

/*)The arrival and departure time of trains are given. 
 * Find the minimum number of platforms to accommodate all the trains. 

 Eg.		Arrival 	Departure
 7		11
 8		10
 13		14
 4 		6
 Output:   2 */

// o(nlogn)

public class ArrivalDepartureOfTrain {

	int partition(int arr[], int left, int right) {
		int pivot = arr[right];
		int i = (left - 1);

		for (int j = left; j <= right; j++) {
			if (arr[j] <= pivot) {
				i++;

				int temp = arr[j];
				arr[j] = arr[i];
				arr[i] = temp;
				// swap (arr[i], arr[j]);

				/*
				 * temp = arrival[j]; arrival[j] = arrival[i]; arrival[i] =
				 * temp;
				 */}
		}
		/*
		 * int left=low,right=high; //int low=left; int pivot1=arr[low]; {
		 * 
		 * 
		 * while(left<right) { while(arr[left]<=pivot1) left++;
		 * 
		 * while(arr[right]>pivot1) right--; if(left<right) { int t=arr[left];
		 * arr[left]=arr[right]; arr[right]=t; } }
		 * 
		 * arr[low]=arr[right]; arr[right]=pivot1;
		 * 
		 * 
		 * }
		 */
		return (i);
	}

	/* A[] --> Array to be sorted, l --> Starting index, h --> Ending index */
	void quickSort(int A[], int left, int right) {
		if (left < right) {
			int pivot = partition(A, left, right); /* Partitioning index */
			System.out.println(Arrays.toString(A));
			quickSort(A, left, pivot - 1);
			quickSort(A, pivot + 1, right);
		}
	}

	public static void main(String[] args) {

		int arrival[] = { 7, 8, 13, 4 };
		int depart[] = { 11, 10, 14, 6 };

		ArrivalDepartureOfTrain adt = new ArrivalDepartureOfTrain();
		adt.quickSort(depart, 0, depart.length - 1);
		// System.exit(0);

		System.out.println(Arrays.toString(arrival));
		System.out.println(Arrays.toString(depart));

		int count = 1;
		for (int i = 0; i < depart.length - 1; i++) {
			if (depart[i] < arrival[i + 1]) {

				//continue;
			} else
				count++;
		}

		System.out.println("count=" + count);

	}

}
