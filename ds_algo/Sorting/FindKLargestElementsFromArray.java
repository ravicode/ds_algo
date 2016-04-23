package Sorting;

//Given an array A[N] where N is very large, 
//find the highest 50 elements and analyse the complexity. 

//Mthod 1.here solved thru bubbleSort ...complexity  o(kn)  
//here solved for k=3 largest elements

/*Method 2(Use Sorting)
 1) Sort the elements in descending order in O(nLogn)
 2) Print the first k numbers of the sorted array O(k).

 Time complexity: O(nlogn)

 Method 3 (Use Max Heap)
 1) Build a Max Heap tree in O(n)
 2) Use Extract Max k times to get k maximum elements from the Max Heap O(klogn)

 Time complexity: O(n + klogn)*

 Method:4 (Use Min Heap)
 t.C - O(k + (n-k)logk)

 */

public class FindKLargestElementsFromArray {

	public static void bubbleSrt(int arr1[]) {
		int len = arr1.length - 1;
		int kLargest = 3;
		int temp = 0;
		
		for (int k = 0; k < kLargest; k++) {
			for (int i = 0; i < len - k; i++) {
				if (arr1[i] > arr1[i + 1]) {
					temp = arr1[i];
					arr1[i] = arr1[i + 1];
					arr1[i + 1] = temp;
				}

			}
		}
		display(arr1);
	}

	public static void display(int arr2[]) {
		int len = arr2.length;

		for (int i = 0; i < len; i++) {
			System.out.println(arr2[i]);
		}

	}

	public static void main(String[] args) {

		int arr[] = { 2, 13, 11, 4, 15, 6, 17, 10, 7 };
		int key = 6;

		bubbleSrt(arr);

	}

}
