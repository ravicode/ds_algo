package Trees;

import java.util.LinkedList;
import java.util.Queue;

/*write the code for level-order traversal of a tree. 
Also asked me to calculate the complexity of the code.
*/

public class LevelOrderTraversal {
	
static void level(Node root)
	{
	
	Queue<Node> li=new LinkedList<Node>();
	li.add(root);
	li.add(null);
	
	while(!li.isEmpty())
	{
		Node temp=li.remove();
		if(temp==null)
		{
			System.out.println();
			
			
			if(li.isEmpty())
				return;
			
			li.add(null);
		}
		else
		{
		System.out.print(temp.getKey() + " ");

		if(temp.getLeft()!=null)
			li.add(temp.getLeft());
		
		if(temp.getRight()!=null)
			li.add(temp.getRight());
		}
		
	}
		
	}
	public static void main(String[] args) {
		
		TreeCreate tc=TreeCreate.treeCreate1();
		
		level(tc.root);
	}

}
