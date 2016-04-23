

public class CheckIfANumberIsPalindromeOrNot {

	int weight = 1;

	int reverseNumber(int num) {
		int remainder;
		int rev = 0;
		if (num / 10 == 0) {

			return num;
		} else {
			remainder = num % 10;

			rev = reverseNumber(num / 10);
			weight *= 10;
			return rev + remainder * weight;
		}

	}

	public static void main(String[] args) {
		CheckIfANumberIsPalindromeOrNot ca = new CheckIfANumberIsPalindromeOrNot();
		int num = 2345;
		int sum = ca.reverseNumber(num);
		System.out.println("reverse=" + sum);
		if(sum==num)
			System.out.println("palidrome");
		else
			System.out.println("not a palindrome");
	}
}
