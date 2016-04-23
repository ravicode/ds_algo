package Heap;

import java.util.Arrays;

public class HeapifyMax {
static int len; //=arr.length;
	static void makeHeap(int arr[], int i) { // logn
		int left = 2 * i + 1;
		int right = 2 * i + 2;
		int largest;
		if ((left < len) && (arr[left] > arr[i])) {
			largest = left;
		} else
			largest = i;

		if ((right < len) && (arr[right] > arr[largest])) {
			largest = right;
		}

		if (largest != i) {   //if left/right child is bigger than parent //this is for if root is already greater than its child
			swap(arr, largest, i);
			// System.out.println(Arrays.toString(arr));
			makeHeap(arr, largest); //now do heapification for child //it is to compare again with largest position child for cuent swapped value
		}

	}

	static void swap(int arr[], int largest, int i) {
		int t = arr[largest];
		arr[largest] = arr[i];
		arr[i] = t;
	}

	public static void main(String[] args) {
		int[] arr = { 4, 1, 3, 2, 16, 9, 10, 14, 8, 7 };
		 len = arr.length;

		for (int i = (len - 1) / 2; i >= 0; i--) {

			makeHeap(arr, i);
		}
		
	
		
		/*for (int j =len; j > 0; j--)   
		 {  
			
		// logn // so total tc= nlogn
		 System.out.println(arr[0]);
		 arr[0] = arr[j - 1];
		 len--;
		 makeHeap(arr, 0); 
		 
		 
		 }*/
		 
		
	}


}
