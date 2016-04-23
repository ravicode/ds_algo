package Dynamic_Programming;

public class MaximumSumNoAdjacentElementsInAnArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int arr[]={4,1,1,4,2,1};
int incl= findMaxSum(arr);
System.out.println("Maximum Sum of No Adjacent Elements in An Array="+incl);
	}
	
	static int findMaxSum(int arr[])
	{
		int incl=arr[0];
		int excl=0;
		int pastIncl=incl;
		for(int i=1;i<arr.length;i++)
		{
			pastIncl=incl;
			incl=Math.max(incl,excl+arr[i]);//it stores best till i 
			excl=pastIncl;
		}
		
		return incl;
	}

}
