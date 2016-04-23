package Trees;

//class to create tree and return its instance

import java.util.Stack;

 

public class FindPreOrder_InOrder_PostOrder_Spiral_TraversalWithoutRecursion {

	public static void main(String[] args) {
		TreeCreate tc = TreeCreate.treeCreate();

		 tc.preOrder(tc.root);
		/*System.out.println("******* Pre Order Traversal ********");
		tc.preOrderWithoutRecursion(tc.root);
		System.out.println();
		System.out.println("******* In Order Traversal ********");
		tc.inOrderWithoutRecursion(tc.root);

		System.out.println();

		System.out.println("******* Spiral Traversal  ********");
		tc.spiralTraversal(tc.root);*/
		// tc.postOrderWithoutRecursion(tc.root); need to do ,some problem

	}
}
