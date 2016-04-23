package StringAlgorithms;

import java.util.Stack;

/*
 You are given a sentence you have to reverse it word by word.
 Example:
 Input:
 this is morgan stanley interview question
 output:
 question interview stanley morgan is this
 */

public class ReverseSentenceNotWords {

	static String str = "this is morgan stanley interview question";

	public static void main(String[] args) {

		simpleSolution();
		other();
		System.out.println();
		other1(str, str.length() - 1, "");

	}

	static void simpleSolution() {
		StringBuilder newString = new StringBuilder();
		String str1[] = str.split(" ");

		for (int i = str1.length - 1; i >= 0; i--)
			newString.append(str1[i] + " ");

		System.out.println(newString);

	}

	static void other() {

		int len = str.length();

		String stt = "";
		while (len > 0) {
			// st.push(str.charAt(len-1));
			stt = str.charAt(len - 1) + stt;
			if (str.charAt(len - 1) == ' ' || len == 1) {
				System.out.print(stt + " ");
				stt = "";
			}
			len--;

		}

	}

	static void other1(String str, int len, String stt) {

		if (len >= 0) {

			stt = str.charAt(len) + stt;
			if (str.charAt(len) == ' ' || len == 0) {
				System.out.print(stt + " ");
				stt = "";
			}

			other1(str.substring(0, len--), len, stt);

		}

	}

}
