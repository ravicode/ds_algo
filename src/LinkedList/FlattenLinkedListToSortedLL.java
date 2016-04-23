package LinkedList;

import Trees.Node;

/*1) Given a linked list where every node represents a linked list and contains
 two pointers of its type:
 (i) Pointer to next node in the main list.

 (ii) Pointer to a linked list where this node is head.
 Write flatten function to flatten the lists into a single linked list (sorted).

 */

// solution  -- 1) merge two linked lists in sorted order concept

// Java program for flattening a Linked List
public class FlattenLinkedListToSortedLL {

	Node root; // head of list

	
	// An utility function to merge two sorted linked lists
	Node merge(Node a, Node b) {
		// if first linked list is empty then second
		// is the answer
		if (a == null)
			return b;

		// if second linked list is empty then first
		// is the result
		if (b == null)
			return a;

		// compare the data members of the two lonked lists
		// and put the larger one in the result
		Node result;

		if (a.getKey() < b.getKey()) {
			result = a;
			result.setLeft(merge(a.getLeft(), b));
		}

		else {
			result = b;
			result.setLeft(merge(a, b.getLeft()));
		}

		return result;
	}

	Node flatten(Node root) {
		// Base Cases
		if (root == null || root.getRight() == null)
			return root;

		// recur for list on right
		root.setRight(flatten(root.getRight()));

		// now merge
		root = merge(root, root.getRight());

		// return the root
		// it will be in turn merged with its left
		return root;
	}

	
	void printList() {
		Node temp = root;
		while (temp != null) {
			System.out.print(temp.getKey() + " ");
			temp = temp.getLeft();
		}
		System.out.println();
	}

	/* Drier program to test above functions */
	public static void main(String args[]) {
		FlattenLinkedListToSortedLL L = new FlattenLinkedListToSortedLL();

		/* Let us create the following linked list
        5 -> 10 -> 19 -> 28
        |    |     |     |
        V    V     V     V
        7    20    22    35
        |          |     |
        V          V     V
        8          50    40
        |                |
        V                V
        30               45
    */
Node r=new Node(5);
Node rl=new Node(7);
Node rll=new Node(8);
Node rlll=new Node(30);
Node rr=new Node(10);
Node rrl=new Node(20);
Node rrr=new Node(19);
Node rrrl=new Node(22);
Node rrrll=new Node(50);
Node rrrr=new Node(28);
Node rrrrl=new Node(35);
Node rrrrll=new Node(40);
Node rrrrlll=new Node(45);

r.setRight(rr);
rr.setRight(rrr);
rrr.setRight(rrrr);

rrrr.setLeft(rrrrl);
rrrrl.setLeft(rrrrll);
rrrrll.setLeft(rrrrlll);

rrr.setLeft(rrrl);
rrrl.setLeft(rrrll);

rr.setLeft(rrl);

r.setLeft(rl);
rl.setLeft(rll);
rll.setLeft(rlll);


		// flatten the list
		L.root = L.flatten(r);

		L.printList();
	}
}
