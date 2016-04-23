package Array;

public class LargestSumInContiguousArrays_KandaneAlgo {
	
	private int arr[] = { -5, 4, 3, 9, -20, -5, 7, 8, 6 ,-10};
	
	public void kandane()
	{
		int len=arr.length;
		int current=0,max=0;
		int start=0,end=0;
		
		for(int i=0;i<len;i++)
		{
			
			current+=arr[i];
			if(start==0)
				start=i;
			
			if(current<0)
			{
				current=0;
				start=0;end=0;
			}
			else if(current>max)
			{
				max=current;
				
				end=i;
			}
		}
		
	
			System.out.println(max);
			
			System.out.println("Start Index="+start+"End Index="+end);
	}
	
	public static void main(String[] args) {
		
		LargestSumInContiguousArrays_KandaneAlgo kan=
				new LargestSumInContiguousArrays_KandaneAlgo();
		
		kan.kandane();
		
	}

}
