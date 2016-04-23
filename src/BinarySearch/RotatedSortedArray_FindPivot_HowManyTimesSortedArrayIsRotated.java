package BinarySearch;

//YoutTube mycodSchool- good explanatin in interviewQuestionsPlaylist 
//rotated sorted array=circularly sorted array
// number of rotations = index of minimum element

// solution 1-  do linear seach, find minimum element and its index=  o(n)
//  o(logn)-

// this is same question as find pivot in sorted rotated array
public class RotatedSortedArray_FindPivot_HowManyTimesSortedArrayIsRotated {
	public static void main(String[] args) {
		int rotatedArray[]={11,12,15,18,2,5,6,8};// 2,5,6,8,11,12,15,18 - rotated anticlockwise(toward right) 4 times
		int index= findPivotIndex(rotatedArray,0,rotatedArray.length-1);
		if(index>=0)
		System.out.println("Pivot index="+index+"Pivot element="+rotatedArray[index]);
		else
			System.out.println("array is not rotated sorted");
	}
	
	public static int findPivotIndex(int arr[],int low,int high)
	{
		
		while(high>=low)
		{
		if(arr[low]<=arr[high])
			return low;
		int mid=low+(high-low)/2;
		int next= (mid+1)%arr.length;
		int previous= (mid+arr.length-1)%arr.length;
		
		if(arr[mid]<=arr[next] && arr[mid]<=arr[previous])
			return mid;
		
		if(arr[mid]<=arr[high])
			high=mid-1;  //to make it across pivot
		
		if(arr[low]<=arr[mid])
			low=mid+1;
		}
		return -1;
	}

}
