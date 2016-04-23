package Trees;

import java.util.Arrays;

import Trees.Node;
import Trees.TreeCreate;

/*Given an n�ary tree .Print the right view of the tree.
After that he added to print the right view in a zigzag way like first element
 from top 
element , second from bottom third from top fourth from bottom and so on. 
Then asked to print both the left and right view of the tree */

public class NArrayRigthView {
	
	static int arr[]=new int[4];
	static int top=-1;
	static Node rightView(Node root)
	{
		
		if(root==null)
			return null;
	arr[++top]=root.getKey();
	
	//System.out.println(root.getKey());
		
		rightView(root.getRight());
	
		
		
		
		return root;
	}
	
	public static void main(String[] args) {
		TreeCreate tc=TreeCreate.treeCreate();
		
		rightView(tc.root);
		
		for(int i=0;i<arr.length/2;i++)
		{
			System.out.println(arr[0+i]);
			System.out.println(arr[arr.length-1-i]);
		}
		//System.out.println(Arrays.toString(arr));
	}

}
