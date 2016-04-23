package Trees;

//import azn_100.Node;
//import azn_100.Tree;
import Trees.Node;
//import binTree.Node;
import Trees.TreeCreate;

/*
given a binary tree where each node has some weight. 
You have to return the max weight in 
the binary tree.

Max weight = value of root node + value in its left subtree and right subtree. 

Ex  - 2
   /   \  
  -1    3
Output = 4 
*/
public class FindMaxWeightNodeInBT {
	
	static int max1;
	
	public static void main(String[] args) {
		
	TreeCreate tc=TreeCreate.treeCreate();
	//Node t=Tree.TreeCreate();

	inOrder(tc.root);
	
	System.out.println("-----Max weight Node ------");
	System.out.println(max1);
	}
	
	static void inOrder(Node root)
	{
		int max=0;;
		if(root==null)
			return;
		
		inOrder(root.getLeft());
		System.out.println(root.getKey());

		if(root.getLeft()!=null && root.getRight()!=null)
		 max=root.getKey()+root.getLeft().getKey()+root.getRight().getKey();
		
		if(max>max1)
		max1=max;
		
		
		inOrder(root.getRight());
		
	}

}
