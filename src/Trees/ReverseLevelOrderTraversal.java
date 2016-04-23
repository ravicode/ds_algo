package Trees;



import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

import Trees.Node;

/*
 * 
 * Reverse level order traversal.
 time complexity : O(n)
Input:
                     1                             
                  /     \                    
                 2       3                  
               /   \   /   \
              4    5  6     7 
             /    / \      / \    
            8    11  10   12  13 
output:
13 12 11 10 8 7 6 5 4 3 2 1

You are permitted to use extra space and now print them in separate levels too.

Output:
 13 12 11 10 8
7 6 5 4
3 2
1

 */

public class ReverseLevelOrderTraversal {
	
	
	public static  void printLevelOrder(Node r)
	{
		Queue<Node> l=new LinkedList<Node>();
		l.add(r);
		l.add(null);
		Stack<Integer> st=new Stack<Integer>();
		while(!l.isEmpty())
		{
			Node temp=l.remove();
			if(temp==null)
			{
				System.out.println();
				if(!l.isEmpty())
				{
				l.add(null);
				st.push(-1);
				}
			}
			else
			{
			//System.out.print(temp.getKey()+" ");
			st.push(temp.getKey());
			
			
			
			if(temp.getRight()!=null)   // insert right first , then left 
				l.add(temp.getRight());
			
			if(temp.getLeft()!=null)
				l.add(temp.getLeft());
			}
		}
		
		for(int i=0;i<12;)
		{
			if(st.peek()>0)
			{
			System.out.print(st.pop()+" ");
			i++;
			}
			else
			{
				st.pop();
				System.out.println();
			}
		}
	}
	public static void main(String[] args) {
		Node r=TreeCreate1();
		
		
		printLevelOrder(r);
	}

	static Node TreeCreate1()
	{
		Node d = new Node(1);
		
		Node l = new Node(2);
		Node ll = new Node(4);
		Node lll = new Node(8);
		Node lr = new Node(5);
		Node lrl = new Node(11);
		Node lrr = new Node(10);

		Node r = new Node(3);
		Node rr = new Node(7);
		Node rrr = new Node(13);
		Node rl = new Node(6);
		Node rrl = new Node(12);
		
		d.setLeft(l);
		l.setLeft(ll);
		l.setRight(lr);
		ll.setLeft(lll);
		lr.setLeft(lrl);
		lr.setRight(lrr);

		d.setRight(r);
		r.setLeft(rl);
		r.setRight(rr);
		rr.setLeft(rrl);
		rr.setRight(rrr);
		return d;
	}

}
