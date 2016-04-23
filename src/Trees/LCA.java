package Trees;



/*2. Code : LCA of BST.
3. Code : LCA of Binary tree.*/

/*
We have discussed an efficient solution to find LCA in Binary Search Tree. In Binary Search Tree, using BST properties, we can find LCA in O(h) time where h is height of tree. Such an implementation is not possible in Binary Tree as keys Binary Tree nodes don�t follow any order. Following are different approaches to find LCA in Binary Tree.

Method 1 (By Storing root to n1 and root to n2 paths):
Following is simple O(n) algorithm to find LCA of n1 and n2.
1) Find path from root to n1 and store it in a vector or array.
2) Find path from root to n2 and store it in another vector or array.
3) Traverse both paths till the values in arrays are same. Return the common element just before the mismatch. 

*/


public class LCA {
	
	
	
	public static void main(String[] args) {
		
		
		Node n=Tree.TreeCreate();
		
		Node lc=findLCA(n,2,23);
		
		/*TreeCreate tc1=TreeCreate.treeCreate1();
		int key1=6,key2=13;
		
		int lcaKey=findLCA(tc1.root,key1,key2).getKey();
		
		
		System.out.println("lcaKey="+lcaKey); */

		
		System.out.println("Binary Tree LCA="+lc.getKey());
		
		TreeCreate tc=TreeCreate.treeCreate();
		
int lca_key=BST_LCA(tc.root,3,8);
		
		System.out.println("Binary Search Tree LCA="+lca_key);
	}
	

	static int BST_LCA(Node root,int a,int b)
	{
		while(true)
		{
			if((root.getKey()<a && root.getKey()>b)||
					(root.getKey()>a && root.getKey()<b))
				return root.getKey();
			
			if(root.getKey()>a && root.getKey()>b)
				root=root.getLeft();
			else
				root=root.getRight();
			
		}
		
	}
	public static Node findLCA(Node root, int n1, int n2){
		if(root!=null){
			if(root.getKey()==n1||root.getKey()==n2){
				return root;
			}
			Node left = findLCA(root.getLeft(),n1,n2);
			Node right = findLCA(root.getRight(),n1,n2);
			
			if(left!=null && right !=null){
				return root;
			}
			if(left!=null){
				return left;
			}
			if(right!=null){
				return right;
			}
		}
		return null;
	}
	
}
