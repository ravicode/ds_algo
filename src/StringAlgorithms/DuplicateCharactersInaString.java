package StringAlgorithms;
import java.util.HashMap;
import java.util.Set;

public class DuplicateCharactersInaString {

	public void findDuplicateChars(String str1) {
		char a[] = str1.toCharArray();
		int len = str1.length();

		HashMap<Character, Integer> mp = new HashMap<Character, Integer>();
		// mp.put(key, value)

		for (Character c : a) {
			if (mp.containsKey(c)) {

				mp.put(c, mp.get(c) + 1);
				System.out.println(c + "=" + mp.get(c));
			} else {
				mp.put(c, 1);
			}
		}

		/*
		 * Set<Character> keys = mp.keySet(); for(Character ch:keys){
		 * if(mp.get(ch) > 1){ System.out.println(ch+"--->"+mp.get(ch)); } }
		 * 
		 * System.out.println(mp.keySet());
		 */
	}

	public static void main(String[] args) {

		String str = "abccda";

		DuplicateCharactersInaString dst = new DuplicateCharactersInaString();
		dst.findDuplicateChars(str);
	}

}
