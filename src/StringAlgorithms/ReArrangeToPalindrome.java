package StringAlgorithms;

import java.util.HashMap;
import java.util.Set;

public class ReArrangeToPalindrome {

	HashMap<Character, Integer> hmp = new HashMap<Character, Integer>();

	public void isPalindromePossible(String str) {
		int i = 0;
		char[] ch = str.toCharArray();
		if (ch.length == 0) {
			System.out.println("Empty String");
			return;
		} else if (ch.length == 1) {
			System.out.println("---PalinDrome---");
			return;
		}

		while (i != ch.length) {

			if (hmp.containsKey(ch[i])) {
				hmp.put(ch[i], hmp.get(ch[i]) + 1);
			} else {
				hmp.put(ch[i], 1);
			}
			i++;
		}

		findPalinDrome(str);

	}

	public void findPalinDrome(String str) {
		Set<Character> ch1 = hmp.keySet();
		int k = 0;

		int ik = 0;
		for (Character ch : ch1) {

			if (hmp.get(ch) % 2 == 0) {

			} else {
				k++;

				if (k % 2 == 0) {
					System.out.println("---No Palindrome---");
					return;
				}

			}

		}
		System.out.println("---PalinDrome---");
		reArrangePalinDrome(str);

	}

	public void reArrangePalinDrome(String str) {
		int length = str.length();
		int mid = length / 2;
		char ch[] = str.toCharArray();
		char chNew[] = new char[length];
		// ch[mid]=singleCh;
		int i = 0;
		for (Character ch1 : ch) {

			if (hmp.get(ch1) % 2 == 0) {
				chNew[i] = ch1;
				chNew[length - i - 1] = ch1;

			}

			i++;
		}

		for (int k = 0; k < length; k++) {
			System.out.print(chNew[k]);
		}
	}

	public static void main(String[] args) {

		ReArrangeToPalindrome rp = new ReArrangeToPalindrome();
		String str = "abacb";
		rp.isPalindromePossible(str);

	}

}
