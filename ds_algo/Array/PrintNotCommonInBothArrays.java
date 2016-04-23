package Array;

import java.util.Set;

/*You have two sorted list A and B. 


 A = [1, 3, 4, 6,8,10, 17, 34] 
 B = [2, 8, 17, 33, 44, 66, 89, 100, 123] 

 Write a program to print those numbers which are 
 1) in A and not in B 
 2) in B and not in A 

 Eg: After print: 1 , 3 , 4 , 6 , 10, 33, 34, 44,, 66, 89, 100, 123 

 I was asked to write this in JAVA.
 */

public class PrintNotCommonInBothArrays {

	public static void main(String[] args) {

		PrintNotCommonInBothArrays pib = new PrintNotCommonInBothArrays();
		int A[] = { 1, 3, 4, 6, 8, 10, 17, 34 };
		int B[] = { 2, 8, 17, 33, 44, 66, 89, 100, 123 };

		Set<Integer> st = CommonTobothArray.commonToBoth1(A, B);
		//System.out.println(Arrays.toString(arr));
		printNotCommon(st, A, B);

	}

	static void printNotCommon(Set<Integer> st, int A[], int B[]) {

		
			for (int j = 0; j < B.length; j++) {
				
				if(j<A.length)
				{
					if(!st.contains(A[j]))
						System.out.print(A[j]+" ");
				}
				
				if(!st.contains(B[j]))
					System.out.print(B[j]+" ");
			}
		}
	}


