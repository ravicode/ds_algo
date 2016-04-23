package Trees;

/*Floor and Ceil from a BST There are numerous applications we need to find floor (ceil)
 *  value of a key in a binary search tree or sorted array.
 *   For example, consider designing memory management system in which free nodes are
 *    arranged in BST. Find best fit for the input request.

Ceil Value Node: Node with smallest data larger than or equal to key value.

Imagine we are moving down the tree, and assume we are root node. The comparison yields
 three possibilities,

A) Root data is equal to key. We are done, root data is ceil value.

B) Root data < key value, certainly the ceil value can�t be in left subtree. Proceed 
to search on right subtree as reduced problem instance.

C) Root data > key value, the ceil value may be in left subtree. We may find a node with 
is larger data than key value in left subtree, if not the root itself will be ceil node.
*/


public class FloorAndCeilOfBST {

	// find predecessor and successor
	//sort by inorder and find the value by scanning..
}
