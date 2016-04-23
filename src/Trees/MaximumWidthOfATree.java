package Trees;

import Queue.QueueImplNode;



/*geeksForGeeks

 Maximum width of a binary treeGiven a binary tree, 
 write a function to get the maximum width of the given tree.
 Width of a tree is maximum of widths of all levels*/

//find the number of elements at each row.
public class MaximumWidthOfATree {

	static void findWidth(Node root) {
		QueueImplNode<Node> q = new QueueImplNode<Node>(50);
		Node temp = null;
		int width = 0, max = 0;
		try {
			q.enque(root);
			q.enque(null);

			while (!q.isEmpty()) {
				temp = q.deque();

				if (temp == null) {
					
					if (q.isEmpty())
					{
						System.out.println("Width/Diameter="+max);
						return;
					}
					if (width > max)
						max = width;
					width = 0;

					
					q.enque(null);
				} else {
					width++;
					if (temp.getRight() != null)
						q.enque(temp.getRight());
					if (temp.getLeft() != null)
						q.enque(temp.getLeft());

				}
			}
			
			

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		TreeCreate tc = TreeCreate.treeCreate();
		findWidth(tc.root);
	}

}
