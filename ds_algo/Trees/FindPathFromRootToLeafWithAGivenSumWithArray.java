package Trees;

import java.util.Arrays;

import Trees.Node;
import Trees.TreeCreate;

/*Given a binary tree and a SUM, print all the path from root whose sum = SUM.*/


public class FindPathFromRootToLeafWithAGivenSumWithArray {
	static int tot=21;
	static void sum(Node root,int path[],int pathLen,int sum)
	{
		if(root==null)
			return;
		sum+=root.getKey();
		path[pathLen++]=root.getKey();
		if(tot==sum)
		{
			System.out.println(Arrays.toString(path));
		}
		else
		{
			sum(root.getLeft(),path,pathLen,sum);
			sum(root.getRight(),path,pathLen,sum);
		}
		
	}
	public static void main(String[] args) {
		TreeCreate tc=TreeCreate.treeCreate1();
		
		int path[]=new int[5];int pathLen=0;int sum=0;
		sum(tc.root,path,pathLen,sum);
	}
	

}
