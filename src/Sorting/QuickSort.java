package Sorting;
import java.util.Arrays;
import java.util.Random;


public class QuickSort {
	/*static int count=0;
	
	static int piv=0;
	*/
	public static void swap(int arr[],int pivotIndex, int right) 
    {
        int temp = arr[pivotIndex];
        arr[pivotIndex] = arr[right];
        arr[right] = temp;
    }
	int randomPartition(int arr[], int left, int right)  //its important for Sorted case worst time and to maintain a average time
	{
		
		Random rand = new Random();
        int pivotIndex = left + rand.nextInt(right - left + 1); //needed to produce for 6-10 left= 6+(10-6+1) =  6+ random(bet 0 to 4)
      //  System.out.println("left="+left+"ff="+rand.nextInt(right - left + 1));
        swap(arr,pivotIndex, right);
		
	
		int i= partition(arr, left, right);
		return i;
	}
	
	int partition(int arr[], int left, int right) {
		int pivot = arr[right];
		int i = (left - 1);

		for (int j = left; j <= right; j++) {
			if (arr[j] <= pivot) {
				i++;

				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
				// swap (arr[i], arr[j]);
			}
			
			//System.out.println(Arrays.toString(arr)+" "+count++);
		}
		/*{
			int temp = arr[right];
			arr[right] = arr[i + 1];
			arr[i + 1] = temp;

		}*/
		return (i);
	}

	/* A[] --> Array to be sorted, l --> Starting index, h --> Ending index */
	void quickSort(int A[], int left, int right) {
		if (left < right) {
			//int pivot = randomPartition(A, left, right); /* Partitioning index */
			int pivot = partition(A, left, right); /* Partitioning index */
			
			//System.out.println("piv="+pivot+"low="+left+"right="+right);
			quickSort(A, left, pivot - 1);
			quickSort(A, pivot + 1, right);
		}

	}

	public static int[] quickSortImpl(int arr[])
	{
		QuickSort q = new QuickSort();
		
		int len = arr.length - 1;
		q.quickSort(arr, 0, len);
		
		return arr;

	}
	public static void main(String[] args) {
		
	int arr[] = { 4, 7, 1,13, 12, 5,99,6 }; // (nlogn= 8log8=24)
		
		// int arr[] = { 1,2,3,4,5,6,7,8}; // sorted array , worst case of n2
		
		//int arr[] = { 8,7,6,5,4,3,2,1};

		quickSortImpl(arr);
		System.out.println(Arrays.toString(arr));
		
		
	}

}
