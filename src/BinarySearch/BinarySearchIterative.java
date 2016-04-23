package BinarySearch;

public class BinarySearchIterative {
	
	
	
	public static int findKey(int arr1[],int key1,int start,int end)
	{
		
		while(start<=end)
		{
			int mid=(start+end)/2;
			
			if(key1==arr1[mid])
				return mid;
			
			if(key1<arr1[mid])
			{
				end=mid-1;
			}
			else
			{
				start=mid+1;
			}
		}
		
		return -1;
		
	}
	
	
	public static void main(String[] args) {
		
		int arr[]= { 2,4,6,7,10,11,13,15,17};
		int key= 2;
		
		int pos= findKey(arr,key,0,arr.length-1);
		
		System.out.println("Position= "+pos + " and value= "+arr[pos]);
		
	}

}
