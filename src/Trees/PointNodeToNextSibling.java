package Trees;

import java.util.LinkedList;

import Trees.Node;
import Trees.TreeCreate;




public class PointNodeToNextSibling {
	
static void level(Node root)
	{
	
	LinkedList<Node> li=new LinkedList<Node>();
	li.add(root);
	li.add(null);
	
	while(!li.isEmpty())
	{
		Node temp=li.remove(0);
		if(temp==null)
		{
			
			System.out.println();
			
			
			if(li.isEmpty())
				return;
			
			li.add(null);
		}
		else
		{
			temp.setSib(li.get(0));
			if(temp.getSib()!=null)
			{
				System.out.print(temp.getKey()+ " -->");
			System.out.print(temp.getSib().getKey() +"  ");
			}
		//System.out.print(temp.getKey() + " ");

		if(temp.getLeft()!=null)
			li.add(temp.getLeft());
		
		if(temp.getRight()!=null)
			li.add(temp.getRight());
		}
		
	}
		
	}
	public static void main(String[] args) {
		
		TreeCreate tc=TreeCreate.treeCreate();
		
		level(tc.root);
	}

}