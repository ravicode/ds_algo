package Trees;

public class InOrderInBack {
	
	
	public static void inOrder(Node root)
	{
		if(root!=null)
		{
		//	inOrder(root.getLeft());
			
			inOrder(root.getRight());
			System.out.print(root.getKey()+",");
			inOrder(root.getLeft());
		}
	}
	public static void main(String[] args) {
		TreeCreate tc=TreeCreate.treeCreate();
		tc.inOrderWithoutRecursion(tc.root);
		
		System.out.println();
		inOrder(tc.root);
	}

}
