package Searching;

/*Given a infinite stream of integers, find the first non-repeated number till now.
Write code for this.*/

// http://www.geeksforgeeks.org/find-first-non-repeating-character-stream-characters/
/*
1) Create an empty DLL. Also create two arrays inDLL[] and repeated[] of size 256. 
inDLL is an array of pointers to DLL nodes. repeated[] is a boolean array, 
repeated[x] is true if x is repeated two or more times, otherwise false. 
inDLL[x] contains pointer to a DLL node if character x is present in DLL, 
otherwise NULL. 

2) Initialize all entries of inDLL[] as NULL and repeated[] as false.

3) To get the first non-repeating character, return character at head of DLL.

4) Following are steps to process a new character 'x' in stream.
a) If repeated[x] is true, ignore this character (x is already repeated two
   or more times in the stream) 
b) If repeated[x] is false and inDLL[x] is NULL (x is seen first time)
  Append x to DLL and store address of new DLL node in inDLL[x].
c) If repeated[x] is false and inDLL[x] is not NULL (x is seen second time)
  Get DLL node of x using inDLL[x] and remove the node. Also, mark inDLL[x] 
  as NULL and repeated[x] as true.
  
  
  Note that appending a new node to DLL is O(1) operation if we maintain tail pointer. 
  Removing a node from DLL is also O(1). So both operations,
   addition of new character and finding first non-repeating character take O(1) time.
*/

public class FindFirstNonRepeatedCharacterFromAinfiniteStream {

}
