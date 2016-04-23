package Trees;

import Trees.Node;
import Trees.TreeCreate;

public class InOrderPredecessorInBST {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeCreate tc = TreeCreate.treeCreate1();
		InOrderPredecessorInBST in = new InOrderPredecessorInBST();
		tc.inOrderWithoutRecursion(tc.root);
		Node predecessor = in.findInOrderPredecessor(11, tc.root);
		if (predecessor != null)
			System.out.println(predecessor.getKey());
		else
			System.out
					.println("No Predecessor, Number is  not present or is minimum number");

	}

	Node findInOrderPredecessor(int key, Node root) {
		Node current = TreeCreate.search(key, root);
		if (current == null)
			return null;

		if (current.getLeft() != null)
			return TreeCreate.findmax(current.getLeft());
		else {
			Node predecessor = null;
			Node ancestor = root;
			while (ancestor != current) {
				if (current.getKey() > ancestor.getKey()) {
					predecessor = ancestor;
					ancestor = ancestor.getRight();

				} else

					ancestor = ancestor.getLeft();

			}
			return predecessor;
		}

		// System.out.println(current);
	}

}
