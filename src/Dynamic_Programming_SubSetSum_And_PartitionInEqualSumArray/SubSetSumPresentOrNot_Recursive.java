package Dynamic_Programming_SubSetSum_And_PartitionInEqualSumArray;

public class SubSetSumPresentOrNot_Recursive {
	
	
	public static  boolean findPresence(int start,int arr[],int target)
	{
		if(target==0)
			return true;
		if(start>=arr.length)
			return (target==0);
		
		
			return(findPresence(start+1, arr, target-arr[start])) || (findPresence(start+1, arr, target));
	
		
	}
	
	
	public static void main(String[] args) {
	
		int arr[]={ 2, 3, 7, 8, 10 };
		
		boolean f= findPresence(0, arr, 17);
		
		System.out.println(f);
	}

}
