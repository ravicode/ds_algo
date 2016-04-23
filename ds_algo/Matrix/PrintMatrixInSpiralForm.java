package Matrix;

//Print Matrix in spiral form.




public class PrintMatrixInSpiralForm {

	
	static void spiralPrint(int m, int n, int a[][])
	{
	    int i, k = 0, l = 0;
	 
	    /*  k - starting row index
	        m - ending row index
	        l - starting column index
	        n - ending column index
	        i - iterator
	    */
	 
	    while (k < m && l < n)
	    {
	        /* Print the first row from the remaining rows */
	        for (i = l; i < n; ++i)
	        {
	            System.out.print( a[k][i]+" ");
	        }
	        k++;
	 
	        System.out.println();
	        /* Print the last column from the remaining columns */
	        for (i = k; i < m; ++i)
	        {
	        	System.out.print( a[i][n-1]+" ");
	        }
	        n--;
	 
	        System.out.println();
	        /* Print the last row from the remaining rows */
	        if ( k < m)
	        {
	            for (i = n-1; i >= l; --i)
	            {
	            	System.out.print( a[m-1][i]+" ");
	            }
	            m--;
	        }
	 
	        System.out.println();
	        /* Print the first column from the remaining columns */
	        if (l < n)
	        {
	            for (i = m-1; i >= k; --i)
	            {
	            	System.out.print( a[i][l]+" ");
	            }
	            l++;    
	        }        
	    }
	}
	 
	/* Driver program to test above functions */
	public static void main(String[] args) {
		
	
	    int a[][] = { {1,  2,  3,  4,  5,  6},
	    			  {7,  8,  9,  10, 11, 12},
	                  {13, 14, 15, 16, 17, 18}
	    };
	 
	    spiralPrint(3, 6, a);
	 
	}

}
