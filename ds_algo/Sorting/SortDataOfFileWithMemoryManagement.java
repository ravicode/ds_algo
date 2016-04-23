package Sorting;

/*Suppose you have a file with billion entries and you have to sort the data of a file 
 * according 
to a column and can put only that column in memory and after putting that your memory gets
 full.
e.g. your file contains
name age address pincode sex
�.. �. � � �
And you can have to sort the file according to pincode then you can only put pincode in the
memory.
I approached it firstly by using merge sort but this requires the entire file to be put 
into memory. Then, I suggested using min heap but he said that heapify process of billion 
numbers will take a lot of time. He said you are getting close, then I suggested that we can
 use
a balanced binary search tree to store the pincodes along with indexes and then traverse the
 bst 
in inorder fashion and swap the indices of the first pincode of file with the index of 
inorder 
element. He was happy after hearing this and asked me to write the code and to be careful
 with 
edge cases.*/


public class SortDataOfFileWithMemoryManagement {

}
