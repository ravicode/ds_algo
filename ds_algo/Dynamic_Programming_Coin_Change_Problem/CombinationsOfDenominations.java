package Dynamic_Programming_Coin_Change_Problem;
import java.util.Arrays;

public class CombinationsOfDenominations {

	int a[] = { 2, 3, 4, 5 };

	void print(int k, int tot) {
		if (k == a.length)
			return;
		int arr[] = new int[a.length];
		int sum = 0;

		for (int i = k; i < a.length; i++) {
			sum += a[i];
			arr[i] = a[i];
			if (sum > tot) {
				break;

			}
			if (sum == tot) {
				System.out.println(Arrays.toString(arr));
			}

		}

		print(k + 1, tot);

	}

	public static void main(String[] args) {
		CombinationsOfDenominations den = new CombinationsOfDenominations();
		den.print(0, 9);
	}

}
