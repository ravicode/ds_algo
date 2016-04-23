package Trees;

import java.util.Arrays;

import Trees.Node;

/*
Given a perfect binary tree.
print nodes in a specific manner. e.g- 

             15
            /  \
          13    14
        /  \    /  \
       9   10  11   12
      / \  / \ / \  / \
     1  2  3 4 5 6  7 8
print - 1 8 2 7 3 6 4 5 9 12 10 11 13 14 15 
I told her approaches having some space complexity. 
Again she restricted space complexity, 
and I got an efficient solution by recognizing some pattern 


ex :               1
              /         \
            2            3
          /   \        /    \
        4      5      6      7
o/p : 4 756231


*/
public class PrintBinaryTree {
	
	static int arr[]=new int[7];
	static int top=-1;
	static void printVerticalSum(Node root,int column) {
		if (root == null)
			return;

		printVerticalSum(root.getLeft(),column-1);
	
		arr[++top]=root.getKey();//	System.out.println(root.getKey());
		printVerticalSum(root.getRight(),column+1);

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

		printVerticalSum(r,0);
		
System.out.println(Arrays.toString(arr));		
		for(int i=0;i<=top/2 ;i++)
		{
			System.out.println(arr[i]);
			if(top-i>top/2)
			{if(i>0)
				i=-i;
			if(i<0)
				i=-i;
			System.out.println(arr[top-i]);
			}
		}
		
		

	}

}
