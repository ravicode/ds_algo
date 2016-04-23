package Matrix;

public class Rotate90 {
	
	static int n=4;
	static int arr[][]={
			{1,0,1,1},
			{0,0,1,1},
			{1,1,1,1},
			{0,0,1,1}
	};
	
	
	//   1 0 1 1
	//   0 0 1 1
	
	//   1 1 1 1 
	//  0 0 1 1

	static int arr1[][]=new int[n][n];
	
	public static void main(String[] args) {
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				//arr1[i][j]=  arr[j][i];	
				System.out.print(arr[3-j][i]+ " ");
			}
			System.out.println();
		}
		
		
	}
}
