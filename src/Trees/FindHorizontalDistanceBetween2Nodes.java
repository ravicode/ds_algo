package Trees;

import java.util.Arrays;

import Trees.Node;
import Trees.TreeCreate;

/*
You are given a binary tree and two nodes. 
You have to print the horizontal distance between them. 

Let us say :
Given nodes are B and C : Answer would be 2.
Given nodes are A and E : Answer would be 0.
Given nodes are D and G : Answer would be 4.


*/

/*
 * http://algorithms.tutorialhorizon.com/find-the-distance-between-two-nodes-of-a-binary-tree/
 */
/*Find distance between two given keys of a Binary TreeFind the distance between two keys in a binary tree, 
 * no parent pointers are given. Distance between two nodes is the minimum number of edges to be traversed to
 *  reach one node from other.



We strongly recommend to minimize the browser and try this yourself first.

The distance between two nodes can be obtained in terms of lowest common ancestor. 
Following is the formula. 

Dist(n1, n2) = Dist(root, n1) + Dist(root, n2) - 2*Dist(root, lca) 
'n1' and 'n2' are the two given keys
'root' is root of given Binary Tree.
'lca' is lowest common ancestor of n1 and n2
Dist(n1, n2) is the distance between n1 and n2.*/

public class FindHorizontalDistanceBetween2Nodes {

	static int keyDistance1=0;
	static int k1[],k2[];
	
	static int findKeyDistanceFromRoot(Node root, int key,int path[],int pathLen)
	{
		if(root==null)
			return keyDistance1 ;
		
			if(root.getKey()==key)
			{
				path[pathLen++]=root.getKey();
				
				//System.out.println(Arrays.toString(path));
				k1=path.clone();
				//System.out.println(pathLen);
				keyDistance1= pathLen-1;
			
			}
			else
			{
				path[pathLen++]=root.getKey();
				
				
				findKeyDistanceFromRoot(root.getLeft(),key,path,pathLen);
				findKeyDistanceFromRoot(root.getRight(),key,path,pathLen);
			}
			
		return keyDistance1;
		
	
	}
	
	public static void main(String[] args) {
		TreeCreate tc=TreeCreate.treeCreate1();
		int key1=6,key2=13;
		int pathlen=0,path[]=new int[5];
		int key1Distance=findKeyDistanceFromRoot(tc.root,key1,path,pathlen);
		int Key1ArrayFromRoot[]=k1;
		System.out.println("Key1ArrayFromRoot="+Arrays.toString(Key1ArrayFromRoot));
		//keyDistance1=0;
		int key2Distance=findKeyDistanceFromRoot(tc.root,key2,path,pathlen);
		int Key2ArrayFromRoot[]=k1;
		System.out.println("Key2ArrayFromRoot="+Arrays.toString(Key2ArrayFromRoot));
		
		System.out.println("dist(root,key1)="+key1Distance+ "\n"+"dist(root,key2)="+key2Distance);
		
		//int lcaKey=findLca(Key1ArrayFromRoot,Key2ArrayFromRoot);
		
		int lcaKey=LCA.findLCA(tc.root,key1,key2).getKey();
		
		
		System.out.println("lcaKey="+lcaKey);
		
		int key3Distance=findKeyDistanceFromRoot(tc.root,lcaKey,path,pathlen);
		
		System.out.println("Dist(root,lca)="+key3Distance);
		
		System.out.println("Distance between 2 keys Dist(n1, n2) = Dist(root, n1) + Dist(root, n2) - 2*Dist(root, lca) ");
		
		System.out.println(key1Distance + key2Distance - 2 * key3Distance);
		
	}
	
	
	static int findLca(int a1[],int a2[])
	{
		int lcaKey=0;
		for(int i=0;i<5;i++)
		{
			if(a1[i]==a2[i] && a1[i+1]!=a2[i+1])
			{
				lcaKey=a1[i];
				break;
			}
		}
		return lcaKey;
	}
}
