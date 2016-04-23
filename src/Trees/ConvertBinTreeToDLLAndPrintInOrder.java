package Trees;


import Trees.Node;
import Trees.TreeCreate;

/*Convert a given Binary Tree to Doubly Linked List | Set 1Given a Binary Tree (Bt), 
 * convert it to a Doubly Linked List(DLL). The left and right pointers in nodes are to be used as
 *  previous and next pointers respectively in converted DLL. 
 *  The order of nodes in DLL must be same as Inorder of the given Binary Tree. 
 *  The first node of Inorder traversal (left most node in BT) must be head node of the DLL.

 do inorder traversal of the binary tree. While doing inorder traversal, keep track of the previously visited 
 node in a variable say prev. For every visited node, make it next of prev and previous of this node as prev.

 */

public class ConvertBinTreeToDLLAndPrintInOrder {

	Node pre = null;
	Node head = null;

	void inOrder(Node root) {
		if (root != null) {

			inOrder(root.getLeft());

			if (pre == null) {
				this.head = root;

			} else {
				root.setLeft(pre);
				pre.setRight(root);
			}
			this.pre = root;

			// System.out.println(root.getKey());
			inOrder(root.getRight());
		}
	}

	static void printLinkedList(Node root) {
		// System.out.println(root);
		while (root != null) {
			System.out.println(root.getKey());
			root = root.getRight();
		}

	}

	public static void main(String[] args) {

		ConvertBinTreeToDLLAndPrintInOrder dl = new ConvertBinTreeToDLLAndPrintInOrder();

		/*
		 * Node n = Tree.TreeCreate(); inOrder(n); printLinkedList(head);
		 */

		System.out.println("----------BST --------");
		TreeCreate tc = TreeCreate.treeCreate();

		dl.inOrder(tc.root);

		System.out
				.println("----------print BST after conversion to Sorted Doubly LinkedList --------");
		printLinkedList(dl.head);

	}

}
