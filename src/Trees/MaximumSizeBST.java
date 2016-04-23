package Trees;

import Trees.Node;
import Trees.TreeCreate;

/*Find the maximum size BST present in the binary tree.*/

//do it 

/*
 Start from root and do an inorder traversal of the tree. For each node N, 
 check whether the subtree rooted with N is BST or not. If BST, then return size of the 
 subtree rooted with N. Else, recur down the left and right subtrees and return 
 the maximum of values returned by left and right subtrees.*/
/*
 Time Complexity: The worst case time complexity of this method will be O(n^2).
 Consider a skewed tree for worst case analysis.*/

public class MaximumSizeBST {

	/*
	 * See http://www.geeksforgeeks.org/archives/632 for implementation of
	 * size() See Method 3 of http://www.geeksforgeeks.org/archives/3042 for
	 * implementation of isBST() max() returns maximum of two integers
	 */

	static int findMax() {

		return 1;
	}

	static boolean isBST(Node root) {
		return true;
	}

	static int size(Node root) {
		return 1;
	}

	static int largestBST(Node root) {
		if (isBST(root))
			return size(root);
		else
			return Math.max(largestBST(root.getLeft()),
					largestBST(root.getRight()));
	}

	public static void main(String[] args) {
		TreeCreate tc = TreeCreate.treeCreate();
		largestBST(tc.root);
	}

}
