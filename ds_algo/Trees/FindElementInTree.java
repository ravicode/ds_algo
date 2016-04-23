package Trees;

import Queue.QueueImplNode;

public class FindElementInTree {
	
	
	boolean valueFound = false;

	void find(Node root, int ele) {
		if (root == null) {

			return;
		}

		if (root.getKey() == ele) {
			System.out.println("value found");

			valueFound = true;

		} else if (!valueFound) {
			if (root.getLeft() != null)
				find(root.getLeft(), ele);
			if (root.getRight() != null)
				find(root.getRight(), ele);
		}
	}

	

	
	public boolean findElementWithoutRecursion(Node root,int data) {

		QueueImplNode<Node> s = new QueueImplNode<Node>(15); // use of generics
		try {
			s.enque(root);

			while (!s.isEmpty()) {
				Node temp = s.deque();

				// System.out.print(temp.getKey() + ",");
				if (temp.getKey() ==data)
					return true;

				if (temp.getLeft() != null) {
					s.enque(temp.getLeft());
				}
				if (temp.getRight() != null) {
					s.enque(temp.getRight());
				}
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

		return false;
	}
	
	
	public static void main(String[] args) {
		
		TreeCreate tc = TreeCreate.treeCreate1();
		FindElementInTree find=new FindElementInTree();
		find.find(tc.root,20);
		
		System.out.println("value present in tree w/o recursion="+find.findElementWithoutRecursion(tc.root,20));
	}

}
