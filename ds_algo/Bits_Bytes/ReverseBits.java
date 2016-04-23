package Bits_Bytes;

/*unsigned char c=1100 0010; (Note that it�s a variable ; not an array.)
U need to reverse this and and return the resut.
Answer: 0100 0011 (Stored in a variable. No arrays have to be used.)
*/
public class ReverseBits {


	public static void main(String[] args) {
		int a=11000010;// & 0xFF;
		
		/*int p=a>>1;
		
		System.out.println(p);*/
		
		int y=reverseBitsByte(a);
		System.out.println(y);
	}
static byte reverseBitsByte(int x) {
		  int intSize = 8;
		  byte y=0;
		  for(int position=intSize-1; position>0; position--){
		    y+=((x&1)<<position);
		    x >>= 1;
		  }
		  return y;
		}
}
