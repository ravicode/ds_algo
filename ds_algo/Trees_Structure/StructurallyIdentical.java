package Trees_Structure;

import Trees.Node;
import Trees.TreeCreate;


/*structually identical*/


public class StructurallyIdentical {
	
	
	boolean structuallyIdentical(Node root1,Node root2)
	{
		if(root1==null && root2==null)
			return true;
		
		if(root1==null || root2==null)
			return false;
		
		
		return (root1.getKey()==root2.getKey() && 
				structuallyIdentical(root1.getLeft(),root2.getLeft()) && 
				structuallyIdentical(root1.getRight(),root2.getRight()));
		
			
		
		
	}
	
	
	public static void main(String[] args) {
		
		TreeCreate tc=TreeCreate.treeCreate();
		TreeCreate tc1=TreeCreate.treeCreate1();
		StructurallyIdentical si=new StructurallyIdentical();
		System.out.println(si.structuallyIdentical(tc.root, tc1.root));
		
		
	}

}
