package Searching;
//q-39 narsimha
public class FindPointFromWhereZeroStartsInTheInputStream {

	
	static int findPivot(int arr[],int left,int right)
	{
		
		if(left==right)
			return left;
		else
		{
			int mid=(left+right)/2;
			if(arr[mid]==0 && arr[mid-1]==1)
				return mid;
			else
				if(arr[mid]==0 && arr[mid-1]==0)
					return findPivot(arr,left,mid-1);
				else
					return findPivot(arr,mid+1,right);
			
		}
		
	}
	public static void main(String[] args) {
		int arr[]={1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};
		
		int left=0,right=1;
		try
		
		{
		while(arr[right]!=0)
		{
			left=0;
			right=right*2;
		}
		}
		catch(Exception e)
		{
			left=0;
			right=right/2;
		}
		System.out.println(findPivot(arr,left,right));
	}

}
