package Trees;

import java.util.Arrays;

import Trees.Node;
import Trees.TreeCreate;

/*
 Given a binary search tree, make 2 separate trees such that difference between 
 the sum of elements between them is minimum.
 (After some time he gave me a hint which helped me solve the problem).*/

/*
 * 1 Do inorder traversal and store all elements in an array(inorder traversal would give sorted list)
 2 Now initialize sum1=0(indicating first tree) and sum2=0(indicating 2nd tree)
 3 Add last (nth) element to sum1(i.e. tree1)

 4 for n-1 ->0
 if sum1> sum2
 add element to tree2 and increment sum2
 else
 add element to tree1 and increment sum1

 */
public class DivideAnArray2Create2BSTtoDiffOfSumOfElementsMinimum {
	static int top = -1;

	public static void main(String[] args) {
		TreeCreate tc = TreeCreate.treeCreate();
		int arr[] = new int[15];
		inOrder(tc.root, arr);
		int sum1 = 0, sum2 = 0;
		System.out.println(Arrays.toString(arr));

		TreeCreate t1 = new TreeCreate();
		TreeCreate t2 = new TreeCreate();

		sum1 += arr[0];
		t1.insert(arr[0]);

		sum2 += arr[1];
		t2.insert(arr[1]);

		for (int i = 2; i <= top; i++) {
			if (sum1 > sum2) {
				t2.insert(arr[i]);
				sum2 += arr[i];
			} else {
				t1.insert(arr[i]);
				sum1 += arr[i];
			}
		}

		inOrderOfSmalltrees(t1.root);

		System.out.println();
		inOrderOfSmalltrees(t2.root);
	}

	static void inOrder(Node root, int arr[]) {
		if (root != null) {

			inOrder(root.getLeft(), arr);
			arr[++top] = root.getKey();
			inOrder(root.getRight(), arr);

		}
	}

	static void inOrderOfSmalltrees(Node root) {
		if (root != null) {

			inOrderOfSmalltrees(root.getLeft());
			// arr[++top]=root.getKey();
			System.out.print(root.getKey() + " ");
			inOrderOfSmalltrees(root.getRight());

		}
	}
}
