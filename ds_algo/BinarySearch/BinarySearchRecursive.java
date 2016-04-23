package BinarySearch;
import java.util.Arrays;

import Sorting.QuickSort;


public class BinarySearchRecursive {
	
	int binary(int arr[],int left,int right,int data)
	{
		if(left<=right)
		{
			int mid=(left+right)/2;
			if(arr[mid]==data)
				return mid;
			else
				if(arr[mid]>data)
					return binary(arr,left,mid-1,data);
				else
					return binary(arr,mid+1,right,data);
			
		}
		
		return -1;
	}
	
	public static void main(String[] args) {
		int arr[] = { 4, 6, 5, 88, 1, 2, 0,10 };
		arr=QuickSort.quickSortImpl(arr);
		System.out.println(Arrays.toString(arr));
		BinarySearchRecursive bs=new BinarySearchRecursive();
		int data=85;
		int len = arr.length - 1;
		
	int pos=bs.binary(arr,0,len,data);
	if(pos==-1)
	{
	System.out.println("Element not present");
	}
	else
	System.out.println("pos="+pos +"  data="+arr[pos]);
	}

}
