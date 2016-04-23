package Matrix;

//Write a program to search an element in a row-wise and column-wise sorted 2-dimesional array .
public class SearchAnElementIn2DArraySortedRowWiseAndColumnWise {



	static void findNumberInSortedColumnAndRowWise(int arr[][], int num) {
		int max1 = 0, max2 = 0, maxRow = 0;
		int count = 0;
		int i = 0,j=0;
		for ( j = 3; j >= 0 & i <= 3;) {
			count++;
			if (num > arr[3][3]) {
				System.out.println("No Data");
				break;
			}

			if (num < arr[0][0]) {
				System.out.println("No Data");
				break;
			}
			
			if (arr[i][j] == num) {
				System.out.println("Number found");
				break;
			}
			
			if(num>arr[i][j])
			{
				i++;
				j=3;
			}
			else
				j--;
			
			

			/*if (j == 0) {
				if(i<=2)
				i++;
				j = 4;
			}*/
			//j--;

		}
		//System.out.println(i+" "+j);
		if(i==4 || j==4)
System.out.println("not found");
	}

	public static void main(String[] args) {
		
		int arr[][] = { { 1, 15, 20, 25 }, { 2, 16, 21, 26 },
				{ 3, 17, 22, 27 }, { 4, 18, 23, 28 } };
		int num = 29;
		findNumberInSortedColumnAndRowWise(arr, num);
	}
}
