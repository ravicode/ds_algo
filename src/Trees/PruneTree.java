package Trees;

import Trees.Node;
import Trees.TreeCreate;

/*Given a bst and two boundary values.
 *  Prune the tree if the node data lies outside the boundary values
*/

//11 and 19

public class PruneTree {
	
	
	
	static int k1=11,k2=19;
	static int k=0;
	static Node pruneTree(Node root)
	{
		if(root==null)
			return null;
		
		k++;
		if(root.getKey()>=k1)
		pruneTree(root.getLeft());
		if(root.getKey()<=k2 && root.getKey()>=k1)
			
		System.out.println(root.getKey());
		
		if(root.getKey()<=k2)
		pruneTree(root.getRight());
		
		return root;
	}
	public static void main(String[] args) {
		TreeCreate tc=TreeCreate.treeCreate();
		pruneTree(tc.root);
		
	//	System.out.println(k);
		
		
	}

}
