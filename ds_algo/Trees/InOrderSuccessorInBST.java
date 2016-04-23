package Trees;



// good explanation in myCodeSchool

//cases :-
//1.noDe has right subtree -  go deep to leftmost node in right subtree or find min in right subtree.
//2. node has no right subtree - a) so if we going to parent from left, then parent is unvsited, 
//then this parent is sucessror
//b) if we going parent from right , then its visited..so this parent cannot be succcessor  , 
//so go to parent's parent and then its to right from left.\,//so this ancestor is successor.
// so for this tree, our node must have reference to its parent in its ndoes.
public class InOrderSuccessorInBST {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeCreate tc = TreeCreate.treeCreate1();
		InOrderSuccessorInBST in = new InOrderSuccessorInBST();
		tc.inOrderWithoutRecursion(tc.root);
		Node successor = in.findInOrderSuccessor(9, tc.root);
		if (successor != null)
			System.out.println(successor.getKey());
		else
			System.out
					.println("No Successor, Number is  not present or is maximum number");

	}

	Node findInOrderSuccessor(int key, Node root) {
		Node current = TreeCreate.search(key, root);
		if (current == null)
			return null;

		if (current.getRight() != null)
			return TreeCreate.findMin(current.getRight());
		else {
			Node successor = null;
			Node ancestor = root;
			while (ancestor != current) {
				if (current.getKey() < ancestor.getKey()) {
					successor = ancestor;
					ancestor = ancestor.getLeft();

				} else

					ancestor = ancestor.getRight();

			}
			return successor;
		}

		// System.out.println(current);
	}

}
