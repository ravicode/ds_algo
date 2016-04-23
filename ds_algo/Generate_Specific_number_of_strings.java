import java.util.Arrays;

public class Generate_Specific_number_of_strings {
	static int num = 4, k = 3;
	static int a[] = new int[num];

	public static void main(String[] args) {
		k_string(num, k);
	}

	static void k_string(int n, int k) {

		if (n < 1) {

			System.out.println(Arrays.toString(a));

		} else {
			for (int j = 0; j < k; j++) {
				a[n - 1] = j;
				k_string(n - 1, k);
			}
		}
	}
}
