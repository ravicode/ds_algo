

import java.util.Arrays;

//Given a number, you have to find next greater number which has same set of digits.
//Example:
//If given number is 4765 the output should be 5467.

//4675

/*
 * 
 */
public class NextHighestNum {
	static boolean lastEle = false;

	static void nextNUM() {
		// String str="4675";

		String str = "4765";

		char ch[] = str.toCharArray();

		char chsorted[] = str.toCharArray();
		Arrays.sort(chsorted);
		int k = 0;
		for (int i = ch.length - 1; i >= 0; i--) {
			if (ch[i] < ch[i - 1]) {

			}

			else {
				k = i - 1;
				if (k == 0)
					lastEle = true;
				break;
			}
		}
		char val = ch[k];
		char next = ' ';
		// swap(val);
		// int p
		for (int i = 0; i < chsorted.length; i++) {
			if (val == chsorted[i]) {
				next = chsorted[i + 1];
				break;
			}
		}

		// System.out.println(val);
		// System.out.println(next);
		if (!lastEle)
			swap(val, next, ch);
		else
			swap(val, next, chsorted);

	}

	static void swap(char val, char next, char ch[]) {
		int valpos = 0, nextpos = 0;
		for (int i = 0; i < ch.length; i++) {
			if (val == ch[i]) {
				valpos = i;
			}

			if (next == ch[i]) {
				nextpos = i;

			}
		}

		char chtemp = ch[valpos];
		ch[valpos] = ch[nextpos];
		ch[nextpos] = chtemp;

		System.out.println(new String(ch));

	}

	public static void main(String[] args) {

		nextNUM();

	}
}
