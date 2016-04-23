package Bits_Bytes;

import java.util.Stack;

/*print all the binary values of number from 1 to n , each number�s binary should be printed
 *  in 0(1).
 for eg: n = 6
 then print 1 10 11 100 101 110. printing 1, 10 ,11 ,100,101,110 should be in o(1) each
 */

//space complexity - o(n)  

public class PrintAllBinNumber {

	static void printBinary(int n) {

		for (int i = 1; i <= n; i++) {

			System.out.println();
			doPrintBinary(i);
		}
	}

	public static void doPrintBinary(int n) {
		// System.out.println(n);
		if (n > 1) {
			doPrintBinary(n >> 1);
		}

		System.out.print(n & 1);
	}

	public static void main(String[] args) {
		printBinary(6);
	}

}
