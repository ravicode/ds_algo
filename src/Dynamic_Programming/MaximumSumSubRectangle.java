package Dynamic_Programming;

import java.util.Arrays;
//SC= o(row)   TC=0(col*col*row)

public class MaximumSumSubRectangle {

	static int currentSum=0,maxSum=Integer.MIN_VALUE,maxLeft=0,maxRight=0,maxUp=0,maxDown=0;
	static int l=0,r=0;
	static int tempLeft=0;static int tempRight=0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int mat[][]={{2,1,-3,-4,5},
				     {0,6,3,4,1},
				    {2,-2,-1,4,-5},
				     {-3,3,1,0,3}};
		
		int arr[]=new int[mat.length];
		
		
		
		int currentSum1=0;
		
		for(l=0;l<5;l++)
		{
			arr=new int[mat.length];
			for(r=l;r<5;r++)
			{
				for(int p=0;p<4;p++)
				{
					arr[p]=arr[p]+mat[p][r];
				}
				
				kandane(arr);  //its also an algo 
				
				
				System.out.println("Current Sum="+currentSum1+"  maxSum="+maxSum);
				currentSum1=maxSum;
				System.out.println("MaXLeft="+maxLeft+"  maxRight="+maxRight);
			
				System.out.println("maxUp="+maxUp+"  maxDown="+maxDown);
				System.out.println(Arrays.toString(arr));
			}
			
			System.out.println("Rectangle between="+"("+maxLeft+","+maxUp+")"+"("+maxRight+","+maxDown+")");
		}
	}

	
	static  void kandane(int arr[])
	{
		int len=arr.length;
		
		
		/*if(currentSum>maxSum)
		{
		maxUp=0;maxDown=0;
		}
*/		
		currentSum=0;
		boolean iStartIndexSet=false;
		for(int i=0;i<len;i++)
		{
			
			currentSum+=arr[i];
			if(maxUp==0 && !iStartIndexSet)
			{
				maxUp=i;
				iStartIndexSet=true;
			}
			
			if(currentSum<0)
			{
				currentSum=0;
				//maxUp=0;maxDown=0;
				iStartIndexSet=false;
			}
			else if(currentSum>maxSum)
			{
				maxSum=currentSum;
				
				maxDown=i;
				
				maxLeft=l;maxRight=r;
				tempLeft=l;tempRight=r;
			}
			else
			{
				maxLeft=tempLeft;maxRight=tempRight;
			}
		}
		
	
	}
}
