package Bits_Bytes;

/*How will you set a bit in a number?
	      Eg. int i=1110 0001. Set 6th bit.
	      Output: 1110 0101
*/
public class SetABitInANumber {
	
	
public static void main(String[] args) {
	int i=11100001;
	
	int p= 1<<2;
	
	int m=i | p;
	
	System.out.println(m);
}
}
