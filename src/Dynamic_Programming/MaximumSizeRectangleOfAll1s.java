package Dynamic_Programming;

import java.util.Arrays;

//SC= o(n)  time complexity= o(row*column)

public class MaximumSizeRectangleOfAll1s {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int row=4,column=6;
		int arr[][]={{1,0,0,1,1,1},
					 {1,0,1,1,0,1},
					 {0,1,1,1,1,1},
					 {0,0,1,1,1,1}};
		
		int maxSize[]=new int[6];
		
		int finalMaxSizeOfRectangle=0;
		int TempMaxSizeofAddedRows=0;
		
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<column;j++)
			{
				if(arr[i][j]==0)
				{
					maxSize[j]=0;
				}
				else
				maxSize[j]+=arr[i][j];
			}
			System.out.println(Arrays.toString(maxSize));
			
			
			int numberOfRectanglesWidth=0;
			int minHeightInARow=Integer.MAX_VALUE;
			int k=0;
			TempMaxSizeofAddedRows=finalMaxSizeOfRectangle;
			for( k=0;k<column;k++)
			{
				if(maxSize[k]!=0)
				{
					numberOfRectanglesWidth++;
					if(maxSize[k]<minHeightInARow)
						minHeightInARow=maxSize[k];
				}
				else
				{
					TempMaxSizeofAddedRows=numberOfRectanglesWidth*minHeightInARow;
					if(TempMaxSizeofAddedRows>finalMaxSizeOfRectangle)
						finalMaxSizeOfRectangle=TempMaxSizeofAddedRows;
					numberOfRectanglesWidth=0;
					minHeightInARow=Integer.MAX_VALUE;
				}
					
				
			}
			
			if(k==maxSize.length)
			{
				TempMaxSizeofAddedRows=numberOfRectanglesWidth*minHeightInARow;
				if(TempMaxSizeofAddedRows>finalMaxSizeOfRectangle)
					finalMaxSizeOfRectangle=TempMaxSizeofAddedRows;
				numberOfRectanglesWidth=0;
				minHeightInARow=Integer.MAX_VALUE;
			}
			
			System.out.println(finalMaxSizeOfRectangle);
		}
	}

}
