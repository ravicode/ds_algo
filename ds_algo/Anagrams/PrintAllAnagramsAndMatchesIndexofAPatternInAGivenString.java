package Anagrams;

/*  Question:-  
 * Given a string S and a pattern P, 
 * you need to find the number of occurrences of anagrams
 *  of pattern P in string S optimally.
 */


/* Question:- 
 * Given a text txt[0..n-1] and a pattern pat[0..m-1], 
write a function search(char pat[], char txt[]) 
that prints all occurrences of pat[] 
		and its permutations (or anagrams) in txt[]. You may assume that n > m. 

E.g. : I/p : txt[] = �BACDGABCDA�    pat[] = �ABCD�
          o/p : Found at index 0
                    Found at index 5
                    Found at index 6*/ 

//use hashing technique and print index + legth(pattern)


// use counting sort way of storing and then decreasing of its pattern




public class PrintAllAnagramsAndMatchesIndexofAPatternInAGivenString {

	public static void main(String[] args) {
		String str = "ABDACDBACA";
		String pattern = "ABCD";
		checkAnagramByHashing(str, pattern);

		checkAnagramByIndexing(str, pattern);

	}

	static void checkAnagramByIndexing(String str, String pattern) {
		boolean flag = true;
		for (int i = 0; i < str.length() - 3; i++) {
			flag = true;
			String s = str.substring(i, i + 4);
			char ch[] = s.toCharArray();
			char pat[] = pattern.toCharArray();

			int count[] = new int[125];

			for (int j = 0; j < s.length(); j++) {
				count[ch[j]]++;
				count[pat[j]]--;
			}

			for (int j = 0; j < count.length; j++) {
				if (count[j] > 0) {

					flag = false;
					break;

				}

			}

			if (flag)
				System.out.println(i);

		}

	}

	static void checkAnagramByHashing(String str, String pattern) {
		int hashofPatt = 0;

		for (int i = 0; i < pattern.length(); i++) {
			hashofPatt += pattern.charAt(i);
		}

		System.out.println("Hash of pattern=" + hashofPatt);
		int has = 0;
		int k = 0;

		int pos = 0, pos1 = 0;
		// match hash of pattern with each sustring of 4 length in given string
		for (int i = 0; i < str.length(); i++) {

			if (k == 0) {
				pos = i;

			}
			k++;
			has += str.charAt(i);
			if (k == 4) {
				if (has == hashofPatt) {
					System.out.println(pos);

				}
				has = 0;
				k = 0;
				i = pos;
			}

		}

	}

}