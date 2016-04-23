package Time_Complexity;

/*
 Only 5 were selected.I was asked only one question and i didnt do well. 
 Find the square root of a number. i answered that this can be done using Babylonian method. 
 (http://www.geeksforgeeks.org/square-root-of-a-perfect-square/) or binary search method.. 
 He asked me to implement Binary Search method. I did a mistake. 
 then he asked me to correct it.. i corrected it.
 I wasn�t able to impress him much.
 */
public class FindSquareRootOfANumber {

	
	public static double sqrt(int n) {   //logn

	    double low = 0;
	    double high = n;
	    double mid = (high - low) / 2;

	    while (Math.abs((mid * mid) - n) > 0.000000000001) {
	        if ((mid * mid) > n) {

	            high = mid;
	            mid = (high - low) / 2;

	        } else{

	            low = mid;
	            mid = mid + ((high - low) / 2);

	        }
	    }
	    return mid;
	}
	
	static double squareRootB_babylonianMethod(int num)
	{
		double n = 36;
		double x = n;
		double y = 1;
		double e = 0.000001;

		while (x - y > e) {
			x = (x + y) / 2;
			y = n / x;
		}

		//System.out.println(x);
		return x;
	}
	public static void main(String[] args) {

		//System.out.println(sqrt(3));
		int num=25;
		System.out.println(squareRootB_babylonianMethod(num));
		System.out.println(sqrt(num));
	}

}
