package Time_Complexity;

///  youtube mycodeschooll in timeComplexity playlst
// for(int i=1 to root(n))

/*
 we want to test whether the number N is prime or not. The first approach that comes to mind is probably to try to dive N by all numbers from 2 up to N-1. 
 If the division is perfect in any of those cases (i.e., no remainder) then N is not prime. Else if it can’t be perfectly divisible by any of the numbers it’s prime.

 However there are two improvements we can make to this algorithm right away. First of all there’s no need to try to divide N by all even numbers. 
 If N is not evenly divisible by 2 then it won’t be by any other even number. So we just test for 2, and then for all odd numbers.

 Second, we don’t need to go up to N-1. In fact going up to the square root of N would suffice. Why? 
 Because if N is not prime then it can be de-composed into at least two factors, and one of those factors must be smaller than or equal to the square of N. If this was not true (i.e., both factors were larger than the square of N) the resulting number would be larger the N itself.
 */
public class IsPrimeNumber {

	static int isPrime(int n) {
		int i;

		if (n == 2)
			return 1;

		if (n % 2 == 0)
			return 0;

		for (i = 3; i <= Math.sqrt(n); i += 2)
			if (n % i == 0)
				return 0;

		return 1;

	}

	public static void main(String[] args) {

		int i;
		int count = 0;
		
		int a= isPrime(19);
		
		if(a==1)
			System.out.println("prime");
		else
			System.out.println("not prime");
/*
		for (i = 2; i < 20; i++) {
			if (isPrime(i) == 1)
				count++;
		}

		System.out.println(count);
*/
	}
}
