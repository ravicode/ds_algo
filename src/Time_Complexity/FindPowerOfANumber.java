package Time_Complexity;

/*
 * Write a code that efficiently calculates X power n where x and n are integers.
 */
///*Implement the pow function in logarithmic time. */

////YoutTube mycodSchool- good explanation in recursion playlist    tc = 0(LOGn)
public class FindPowerOfANumber {

	//static int count=0;
static 	int pow(int x,int n)
	{
	//count++;
	    int p =0 ;
	    if(n==0)
	       return 1;
	    p= pow(x,n/2);
	    if(n%2==0)
	    {
	         return p*p;
	    }
	    else
	    {
	          return p*p*x;
	    }
	     
	}
	 
	public static void main(String[] args) {
		System.out.println(pow(2,32));
		
	}
	
}
