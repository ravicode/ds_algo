package Trees;

import java.util.LinkedList;
import java.util.Queue;

import Trees.Node;

//already done
public class CheckTreeBSTorNot {

	public static void main(String[] args) {

		// to check BST
		 TreeCreate tc = TreeCreate.treeCreate();
		// boolean flag = checkBstOrNot(tc.root);
		 boolean flag = checkBstOrNotWithOutExtraSpace(tc.root);  

		// to check not a BST
		/* Node rt = Tree.TreeCreate();
	    // boolean flag = checkBstOrNot(rt);
		boolean flag = checkBstOrNotWithOutExtraSpace(rt);  */

		// tc.inOrderWithoutRecursion(rt);

		if (!flag)

			System.out.println("Not a BST");
		else
			System.out.println("BST");

	}

	static int findMax(Node root) {
		int maxx = Integer.MIN_VALUE;

		if (root == null)
			return maxx;
		int root_val = root.getKey();
		int left = findMax(root.getLeft());
		int right = findMax(root.getRight());
		// System.out.println(left + " " +right);
		if (left > right)
			maxx = left;
		else
			maxx = right;
		// System.out.println("root val="+root.getKey());
		if (root_val > maxx)
			maxx = root_val;
		// System.out.println("MAX="+maxx);
		return maxx;
	}

	static int findMin(Node root) {
		int minn = Integer.MAX_VALUE;
		// int max=-1;
		if (root == null)
			return minn;
		int root_val = root.getKey();
		int left = findMin(root.getLeft());
		int right = findMin(root.getRight());
		if (left < right)
			minn = left;
		else
			minn = right;

		if (root_val < minn)
			minn = root_val;

		return minn;
	}

	static boolean checkBstOrNotWithOutExtraSpace(Node root) {

		if (root == null)
			return true;
		if (findMax(root.getLeft()) > root.getKey()
				|| (findMin(root.getRight()) < root.getKey()))
			return false;

		if ((checkBstOrNotWithOutExtraSpace(root.getLeft()) == false)
				|| (checkBstOrNotWithOutExtraSpace(root.getRight()) == false)) {
			return false;
		}
		/*
		 * checkBstOrNotWithOutExtraSpace(root.getLeft());
		 * checkBstOrNotWithOutExtraSpace(root.getRight());
		 */
		return true;
	}

	static boolean checkBstOrNot(Node root) {

		Queue<Node> q = new LinkedList<Node>();
		q.add(root);
		while (!q.isEmpty()) {

			Node temp = q.remove();
			// System.out.println(temp.getKey());
			if (temp.getLeft() != null) {

				// if(temp.getLeft().getKey()<temp.getKey())

				if (findMax(temp.getLeft()) < temp.getKey()) {
					// System.out.println("11="+findMax(temp.getLeft()) + "  " +
					// temp.getKey());
					q.add(temp.getLeft());
				} else {
					// flag=false;
					return false;
				}
			}

			if (temp.getRight() != null) {
				// if(temp.getRight().getKey()>temp.getKey())
				if (findMin(temp.getRight()) > temp.getKey())

					q.add(temp.getRight());
				else {
					// flag=false;
					return false;
				}
			}
		}

		return true;

	}
}
