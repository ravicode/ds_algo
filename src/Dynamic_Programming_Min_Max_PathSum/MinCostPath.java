package Dynamic_Programming_Min_Max_PathSum;

import java.util.Arrays;

public class MinCostPath {

	static int mat[][]=new int[3][4];
	
	/*static int minCost1(int cost[][]) {
		
		int index[]=new int[10];
		int j=0;
		int k1=0;
		index[k1++]=cost[0][0];
		for(int i=0;i<3-1;)
		{
			
			
			if(cost[i+1][j]<cost[i][j+1])
			{
				
				i=i+1;
				index[k1++]=cost[i][j];
				
			}
			else
			{
				j=j+1;
				index[k1++]=cost[i][j];
			}
			
			
		}
		index[k1++]=cost[2][3];
		System.out.println(Arrays.toString(index));
		
		return 1;
		
	}
	*/
	
	static int minCost(int cost[][]) {
		
		int index[]=new int[10];
		int k=0;
		for(int i=1;i<4;i++)
		{
			mat[0][i]=mat[0][i-1]+mat[0][i];
			
		}
		
		for(int i=1;i<3;i++)
		{
			mat[i][0]=mat[i-1][0]+mat[i][0];
			
		}
		int min=0;
		index[k++]=mat[0][0];
		boolean br=false;
		for(int i=1;i<3;i++)
		{
			for(int j=1;j<4;j++)
			{
				//mat[i][j]=Math.min(cost[i][j];
				if(mat[i-1][j]<mat[i][j-1])
				{
					min=mat[i-1][j];
					mat[i][j]=min+mat[i][j];
				
					index[k++]=cost[i-1][j];
					
				}
				else
				{
					min=mat[i][j-1];
					
					mat[i][j]=min+mat[i][j];
					index[k++]=cost[i][j-1];
				
				}
				
				
				
			
			}
			
			
		}
		
		System.out.println("new matrix with Cost");
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<4;j++)
			{
				System.out.print(mat[i][j]+" ");
			}
			System.out.println();
		}
		
		
		System.out.println("path of traversal , some more chck new to add");
		System.out.println(Arrays.toString(index));
		
		
		System.out.println("Cost="+mat[3-1][4-1]);
		
		
		return 1;
	} /* A utility function that returns minimum of 3 integers */

	/* Driver program to test above functions */
	/*static int min(int leftCell, int topCell, int cornerCell) {
		//System.out.println(leftCell + " " + topCell + " " + cornerCell);
		int min = Math.min(leftCell, topCell);

		min = Math.min(min, cornerCell);

		return min;

	}*/

	public static void main(String[] args) {

		int cost[][] = { { 1, 3, 5, 8 }, 
						{ 4, 2, 1,7 }, 
						{ 4, 3, 2,3 } };
		
		System.out.println("Origial matrix=");
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<4;j++)
			{
				mat[i][j]=cost[i][j];
				System.out.print(mat[i][j]+" ");
			}
			System.out.println();
		}
		
	minCost(cost);
	//minCost1(cost);  // by this method we can come to know the path wth storing values , 
	//similry, it can be done for dialgonal , right and left
		
		
	}
}
