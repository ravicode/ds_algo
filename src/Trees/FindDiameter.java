package Trees;

import Trees.Node;
import Trees.TreeCreate;

/*find diameter of a tree.Follow up how will find the height of a binary tree? */


public class FindDiameter {
	
	static int findHeight(Node root)
	{
		int left=0,right=0;
		if(root==null)
			return 0;
			
		//System.out.println(diameter);
			left=findHeight(root.getLeft());
			
			right=findHeight(root.getRight());
			
			if(left>right)
				return (left+1);
			else
				return (right+1);
			
		
	}
	
	
	static int  findDiameter(Node root)
	{
		int left,right;
	if(root==null)
		return 0;
		
	//System.out.println(diameter);
		left=findHeight(root.getLeft());  
		
		right=findHeight(root.getRight()); 
		
		 /* get the diameter of left and right sub-trees */
		  int ldiameter = findDiameter(root.getLeft());
		  int rdiameter = findDiameter(root.getRight());
		  
		return Math.max(left + right,Math.max(ldiameter, rdiameter));
	}
	
	public static void main(String[] args) {
		
		TreeCreate tc=TreeCreate.treeCreate();
		
		int dia=findDiameter(tc.root);
		System.out.println("Diameter="+ (dia + 1));  //1 is for root node from left and right
		
		int height=findHeight(tc.root);
		System.out.println("Height="+height);
		
	}

}
