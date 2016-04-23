package Dynamic_Programming;

import java.util.Arrays;

public class WeightJobScheduling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arrStart[]={1,2,4,6,5,7};
		int arrEnd[]={3,5,6,7,8,9};
		int weight[]={5,6,5,4,11,2};
		int max[]=new int[arrEnd.length];
		for(int i=0;i<weight.length;i++)
		{
			max[i]=weight[i];
		}
		
		for(int i=1;i<arrEnd.length;i++)
		{
			for(int j=0;j<i;j++)
			{
				
				if(arrEnd[j]<=arrStart[i])
				{
					max[i]=max[j]+weight[i];
				}
				
			}
			
			
		}
	
		//System.out.println(Arrays.toString(max));
		int maxProfit=0;
		for(int j=0;j<max.length;j++)
		{
			if(max[j]>maxProfit)
				maxProfit=max[j];
		}
		
		System.out.println("Maximum Profit with non overlapping jobs="+maxProfit);
		}
		
	}
	


