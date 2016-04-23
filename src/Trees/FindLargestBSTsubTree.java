package Trees;



import java.util.Arrays;
import java.util.Stack;



/*Find the largest BST subtree in a given Binary TreeGiven a Binary Tree,
 *  write a function that returns the size of the largest subtree which is 
 *  also a Binary Search Tree (BST). If the complete Binary Tree is BST, 
 *  then return the size of whole tree.

 Examples:

 Input: 
 5
 /  \
 2    4
 /  \
 1    3

 Output: 3 
 The following subtree is the maximum size BST subtree 
 2  
 /  \
 1    3


 Input: 
 50
 /    \
 30       60
 /  \     /  \ 
 5   20   45    70
 /  \
 65    80
 Output: 5
 The following subtree is the maximum size BST subtree 
 60
 /  \ 
 45    70
 /  \
 65    80
 Method 1 (Simple but inefficient)
 Start from root and do an inorder traversal of the tree. 
 For each node N, check whether the subtree rooted with N is BST or not. 
 If BST, then return size of the subtree rooted with N. 
 Else, recur down the left and right subtrees and return the maximum of values 
 returned by left and right subtrees.

 */

public class FindLargestBSTsubTree {

	public int[] inorder(Node root) {
		int arr[] = new int[9];
		Node mainRoot = root;
		Stack<Node> st = new Stack<Node>();
		int i = 0;
		while (true) {
			while (root != null) {

				st.push(root);
				root = root.getLeft();
			}

			if (st.isEmpty()) {
				// System.out.println();
				// System.out.println(Arrays.toString(arr));
				// Arrays.sort(arr);

				return arr;
			}

			root = st.pop();
			System.out.print(root.getKey() + ",");
			arr[i] = root.getKey();
			i++;
			root = root.getRight();

		}

	}

	public void findPostionFromIncreasing(int arr[]) {

		int p = 0;
		for (int i = 0; i < arr.length - 1; i++) {
			if (arr[i] < arr[i + 1]) {

			} else {

				p = i;
				// System.out.println(p);
			}
		}
System.out.println();
		System.out.println("binary Search Tree From position=" + (p + 1));
	}

	public static void main(String[] args) {
		Node d = new Node(50);
		Node l = new Node(30);
		Node ll = new Node(5);
		Node lr = new Node(20);

		Node r = new Node(60);
		Node rl = new Node(45);
		Node rr = new Node(70);
		Node rrl = new Node(65);
		Node rrr = new Node(80);

		d.setLeft(l);
		l.setLeft(ll);
		l.setRight(lr);

		d.setRight(r);
		r.setLeft(rl);
		r.setRight(rr);
		rr.setLeft(rrl);
		rr.setRight(rrr);

		FindLargestBSTsubTree fl = new FindLargestBSTsubTree();
		int arr[] = fl.inorder(d);

		fl.findPostionFromIncreasing(arr);

	}
}
