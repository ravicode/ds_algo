package Trees;

import Queue.QueueImplNode;

public class FinfLevelOfmaximumSum {

	public void findMAxLevelSum(Node root) {
		QueueImplNode<Node> q = new QueueImplNode<Node>(20);
		int maxSum = 0, currentSum = 0;
		Node temp;
		try {
			q.enque(root);
			q.enque(null);

			while (!q.isEmpty()) {
				temp = q.deque();

				if (temp == null) {
					if (q.isEmpty())
					{
						System.out.println(maxSum);
						return;
					}
					
						q.enque(null);
					if (currentSum > maxSum)
						maxSum = currentSum;

					currentSum = 0;

					
				} else {
					currentSum += temp.getKey();

				}
				
				if (temp != null && temp.getLeft() != null) {
					q.enque(temp.getLeft());

				}

				if (temp != null && temp.getRight() != null) {
					q.enque(temp.getRight());

				}

				

			}

		} catch (Exception e) {
			e.printStackTrace();
		}

		
	}

	public static void main(String[] args) {
		TreeCreate tc = TreeCreate.treeCreate();
		FinfLevelOfmaximumSum levelMax = new FinfLevelOfmaximumSum();
		levelMax.findMAxLevelSum(tc.root);
	}

}
