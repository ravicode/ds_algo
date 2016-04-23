package Trees;

import java.util.HashMap;

import Trees.Node;
import Trees.TreeCreate;

/*Print vertical sum of all the axis in the given binary tree.*/

public class PrintVerticalSumOfTree {
	
	static void printVerticalSum(Node root,int column,HashMap<Integer,Integer> m)
	{
		if(root==null)
			return;
		printVerticalSum(root.getLeft(),column-1,m);
		
		if(m.containsKey(column))
		{
			m.put(column,m.get(column)+root.getKey());
		}
		else
		{
			m.put(column,root.getKey());
		}
		
		printVerticalSum(root.getRight(),column+1,m);
		
		
	}
	
	public static void main(String[] args) {
		TreeCreate tc=TreeCreate.treeCreate();
		HashMap<Integer, Integer> mp=new HashMap<Integer, Integer>();
		printVerticalSum(tc.root,0,mp);
		
		System.out.println(mp.entrySet());
		
	}

}
