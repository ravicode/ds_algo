package Trees;

public class PrintAllAncestors {

	static boolean ancestor(Node root, int b) {
		if (root == null || root.getLeft() == null)
			return false;

		if ((root.getLeft().getKey() == b) || (root.getRight().getKey() == b)
				|| ancestor(root.getLeft(), b) || ancestor(root.getRight(), b)) {
			System.out.println(root.getKey());
			return true;
		}

		return false;
	}

	static boolean ancestor1(Node root, int b, int path[], int pathLen) {
		if (root == null)
			return false;

		path[pathLen++] = root.getKey();

		if (root.getKey() == b) {
			print(path, pathLen);
			return true;
		} else {

			ancestor1(root.getLeft(), b, path, pathLen);
			ancestor1(root.getRight(), b, path, pathLen);
		}
		return false;

	}

	static void print(int path[], int pathLen) {
		for (int i = 0; i < pathLen-1; i++)
			System.out.println(path[i]);
	}

	public static void main(String[] args) {
		Node r = Tree.TreeCreate();
		 System.out.println(ancestor(r,25));
		 
		 System.out.println("\n\n");
		int path[] = new int[5];
		int pathLen = 0;
		System.out.println(ancestor1(r, 25, path, pathLen));
	}

}
