package Searching;

import java.util.HashMap;
import java.util.Map;

/*

 find the first non repeating character in a string.*/

public class find1stNonRepeatingCharacter {

	public static void main(String[] args) {
		String str = "aababaacdffgxc";
		firstNotRepeatingWithArray(str);
		firstNotRepeatingWithHashMap(str);

	}

	static void firstNotRepeatingWithArray(String str) {
		char ch[] = str.toCharArray();

		int chInt[] = new int[125];

		for (int i = 0; i < ch.length; i++)
			chInt[ch[i]]++;

		for (int i = 0; i < ch.length; i++) {
			if (chInt[ch[i]] == 1) {
				System.out.println("first  not repeating chracter=" + ch[i]);
				break;
			}

		}

		

	}

	static void firstNotRepeatingWithHashMap(String str) {
		char ch[] = str.toCharArray();
		Map<Character, Integer> hs1 = new HashMap<Character, Integer>();

		for (Character ch1 : ch) {
			if (hs1.containsKey(ch1)) {
				hs1.put(ch1, hs1.get(ch1) + 1);
			} else {
				hs1.put(ch1, 1);
			}
		}

		Character ch2 = null;
		for (Character ch1 : ch) {
			if (hs1.get(ch1) == 1) {
				ch2 = ch1;
				// System.out.println(ch1);
				break;
			}

		}

		System.out.println("So first non-repeating character=" + ch2);
	}
}
