package Matrix;
//q-65 
//this can be done by binary search as done for finding 1 in another similar question.
public class FindRowWithMaxNumberOfZero {
	
	public static void main(String[] args) {
		int arr[][]={{1,1,1,0,0,0,0},
					{1,0,0,0,0,0,0},
					{1,1,0,0,0,0,0},
					{1,1,1,1,0,0,0},
		};
		
		findMaxZero(arr);
	}
	
	
	static void findMaxZero(int arr[][])
	{
		int j=6,c=0,max=0,row=0;
		int i=0;
		
		for(i=0;i<4;)
		{
			if(arr[i][j]==0)
			{
				j--;
				c++;
				
				if(c>max)
				{
					max=c;
					row=i;
				}
			}
			
			if(arr[i][j]==1)
			{
				i++;
				j=6;
				c=0;
				
			}
		}
		
		System.out.println(row);
	}

}
