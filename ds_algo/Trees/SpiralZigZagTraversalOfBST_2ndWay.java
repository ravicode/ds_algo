package Trees;

import java.util.LinkedList;
import java.util.Stack;

import Trees.Node;
import Trees.TreeCreate;

/*
 * Print the level order traversal of the binary tree in the spiral form.
 [They also asked us the solution without any extra space and O(n)
 Time complexity].*/

public class SpiralZigZagTraversalOfBST_2ndWay {

	static void spiralZigZagTraversal(Node root) {

		// boolean a=false;
		int leftToRight = 1;

		Stack<Node> st1 = new Stack<Node>();
		Stack<Node> st2 = new Stack<Node>();
		st1.push(root);
		while (!st1.isEmpty()) {
			Node temp = st1.pop();
			System.out.print(temp.getKey() + " ");

			if (leftToRight == 1) {
				if (temp.getLeft() != null)
					st2.push(temp.getLeft());

				if (temp.getRight() != null)
					st2.push(temp.getRight());
			} else {
				if (temp.getRight() != null)
					st2.push(temp.getRight());
				if (temp.getLeft() != null)
					st2.push(temp.getLeft());
			}

			if (st1.isEmpty()) {
				leftToRight = 1 - leftToRight;

				Stack temp1 = st1;
				st1 = st2;
				st2 = temp1;

				System.out.println();
			}
		}
	}

	public static void main(String[] args) {

		TreeCreate tc = TreeCreate.treeCreate1();

		spiralZigZagTraversal(tc.root);
	}

}
