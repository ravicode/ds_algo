package Trees;

/*Using Morris Traversal, we can traverse the tree without using stack and recursion. 
 * The algorithm for Preorder is almost similar to Morris traversal for Inorder.

1...If left child is null, print the current node data. Move to right child.
�.Else, Make the right child of the inorder predecessor point to the current node. 

Two cases arise:
���a) The right child of the inorder predecessor already points to the current node. 
Set right child to NULL. Move to right child of current node.

���b) The right child is NULL. Set it to current node. 
Print current node�s data and move to left child of current node.
2...Iterate until current node is not NULL.
*/

/*
*Using Morris Traversal, we can traverse the tree without 
using stack and recursion. The idea of Morris Traversal is based on 
Threaded Binary Tree. In this traversal, we first create links to Inorder 
successor and print the data using these links, 
and finally revert the changes to restore original tree. */

/*1. Initialize current as root 
2. While current is not NULL
   If current does not have left child
      a) Print current�s data
      b) Go to the right, i.e., current = current->right
   Else
      a) Make current as right child of the rightmost node in current's left subtree
      b) Go to this left child, i.e., current = current->left
Although the tree is modified through the traversal, it is reverted back to its original shape after the completion. Unlike Stack based traversal, no extra space is required for this traversal.
*/
public class MorrisTraversalOfPreOrder {

}
