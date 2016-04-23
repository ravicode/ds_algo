package GraphAlgorithms;

/*Design and implement algorithm to find the shortest path from start 
 to finish of a maze.*/

public class ShortestPathForMaze {

	static int shortestPath(int cost[][], int m, int n) {

	int t[][]=new int[m][n];
	
	t[0][0]=cost[0][0];
	
	for(int i=1;i<m;i++)
	{
		t[i][0]=t[i-1][0]+cost[i][0];
		
	}
	
	for(int j=1;j<n;j++)
	{
		t[0][j]=t[0][j-1]+cost[0][j];
	}
	
	for(int i=1;i<m;i++)
	{
		for(int j=1;j<n;j++)
		{
			
			t[i][j]=min(t[i][j-1],t[i-1][j],t[i-1][j-1])+cost[i][j];
		}
	}
	
	
		return t[m-1][n-1];
	}
	
	static int min(int a,int b,int c)
	{
		int min=Math.min(a,b);
		
		min=Math.min(min, c);
		return min;
	}

	public static void main(String[] args) {
		int cost[][] = { { 1, 6, 10 }, 
				{ 4, 8, 2 },
				{ 2, 8, 3 } };
		System.out.println(shortestPath(cost, 3, 3));
	}
}