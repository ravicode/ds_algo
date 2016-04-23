package Trees;

import java.util.LinkedList;
import java.util.Queue;

import Trees.Node;
import Trees.TreeCreate;

/* Given a binary tree with usual left and right pointers and one additional
 pointer called adj. modify the tree in-place such that adj pointer should 
 point to the right node in same level as current node or if it there is
 no node right to it, adjshould be NULL. */

//do level order traversal and point accordingly

public class ExtraPointerAdjacetToRightChild {

	public static void main(String[] args) {
		TreeCreate tc = TreeCreate.treeCreate1();

		Queue<Node> q = new LinkedList<Node>();
		q.add(tc.root);
		q.add(null);
		while (!q.isEmpty()) {
			Node temp = q.remove();
			/*
			 * if(temp.getRight()!=null) temp.getLeft().setSib(temp.getRight());
			 */
			if (temp == null) {

				if (q.isEmpty())
					return;
				q.add(null);

			} else {

				temp.setSib(q.peek());

				/*
				 * if (temp.getSib() != null) { System.out.print(temp.getKey() +
				 * " -->" + temp.getSib().getKey()); System.out.println(); }
				 */

				if (temp.getLeft() != null)
					q.add(temp.getLeft());
				if (temp.getRight() != null)
					q.add(temp.getRight());
			}

		}
	}

}
