package StringAlgorithms;

import java.util.Arrays;

//SC= o(n) .. o(m+n)
public class FindSubStringInAString_KMPAlgo {

	public static void main(String[] args) {

		String pattern = "abcaby";
		String text = "abxabcabcaby";
		char patt[] = pattern.toCharArray();
		int pattIndex[] = findPatternPrefixIsSuffix(patt);

		isMatchFound(text, patt, pattIndex);

	}

	static void isMatchFound(String text, char patt[], int pattIndex[]) {
		char tex[] = text.toCharArray();
		int j = 0;
		int i = 0;
		boolean isPresent = false;
		for (i = 0; i < tex.length;) {
			if (j == patt.length) {
				isPresent = true;
				System.out.println("pattern is present");
				break;
			}

			if (tex[i] == patt[j]) {
				j++;
				i++;
			} else {
				if (j >= 1)
					j = pattIndex[--j];
				else
					i++;
			}
		}
		if ((i == tex.length) && (j == patt.length)) {

			System.out.println("patttern is present");
		} else {
			if (!isPresent)
				System.out.println("patttern is not  present");
		}
	}

	static int[] findPatternPrefixIsSuffix(char patt[]) {
		int j = 0;
		int pattIndex[] = new int[patt.length];
		pattIndex[0] = j;
		for (int i = 1; i < patt.length;) {

			if (patt[i] != patt[j]) {
				if (j >= 1) {
					j = pattIndex[--j];
				} else {
					pattIndex[i] = 0;
					i++;
				}

			} else {
				pattIndex[i] = j + 1;
				i++;
				j++;
			}

			// System.out.println(Arrays.toString(pattIndex));
		}

		return pattIndex;

	}

}
