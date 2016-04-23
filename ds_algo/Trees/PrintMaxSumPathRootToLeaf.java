package Trees;

import java.util.Arrays;

import Trees.Node;
import Trees.TreeCreate;

/*
 Given a tree, print the max sum path from root to leaf .. 
 (http://www.geeksforgeeks.org/find-the-maximum-sum-path-in-a-binary-tree/)

 */
public class PrintMaxSumPathRootToLeaf {
	static int max = 0;
	static int arr[];

	static void findMaxPath(Node root, int path[], int pathLen, int sum) {
		if (root == null)
			return;

		path[pathLen++] = root.getKey();
		sum += root.getKey();

		if (root.getLeft() == null && root.getRight() == null) {
			if (sum > max) {
				max = sum;
				arr = path.clone();

			}

		} else {
			findMaxPath(root.getLeft(), path, pathLen, sum);
			findMaxPath(root.getRight(), path, pathLen, sum);

		}

		return;
	}

	static void printMax() {
		System.out.println();
		System.out.println("max=" + max);
		System.out.println(Arrays.toString(arr));
	}

	static private void print(int path[], int sum) {
		System.out.println();
		for (int i : path)
			System.out.print(i + " ");
		// System.out.println("sum="+sum);

	}

	public static void main(String[] args) {
		TreeCreate tc = TreeCreate.treeCreate();
		int path[] = new int[5];
		int pathLen = 0;
		int sum = 0;
		findMaxPath(tc.root, path, pathLen, sum);
		printMax();
	}

}
