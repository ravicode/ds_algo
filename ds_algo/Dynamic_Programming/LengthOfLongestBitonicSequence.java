package Dynamic_Programming;

import java.util.Arrays;

public class LengthOfLongestBitonicSequence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[]={2,-1,4,3,5,-1,3,2};
		int arrReverse[]=reverse(arr);    //reverse it so that it can be passes to LIS method
		
		//System.out.println(Arrays.toString(arr));
		//System.out.println(Arrays.toString(arrReverse));
		int arrLeftToRight[]=LengthOfLongestIncreasingSubsequence.findLIS(arr);  //
		
		int arrRightToLeft[]=LengthOfLongestIncreasingSubsequence.findLIS(arrReverse);
		int arrRightToLeftReverese[]=reverse(arrRightToLeft);//  //reverse it so that it will be LIS calculated from right to left
		
		System.out.println("LIS Left to RIGHT");
		System.out.println(Arrays.toString(arrLeftToRight));
		
		System.out.println("LIS Right to Left");
		System.out.println(Arrays.toString(arrRightToLeftReverese));
		int maxLength=0;
		for(int i=0;i<arr.length;i++)
		{
			if(arrLeftToRight[i]+arrRightToLeftReverese[i]-1>maxLength)  //add LIS lefttoRight wth LIS right to left and subtract -1 for common value
			{
				maxLength=arrLeftToRight[i]+arrRightToLeftReverese[i]-1;
			}
		}
		
		System.out.println("Length of longest bitonic sequenc="+maxLength);
	}
	
	
	static int[] reverse(int arr[])
	{
		int rev[]=new int[arr.length];
		int len=arr.length;
		
		for(int i=0;i<arr.length;i++)
		{
			rev[i]=arr[len-i-1];
		}
		return rev;
	}

}
