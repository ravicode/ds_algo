package Trees;

import java.util.Arrays;

import Trees.Node;
import Trees.TreeCreate;

/*
 * 
 * Given a BST, find out the minimum length form root to leaf with sum S. Note that:
 a) Path from root to leaf node.
 b) Sum of node of the path is S.
 c) if multiple such path exist, print minimum length path.
d) What is advantage of BST rather than BT used for this algorithm,
 how it improve the performance. in BST, is it required to explore both side ?
 e) Write working codes for it.
 */


public class BSTRelatedQuestions {
	static int max=0;
	static int arr[];
	static int k=Integer.MAX_VALUE;
	static void findMaxPath(Node root,int path[],int pathLen,int sum)
	{
		if(root==null)
			return;
		path[pathLen++]=root.getKey();
		sum+=root.getKey();
		if(sum==21 && pathLen<k)
		{
			//max=sum;
			arr=path;
		k=pathLen;
			//System.out.println(Arrays.toString(path) + " " + pathLen);
		
			return;
		}
		/*if(root.getLeft()==null && root.getRight()==null)
			print(path,sum);*/
		if(sum<21)
		{
		findMaxPath(root.getLeft(),path,pathLen,sum);
		
		System.out.println("e");
		findMaxPath(root.getRight(),path,pathLen,sum);
		}
		//if()
		
		return ;
	}
	
	static void printMax()
	{
		System.out.println();
		System.out.println("max="+max);
		System.out.println(Arrays.toString(arr));
	}

	
	public static void main(String[] args) {
		TreeCreate tc=TreeCreate.treeCreate();
		int path[]=new int[5];
		int pathLen=0;
		int sum=0;
		findMaxPath(tc.root,path,pathLen,sum);
		
		System.out.println(Arrays.toString(arr) + " " + k);
		
		//printMax();
	}

}
