package Trees;

import Trees.Node;
import Trees.TreeCreate;

/*
 Replace the data of every node of a Binary Search Tree with the sum of all the 
 nodes greater than it.
 I gave him the approach using reverse inorder traversal. He then asked me to write a 
 code on paper. I had used pointers in the code. He then asked me to write a code that 
 did not use pointers, static variables or global variables.
 I wrote that. Finally he appeared satisfied.
 */

public class ReplaceDataOfBSTbySumOFNodesGreaterThanNode {

	static int sum = 0;

	public static void main(String[] args) {
		TreeCreate tc = TreeCreate.treeCreate();
		// sum=0;
		inOrder(tc.root);
		System.out.println();
		inOrder1(tc.root);
	}

	static void inOrder(Node root) {
		if (root == null)
			return;

		inOrder(root.getRight());
		sum += root.getKey();
		// System.out.print(root.getKey()+ " ");
		root.setKey(sum);

		inOrder(root.getLeft());

	}

	static void inOrder1(Node root) {
		if (root == null)
			return;

		inOrder1(root.getLeft());
		// sum1+=root.getKey();
		System.out.print(root.getKey() + " ");
		// root.setKey(sum1);
		// System.out.println(sum1);
		inOrder1(root.getRight());

	}

}
