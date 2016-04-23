

package LinkedList;


/*1) Given 2 linked lists of digits as data in their nodes add two numbers. 

 Eg:  5 -> 8 -> 3 -> 4    and 9->7->8
 print 4 - > 6 -> 4 -> 4 */

public class Add2LinkedListsWithCarry {

	Link head = null;
	Link last = null;
int r=0,q=0;
	private void insert(int data) {
		data+=q;
		r=data%10;
		 q=data/10;
		
		if(q!=0)
			data=r;
		
		
		
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
		Add2LinkedListsWithCarry a1 = new Add2LinkedListsWithCarry();
		// a1[0] = new Add2LinkedLists();
		a1.insert(5);
		a1.insert(8);
		a1.insert(3);
		a1.insert(4);

		a1.print(a1.head);

		System.out.println("\n\n\n");
		Add2LinkedListsWithCarry a2 = new Add2LinkedListsWithCarry();

		a2.insert(9);
		a2.insert(7);
		a2.insert(8);

		a2.print(a2.head);

		Add2LinkedListsWithCarry a3 = new Add2LinkedListsWithCarry();
		System.out.println("\n\n\n");
		a3.add(a1, a2);
		a3.print(a3.head);

	}

	private void add(Add2LinkedListsWithCarry a, Add2LinkedListsWithCarry b) {
		Link aCurrent = a.head;
		Link bCurrent = b.head;
		int count = 0;
		/*while (aCurrent != null) {
			if (count >= 2) {
				insert(aCurrent.getData() + bCurrent.getData());
				bCurrent = bCurrent.getNext();
			} else {
				System.out.println(aCurrent.getData());

			}
			aCurrent = aCurrent.getNext();
			count++;

		}*/
		
		while (aCurrent != null) {
			
			if (bCurrent != null)
			{
		
				insert(aCurrent.getData() + bCurrent.getData());
				bCurrent = bCurrent.getNext();
			}
			else
				insert(aCurrent.getData());
			aCurrent = aCurrent.getNext();
			//count++;
			}
		
		

	}
}
