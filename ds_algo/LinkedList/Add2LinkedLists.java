package LinkedList;



/*1) Given 2 linked lists of digits as data in their nodes add two numbers. 

 Eg:  1 -> 2 -> 3 -> 4    and 4->3 
 print 1 - > 2 -> 7 -> 7 */

public class Add2LinkedLists {

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
			System.out.println(lin.getData());
			lin = lin.getNext();
		}
	}

	public static void main(String[] args) {
		Add2LinkedLists a1 = new Add2LinkedLists();
		// a1[0] = new Add2LinkedLists();
		a1.insert(1);
		a1.insert(2);
		a1.insert(3);
		a1.insert(4);

		//a1.print(a1.head);

		System.out.println("\n\n\n");
		Add2LinkedLists a2 = new Add2LinkedLists();

		a2.insert(4);
		a2.insert(3);

		//a2.print(a2.head);

		Add2LinkedLists a3 = new Add2LinkedLists();
		System.out.println("\n\n\n");
		a3.add(a1, a2);
		a3.print(a3.head);

	}

	private void add(Add2LinkedLists a, Add2LinkedLists b) {
		Link aCurrent = a.head;
		Link bCurrent = b.head;
		int count = 0;
		while (aCurrent != null) {
			if (count >= 2) {
				insert(aCurrent.getData() + bCurrent.getData());
				bCurrent = bCurrent.getNext();
			} else {
				insert(aCurrent.getData());

			}
			aCurrent = aCurrent.getNext();
			count++;

		}

	}
}
