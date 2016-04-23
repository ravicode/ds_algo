package Sorting;

import java.util.Arrays;

public class InsertionSort {

	
	static void insertionSort(int arr[])
	{
		int j=0;
		//int n=0;
		for(int i=1;i<arr.length;i++)
		{
			
			int key=arr[i];
			j=i-1;
			while(j>=0 && arr[j]>key)
			{
				//n++;
				arr[j+1]=arr[j];
				j--;
				//System.out.println(Arrays.toString(arr));	
			}
			arr[j+1]=key;
			System.out.println(Arrays.toString(arr));
		}
		
		//sSystem.out.println("n="+n);
	}
	
	static void insertionSort1(int arr[])
	{
		//int j=0;
	int n=0;
		for(int i=1;i<arr.length;i++)
		{
			for(int j=0;j<i;j++)
			{
				
				if(arr[j]>arr[i])
				{
					n++;
					
					int temp=arr[j];
					arr[j]=arr[i];
					arr[i]=temp;
				}
			}
			
			
			System.out.println(Arrays.toString(arr));
		}
		System.out.println("n="+n);
	}
	
	
	public static void main(String args[])
	{
		int arr[]={6,3,8,1,9,2,4};
		
		insertionSort(arr);
		arr=new int[]{6,3,8,1,9,2,4};
		insertionSort1(arr);
		
		System.out.println(Arrays.toString(arr));
	}
}
