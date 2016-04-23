package Sorting_Merge_Sorted_Arrays_LL;

import java.util.Arrays;
import java.util.HashMap;
/*
Given k sorted arrays of different or equal sizes,

 merge them into a single sorted array*/

/**
 * 
 * 
 * 
 * @author Ravi
 * A simple solution is to create an output array of size n*k and one by one copy all 
 * arrays to it. Finally, sort the output array using any O(nLogn) sorting algorithm. 
 * This approach takes O(nkLognk) time. 

We can merge arrays in O(nk*Logk) time using Min Heap. Following is detailed algorithm.

1. Create an output array of size n*k.
2. Create a min heap of size k and insert 1st element in all the arrays into a the heap
3. Repeat following steps n*k times.
       a) Get minimum element from heap (minimum is always at root) and store it in output array.
      b) Replace heap root with next element from the array from which the element is extracted.
       If the array doesn�t have any more elements, then replace root with infinite. 
       After replacing the root, heapify the tree.

 *
 */
public class MergeKSortedArraysIntoASingleOne {
	static int len=3;
	static void makeHeap(int arr[], int i) { // logn
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
	public static void main(String[] args) {
		int arr1[]={2, 6, 12, 35};
				int arr2[]= {1, 9, 20, 1000};
				int arr3[]= {23, 34, 90, 2000};
				
				HashMap<Integer, Integer> mp=new HashMap<Integer, Integer>();
				
				for(int i=0;i<arr1.length;i++)
				{
					mp.put(arr1[i], 1);
				}
				for(int i=0;i<arr2.length;i++)
				{
					mp.put(arr2[i], 2);
				}
				for(int i=0;i<arr3.length;i++)
				{
					mp.put(arr3[i], 3);
				}
				
				int heap[]=new int[3];
				
				
				int i1=0,i2=0,i3=0;
			heap[0]=arr1[0]; heap[1]=arr2[0]; heap[2]=arr3[0];
			
			
				for (int i = (len - 1) / 2; i >= 0; i--) {

					makeHeap(heap, i);
				}
				
				for(int i=0;i<12;i++)
				{
					if(i<8)
					{
					System.out.println(heap[0]);
					int ar=mp.get(heap[0]);
					
					if(ar==1 && i1<3)
						heap[0]=arr1[++i1];
					if(ar==2 && i2<3)
						heap[0]=arr2[++i2];
					if(ar==3 && i3<3)
						heap[0]=arr3[++i3];
					
					
					makeHeap(heap, 0);
					}
				}
		
				System.out.println(Arrays.toString(heap));
		//int output[]=new int[12];

	}

}


class MinHeapNode
{
    int element; // The element to be stored
    int i; // index of the array from which the element is taken
    int j; // index of the next element to be picked from array
}

