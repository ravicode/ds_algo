package Trees;





public class LevelOrderTraversalWithoutQueue {
	
	
	void printTraversal(Node root)
	{
		for(int i=0;i<5;i++)
		{
			printAll(root,i);
			System.out.println();
		}
	}
	
	
	
	private void printAll(Node root,int i)
	{
		if(root==null)
		{
			
			return;
		}
		
		if(i==0)
			System.out.print(root.getKey()+" ");
			
		else
		{
			
		printAll(root.getLeft(),i-1);
		printAll(root.getRight(),i-1);
		
		}
		
		
		
	}
	
	public static void main(String[] args) {
		TreeCreate tc=TreeCreate.treeCreate();
		LevelOrderTraversalWithoutQueue pp=new LevelOrderTraversalWithoutQueue();
				pp.printTraversal(tc.root);
		
	}

}
