package Matrix;

import BinarySearch.FindOccurencesInSortedArray_1st_way_imp;





public class FindRowWithMaximumNumOf1_BinarySearch {



	static int rowWithMax1s(int mat[][]) {
		int max=0;
		int row=0;
		for (int i = 0; i < mat.length; i++) {
	//int occ = FindOccurencesInSortedArray_2nd_way.findfirst(mat[i], 0, mat[i].length - 1, 1);
	int occ= FindOccurencesInSortedArray_1st_way_imp.findOccurenc(mat[i],1,0,mat[i].length-1,true);

			//System.out.println(occ);
			if(occ>=0 && (mat[i].length-occ)>max)
			{
				max=mat[i].length-occ;
				row=i;
				//System.out.println("maximum number of 1s="+ max);
			}
			
		}
		
		System.out.println("maximum number of 1s="+ max +" Row="+row);
		
		
		
		return 1;
	}

	public static void main(String[] args) {
		int mat[][] = { { 0, 0, 0, 1 }, 
				{ 0, 1, 1, 1 }, 
				{ 1, 1, 1, 1 },
				{ 0, 0, 0, 0 } };
		rowWithMax1s(mat);
		/*System.out.println("Index of row with maximum 1s is"
				+ rowWithMax1s(mat));*/

	}

}