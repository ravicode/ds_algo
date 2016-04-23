package Trees;



/*Print Left View of a Binary TreeGiven a Binary Tree, print left view of it. 
 * Left view of a Binary Tree is set of nodes visible when tree is visited from left side. 
 * Left view of following tree is 12, 10, 25.

	12
   /  \
  10   30
  /     \
25       40 The left view contains all nodes that are first nodes in their levels. 
A simple solution is to do level order traversal and print the first node in every level.

The problem can also be solved using simple recursive traversal. We can keep track of 
level of a node by passing a parameter to all recursive calls. The idea is to keep track of
 maximum level also. Whenever we see a node whose level is more than maximum level so far,
  we print the node because this is the first node in its level (Note that we traverse the 
  left subtree before right subtree).

*/
public class PrintLeftViewOfABinTree {
	
	static void inOrder(Node root,int rootKey)
	{
		if(root==null)
			return;
		//if(root.getLeft().getKey()<rootKey || root.getRight().getKey()<rootKey)
		{
		inOrder(root.getLeft(),rootKey );
		if(root.getKey()<rootKey)
		System.out.println(root.getKey());
		inOrder(root.getRight(),rootKey );
		}
	}
	public static void main(String[] args) {
		TreeCreate tc=TreeCreate.treeCreate();
		inOrder(tc.root,tc.root.getKey());
	}

}
