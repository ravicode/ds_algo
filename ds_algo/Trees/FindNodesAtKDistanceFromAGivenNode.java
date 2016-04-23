package Trees;

import Trees.Node;
import Trees.TreeCreate;

/*Given a pointer to node in tree and a root pointer.
Print all the nodes which are at a distance k from the given node.*/


public class FindNodesAtKDistanceFromAGivenNode {
	
	public static void main(String[] args) {
		TreeCreate tc=TreeCreate.treeCreate();
		for(int i=0;i<=4;i++)
		{
			System.out.println();
		inOrder(tc.root,i);
		}
		
	}

	
	static void inOrder(Node root,int pathLen)
	{
		if(root==null)
			return;
		//pathLen++;
		inOrder(root.getLeft(),pathLen-1);
		if(pathLen==0)
		System.out.print(root.getKey() + " ");
		//System.out.println(pathLen);
		inOrder(root.getRight(),pathLen-1);
	}
}
