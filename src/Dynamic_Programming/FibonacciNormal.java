package Dynamic_Programming;

public class FibonacciNormal {
	static int n = 40;
	static int look[] = new int[n + 1];

	static int findFiboRecursiveDynamicAndMemoization(int n) {
		if (n == 0 || n == 1)
			return 1;
		else if (look[n] != 0)
			return look[n];
		else
			look[n] = findFiboRecursiveDynamicAndMemoization(n - 1)
					+ findFiboRecursiveDynamicAndMemoization(n - 2);

		return look[n];
	}

	static int findFiboRecursiveExponential(int n) {

		if (n == 0 || n == 1)
			return 1;

		return findFiboRecursiveExponential(n - 1)
				+ findFiboRecursiveExponential(n - 2);
	}

	static int findFiboLoop(int n) {
		int sum = 0;
		int a = 0, b = 1;
		for (int i = 0; i < n; i++) {
			sum = a + b;
			a = b;
			b = sum;
		}

		return sum;
	}

	public static void main(String[] args) {

		System.out.println("Without memoization");
		long a = System.nanoTime();
		System.out.println(findFiboRecursiveExponential(n));
		long b = System.nanoTime();

		System.out.println("Time to calculate=" + (b - a));

		System.out.println("\n\n\nWith memoization");
		a = System.nanoTime();
		System.out.println(findFiboRecursiveDynamicAndMemoization(n));
		b = System.nanoTime();

		System.out.println("Time to calculate=" + (b - a));

		System.out.println("\n\n\nWith for loop , optimization memoization");
		a = System.nanoTime();
		System.out.println(findFiboLoop(n));
		b = System.nanoTime();

		System.out.println("Time to calculate=" + (b - a));
	}

}
