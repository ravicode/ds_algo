package Trees;

/*. Given an array that contains post-order traversal of a binary tree. 
 Can you construct a single tree? I said no. 
 Then he asked if i can make a binary search tree from the array to
 which i said yes. 
 Then after discussing the approach, he asked to write the code.

 */

//1) postOrder- last element is root
//2) preOrder- first element is root
//3) by idetifying the root element in inorder traversal , we can divide inorder traversal in left and right half. 

/*
 * From the post-order array, we know that last element is the root.
 *  We can find the root in in-order array. 
 *  Then we can identify the left and right sub-trees of the root from in-order array.
 *  
 */
public class ConstructATreeFromAPostOrderTraversal {

}
