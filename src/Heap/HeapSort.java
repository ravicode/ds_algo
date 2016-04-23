package Heap;

public class HeapSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = { 4, 1, 3, 2, 16, 9, 10, 14, 8, 7 };
		//int len = arr.length;
		HeapifyMax.len=arr.length;
		for (int i = (HeapifyMax.len - 1) / 2; i >= 0; i--) {

			HeapifyMax.makeHeap(arr, i);
		}
		
		for (int j = HeapifyMax.len; j >0; j--) {

			// logn // so total tc= nlogn
			HeapifyMax.makeHeap(arr, 0);
			System.out.println(arr[0]);
			
			arr[0] = arr[j - 1];
			HeapifyMax.len--;
			
			

		}
	}

}
