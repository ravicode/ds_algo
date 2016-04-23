package Trees;







public class LevelOrderSpiralTraversalWithoutQueue {
	
	
	void printTraversal(Node root)
	{
		boolean ltr=true;
		for(int i=0;i<5;i++)
		{
			printAll(root,i,ltr);
			System.out.println();
			ltr=!ltr;
		}
	}
	
	
	
	private void printAll(Node root,int i,boolean ltr)
	{
		if(root==null)
		{
			
			return;
		}
		
		if(i==1)
			System.out.print(root.getKey()+" ");
			
		else
		{
		if(ltr)	
		{
			printAll(root.getLeft(),i-1,ltr);
			printAll(root.getRight(),i-1,ltr);
		}
		else
			{
			
			printAll(root.getRight(),i-1,ltr);
			printAll(root.getLeft(),i-1,ltr);
			}
		
		
		}
		
		
		
	}
	
	public static void main(String[] args) {
		TreeCreate tc=TreeCreate.treeCreate();
		LevelOrderSpiralTraversalWithoutQueue pp=new LevelOrderSpiralTraversalWithoutQueue();
				pp.printTraversal(tc.root);
		
	}

}
