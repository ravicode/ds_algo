package Trees;

import java.util.Iterator;
import java.util.LinkedList;

import Queue.QueueImplNode;

/*Construct Complete Binary Tree from its Linked List RepresentationGiven 
 * Linked List Representation of Complete Binary Tree, construct the Binary tree.
 *  A complete binary tree can be represented in an array in the following approach.

 If root node is stored at index i, its left, and right children are stored 
 at indices 2*i+1, 2*i+2 respectively.
 Suppose tree is represented by a linked list in same way, how do we convert 
 this into normal linked representation of binary tree where every node has data, 
 left and right pointers? In the linked list representation, we cannot directly access 
 the children of the current node unless we traverse the list.



 We are mainly given level order traversal in sequential access form. We know head of
 linked list is always is root of the tree. We take the first node as root and we also
 know that the next two nodes are left and right children of root. So we know partial
 Binary Tree. The idea is to do Level order traversal of the partially built Binary Tree
 using queue and traverse the linked list at the same time. At every step, we take the
 parent node from queue, make next two nodes of linked list as children of the parent 
 node, and enqueue the next two nodes to queue.

 1. Create an empty queue.
 2. Make the first node of the list as root, and enqueue it to the queue.
 3. Until we reach the end of the list, do the following.
 ���a. Dequeue one node from the queue. This is the current parent.
 ���b. Traverse two nodes in the list, add them as children of the current parent.
 ���c. Enqueue the two nodes into the queue.

 */

public class ConstructCompleteBinTreeFromLinkedListRepresentation {

	public static void main(String[] args) {

		LinkedList<Node> li = new LinkedList<Node>();
		li.add(new Node(5));
		li.add(new Node(10));
		li.add(new Node(12));
		li.add(new Node(13));
		li.add(new Node(16));
		li.add(new Node(20));
		li.add(new Node(22));
		li.add(new Node(23));
		Iterator<Node> it = li.iterator();
		Node root = it.next();
		
		QueueImplNode<Node> s = new QueueImplNode<Node>(15); // use of generics
		try {

			s.enque(root);
			while (it.hasNext()) {
				Node temp = s.deque();

				if (s.isEmpty())
					return;

				if (temp.getLeft() == null && it.hasNext()) {
					Node t = it.next();
					s.enque(t);
					temp.setLeft(t);
				}
				if (temp.getRight() == null && it.hasNext()) {
					Node t = it.next();
					s.enque(t);
					temp.setRight(t);
				}
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

		preOrder(root);

	}

	static Node preOrder(Node root) {
		if (root == null)
			return null;

		if (root != null) {

			System.out.println(root.getKey());
			preOrder(root.getLeft());
			preOrder(root.getRight());

		}

		return null;
	}

}
