package Dynamic_Programming;

import java.util.Arrays;

//sum=Math.pow(2,n)-n;

public class CountTotalNumberOfBST {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n=4;
		int cnt=countBST(n);
		
		System.out.println("For "+n+" keys , no of possible BSTs="+cnt);
	}
	
	static int countBST(int n)
	{
		int T[]=new int[n+1];
		T[0]=T[1]=1; //base case
		for(int i=2;i<=n;i++)
		{
			for(int j=0;j<i;j++)
			{
				T[i]+=T[j]*T[i-j-1];   // this number is called catalan number
			}
			
		}
		
		
		System.out.println(Arrays.toString(T));
		return T[n];
		
			}
}


