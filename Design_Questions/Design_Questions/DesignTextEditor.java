package Design_Questions;

/*
 * 
 * Design a Text Editor, in term of class diagram and data structure required to store the data/text and
 *  Insert, Delete, search in both direction and Edit operation. Calculate the time complexity for all operation. 
Note: the size of file is huge and we don't have the RAM to load entire file into a memory.
 */
/*
 * think we can do it by using double linked-list, which is hold pointers pointing a fix-size of buffer.
 *  Insertion\Delete\Edit may have O(1) complexity(),also could add hash_map whose key is line number and value is pointers belong
 *   to the linked-list. 
About search forward or backwards, firstly we must locate the current position and using KMP to finishing searching, and the complexcity is O(L*N),
 L is line size and N is charcter number average.
 */

//ROPE data structure is used generally for the text editors]

/*
 * Yes, doubly linked lists should work!

Also, if we are to maintain line numbers, on inserting a new line somewhere in between, 
we need to update the line numbers on all the lines following it. This is linear ofcourse.

We could use an index on line numbers. So we could retrieve the line in constant time from this index.
 However, on inserting a new line we need to update the index. This is linear again.
 */
public class DesignTextEditor {

}
