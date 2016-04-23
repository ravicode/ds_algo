package Trees;

import java.util.Arrays;
import java.util.Stack;



/*Binary Tree to Binary Search Tree ConversionGiven a Binary Tree, 
 * convert it to a Binary Search Tree. The conversion must be done in such
 *  a way that keeps the original structure of Binary Tree. 

 Examples. 

 Example 1
 Input:
 10
 /  \
 2    7
 / \
 8   4
 Output:
 8
 /  \
 4    10
 / \
 2   7


 Example 2
 Input:
 10
 /  \
 30   15
 /      \
 20       5
 Output:
 15
 /  \
 10    20
 /      \
 5        30
 Solution
 Following is a 3 step solution for converting Binary tree to Binary Search Tree.
 1) Create a temp array arr[] that stores inorder traversal of the tree. 
 This step takes O(n) time.

 2) Sort the temp array arr[]. 
 Time complexity of this step depends upon the sorting algorithm. 
 In the following implementation, Quick Sort is used which takes (n^2) time. 
 This can be done in O(nLogn) time using Heap Sort or Merge Sort.

 3) Again do inorder traversal of tree and copy array elements to tree nodes
 one by one. This step takes O(n) time.

 */

public class BinTreeToBSTConversion {

	public int[] inorder(Node root) {
		int arr[] = new int[5];
		Node mainRoot=root;
		Stack<Node> st = new Stack<Node>();
		int i = 0;
		while (true) {
			while (root != null) {

				st.push(root);
				root = root.getLeft();
			}

			if (st.isEmpty()) {
				//System.out.println();
				//System.out.println(Arrays.toString(arr));
				Arrays.sort(arr);
				
				return arr;
			}

			root = st.pop();
			System.out.print(root.getKey() + ",");
			arr[i] = root.getKey();
			i++;
			root = root.getRight();

		}

	}

	
	void putNodesAtRightPosition(int arr[],Node root)
	{
		
		//int arr[] = new int[5];
		Stack<Node> st = new Stack<Node>();
		Node mainRoot=root;
		int i = 0;
		while (true) {
			while (root != null) {

				st.push(root);
				root = root.getLeft();
			}

			if (st.isEmpty()) {
				//System.out.println();
				//System.out.println(Arrays.toString(arr));
			//	Arrays.sort(arr);
				//putNodesAtRightPosition(arr);
				
				//inorder(mainRoot);
				return;
			}

			root = st.pop();
			root.setKey(arr[i]);
		//	arr[i] = root.getKey();
			i++;
			root = root.getRight();

		}
		
		
		
	}
	public static void main(String[] args) {
		// TreeCreate tc=TreeCreate.treeCreate();
		Node d = new Node(10);
		Node l = new Node(2);
		Node ll = new Node(8);
		Node lr = new Node(4);
		Node r = new Node(7);

		d.setLeft(l);
		l.setLeft(ll);
		l.setRight(lr);
		d.setRight(r);

		BinTreeToBSTConversion bst = new BinTreeToBSTConversion();

		int arr[]=bst.inorder(d);         //1. return a sorted array
		
		System.out.println();
		
		bst.putNodesAtRightPosition(arr,d);     // 2. put nodes at right positions
		 
		bst.inorder(d);       //3. check by printing

		
		//TreeCreate tc=new TreeCreate();
	//	tc.inOrderWithoutRecursion(d);
	}

}
