package Anagrams;

/*
Q:- What algorithms and data structures can be used to find anagrams?

Asnwers:-
1) HashMap

Description-
Map each word to the string of its sorted letters. 
Let's call this sorted string the word's "signature". Examples:

teal => aelt
tale => aelt
late => aelt
fate => aeft

Now if you invert the map, you get all of the words with a given "signature". 
So a signature of "aelt" corresponds to the words "teal", "tale", "late", etc. 
There aren't that many words in the English dictionary, 
so storing this entire mapping in memory would only take a few megabytes of RAM.

When someone asks for anagrams of a word, you can compute the word's signature and then return all words with that
 signature. 
 
 Same solution : -
 Create empty hashmap H
For each word in dictionary:
  Create a key that is the word's letters sorted alphabetically (and forced to one case)
  Add the word to the list of words accessed by the hash key in H


To check for all anagrams of a given word:
Create a key that is the letters of the word, sorted (and forced to one case)
Look up that key in H
You now have a list of all anagrams


Relatively fast to build, blazingly fast on look-up.

2)Tries

Description:-

all the words of the dictionary saved in the form of an array of strings. What you essentially need to do is, 
traverse the array and insert the sorted form of the word in the Trie. So for example, the word is "teal" you will
 insert "aelt" in the Trie. 
The Trie is designed in a way that each node is capable of storing a linked list. 
And, for each path(sorted version of any word), this is essentially the last vertex in that path. 
In the example, the 't' in "aelt" contains a linked list that stores the indices(index of that particular word in 
the array) of "teal", "tale", "late". 

Now when you are given any word, you sort the word and traverse the Trie according to the sorted version of the word. The last node will give you a linked list that has the indices of all it's anagrams that are in the dictionary. 

Complexity:
Say you have m words with an average length n.
Sorting a word would be  O(nlgn)
And the insertion in the Trie takes  O(n) . 
The insertion of the index in the linked list would take  O(m) .
 So the total complexity for inserting one word would be  O(nlgn+n+m)i.e.  O(nlgn+m) . 
And for m words this would me  O(mnlgn+m2)O.



3) Take two auxiliary arrays, index array and word array. 

/*
 * 
 * Take two auxiliary arrays, index array and word array. 
 * Populate the word array with the given sequence of words.
 *  Sort each individual word of the word array. 
 *  Finally, sort the word array and keep track of the corresponding indices. 
 *  After sorting, all the anagrams cluster together.
 *   Use the index array to print the strings from the original array of strings.

Let us understand the steps with following input Sequence of Words:

"cat", "dog", "tac", "god", "act"
1) Create two auxiliary arrays index[] and words[]. Copy all given words to words[] and store the original indexes in index[]

index[]:  0   1   2   3   4
words[]: cat dog tac god act
2) Sort individual words in words[]. Index array doesn’t change.

index[]:   0    1    2    3    4
words[]:  act  dgo  act  dgo  act
3) Sort the words array. Compare individual words using strcmp() to sort

index:     0    2    4    1    3
words[]:  act  act  act  dgo  dgo
4) All anagrams come together. But words are changed in words array. To print the original words, take index from the index array and use it in the original array. We get

"cat tac act dog god"
 */





public class DStoImplementAnagramsFindingAndStorage {

}
