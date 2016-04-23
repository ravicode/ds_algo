package BinarySearch;
//YoutTube mycodSchool- good explanatin in interviewQuestionsPlaylist 

//Question- Find First And Last Occurence Of A Number in Sorted Rotated Array With Duplicates
public class FindOccurencesInSortedArray_1st_way_imp {

	public static void main(String[] args) {
		
		int arr[]={ 4, 4, 4, 5, 5, 5,5,5,5,5,5,5,5, 6, 7, 8, 9, 9 };//{1,5,8,9,9,9};
		boolean searchFirst=true;  // true to find first occurence
		int firstIndex= findOccurenc(arr,5,0,arr.length-1,searchFirst);
		searchFirst=false;   
		int lastIndex= findOccurenc(arr,5,0,arr.length-1,searchFirst);
		System.out.println(firstIndex);
		System.out.println(lastIndex);
		System.out.println("Number of occurences="+(lastIndex-firstIndex+1));
	}
	
	static public int findOccurenc(int arr[],int key,int low,int high,boolean searchFirst)
	{
		int result=-1;
		while(high>=low)
		{
		
			int mid=low+(high-low)/2;
			
			if(arr[mid]==key)
			{
				result= mid;
				if(searchFirst)
				high=mid-1;
				else
					low=mid+1;
			}
			else
			{
				if(key<arr[mid])
					high=mid-1;
				else
					low=mid+1;
			}
			
			
		}
		
		return result;
	}
}
