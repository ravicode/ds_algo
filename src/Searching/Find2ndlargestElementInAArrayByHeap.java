package Searching;

/*
 * Find the second largest element in an array.
 */

//max heap 
public class Find2ndlargestElementInAArrayByHeap {
	
	
	static int len;
	static void makeHeap(int arr[],int i)
	{
		int left=2*i+1;
		int right=2*i +2;
		int largest;
		if((left<len)  && arr[left]>arr[i])
			largest= left;
		else
			largest=i;
		
		if((right<len)  && arr[right]>arr[largest])
			largest= right;
		
		if(largest!=i)
		{
			swap(arr,largest,i);
			makeHeap(arr,i);
		}
		
		
	}
	
	static void swap(int arr[],int largest,int i)
	{
		int t=arr[largest];
		arr[largest]=arr[i];
		arr[i]=t;
	}
	
	
	public static void main(String[] args) {
		int arr[]={4,7,88,120,5,98};
		len=arr.length;
		for(int i=(len-1)/2;i>=0;i--)
		{
			makeHeap(arr,i);
		}
		int len1=len;
		for(int i=0;i<len1;i++)
		{
		System.out.println(arr[0]);
		arr[0]=arr[len-1];
		len--;
		makeHeap(arr,0);
		}
	}

}
