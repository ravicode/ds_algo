package Trees;

import Trees.Node;
import Trees.TreeCreate;

/*Remove the nodes in the binary tree for that the sum of all values 
 * from root to leaf is less than K.*/


// do it as path from root to leaf
public class PrintRootToLeafpathLessThanAsum {
	
	int k=20;
	static void printRootToLeafPaths(Node root,int path[],int pathLen,int sum)
	{
		
		if(root==null)
			return;
		path[pathLen++]=root.getKey();
		
		sum+=root.getKey();
		
		if(root.getLeft()==null & root.getRight()==null && sum<20)
			print(path);
		
		printRootToLeafPaths(root.getLeft(),path,pathLen,sum);
		printRootToLeafPaths(root.getRight(),path,pathLen,sum);
	}
	
	static void print(int path[])
	{
		System.out.println();
		for(int i:path)
			System.out.print(i+" ");
	}
	public static void main(String[] args) {
		TreeCreate tc=TreeCreate.treeCreate1();
		int path[]=new int[6];
		int pathLen=0;
		int sum=0;
		printRootToLeafPaths(tc.root,path,pathLen,sum);
	}

}
