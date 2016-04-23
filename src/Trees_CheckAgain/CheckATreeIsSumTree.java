package Trees_CheckAgain;

import Trees.Node;



/*Check if a given Binary Tree is SumTreeWrite a function that returns true if the given 
 * Binary Tree is SumTree else false. A SumTree is a Binary Tree where the value of a node
 *  is equal to sum of the nodes present in its left subtree and right subtree. An empty 
 *  tree is SumTree and sum of an empty tree can be considered as 0. A leaf node is also
 *   considered as SumTree.

 Following is an example of SumTree.

    26
   /  \
 10    3
 / \    \
 4  6    3  */

public class CheckATreeIsSumTree {

	public int sum(Node root) {

		if (root == null)
			return 0;
		return sum(root.getLeft()) + root.getKey() + sum(root.getRight());
	}

	public int sumTree(Node root) {
		int ls = 0, rs = 0;

		if (root == null ||

		(root.getLeft() == null && root.getRight() == null))
			return 1;

		ls = sum(root.getLeft());
		rs = sum(root.getRight());

		if (root.getKey() == (ls + rs) && sumTree(root.getLeft()) == 1
				&& sumTree(root.getRight()) == 1) {
			return 1;
		}

		return 0;
	}

	public static void main(String[] args) {
		//TreeCreate tc = TreeCreate.treeCreate();   //not sum tree
		
	// for sum tree 	
		Node d = new Node(26);
		Node l = new Node(10);
		Node ll = new Node(4);
		Node lr = new Node(6);
		Node r = new Node(3);
		Node rr = new Node(3);

		d.setLeft(l);
		l.setLeft(ll);
		l.setRight(lr);
		d.setRight(r);
		r.setRight(rr);
	////////////	
		
		CheckATreeIsSumTree ct = new CheckATreeIsSumTree();
		int check=ct.sumTree(d);
		
		if(check==1)
			System.out.println("SUM Tree");
		else
			System.out.println("Not Sum Tree");
	}

}
