package Anagrams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// DS to store ANangrams-
//1 . sort all the strings   
//2.  make a trie and add all the words with common characters as a
//alinked list at last leaf of trie

/*Ways to check anagrams:-
 * 1) by array     SC-o(n)   TC- o(n)
 * 2)by hashmap  - SC-o(n)..little more space than array   TC- o(n) 
 * 3)by prime assignment and multiplication   SC- o(n) little more space than array   TC-  o(n)
 *   4)by sorting and use equals  SC-o(n)     TC-nlgn
 * 
 * 
 * 
 */

public class FindAnagrams {

	void findPrimeNumbers(HashMap<Character, Integer> mp) {

		int i = 0;
		boolean flag;

		int cnt = 97;
		while (i < 102) {
			flag = true;
			for (int k = 2; k < i; k++) {
				if (i % k == 0) {
					flag = false;
					break;
				}
			}

			if (flag == true & i > 1) {
				// cnt++;
				// System.out.println(i);
				mp.put((char) cnt++, i);
			}

			i++;
		}

		// System.out.println(cnt);
		// System.out.println(mp.entrySet());
	}

	public void checkAnagramorNot(char str1[], char str2[],
			HashMap<Character, Integer> mp) {
		int s1 = 1, s2 = 1;
		for (int i = 0; i < str1.length; i++) {
			s1 *= mp.get(str1[i]);

		}

		for (int i = 0; i < str2.length; i++) {

			s2 *= mp.get(str2[i]);

		}

		// System.out.println(s1 + " " + s2);
		if (s1 == s2)
			System.out.println("Anagrams");
		else
			System.out.println("not anagrams");

	}

	public static void main(String[] args) {
		FindAnagrams fnd = new FindAnagrams();
		Map<Character, Integer> mp = new HashMap<Character, Integer>();

		String wordArr[] = { "cat", "dog","monkey", "tac", "god","komney", "act" };
		List<String> li = new ArrayList<String>();

		for (int i = 0; i < wordArr.length; i++) {
			if (!li.contains(wordArr[i]))
				li.add(wordArr[i]);
			for (int j = i + 1; j < wordArr.length; j++) {
				boolean flag = fnd.checkAnagramorNot_Array(
						wordArr[i].toCharArray(), wordArr[j].toCharArray());

				if (flag == true) {
					if (!li.contains(wordArr[j]))
						li.add(wordArr[j]);
				}
			}
		}

		System.out.println(li);

		
		long t3 = System.nanoTime();

		fnd.checkAnagramorNot_Array("cat".toCharArray(), "tac".toCharArray());

		long t4 = System.nanoTime();

		System.out.println("Time from Array Wala Logic=" + (t4 - t3));

	/*	long t5 = System.nanoTime();
		fnd.checkAnagramorNot_HashMap("cat".toCharArray(), "tac".toCharArray());
		long t6 = System.nanoTime();

		System.out.println("Time from hashmap Wala Logic=" + (t6 - t5));
		
		fnd.findPrimeNumbers(mp);

		long t1 = System.nanoTime();
		fnd.checkAnagramorNot("cat".toCharArray(), "tac".toCharArray(), mp);
		long t2 = System.nanoTime();

		System.out.println("Time from Prime Wala Logic=" + (t2 - t1));

		long t7 = System.nanoTime();
		fnd.checkAnagramorNot_Sort("cat".toCharArray(), "tac".toCharArray());
		long t8 = System.nanoTime();

		System.out.println("Time from Sort Wala Logic=" + (t8 - t7));*/

	}

	boolean checkAnagramorNot_Array(char str1[], char str2[]) {

		int arr[] = new int[123];
		if(str1.length!=str2.length)
			return false;

		for (int i = 0; i < str1.length; i++) {
			arr[str1[i]] += 1;
			arr[str2[i]] -= 1;
		}

		boolean flag = true;

		for (int i = 0; i < 123; i++) {
			if (arr[i] != 0) {
				// System.out.println("not anagram");
				flag = false;
				break;
			}
		}

		/*
		 * if(flag) System.out.println("Anagrams from int"); else
		 * System.out.println("not anagrams int");
		 */

		return flag;
	}

	public void checkAnagramorNot_HashMap(char str1[], char str2[]) {

		int arr[] = new int[123];

		HashMap<Character, Integer> mp = new HashMap<Character, Integer>();

		for (int i = 0; i < str1.length; i++) {
			// arr[str1[i]]+=1;
			// arr[str2[i]]-=1;

			if (mp.containsKey(str1[i])) {
				mp.put(str1[i], mp.get(str1[i]) + 1);
			} else
				mp.put(str1[i], 1);
		}

		for (int i = 0; i < str2.length; i++) {
			// arr[str1[i]]+=1;
			// arr[str2[i]]-=1;

			if (mp.containsKey(str2[i])) {
				mp.put(str2[i], mp.get(str2[i]) - 1);
			} else
				mp.put(str2[i], 1);
		}
		boolean flag = true;

		for (int i = 0; i < mp.size(); i++) {
			if (mp.get(str1[i]) != 0) {
				// System.out.println("not anagram");
				flag = false;
				break;
			}
		}

		if (flag)
			System.out.println("Anagrams from hashmap");
		else
			System.out.println("not anagrams hashmap");
	}

	public void checkAnagramorNot_Sort(char str1[], char str2[]) {

		Arrays.sort(str1);
		Arrays.sort(str2);

		boolean flag = true;
		for (int i = 0; i < str1.length; i++) {
			if (str1[i] != str2[i]) {
				flag = false;
				break;
			}
		}

		if (flag)
			System.out.println("Anagrams from sort");
		else
			System.out.println("not anagrams sort");
	}
}
