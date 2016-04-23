package Heap;

import java.util.NoSuchElementException;

public class HeapifyMin {
	int len;
	int arrHeap[];
	int totalCount;

	/** Check if heap is full **/

	public boolean isFull()

	{

		return len == totalCount;

	}

	/** Clear heap */

	public void makeEmpty()

	{

		len = 0;

	}

	public int delete(int ind)

	{

		if (isEmpty())

			throw new NoSuchElementException("Underflow Exception");

		int keyItem = arrHeap[ind];

		arrHeap[ind] = arrHeap[len - 1];

		len--;

		for (int i = (len - 1) / 2; i >= 0; i--) {

			makeHeap(arrHeap, i);
		}

		return keyItem;

	}

	public boolean isEmpty() {
		if (len == 0)
			return true;

		return false;
	}

	public HeapifyMin(int length) {
		len = length;
		arrHeap = new int[len];
		totalCount = len;
	}

	void makeHeap(int arr[], int i) { // logn
		int left = 2 * i + 1;
		int right = 2 * i + 2;
		int largest;
		if ((left < len) && (arr[left] < arr[i])) {
			largest = left;
		} else
			largest = i;

		if ((right < len) && (arr[right] < arr[largest])) {
			largest = right;
		}

		if (largest != i) {
			swap(arr, largest, i);
			// System.out.println(Arrays.toString(arr));
			makeHeap(arr, largest);
		}

	}

	static void swap(int arr[], int largest, int i) {
		int t = arr[largest];
		arr[largest] = arr[i];
		arr[i] = t;
	}

	int k = 0;

	public void insertHeap(int node, String update) {
		if (update.equals("u"))
			k--;
		arrHeap[k++] = node;

		len = k;
		for (int i = (len - 1) / 2; i >= 0; i--) { // n

			makeHeap(arrHeap, i); // logn
		}
		len = totalCount;
	}

	public static void main(String[] args) {

		int[] arr = { 4, 1, 3, 2, 16, 9, 10, 14, 8, 7 };
		HeapifyMin hMin = new HeapifyMin(arr.length);

		for (int i = 0; i < hMin.totalCount; i++)
			hMin.insertHeap(arr[i], "");
		// System.out.println("heap array");
		// hMin.printArray(hMin.arrHeap);
		System.out.println("HEAP SORT");
		hMin.heapSort();

	}

	public void heapSort() {
		for (int i = 0; i < k; i++) {
			int min = deleteMin();
			System.out.println(min);
		}
	}

	public int getMinimum() {
		int min = arrHeap[0];
		for (int i = (len - 1) / 2; i >= 0; i--) {

			makeHeap(arrHeap, i);
		}
		return min;

	}

	public int deleteMin() {
		int min = arrHeap[0];

		arrHeap[0] = arrHeap[len - 1];

		len--;
		for (int i = (len - 1) / 2; i >= 0; i--) {

			makeHeap(arrHeap, i);
		}
		return min;

	}

	public void printArray(int arr[]) {
		for (int i = 0; i < len; i++) {
			System.out.print(arr[i] + ",");
		}
		System.out.println();
	}
}
