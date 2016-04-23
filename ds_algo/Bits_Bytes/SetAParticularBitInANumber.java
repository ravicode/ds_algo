package Bits_Bytes;

/*Set a particular bit in a number.*/

public class SetAParticularBitInANumber {
	
	static void setBit(int n,int k)
	{
		
		int m=n & ~(1<<(k-1));
		
		//System.out.print(1<<(k-1));
		System.out.println(m);
		
	}
	
	public static void main(String[] args) {
		int n=15;
		int k=4; // means 15=1111   so set last bit as 0 , and value=1110
		
		setBit(n,k);
	}

}
