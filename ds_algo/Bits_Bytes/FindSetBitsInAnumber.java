package Bits_Bytes;

/*
 * Write a code that efficiently counts the total Set Bits in a number.
 */
public class FindSetBitsInAnumber {

	
	static int countbits(int n)
	{
	    int count = 0;
	    while(n==0)
	    {
	        n = n&(n-1);
	        count++;
	    }
	    return count;
	}

	//method 2 effeciency O(1)

	static int countbits1(int n)
	{
	     n = (n & 0x55555555) + ((n>>1) & 0x55555555) ;
	     n = (n & 0x33333333) + ((n>>2) & 0x33333333) ;
	     n = (n & 0x0F0F0F0F) + ((n>>4) & 0x0F0F0F0F);
	     n = (n & 0x00FF00FF) + ((n>>8) & 0x00FF00FF);
	     n = (n & 0x0000FFFF) + ((n>>16) & 0x0000FFFF);

	     return n;
	}
	
	public static void main(String[] args) {
		System.out.println(countbits1(7));
	}

}
