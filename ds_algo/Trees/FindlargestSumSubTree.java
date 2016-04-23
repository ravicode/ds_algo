package Trees;

import Trees.Node;
import Trees.TreeCreate;

/*
 * Find the largest sum subtree in a given Binary Tree.
 */

public class FindlargestSumSubTree {
	static int toSumTree(Node root) {
		// Base case
		if (root == null)
			return 0;

		// Store the old value
		int old_val = root.getKey();

		// Recursively call for left and right subtrees and store the sum as
		// new value of this node
		
		root.setKey(toSumTree(root.getLeft()) + toSumTree(root.getRight()));
		
		// Return the sum of values of nodes in left and right subtrees and
		// old_value of this node
		return root.getKey() + old_val;
	}

	public static void main(String[] args) {

		TreeCreate tc = TreeCreate.treeCreate1();
		tc.inOrderWithoutRecursion(tc.root);

		int k = toSumTree(tc.root);

		System.out.println(k);

		tc.inOrderWithoutRecursion(tc.root);
	}

}
