package Trees;

import Trees.Node;
import Trees.TreeCreate;

/*
 * 
 * Boundary traversal
 */

public class BoundaryTraversal {
	
	public static void main(String[] args) {
		TreeCreate tc=TreeCreate.treeCreate1();
		leftView(tc.root);
		System.out.println();
		bottomView(tc.root);
		System.out.println();

		rightView(tc.root);
	}
	
	static void leftView(Node root)
	{
		
		if(root!=null)
		{
			if(root.getLeft()!=null)
			System.out.print (root.getKey()+" ");
		
			leftView(root.getLeft());
		}
		
	}

	
	static void bottomView(Node root)
	{
		if(root!=null)
		{
			
		
			bottomView(root.getLeft());
			if(root.getLeft()==null && root.getRight()==null)
				System.out.print(root.getKey()+" ");
			bottomView(root.getRight());
		}
	}
	
	static void rightView(Node root)
	{
		if(root!=null)
		{
			
		
			rightView(root.getRight());
			
			if(root.getRight()!=null)
				System.out.print(root.getKey()+" ");
		}
	}

}
