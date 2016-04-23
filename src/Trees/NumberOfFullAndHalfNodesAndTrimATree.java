package Trees;

import java.util.LinkedList;
import java.util.Queue;

/*number of full nodes and half nodes*/

public class NumberOfFullAndHalfNodesAndTrimATree {

	static int count=0,count1 = 0;
	int numberOfFullNodes(Node root)
	{
		
		try
		{
		Queue<Node> q=new LinkedList<Node>();
		
		q.add(root);
		
		while(!q.isEmpty())
		{
			
			Node temp=q.remove();
		
			if(temp.getLeft()!=null && temp.getRight()!=null)
			count++;
			/*if(temp.getKey()>6  && temp.getKey()<16)
			System.out.println(temp.getKey());*/
			if(temp.getLeft()!=null && temp.getRight()==null)
				count1++;
			
			if(temp.getLeft()==null && temp.getRight()!=null)
				count1++;
			
			
				if(temp.getLeft()!=null)
					q.add(temp.getLeft());

				if(temp.getRight()!=null)
					q.add(temp.getRight());
				
			
			
		}
		
		
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		return count1;
	}
	
	
	void printAll_TrimTree(Node root,int k1,int k2)
	{
		if(root==null)
			return;
		
		if(root.getKey()>=k1)
			printAll_TrimTree(root.getLeft(),k1,k2);
		
		if(root.getKey()>=k1 && root.getKey()<=k2)
		System.out.println(root.getKey());
		
		if(root.getKey()<=k2)
			printAll_TrimTree(root.getRight(),k1,k2);
		
		
	}
	
	
	
	
		public static void main(String[] args) {
			TreeCreate tc=TreeCreate.treeCreate();
			NumberOfFullAndHalfNodesAndTrimATree nod=new NumberOfFullAndHalfNodesAndTrimATree();
			nod.numberOfFullNodes(tc.root);
			System.out.println("Full Nodes="+count);
			System.out.println("half Nodes="+count1);
			int k1=6,k2=14;
			nod.printAll_TrimTree(tc.root,k1,k2);
	}
}
