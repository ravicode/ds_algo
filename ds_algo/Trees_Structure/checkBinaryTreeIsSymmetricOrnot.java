package Trees_Structure;


import Trees.Node;
import Trees.TreeCreate;

/*
 Given 2 binary trees check if it is symmetric (structure only not data).
 */

public class checkBinaryTreeIsSymmetricOrnot {

	boolean checkIdentical(Node root1, Node root2) {
		if (root1 == null && root2 == null)
			return true;

		if (root1 == null || root2 == null)
			return false;

		/*
		 * if (root1.getKey() != root2.getKey()) {
		 * 
		 * return false; }
		 */

		return (checkIdentical(root1.getRight(), root2.getRight()) && checkIdentical(
				root1.getLeft(), root2.getLeft()));

	}

	public static void main(String[] args) {

		TreeCreate tc = TreeCreate.treeCreate();
		TreeCreate tc1 = TreeCreate.treeCreate1();
		checkBinaryTreeIsSymmetricOrnot img = new checkBinaryTreeIsSymmetricOrnot();

		System.out.println(img.checkIdentical(tc.root, tc.root)); // true
		System.out.println(img.checkIdentical(tc.root, tc1.root)); // false
	}

}
