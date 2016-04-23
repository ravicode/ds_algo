package Dynamic_Programming_Coin_Change_Problem;

public class FindTotalNoFoWaystomakeaSumFromGivenInfiniteCoins {

	
	
	
	public static void main(String[] args) {
		int numbers[]={1,2,3};
	int total=5;
	
	int mat[][]=new int[numbers.length+1][total+1];
	
	
	TotalNumberOfWays(numbers, total, mat);
	
	System.out.print("Total Number of to get "+total+"="+mat[numbers.length][total]);
	
	}

	private static void TotalNumberOfWays(int[] numbers, int total, int[][] mat) {
		for(int i=0;i<total+1;i++)
			mat[0][i]=0;
			
		
		for(int i=1;i<numbers.length+1;i++)
			mat[i][0]=1;
			
		
		
		for(int i=1;i<numbers.length+1;i++)
		{
			
			for(int j=1;j<total+1;j++)
			{
				if(numbers[i-1]>j)
					mat[i][j]=mat[i-1][j];
				else
					mat[i][j]=mat[i-1][j]+mat[i][j-numbers[i-1]];

				
				
				//System.out.print(mat[i][j]+" ");
				
			}
		}
			
		for(int i=0;i<numbers.length+1;i++)
		{
			
			for(int j=0;j<total+1;j++)
			{
				System.out.print(mat[i][j]+" ");
				
			}
			System.out.println();
			
		}
	}
}
