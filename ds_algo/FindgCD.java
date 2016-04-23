

public class FindgCD {

	static int gcd(int a, int b) {
		if (b == 0)
			return a;
		else
			return gcd(b, a % b);

	}

	public static void main(String[] args) {

		int a = gcd(6, 16);

		System.out.println(a);

	}

}
