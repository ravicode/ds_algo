package Bits_Bytes;

/*given a string which represents a decimal number return its binary representation.
 */
public class ReturnBinaryRepresentation {

	static void printBinary(int n) {
		int r;
		if (n == 0)
			return;
		r = n % 2;
		printBinary(n >> 1);
		System.out.print(r);
	}

	public static void main(String[] args) {

		printBinary(8);
	}

}
