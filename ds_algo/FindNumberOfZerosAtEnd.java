

/*Given N, 
 * find total number of Zeros at the end of N!. (of course with proof).*/


public class FindNumberOfZerosAtEnd {
	
	public static void main(String[] args) {
		int n=25; 
		int i=1;
		int numofZero=0;
		while(n/Math.pow(5,i) > 0)   //its gives how many multiple of 5 and 5^n are in this number
		{
			numofZero+=n/Math.pow(5,i);
			i++;
			
		}   
		
		System.out.println("Number of zero in "+n+"!="+numofZero);
	}

}
