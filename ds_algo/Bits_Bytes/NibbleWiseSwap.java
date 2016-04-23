package Bits_Bytes;


/*perform nibble wise swap in a byte of data
*/

public class NibbleWiseSwap {
	
	public static void main(String[] args) {
		int a=100;
		
	//	System.out.println();
		
		int last4=(a & 0x0F)<<4;
		int first4=(a & 0x0F)>>4;
		int or=last4 | first4;
		System.out.println(or);
	}

}
