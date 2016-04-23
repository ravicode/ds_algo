package Trees;

import java.util.LinkedList;
import java.util.Queue;

//find max element in tree
public class FindMaximumNodeValueInTree {

	int findMax_recursion(Node root) {
		int l = Integer.MIN_VALUE, r = Integer.MIN_VALUE, root_val = 0, max = Integer.MIN_VALUE;
		if (root == null) {

			return max;
		} else {
			root_val = root.getKey();
			if (root.getLeft() != null)
				l = findMax_recursion(root.getLeft());

			if (root.getRight() != null)
				r = findMax_recursion(root.getRight());

			if (l < r)
				max = r;
			else
				max = l;

			if (root_val > max)
				max = root_val;
		}

		return max;
	}
	public int findMax(Node root) {

		int root_val, left, right, max = 1;
		Queue<Node> s = new LinkedList<Node>(); // use of generics
		try {
			s.add(root);

			while (!s.isEmpty()) {
				Node temp = s.remove();

				// System.out.print(temp.getKey() + ",");
				if (temp.getKey() > max)
					max = temp.getKey();

				if (temp.getLeft() != null) {
					s.add(temp.getLeft());
				}
				if (temp.getRight() != null) {
					s.add(temp.getRight());
				}
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

		return max;
	}
	



	public static void main(String[] args) {
	//	TreeCreate tc = TreeCreate.treeCreate();
		Node r = Tree.TreeCreate();

		FindMaximumNodeValueInTree fmax = new FindMaximumNodeValueInTree();

		System.out.println("Max value=" + fmax.findMax_recursion(r));

		System.out.println("Max value (without recursion) ="
				+ fmax.findMax(r)); //tc.root
	
	}

}
