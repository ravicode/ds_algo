package Matrix;

//3.You have a matrix a[m] [n]. 
//Transpose it into a matrix b[n] [m] in minimum iterations. 
//I could think of m*n/4 at most.



public class MatrixTranspose {
    public static void main(String args[]) {
        // initialize the variable
        int[][] a =new int[][]
        		{ { 5, 1, 1 },    //2*3
        			  { 3, 6, 0 } 
        			  };
       
        print(a);
        
        int[][] trans=new int[3][2];    //3*2
        // operation for transpose
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
               
            	trans[j][i] = a[i][j];
            }
            //System.out.println();
        }
        System.out.println("Transpose matrix:");
        // After Transpose the matrix print the result
        printTrans(a);
    }
    
    static void  print(int [][]a)
    {
	   for (int i = 0; i < 2; i++) {
           for (int j = 0; j < 3; j++) {
               System.out.print(a[i][j]+" ");
           }
           System.out.println();
       }
    }
    
   static void  printTrans(int [][]a)
    {
	   for (int i = 0; i < 3; i++) {
           for (int j = 0; j < 2; j++) {
               System.out.print(a[j][i]+" ");
           }
           System.out.println();
       }
    }
}
