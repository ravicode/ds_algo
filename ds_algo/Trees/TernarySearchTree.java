package Trees;

/*
 * Write a code for ternary search. Is it better than Binary?
 *  He asked me to generalize the search and asked me which is 
 *  the optimum.
 */

//http://cs.stackexchange.com/questions/29755/why-is-binary-search-faster-than-ternary-search
class Node2 {
	char data;
	int EOS;
	Node2 left, eq, right;

	public char getData() {
		return data;
	}

	public void setData(char data) {
		this.data = data;
	}

	public int getEOS() {
		return EOS;
	}

	public void setEOS(int eOS) {
		EOS = eOS;
	}

	public Node2 getLeft() {
		return left;
	}

	public void setLeft(Node2 left) {
		this.left = left;
	}

	public Node2 getEq() {
		return eq;
	}

	public void setEq(Node2 eq) {
		this.eq = eq;
	}

	public Node2 getRight() {
		return right;
	}

	public void setRight(Node2 right) {
		this.right = right;
	}

	Node2(char data) {
		this.data = data;
		EOS = 0;
		left = null;
		eq = null;
		right = null;

	}
}

public class TernarySearchTree {

	 Node2 root;

	TernarySearchTree() {
		root = null;

	}

	public Node2 insert(Node2 root, char str[], int ptr) {

		if (root == null) {
			root = new Node2(str[ptr]);
		}

		if (str[ptr] < root.getData())
			root.setLeft(insert(root.getLeft(), str, ptr));
		else if (str[ptr] > root.getData())
			root.setRight(insert(root.getRight(), str, ptr));

		else {
			if (str.length > ptr + 1) {

				root.setEq(insert(root.getEq(), str, ptr + 1));

			}
			// the last character of the word
			else
				root.setEOS(1);
		}

		return root;

	}

	public int searchTST(Node2 root, char str[], int ptr) {
		if (root == null)
			return 0;

		if (str[ptr] < root.getData())
			return searchTST(root.getLeft(), str, ptr);

		else if (str[ptr] > root.getData())
			return searchTST(root.getRight(), str, ptr);

		else {
			if (root.getEOS() == 1 && ptr == str.length - 1)

				return 1;

			else if (ptr == str.length - 1)

				return 0;

			else

				return searchTST(root.getEq(), str, ptr + 1);

		}

	}

	public void traverseTST(Node2 root, char buffer[], int depth) {
		if (root != null) {
			// First traverse the left subtree
			traverseTST(root.getLeft(), buffer, depth);

			// Store the character of this Node2
			buffer[depth] = root.getData();
			if (root.getEOS() == 1) {
				buffer[depth + 1] = '\0';
				System.out.println(buffer);
			}

			// Traverse the subtree using equal pointer (middle subtree)
			traverseTST(root.getEq(), buffer, depth + 1);

			// Finally Traverse the right subtree
			traverseTST(root.getRight(), buffer, depth);
		}

	}

	
	public static void main(String[] args) {
		Node2 root = null;
		TernarySearchTree ty = new TernarySearchTree();
		root = ty.insert(root, "cat".toCharArray(), 0);

		ty.insert(root, "cats".toCharArray(), 0);
		ty.insert(root, "up".toCharArray(), 0);
		ty.insert(root, "bug".toCharArray(), 0);

		System.out.println("********* traversal *********");
		char buffer[] = new char[50];
		ty.traverseTST(root, buffer, 0);

		System.out.println("\n ********** search for cats, bu *********");
		if (ty.searchTST(root, "cats".toCharArray(), 0) == 1)
			System.out.println("Found\n");
		else
			System.out.println("Not Found\n");

		if (ty.searchTST(root, "bu".toCharArray(), 0) == 1)
			System.out.println("Found\n");
		else
			System.out.println("Not Found\n");
		// searchTST(root, "bu")? System.out.println("Found\n"):
		// System.out.println("Not Found\n");
		// searchTST(root, "cat")? System.out.println("Found\n"):
		// System.out.println("Not Found\n");

	}
}
