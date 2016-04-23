package Trees;




//as in book explained.

class Node4 {
	String key;
	Node4 left;
	Node4 right;

	public String getKey() {
		return key;
	}

	public void setKey(String str) {
		this.key = str;
	}

	public Node4 getLeft() {
		return left;
	}

	public void setLeft(Node4 left) {
		this.left = left;
	}

	public Node4 getRight() {
		return right;
	}

	public void setRight(Node4 right) {
		this.right = right;
	}

	Node4(String str) {
		this.key = str;
		left = null;
		right = null;

	}
}


public class ConstructABinaryTreeWithGivenTreeTraversal {
	
	
	static String inorder[]={"d","b","e","a","f","c"};
	static String preorder[]={"a","b","d","e","c","f"};

	static int search(String inorder[],int left,int right,String key)
	{
		for(int i=left;i<right;i++)
		{
			if(inorder[i].equals(key))
				return i;
		}
		return 1;
	}
	static Node4 buildBinaryTree(String inorder[],String preorder[],int left,int right)
	{
		int preIndex=0;
		if(left>right)
			return null;
		Node4 newNode=new Node4(preorder[preIndex]);
		preIndex++;
		if(left==right)
			return newNode;
		
		int inIndex=search(inorder,left,right,newNode.getKey());
		
		newNode.setLeft(buildBinaryTree(inorder,preorder,left,inIndex-1));
		newNode.setRight(buildBinaryTree(inorder,preorder,inIndex+1,right));
		
		return newNode;
		
		
	}
	
	
	public static void main(String[] args) {
		
		Node4 node= buildBinaryTree(inorder,preorder,0,inorder.length-1);
	}
	
}
