import java.util.Arrays;

//o(n2)
public class FindPythagoreanTripltes {

	public static void main(String[] args) {
		findPythagoreanTriplets();
	}

	public static void findPythagoreanTriplets() {

		int arr1[] = { 3, 6, 9, 4, 8, 5, 10, 12, 15, 9 };

		int arr[] = new int[arr1.length];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = arr1[i] * arr1[i];
		}

		Arrays.sort(arr);
		Arrays.sort(arr1);

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0, k = arr.length - 1; j < k;) {

				if (arr[i] == arr[j] + arr[k]) {
					System.out.println(arr1[i] + "=" + arr1[j] + "+" + arr1[k]);
					break;
				} else {
					if (arr[j] + arr[k] > arr[i])
						k--;
					else
						j++;

				}

			}
		}
	}
}
