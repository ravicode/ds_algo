package Trees;

// good explanation in youtube mycodeschool

// TC=0(n)
import java.util.LinkedList;
import java.util.Queue;

/*
 *      1
 *     /  \
 *    2    3
 *   /      \
 *  4        5
 * 
 *  maxDepth('1') = max(maxDepth('2'), maxDepth('3')) + 1
                               = 2 + 1
                                  /    \
                                /         \
                              /             \
                            /                 \
                          /                     \
               maxDepth('2')                  maxDepth('3') = 1
= max(maxDepth('4'), maxDepth('5')) + 1
= 1 + 1   = 2         
                   /    \
                 /        \
               /            \
             /                \
           /                    \
 maxDepth('4') = 1     maxDepth('5') = 1
 */

public class FindHeightOfATree {
	
	int finfHeight(Node root)  //counting by nodes
	{
	int left=0,right=0;
		
		if(root==null)   //since heigth of a empty node is -1, not 0  and we are counting number of edges as hegh not number of nodes as height
			return -1;
		
		left=finfHeight(root.getLeft());
		
		
		right=finfHeight(root.getRight());
		
		
		
		if(left>right)
				return (left+1);
		else
			return (right+1);
	}
	
	int finfHeight1(Node root)  //counting by nodes
	{
		if(root==null)
			return -1;
		
		
		
		return 1+Math.max(finfHeight(root.getLeft()), finfHeight(root.getRight()));
		
		
	}
	
	
	int finfHeight_withoutRecursion(Node root)   //counting with edges
	{
		int height=0;
		
		try
		{
		Queue<Node> q=new LinkedList<Node>();
		
		q.add(root);
		q.add(null);
		
		while(!q.isEmpty())
		{
			
			Node temp=q.remove();
			/*if(temp!=null)
			System.out.println(temp.getKey());*/
			if(temp==null)
			{
				if(q.isEmpty())
					return height;
				
					q.add(null);
					
				height++;	
				
				
				
			}
			else
			{
				
				if(temp.getLeft()!=null)
					q.add(temp.getLeft());

				if(temp.getRight()!=null)
					q.add(temp.getRight());
				
			
			}
			
			
		}
		
		
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return height;	
		
	}
	public static void main(String[] args) {
		TreeCreate tc=TreeCreate.treeCreate();
		FindHeightOfATree fh=new FindHeightOfATree();
		System.out.println(fh.finfHeight(tc.root));
		
		System.out.println(fh.finfHeight1(tc.root));
		
		System.out.println(fh.finfHeight_withoutRecursion(tc.root));
	}

}
