package LinkedList;

import Trees.Node;

public class FlattenMultiLevelLinkedList {

	// A utility function to print all nodes of a linked list
	void printList(Node node) {
		while (node != null) {
			System.out.print(node.getKey() + " ");
			node = node.getRight();
		}
		System.out.println("");
	}

	/* The main function that flattens a multilevel linked list */
	void flattenList(Node node) {

		/* Base case */
		if (node == null) {
			return;
		}

		Node tmp = null;

		/* Find tail node of first level linked list */
		Node tail = node;
		while (tail.getRight() != null) {
			tail = tail.getRight();
		}

		// One by one traverse through all nodes of first level
		// linked list till we reach the tail node
		Node cur = node;
		while (cur != tail) {

			// If current node has a child
			if (cur.getLeft() != null) {

				// then append the child at the end of current list
				tail.setRight(cur.getLeft());

				// and update the tail to new last node
				tmp = cur.getLeft();
				while (tmp.getRight() != null) {
					tmp = tmp.getRight();
				}
				tail = tmp;
			}

			// Change current node
			cur = cur.getRight();
		}
	}

	public static void main(String[] args) {
		Node r = new Node(10);//
		Node rr = new Node(5);//
		Node rrr = new Node(12); //
		Node rrrr = new Node(7);//
		Node rrrrr = new Node(11);//

		Node rl = new Node(4);//
		Node rlr = new Node(20);//
		Node rlrr = new Node(13);//

		Node rlrl = new Node(2);//

		Node rlrrl = new Node(16);//
		Node rlrrll = new Node(3);//

		Node rrrrl = new Node(17);//
		Node rrrrll = new Node(9);//
		Node rrrrlll = new Node(19);//

		Node rrrrlr = new Node(6);//
		Node rrrrllr = new Node(8);//
		Node rrrrlllr = new Node(15);//

		r.setRight(rr);
		rr.setRight(rrr);
		rrr.setRight(rrrr);
		rrrr.setRight(rrrrr);

		r.setLeft(rl);
		rl.setRight(rlr);
		rlr.setRight(rlrr);
		rlr.setLeft(rlrl);
		rlrr.setLeft(rlrrl);
		rlrrl.setLeft(rlrrll);
		rrrr.setLeft(rrrrl);
		rrrrl.setLeft(rrrrll);
		rrrrll.setLeft(rrrrlll);
		rrrrl.setRight(rrrrlr);
		rrrrll.setRight(rrrrllr);
		rrrrlll.setRight(rrrrlllr);

		FlattenMultiLevelLinkedList list = new FlattenMultiLevelLinkedList();
		list.flattenList(r);
		list.printList(r);
	}
}
