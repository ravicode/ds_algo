package Hashing;
//5. Find highest length substring such that there are 
//   equal number of 0�s and 1�sin array of 1�s and 0�s only

public class HighestLengthSubStringg {

	static String str = "111100101010001101100001100010101011110000";

	public static void main(String[] args) {

		int sum = 0;

		int startIndex = 0;
		int endIndex = 0;
		int max = 0;
		char ch[] = str.toCharArray();
		// System.out.println(ch.length);
		int count0 = 0;
		int count1 = 0;
		int count0Final = 0;
		int count1Final = 0;
		for (int i = 0; i < ch.length - 1; i++) {
			count0 = 0;
			count1 = 0;

			count0 = (ch[i] == '0') ? 1 : 0;
			count1 = (ch[i] == '1') ? 1 : 0;

			for (int j = i + 1; j < ch.length; j++) {
				if (ch[j] == '0')
					count0++;
				else
					count1++;

				if (count0 == count1) {
					if ((j - i) > max) {
						max = j - i;
						startIndex = i;
						count0Final = count0;
						count1Final = count1;
						endIndex = j;
					}
				}

			}
		}
		System.out.println("Number of zero=" + count0Final + " "
				+ "Number of 1=" + count1Final);
		if (startIndex == 0 && endIndex == 0) {
			System.out.println("No String Possible");
		} else {
			System.out.println("SubString=" + startIndex + " " + endIndex + " "
					+ "String=" + str.substring(startIndex, endIndex + 1));
		}
	}

}
