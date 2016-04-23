package Dynamic_Programming;




public class MatrixChainOrder {

    public int findCost(int arr[]){
        int mat[][] = new int[arr.length][arr.length];
        int q = 0;
        for(int lengthPicked=2; lengthPicked < arr.length; lengthPicked++){
            for(int i=0; i < arr.length - lengthPicked; i++){    //should not cross array boundary
                int j = i + lengthPicked;
                mat[i][j] = 1000;
                for(int k=i+1; k < j; k++){
                    q = mat[i][k] + mat[k][j] + arr[i]*arr[k]*arr[j];   //sum of cost of current multi plus already computed ones.
                    if(q < mat[i][j]){
                    	mat[i][j] = q;
                    }
                }
            }
        }
        
        
        for(int i=0;i<arr.length;i++)
        {
        	for(int j=0;j<arr.length;j++)
            {
            	System.out.print(mat[i][j]+"   ");
            }
System.out.println();
        }
        return mat[0][arr.length-1];
    }
    
    public static void main(String args[]){
    	MatrixChainOrder mmc = new MatrixChainOrder();
       // int arr[] = {4,2,3,5,3};
        int arr[] = { 2,3,6,4,5};
        int cost = mmc.findCost(arr);
        System.out.println();
        System.out.print("minimum multiplication cost of all the matrix="+cost);
    }
}
