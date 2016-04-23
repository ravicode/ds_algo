package Dynamic_Programming_Coin_Change_Problem;

import java.util.Arrays;

/*
 * 
 * Given an amount and an array containing possible coin denominations, 
 * determine the smallest no of coins in which the amount may be formed.
 *  Assume you have infinite units of each denomination.
 */

public class FindMinimumNumberOfCoinsToMakeASum {
	
	static int sum=15;
	
	static void findMinNoofCoins(int positionOfCoins[],int valueofCoins[] )
	{
		int valueOfCoinsLeft[]=new int[sum+1];
		int coinPositionsIncluded[]=new int[sum+1];
		
		for(int i=0;i<valueOfCoinsLeft.length;i++)
		{
			if(i==0)
				valueOfCoinsLeft[0]=0;
			else
			valueOfCoinsLeft[i]=100;
			coinPositionsIncluded[i]=-1;
		}
		
		
		for(int i=0;i<positionOfCoins.length;i++)
		{
			
			for(int j=1;j<valueOfCoinsLeft.length;j++)
			{
				
				if(valueofCoins[i]<=j)
				{
					int earliervalue=valueOfCoinsLeft[j];
					valueOfCoinsLeft[j]=Math.min(valueOfCoinsLeft[j],1+valueOfCoinsLeft[j-valueofCoins[i]]);
					if(earliervalue!=valueOfCoinsLeft[j] && valueOfCoinsLeft[j]<100 )
						coinPositionsIncluded[j]=i;  //if value chnages, so it means we used current coin i.
					
					
				}
				
			}
			
			System.out.println(Arrays.toString(valueOfCoinsLeft));
			System.out.println(Arrays.toString(coinPositionsIncluded));
		}
		
		int numOfMinCoin=valueOfCoinsLeft[valueOfCoinsLeft.length-1];
		
		System.out.println("Number of Minimum coins required for 13="+numOfMinCoin);
		int pos=coinPositionsIncluded.length-1;
		
		System.out.println("Values which are included to make sum 13=");
		while(pos!=0)
		{
			sum=pos;
	 pos=coinPositionsIncluded[pos];
	 
			System.out.println(valueofCoins[pos]);
			pos=sum-valueofCoins[pos];
			
		}
		
		
	}
	
	
	public static void main(String[] args) {
		
		int positionOfCoins[]={0,1,2,3};
		int valueofCoins[]={7,2,3,6};
		findMinNoofCoins(positionOfCoins,valueofCoins);
		
	}

}
