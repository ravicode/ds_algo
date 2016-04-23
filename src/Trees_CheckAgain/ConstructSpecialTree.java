package Trees_CheckAgain;

import Trees.Node;



/*Construct a special tree from given preorder traversal
 * Given an array �pre[]� that represents Preorder traversal of a spacial binary tree
 *  where every node has either 0 or 2 children.
 *   One more array �preLN[]� is given which has only two possible values �L� and �N�. The value �L� in �preLN[]� indicates that the corresponding node in Binary Tree is a leaf node and value �N� indicates that the corresponding node is non-leaf node. Write a function to construct the tree from the given two arrays.

Source: Amazon Interview Question

Example: 

Input:  pre[] = {10, 30, 20, 5, 15},  preLN[] = {'N', 'N', 'L', 'L', 'L'}
Output: Root of following tree
          10
         /  \
        30   15
       /  \
      20   5
The first element in pre[] will always be root. So we can easily figure out root. If left subtree is empty, the right subtree must also be empty and preLN[] entry for root must be �L�. We can simply create a node and return it. If left and right subtrees are not empty, then recursively call for left and right subtrees and link the returned nodes to root. 

*/

public class ConstructSpecialTree {
	
	
	Node constructTreeUtil(int pre[], char preLN[], int index_ptr, int n) {
		int index = index_ptr; // store the current value of index in pre[]
		// Base Case: All nodes are constructed
		if (index == n)
			return null;
		// Allocate memory for this node and increment index for
		// subsequent recursive calls
		Node temp = new Node(pre[index]);
		index_ptr++;
		// If this is an internal node, construct left and right subtrees and
		// link the subtrees
		if (preLN[index] == 'N') {
			temp.setLeft(constructTreeUtil(pre, preLN, index_ptr, n));
			temp.setRight(constructTreeUtil(pre, preLN, index_ptr, n));
		}
		return temp;
	} // A wrapper over constructTreeUtil()

	/* This function is used only for testing */
	void printInorder(Node node) {
		if (node == null)
			return; /* first recur on left child */
		printInorder(node.getLeft()); /* then print the data of node */
		System.out.println(node.getKey());
		/* now recur on right child */
		printInorder(node.getRight());
	}

	public static void main(String[] args) {
		Node root = null;
		ConstructSpecialTree ct = new ConstructSpecialTree();
		int pre[] = { 10, 30, 20, 5, 15 };
		char preLN[] = { 'N', 'N', 'L', 'L', 'L' };
		int n = pre.length;

		// construct the above tree
		root = ct.constructTreeUtil(pre, preLN, 0, n);
		// Test the constructed tree
		System.out
				.println("Following is Inorder Traversal of the Constructed Binary Tree: \n");
		ct.printInorder(root);

	}

}
