package Trees;

import java.util.Collection;
import java.util.HashMap;
import java.util.Stack;
import java.util.TreeMap;

import Trees.Node;

/*
Given a tree,print spirally the column order of a tree. 

ex :               1
              /         \
            2            3
          /   \        /    \
        4      5      6      7
o/p : 4 2 6 5 1 3 7 
*/
public class PrintSpirallyColumnOrder {

static String str="";
	static void printVerticalSum(Node root,int column, HashMap<Integer, String> mp) {
		if (root == null)
			return;
if(mp.containsKey(column))
{
	mp.put(column,mp.get(column)+root.getKey());
	//st.push(root.getKey());
}
else
{
	mp.put(column,""+root.getKey());
	//st.push(root.getKey());
}
		
		printVerticalSum(root.getLeft(),column-1,mp);
		//System.out.println(root.getKey());
		printVerticalSum(root.getRight(),column+1,mp);

	}

	public static void main(String[] args) {
		Node r = new Node(1);
		Node rl = new Node(2);
		Node rr = new Node(3);
		Node rll = new Node(4);
		Node rlr = new Node(5);
		Node rrl = new Node(6);
		Node rrr = new Node(7);

		r.setLeft(rl);
		r.setRight(rr);
		rl.setLeft(rll);
		rl.setRight(rlr);

		rr.setLeft(rrl);
		rr.setRight(rrr);

		 HashMap<Integer, String> mp=new HashMap<Integer, String>();
		printVerticalSum(r,0,mp);
		
		//System.out.println(mp.entrySet());
		
		TreeMap<Integer,String> tr=new TreeMap<Integer,String>(mp);
		
		
		Collection<String> st=tr.values();
		for(String i:st)
		{
			System.out.print (i+" ");
		}

	}
}
