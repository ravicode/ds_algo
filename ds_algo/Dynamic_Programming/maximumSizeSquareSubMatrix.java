package Dynamic_Programming;
//same as book
public class maximumSizeSquareSubMatrix {

	static int ROW = 4;
	static int COLUMN = 5;

	static int mat[][]=new int[ROW+1][COLUMN+1];
	
	static void printMaxSubSquare(int givenMatrix[][]) {
		
		int maxSize=0;
		for(int i=1;i<ROW+1;i++)
		{
			for(int j=1;j<COLUMN+1;j++)
			{
				if(givenMatrix[i-1][j-1]==0)
				{
					mat[i][j]=0;
				}
				else
				{
					mat[i][j]=min(mat[i-1][j],mat[i][j-1],mat[i-1][j-1])+1;
					if(mat[i][j]>=maxSize)
						maxSize=mat[i][j];
					
				}
				
			}
			
		}
		
		
		
		for(int i=1;i<ROW+1;i++)
		{
			for(int j=1;j<COLUMN+1;j++)
			{
				System.out.print(mat[i][j]+" ");
			}
			System.out.println();
		}
		
		System.out.println("Max Size Square Matrix="+maxSize);
			}
		
	

	/* UTILITY FUNCTIONS *//* Function to get minimum of three values */
	static int min(int a, int b, int c) {
		int m = a;
		if (m > b)
			m = b;
		if (m > c)
			m = c;
		return m;
	} /* Driver function to test above functions */

	public static void main(String[] args) {
		int givenMatrix[][] = { { 0, 0, 1, 1, 1 }, 
				{ 1, 0, 1, 1, 1 }, 
				{ 0, 1, 1, 1, 1 },
				{ 1, 0, 1, 1, 1 } };
		printMaxSubSquare(givenMatrix);
	}
}