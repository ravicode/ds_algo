package Trees;



/*Print nodes at k distance from root.
 * Given a root of a tree, and an integer k.
 *  Print all the nodes which are at k distance from root. 

 For example, in the below tree, 4, 5 & 8 are at distance 2 from root. */

/* 1
/   \
2      3
/  \    /
4     5  8 */

public class PrintNodesAtKDistance {

	static void printKDistant(Node root, int k) {
		if (root == null)
			return;
		if (k == 0) {
			System.out.println(root.getKey());
		//	return;
		} else {
			printKDistant(root.getLeft(), k - 1);
			printKDistant(root.getRight(), k - 1);
		}
	}
	
	public static void main(String[] args) {
		TreeCreate tc=TreeCreate.treeCreate();
		printKDistant(tc.root,2);
	}

}
