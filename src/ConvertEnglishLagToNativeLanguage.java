
/*how to convert an english sentence into our native language 
 sentence(given an dictionary of english-native language)..
 
 Questions:-  what data 
 structures will be used for implementing dictionary and how to convert 
 using it??*/
//https://www.quora.com/How-can-I-implement-an-English-dictionary
/*
 * 
 Solutions:-  
 1 ) Trie 

 Description:- It is usually used to implement dictionary since the complexity of finding a particular word from given dictionary words is O(L) where L is the length of the word.
 (prefix search and fast lookup)
 If you want to be able to check if a given prefix exists while supporting fast lookups, a trie is a good option, though it can be a bit space-inefficient. It also supports fast insertions or deletions. It also allows for iteration in alphabetical order, which hashing doesn't offer. 

 Correct Implementation: -
 DS maps a key to a value and that is what you want.
 Now, these DS are internally implemented as TRIES, which makes it easier to find the key. The implementation used would be standard, efficient and also fast. So it would make more sense to use these DS rather than implementing your own.

 Next is loading the text file that contains the words. As you mentioned, you will use a text file which will store a word and its meaning in each line. In order to have both in the same line you would have to use a delimiter so that your program can differentiate between word and meaning. So each of your line could be something like this:

 WORD##MEANING, where ## is a delimiter.

 All you have to do is, read the file, parse it into KEY->VALUE pairs for each line, store it in the above mentioned DS.

 Now when the user searches for a word, all you have to do is find the value corresponding to that key.


 2) HashMap   ( optimal when you just want to check if the word exists or not in your dictionary.)

 Description-  HashMap will map to a HashTable. Basically depending upon the first character, 
 we will get the associated hashTable and then using this, we can add the words starting from that character. 
 Hashing function can be smartly based on the string.  (no prefix search)

 3)Ternary Search Tree

 Description:- If you want trie-like behavior but don't want to pay a huge space penalty, the ternary search tree is another viable option, as is the radix tree. These are very different structures, but can be much better than the trie in different circumstance


 4)Succinct Tree:-

 Description:-  sIf space is a concern but you want a trie, look into the succinct trie representation, which has slower lookups but just about theoretically optimal space usage.
 */
public class ConvertEnglishLagToNativeLanguage {

}
