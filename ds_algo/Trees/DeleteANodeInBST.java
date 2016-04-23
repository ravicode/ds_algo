package Trees;

import Trees.Node;
import Trees.TreeCreate;

// ITT delhi and youtube mycodeschool videos

//cases 
//1 . delete leaf node  (No child)-  just disconnect the link (make parent==null)
// 2. delete a node having only left subtree or right subtree  ( 1 child)  -just point parent to its children 
// 3. delete a node havig both left and right subTree  ( 2 child)
public class DeleteANodeInBST {

	public static void main(String[] args) {
		TreeCreate tc = TreeCreate.treeCreate1();

		TreeCreate.inOrderWithoutRecursion(tc.root);
		System.out.println();

		DeleteANodeInBST del = new DeleteANodeInBST();
		del.deleteNode(tc.root, 20); //11-no child    //20- only 1 child   //15- both child
		TreeCreate.inOrderWithoutRecursion(tc.root);

	}

	static Node parent=null;
	public static Node search(int key, Node root) {
		if (root == null)
			return null;
		else {
			if (key == root.getKey())
				return root;
			else {
				parent=root;
				if (key < root.getKey())
					return search(key, root.getLeft());
				else
					return search(key, root.getRight());
			}
		}

	}
	public void deleteNode(Node root, int key) {
		if (root == null)
			return;

		Node current = search(key, root);
		if (current == null)
			return;
		//System.out.println(parent.getKey());
		if (current.getLeft() == null & current.getRight() == null) // case1 ..11 is leaf
		{
if(parent.getLeft().getKey()==key)
	parent.setLeft(null);

if(parent.getRight().getKey()==key)
	parent.setRight(null);


		}

		if (current.getLeft() != null & current.getRight() == null) // case2   ..
		{

		}

		if (current.getLeft() == null & current.getRight() != null) {   //20 is having 1 child
			parent.setRight(current.getRight());
			
			//TreeCreate.inOrderWithoutRecursion(root);

		}

		if (current.getLeft() != null & current.getRight() != null) // case3  //15 is having both child
		{
Node minRight=TreeCreate.findMin(current.getRight());
//System.out.println(minRight.getKey());
current.setKey(minRight.getKey());
deleteNode(current.getRight(), minRight.getKey());
//TreeCreate.inOrderWithoutRecursion(root);


		}

	}
}
