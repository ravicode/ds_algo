package Trees;

import java.util.Arrays;




/*
 * 
 * 1) Create a temp array arr[] that stores inorder traversal of the tree. This step takes O(n) time.
 2) Sort the temp array arr[]. Time complexity of this step depends upon the sorting algorithm. In the following implementation,
  Quick Sort is used which takes (n^2) time. This can be done in O(nLogn) time using Heap Sort or Merge Sort.
 3) Again do inorder traversal of tree and copy array elements to tree nodes one by one. This step takes O(n) time.
 */


/*Given a Binary tree convert into a BST no auxillary space 
(i did it with an inorder traversal) he asked me to code.*/

// 1) inorder traveral if binary tree and store in an array
//2) sort array  o(nlog(n))
//3) inorder traveral if binary tree and store aray values at rootKeys.

//o (n(logn))

public class ConvertBinaryTreeToBST {

	public static void main(String[] args) {
		Node tc = Tree.TreeCreate();
		int count = Tree.getSize(tc);
		int arr[] = new int[count];
		System.out.print("Binary Tree Inorder=");
		arr = Tree.inOrder(tc, arr);
		System.out.println();
		System.out.println("Binary Tree Inorder in array="
				+ Arrays.toString(arr));
		Arrays.sort(arr);
		System.out.println("Binary Tree Inorder in array after sort="
				+ Arrays.toString(arr));
		convertToBST(tc, arr);
		System.out.println();
		System.out.println("Binary Search Tree Inorder");
		inOrder1(tc);
	}

	static int i = 0;

	static void convertToBST(Node root, int arr[]) {
		if (root != null) {
			convertToBST(root.getLeft(), arr);
			// System.out.print(root.getKey()+" ");
			root.setKey(arr[i++]);
			convertToBST(root.getRight(), arr);
		}
	}

	public static void inOrder1(Node root) {

		if (root != null) {
			inOrder1(root.getLeft());
			System.out.print(root.getKey() + " ");
			inOrder1(root.getRight());

		}

	}

}
