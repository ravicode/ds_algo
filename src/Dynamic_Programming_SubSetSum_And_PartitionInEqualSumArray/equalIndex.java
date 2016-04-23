package Dynamic_Programming_SubSetSum_And_PartitionInEqualSumArray;
public class equalIndex {

	public static void passArray(int a1[]) {
		int lastIndex = a1.length - 1;
		System.out.println("length= " + lastIndex);

		int sumLeft = 0, sumRight = 0;
		int ik = 0;

		sumLeft += a1[0];

		sumRight += a1[lastIndex];
		for (int i = 1, j = lastIndex - 1; i <= j;) {

			if (sumLeft > sumRight) {
				sumRight += a1[j--];
			} else if (sumLeft < sumRight)
				sumLeft += a1[i++];

			ik = i;
			if (sumLeft == sumRight)
				break;
		}
		System.out.println("Equal at index " + ik+" "+sumLeft+" "+sumRight);

	}

	public static void main(String[] args) {
		int a[] = { 2, 1, 4, 3, 5, 4, 1,8 };

		passArray(a);

	}
}
