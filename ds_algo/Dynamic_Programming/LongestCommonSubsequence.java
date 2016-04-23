package Dynamic_Programming;

import java.util.Stack;

/*LCS for input Sequences �ABCDGH� and �AEDFHR� is �ADH� of length 3.
 LCS for input Sequences �AGGTAB� and �GXTXAYB� is �GTAB� of length 4.
 */
// o(n2)
public class LongestCommonSubsequence {

	public static void main(String[] args) {

		char ch1[] = "BDCABA".toCharArray();
		char ch2[] = "ABCBDAB".toCharArray();
		
		Stack<Character> backTrack=new Stack<Character>();

		int arr[][] = new int[ch1.length + 1][ch2.length + 1];

		boolean arrBoolean[][] = new boolean[ch1.length + 1][ch2.length + 1];

		printLcsLength(ch1, ch2, arr, arrBoolean);

		System.out.println("length of LCS=" + arr[ch1.length][ch2.length]);

		printLCS(ch1, ch2, backTrack, arr, arrBoolean);

	}

	public static void printLcsLength(char[] ch1, char[] ch2, int[][] arr,
			boolean[][] arrBoolean) {
		for (int j = 0; j < ch2.length; j++) {
			arr[0][j] = 0;

		}

		for (int i = 0; i < ch1.length; i++) {

			arr[i][0] = 0;

		}

		for (int i = 1; i < ch1.length + 1; i++) {

			for (int j = 1; j < ch2.length + 1; j++) {
				char c1 = ch1[i - 1];
				char c2 = ch2[j - 1];
				if (ch1[i - 1] == ch2[j - 1]) {
					arr[i][j] = arr[i - 1][j - 1] + 1;
					arrBoolean[i][j] = true;
				} else {
					//if (arr[i - 1][j] >= arr[i][j - 1])
						arr[i][j] = Math.max(arr[i - 1][j],arr[i][j - 1]);
					//else
						//arr[i][j] = arr[i][j - 1];

				}

			}
		}
		for (int i = 0; i < ch1.length + 1; i++) {

			for (int j = 0; j < ch2.length + 1; j++) {
				System.out.print(arr[i][j] + " " + arrBoolean[i][j] + "   ");
			}
			System.out.println();
		}
	}

	// If the cell boolean value is true and if cell[value] is smaller than already computed row max length  and [cell-1][value] < cell[value]
	public static void printLCS(char[] ch1, char[] ch2,
			Stack<Character> backTrack, int[][] arr, boolean[][] arrBoolean) {
		int previousRowLCSLength = arr[ch1.length][ch2.length];

		for (int i = ch1.length; i > 0; i--) {

			for (int j = ch2.length; j > 0; j--) {

				/*int c1 = arr[i][j];
				int c2 = arr[i][j - 1];
				int k1 = k;
				boolean b1 = arrBoolean[i][j];
*/
				if ((arr[i][j - 1] < arr[i][j])) {      //length should decrease from the successor element 
					if (arr[i][j - 1] < previousRowLCSLength)  //to compare with the next row maximum length-1
					{
						if (arrBoolean[i][j]) {  // it should b true , if added in LCS as per above method
						
								char c = ch2[j - 1]; //current position character, j-1 , bcoz array[][] is +1 +1 n x and y
								backTrack.push(c);
								//System.out.println(c);
								previousRowLCSLength = arr[i][j] - 1;
								
							}
						
						break;
					}
				}
			}

			
		}
		
		int stackSize=backTrack.size();  // to print LCS from Stack 
		for(int i=0;i<stackSize;i++)
		System.out.print(backTrack.pop());
	}
}
