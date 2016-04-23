package Dynamic_Programming;

public class StockBuySellWithKTransactionsWithMaxprofit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int k=3;
		
		int transaction[]=new int[4];
		
		int price[]={2,5,7,1,4,3,1,3};
		
		int mat[][]=new int[transaction.length][price.length];
		
		for(int i=0;i<transaction.length;i++)
		{
		mat[i][0]=0;
		}
		
		for(int i=0;i<price.length;i++)
		{
		mat[0][i]=0;
		}
		
		for(int i=1;i<transaction.length;i++)
		{
			for(int j=1;j<price.length;j++)
			{
			mat[i][j]=Math.max(mat[i][j-1], calcMax(j,i,price,mat))	;
			}
		}
		
		
		
		
		
		for(int i=0;i<transaction.length;i++)
		{
			for(int j=0;j<price.length;j++)
			{
				
				System.out.print(mat[i][j]+" ");
			}
			System.out.println();
		}

		System.out.println("max profit="+mat[transaction.length-1][price.length-1]);
	}
	
	
	static int calcMax(int j,int i,int price[],int mat[][])  //its gives which is th best day to buy and how much is the profit that day
	{
		int max=0,sum=0;
		for(int m=0;m<j;m++)
		{
			sum= price[j]-price[m] +  mat[i-1][m];
			if(sum>max)
				max=sum;
		}
		
		return max;
	}

}
