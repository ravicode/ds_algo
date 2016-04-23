package LinkedList;

/*
 Given a linked list which contains series of numbers seperated by “0″.
 Add them and store in the linked list in-place. 
 for eg : i/p linked list is 1->2->3->0->5->4->0->3->2->0
 o/p Linked list is 6->9->5 

 */
public class CreateASumLLInPlace {
	Link head = null;
	Link last = null;

	private void insert(int data) {
		Link lin = new Link(data);
		if (head == null) {
			head = lin;
			last = lin;
		}
		last.setNext(lin);
		last = lin;

	}

	private void print(Link lin) {
		while (lin != null) {
			System.out.print(lin.getData() + "->");
			lin = lin.getNext();
		}
	}

	private void printAdd(Link lin) {
		int sum = 0;
		Link pre = null;
		Link prelast = null;
		while (lin != null) {

			sum += lin.getData();
			if (lin.getData() == 0) {
				lin.setData(sum);
				sum = 0;
				if (pre == null) {
					pre = lin;
					prelast = lin;

				} else {
					prelast.setNext(lin);

				}
				prelast = lin;
			}

			lin = lin.getNext();

		}

		print(pre);
	}

	public static void main(String[] args) {
		CreateASumLLInPlace ll = new CreateASumLLInPlace();
		ll.insert(1);
		ll.insert(2);
		ll.insert(3);
		ll.insert(0);
		ll.insert(5);
		ll.insert(4);
		ll.insert(0);
		ll.insert(3);
		ll.insert(2);
		ll.insert(0);
		ll.print(ll.head);
		System.out.println();
		ll.printAdd(ll.head);

	}
}
