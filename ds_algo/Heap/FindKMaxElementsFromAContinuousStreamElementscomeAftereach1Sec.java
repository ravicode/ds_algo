package Heap;

import java.util.Arrays;

//for kth largest-  build a min heap of k largest elemtns and 0th element is the kth largest
//for kth smallest- build a max heap of k smallest elements and 0th element is the kth smallest

/*
 Heap operations*/
//find k largest

/*
 * 
 * 1) Build a Min Heap MH of the first k elements (arr[0] to arr[k-1]) of the given array. O(k)

 2) For each element, after the kth element (arr[k] to arr[n-1]), compare it with root of MH.
 ��a) If the element is greater than the root then make it root and call heapify for MH
 ��b) Else ignore it.
 // The step 2 is O((n-k)*logk)

 3) Finally, MH has k largest elements and root of the MH is the kth largest element.

 Time Complexity: O(k + (n-k)Logk) without sorted output.
 If sorted output is needed then O(k + (n-k)Logk + kLogk)


 */

/*
 * //create a heap of 10+1 elements ,
// will remove top element if it is less than new stream element
// and print rest three element bcoz top is always min, so max
// elements are at bottom.
 */

public class FindKMaxElementsFromAContinuousStreamElementscomeAftereach1Sec {

	/*
	 * void swap(int *a, int *b) {a = *a + *b;b = *a - *b;a = *a - *b; }
	 */

	static void minHeapify(int a[], int size, int i) {
		int left = 2 * i + 1;
		int right = 2 * i + 2;
		int smallest;
		if (left < size && a[left] < a[i])
			smallest = left;
		else
			smallest = i;
		if (right < size && a[right] < a[smallest])
			smallest = right;
		if (smallest != i) {

			{
				int t = a[i];
				a[i] = a[smallest];
				a[smallest] = t;
				minHeapify(a, size, smallest);
			}

		}
	}

	static void buildMinHeap(int a[], int size) {
		for (int i = size / 2; i >= 0; i--)
			minHeapify(a, size, i);
	}

	static int kthLargest(int a[], int size, int k) {
		int minHeap[] = new int[k];
		int i;
		for (i = 0; i < k; i++)
			minHeap[i] = a[i];

		buildMinHeap(minHeap, k);

		for (i = k; i < size; i++)
			if (a[i] > minHeap[0]) {
				minHeap[0] = a[i];
				buildMinHeap(minHeap, k);
			}
		System.out.println(Arrays.toString(minHeap));
		return minHeap[0];
	}

	public static void main(String[] args) {
		int a[] = { 6, 7, 8, 4, 2, 3, 5, 1 };
		int size = a.length;
		int k = 4;
		System.out.println(kthLargest(a, size, k));
		// created a min heap of 4 elements and when an element is greateer than
		// 0th position element, then replace it wll enext element

	}
}
