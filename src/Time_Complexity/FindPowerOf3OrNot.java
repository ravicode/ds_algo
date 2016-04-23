package Time_Complexity;

/*
 *  Given an integer N . tell if it is power of 3 or not.


 */
public class FindPowerOf3OrNot {

	static boolean findPowerOf3(int n) {

		while (n % 3 == 0) {
			n /= 3;
		}
		return n == 1;
	}

	public static void main(String[] args) {
		for (int i = 1; i < 1000; i++) {
			boolean f = findPowerOf3(i);
			if (f)
				System.out.println(i + " is power of 3");
			// else
			// System.out.println("not a power of 3");
		}
	}

}
