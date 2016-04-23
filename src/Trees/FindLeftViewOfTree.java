package Trees;

import java.util.LinkedList;
import java.util.Queue;

import Trees.Node;
import Trees.TreeCreate;

/*Left view of binary tree*/

public class FindLeftViewOfTree {

	public static void main(String[] args) {
		TreeCreate tc = TreeCreate.treeCreate1();
		levelOrderLeftViewTraversal(tc.root);
	}

	static void levelOrderLeftViewTraversal(Node root) {
		Queue<Node> q = new LinkedList<Node>();
		q.add(root);
		q.add(null);
		int k = 1;
		while (!q.isEmpty()) {
			Node temp = q.remove();

			if (temp == null) {

				if (q.isEmpty()) {
					return;

				}
				q.add(null);
				k = 1;
			} else {
				if (k == 1)
					System.out.println(temp.getKey());
				k++;
				if (temp.getLeft() != null)
					q.add(temp.getLeft());

				if (temp.getRight() != null)
					q.add(temp.getRight());

			}
		}
	}

}
