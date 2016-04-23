package Array;

/*Discussion on heap and stack.
5. Code : Maximum subarray sum.
6. Os concepts : What is semaphore? Brief explanation on wait() and signal() operation.*/



public class MaxSubArraySum {
	private int arr[] = { -5, 4, 3, 9, -5, 7, 8, 6 };
	
	public void kandane()
	{
		int len=arr.length;
		int current=0,max=0;
		
		
		for(int i=0;i<len;i++)
		{
			
			current+=arr[i];
			
			if(current<0)
				current=0;
			else if(current>max)
				max=current;
		}
		
	
			System.out.println(max);
	}
		public static void main(String[] args) {
		
		MaxSubArraySum kan=
				new MaxSubArraySum();
		
		kan.kandane();
		
	}
}
