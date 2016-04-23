package Trees_CheckAgain;

import Trees.Node;
import Trees.TreeCreate;






public class CheckAVLOrNot {

	public int height(Node root) {

		if (root == null)
			return 0;
		return 1+ Math.max(height(root.getLeft()),height(root.getRight()));
	}

	public int checkAVL(Node root) {
		int ls = 0, rs = 0;

		if (root == null)
			return 1;

		ls = height(root.getLeft());
		rs = height(root.getRight());

		if (Math.abs(ls-rs)<= 1 && checkAVL(root.getLeft()) == 1
				&& checkAVL(root.getRight()) == 1) {
			return 1;
		}

		return 0;
	}

	public static void main(String[] args) {
		TreeCreate tc = TreeCreate.treeCreate();   //AVL
		
	// Not AVL
		/* Node d = new Node(26);
		Node l = new Node(10);
		Node ll = new Node(4);
		Node lr = new Node(6);
		Node r = new Node(3);
		Node rr = new Node(3);

		d.setLeft(l);
		l.setLeft(ll);
		l.setRight(lr);
		d.setRight(r);
		r.setRight(rr); */
	////////////	
		
		CheckAVLOrNot ct = new CheckAVLOrNot();
		int check=ct.checkAVL(tc.root);
		
		if(check==1)
			System.out.println("AVL");
		else
			System.out.println("Not AVL");
	}

}
