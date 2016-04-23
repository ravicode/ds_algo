package Anagrams;

/*
 * 
 * Given an array of words, print all anagrams together. 
 For example, if the given array is {�cat�, �dog�, �tac�, �god�, �act�}, then output may be �cat tac act dog god�.

 We have discussed two different methods in the previous post. In this post, a more efficient solution is discussed.

 Trie data structure can be used for a more efficient solution. Insert the sorted order of each word in the trie.
 Since all the anagrams will end at the same leaf node. 
 We can start a linked list at the leaf nodes where each node represents the index of the original array of words. 
 Finally, traverse the Trie. While traversing the Trie, traverse each linked list one line at a time.
 Following are the detailed steps.

 1) Create an empty Trie
 2) One by one take all words of input sequence. Do following for each word
 �a) Copy the word to a buffer.
 �b) Sort the buffer
 �c) Insert the sorted buffer and index of this word to Trie. Each leaf node of Trie is head of a Index list. 
 The Index list stores index of words in original sequence. If sorted buffe is already present, we insert index
 of this word to the index list.
 3) Traverse Trie. While traversing, if you reach a leaf node, traverse the index list. And print all words
 using the index obtained from Index list.

 */
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class DStoImplementAnagramsFindingAndStorageFromGivenSequenceOfStrings {

	public static void main(String[] args) {
		String str[] = { "cat", "dog", "tac", "god", "act" };

		List<Integer> li = null;
		Map<String, List<Integer>> mp = new HashMap<String, List<Integer>>();
		for (int i = 0; i < str.length; i++) {

			char[] chars = str[i].toCharArray();
			Arrays.sort(chars);
			String sorted = new String(chars);

			if (mp.get(sorted) == null) {
				li = new LinkedList<Integer>();
				li.add(i);
				mp.put(sorted, li);
			} else {
				li = mp.get(sorted);
				li.add(i);
				mp.put(sorted, li);
			}

		}

		// find anagrams for "odg"

		String find_anagram_of = "odg";

		char[] char_find_anagram_of = find_anagram_of.toCharArray();
		Arrays.sort(char_find_anagram_of);
		String sorted = new String(char_find_anagram_of);

		List<Integer> l = mp.get(sorted);

		// System.out.println(mp.entrySet());

		for (int i : l)
			System.out.println(str[i]);

	}
}
