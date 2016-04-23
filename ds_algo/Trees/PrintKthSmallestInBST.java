package Trees;

import Trees.Node;
import Trees.TreeCreate;

/*
You are given a bst. You have to print the kth smallest element.*/


public class PrintKthSmallestInBST {
	static int k=0;
	static int find5thSmallest(Node root)
	{
		
		if(root==null)
		return 1;
		
		find5thSmallest(root.getLeft());
		if(k==4)
		
		System.out.println(root.getKey());
		k++;
		
		find5thSmallest(root.getRight());
		
		return 1;
	}
	
	
	
	public static void main(String[] args) {
		TreeCreate tc=TreeCreate.treeCreate();
		
		find5thSmallest(tc.root);
	}

}
