package Trees_Structure;

import java.util.LinkedList;
import java.util.Queue;

import Trees.Node;
import Trees.TreeCreate;





/*
 *  Given two trees, superimpose them. If not possible to superimpose raise exception.

Example:
           2            2                        2
         /                \        =>           / \
        1                 5                     1  5
           5            2
          /                \       =>        Not superimposable
         1                  5
 */
public class Check2TreeSuperImposeOrNot {

	
	public boolean superImpose(Node root1, Node root2) {

		Queue<Node> queue = new LinkedList<Node>();

		if (root1 == null || root2 == null)

		return true;

		queue.add(root1);

		while (!queue.isEmpty()) {

		root1 = queue.poll();

		if (root1.getKey()==root2.getKey())

		break;

		if (root1.getLeft() != null)

		queue.add(root1.getLeft());

		if (root1.getRight() != null)

		queue.add(root1.getRight());

		}

		if (check(root1, root2)) {

		return true;

		}

		return false;

		}

		public boolean check(Node root1, Node root2) {

		if ((root1 == null && root2 != null) || (root1 != null && root2 == null) || (root1 == null && root2 == null))

		return true;

		if (!(root1.getKey()==(root2.getKey())))

		return false;

		return check(root1.getLeft(), root2.getLeft()) && check(root1.getRight(), root2.getRight());

		}
		
		public static void main(String[] args) {
			
			TreeCreate t1=TreeCreate.treeCreate();
			TreeCreate t2=TreeCreate.treeCreate1();
			
			Check2TreeSuperImposeOrNot ct=new Check2TreeSuperImposeOrNot();
			System.out.println(ct.check(t1.root, t2.root));
			
		}
}
