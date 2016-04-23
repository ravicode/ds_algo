package Matrix;



/*Given a mxn matrix consisting of only 0′s and 1′s. wherever you find 1, make all
the elements of that row and column as 1. A lot of discussions on space 
optimization and was asked to do in-place.*/

//do it again.

public class MatrixUpate {
	
	 int aa[][]={{0,1,0,1},
				{0,0,0,1},
				{0,1,0,0},
				{0,0,0,0}
			 
	};
	
/*	int bb[][]={{0,1,0,1},
			{0,0,0,1},
			{0,1,0,0},
			{0,0,0,0}
	};*/
			
			

	
	void display()
	{
		for(int i=0;i<aa.length;i++)
		{
			for(int j=0;j<aa.length;j++)
			{
				System.out.print(aa[i][j]);
			}
			System.out.println();
		}
	}
	
	public void changeMatrix(MatrixUpate mu1)
	{
		
		boolean flag=false;
		System.out.println("\n\n");
		for(int i=0;i<aa.length;i++)
		{
			for(int j=0;j<aa.length;j++)
			{
				if(mu1.aa[i][j]==1)
				{
					
					flag=true;
					
					
					for(int r=0;r<aa.length;r++)
					{
						aa[r][j]=1;
					}
					
					for(int c=0;c<aa.length;c++)
					{
						aa[i][c]=1;
					}
					
					
				}
			
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		
		MatrixUpate mu=new MatrixUpate();
		MatrixUpate mu1=new MatrixUpate();
		mu.display();
		mu.changeMatrix(mu1);
		mu.display();
		
	}

}
