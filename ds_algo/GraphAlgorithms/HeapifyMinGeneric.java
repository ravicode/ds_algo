package GraphAlgorithms;

import java.util.Arrays;
/*class Pair1
{
	Integer key;
	Character val;
	Pair1(Integer key,Character val)
	{
		this.key=key;
		this.val=val;
	}
	
}*/

public class HeapifyMinGeneric {
static int len; //=arr.length;
	static void makeHeap(Pair arr[], int i) { // logn
		int left = 2 * i + 1;
		int right = 2 * i + 2;
		int largest;
		if ((left < len) && (arr[left].key < arr[i].key)) {
			largest = left;
		} else
			largest = i;

		if ((right < len) && (arr[right].key < arr[largest].key)) {
			largest = right;
		}

		if (largest != i) {   //if left/right child is bigger than parent //this is for if root is already greater than its child
			swap(arr, largest, i);
			// System.out.println(Arrays.toString(arr));
			makeHeap(arr, largest); //now do heapification for child //it is to compare again with largest position child for cuent swapped value
		}

	}

	static void swap(Pair arr[], int largest, int i) {
		Pair t = arr[largest];
		arr[largest] = arr[i];
		arr[i] = t;
	}

	public static void main(String[] args) {
		Pair[] arr = new Pair[2];
		arr[0]=new Pair('A',4);
		arr[1]=new Pair('B',1);
		
		
		printHeap(arr);
	}

	 static Pair printHeap(Pair[] arr) {
		 len = arr.length;

		for (int i = (len - 1) / 2; i >= 0; i--) {

			makeHeap(arr, i);
		}
		
		

		//System.out.println(Arrays.toString(arr));
		//printArray(arr);
		
		Pair extracedMin= deleteMin(arr);
		/*deleteMin(arr);
		deleteMin(arr);
		deleteMin(arr);
		deleteMin(arr);
		deleteMin(arr);
		deleteMin(arr);
		deleteMin(arr);
		deleteMin(arr);
		deleteMin(arr);*/
		
		
		// for heapsort
		
	/*	for (int j =len; j > 0; j--)   
		 {  
			
		// logn // so total tc= nlogn
		 System.out.println(arr[0].key);
		 arr[0] = arr[j - 1];
		 len--;
		 makeHeap(arr, 0); 
		 
		 
		 }*/
		 
		//makeHeap(arr,0);
	//	 System.out.println(arr[0]);
		return extracedMin;
	}

	public static Pair deleteMin(Pair arr[])
	{
		System.out.println(arr[0].key);
		Pair temp=arr[0];
		//arr[len-1]=arr[0];
		arr[0]=arr[len-1];
	//	len--;
		/*for (int i = (len - 1) / 2; i >= 0; i--) {

			makeHeap(arr, i);
		}*/
		
		//System.out.println(Arrays.toString(arr));
		//printArray(arr);
		return  temp;
	}
	
	public static void printArray(Pair arr[])
	{
		for(int i=0;i<len;i++)
		{
			System.out.print(arr[i].key+",");
		}
		System.out.println();
	}
}
