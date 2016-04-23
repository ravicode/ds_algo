package Trees;



import Trees.Node;
import Trees.TreeCreate;

/*Given a binary tree, convert it into doubly linked list and after the conversion,
the linked list should
look like the post order traversal of the binary tree. 
The conversion should be in-place. What is the time and space complexity of the
program.*/


public class ConvertBinTreeToDLLAndPrintPostOrder {

	Node pre = null;
	Node head = null;
static int count=0;
	void inOrder(Node root) {
		
		if (root != null) {

			//System.out.println(root==null);
			inOrder(root.getLeft());
			inOrder(root.getRight());
			if (pre == null) {
				this.head = root;

			} else {
				root.setLeft(pre);
				pre.setRight(root);
			}
			this.pre = root;
			count++;
			//System.out.println(root.getKey());
			
		}
		
			//pre.setRight(null);
	}

	static void printLinkedList(Node root) {
		// System.out.println(root);
		int c=0;
		while (c!=count) {
			System.out.println(root.getKey());
			root = root.getRight();
			c++;
		}

	}

	public static void main(String[] args) {

		ConvertBinTreeToDLLAndPrintPostOrder dl = new ConvertBinTreeToDLLAndPrintPostOrder();

		/*
		 * Node n = Tree.TreeCreate(); inOrder(n); printLinkedList(head);
		 */

		System.out.println("----------BST --------");
		TreeCreate tc = TreeCreate.treeCreate1();

		dl.inOrder(tc.root);

		System.out
				.println("----------print BST after conversion to Sorted Doubly LinkedList --------");
	printLinkedList(dl.head);

	}

}

