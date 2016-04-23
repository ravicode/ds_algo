package Trees;

import Trees.Node;

/*Get nth to last element
Check if 2 binary trees are equal recursively and iteratively*/


public class CheckBintreeEqualRecursivelyAndIteratively {
	
	boolean checkEqual(Node root1,Node root2)
	{
		if(root1==null && root2==null)
		return true;
		
		if(root1==null || root2==null)
			return false;
	
		if(root1.getKey()==root2.getKey() && 
				checkEqual(root1.getLeft(),root2.getLeft()) &&
				checkEqual(root1.getRight(),root2.getRight()))
	return true;
		
		return false;
	}
	
	

}
