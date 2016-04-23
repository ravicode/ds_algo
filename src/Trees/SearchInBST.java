package Trees;
public class SearchInBST {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TreeCreate tc = TreeCreate.treeCreate();
		int key = 113;
		Node found = search(tc.root, key);
		if (found != null)
			System.out.println(found.getKey());
		else
			System.out.println("Not found in recursive ");

		Node foundIterative = searchIterative(tc.root, key);
		if (foundIterative != null)
			System.out.println(foundIterative.getKey());
		else
			System.out.println("Not found in iterative ");

	}

	public static Node search(Node root, int key) {
		if (root == null) {
			return null;
		}
		if (root.getKey() == key) {
			return root;
		} else if (root.getKey() < key) {
			return search(root.getRight(), key);
		} else {
			return search(root.getLeft(), key);
		}

	}

	static Node current;

	public static Node searchIterative(Node root, int key) {

		if (root == null) {
			return null;

		} else {
			current = root;
			while (true) {
				if (current == null)
					return null;

				if (key == current.getKey())
					return current;
				else {
					if (key < current.getKey()) {

						current = current.getLeft();

					}

					else {
						if (key > current.getKey()) {

							current = current.getRight();

						}

					}

				}
			}

		}
	}
}
