package Trees;

import Trees.Node;

//good explnatation in youtube mycodeschool videos in DS playlist
public class BSTCreationRecursive {

	Node insert(int key, Node root) {
		if (root == null)
			root = new Node(key);
		else {
			if (key <= root.getKey())
				root.setLeft(insert(key, root.getLeft()));
			else
				root.setRight(insert(key, root.getRight()));
		}
		return root;

	}

	static boolean search(int key, Node root) {
		if (root == null)
			return false;
		else {
			if (key == root.getKey())
				return true;
			else {
				if (key < root.getKey())
					return search(key, root.getLeft());
				else
					return search(key, root.getRight());
			}
		}

	}

	public void inOrder(Node root) {
		if (root == null)
			return;
		inOrder(root.getLeft());
		System.out.print(root.getKey() + " ");
		inOrder(root.getRight());

	}

	Node findMin(Node root)
	{
		if(root==null)
			return null;
		else
		{
			if(root.getLeft()==null)
				return root;
		
		else
		{
			return findMin(root.getLeft());
		}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BSTCreationRecursive br = new BSTCreationRecursive();
		Node root = null;
		root = br.insert(8, root);
		root = br.insert(9, root);
		root = br.insert(5, root);
		root = br.insert(2, root);
		root = br.insert(1, root);
		root = br.insert(3, root);
		root = br.insert(7, root);
		root = br.insert(6, root);
		root = br.insert(8, root);

		root = br.insert(15, root);
		root = br.insert(13, root);
		root = br.insert(11, root);
		root = br.insert(14, root);

		root = br.insert(19, root);
		root = br.insert(16, root);
		root = br.insert(20, root);
		root = br.insert(21, root);

		br.inOrder(root);

		boolean found = br.search(13, root);
		if (found)
			System.out.println("\npresent");
		else
			System.out.println("\nnot present");

		System.out.println(br.findMin(root).getKey());
	}

}
