package SelectionAlgorithms_Medians;

/*
 * Find the mean and median of the elements which are dynamically added at runtime.
 * 
 * There is a stream of incoming integers, how would you maintain its median using a minHeap and a maxHeap.
(http://www.geeksforgeeks.org/median-of-stream-of-integers-running-integers/)
 
 *1. maxheap will contain all smallest numbers than minHeap
 *2. when n is even, maxheap=minheap - median=(minheap[0]+maxheap[0])/2
 *3. when n is odd, maxheap will contain 1 more elemen than minHeap and maxheap[0] is median
 */
import java.util.Arrays;

public class FindMedianFromStreamOfIntegers {

	public void heapifyMax(int arr[], int i) {
		int left = 2 * i + 1;
		int right = 2 * i + 2;
		int largest;

		if (left < arr.length && arr[left] > arr[i])
			largest = left;
		else
			largest = i;
		if (right < arr.length && arr[right] > arr[largest])
			largest = right;
		if (largest != i) {
			swap(arr, largest, i);
			heapifyMax(arr, largest);
		}
	}

	public void heapifyMin(int arr[], int i) {
		int left = 2 * i + 1;
		int right = 2 * i + 2;
		int smallest;

		if (left < arr.length && arr[left] < arr[i])
			smallest = left;
		else
			smallest = i;
		if (right < arr.length && arr[right] < arr[smallest])
			smallest = right;
		if (smallest != i) {
			swap(arr, smallest, i);
			heapifyMin(arr, smallest);
		}
	}

	public void swap(int arr[], int i, int j) {
		int t = arr[i];
		arr[i] = arr[j];
		arr[j] = t;
	}

	public static void main(String[] args) {
		FindMedianFromStreamOfIntegers fm = new FindMedianFromStreamOfIntegers();
		int arr[] = { 1, 2, 3, 4, 5, 6, 7 };

		
		int topMax = -1;
		int topMin = -1;
		int arrMaxHeap[] = { -99, -99, -99, -99 };
		int arrMinHeap[] = { 99, 99, 99, 99 };

		int k = 0;
		for (int i = 0; i < arr.length; i++) {
			if (topMax == -1) {
				arrMaxHeap[++topMax] = arr[i];
			
			} else {
				if (topMax <= topMin) {
					arrMaxHeap[++topMax] = arrMinHeap[0];
					arrMinHeap[0] = arr[i];

					for (k = (topMax) / 2; k >= 0; k--) {
						fm.heapifyMax(arrMaxHeap, k);

					}
					for (k = (topMin) / 2; k >= 0; k--) {
						fm.heapifyMin(arrMinHeap, k);

					}

				} else if (topMax > topMin) {
					arrMinHeap[++topMin] = arr[i];

				/*	for (k = (topMax) / 2; k >= 0; k--) {
						fm.heapifyMax(arrMaxHeap, k);

					}*/
					for (k = (topMin) / 2; k >= 0; k--) {
						fm.heapifyMin(arrMinHeap, k);

					}

					
				}
			}

			// Stream print one by one ..consider given array as stream of integers one by one 
			if (topMax > topMin)
				System.out.println(arrMaxHeap[0]);
			else {

				double med = (arrMaxHeap[0] / 1.0 + arrMinHeap[0]) / 2;
				System.out.println(med);
			}
		}



	}
}

//