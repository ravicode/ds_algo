package LinkedList;

//Question:- 
/*Given a linked list with every node containing two pointers next 
and random. next points to next element and random points to any random element 
in linked list. Create a copy of this list. He asked me to write the code.*/



import java.util.HashMap;

import LinkedList.Link;
import LinkedList.LinkedListInsDel;

//Random Pointer in Linked list. Clone it.
public class CloneALinkedListWithRandomPointers {

	public Link cloneList(Link current) {
		HashMap<Link, Link> mp = new HashMap<Link, Link>();

		Link temp = current;
		Link start = null;
		while (current != null) {
			Link t = new Link(current.getData());
			if (start == null)
				start = t;
			t.setNext(null);

			mp.put(current, t);
			current = current.getNext();
		}

		while (temp != null) {
			Link p = mp.get(temp);
			Link next = mp.get(temp.getNext());
			p.setNext(next);
			temp = temp.getNext();

		}

		return start;

	}

	public static void main(String[] args) {

		LinkedListInsDel ldl = LinkedListInsDel.LinkedListCreate();
		CloneALinkedListWithRandomPointers cl = new CloneALinkedListWithRandomPointers();
		Link clone = cl.cloneList(ldl.first);
		System.out.println("cloned list");
		System.out.println("starting node address for confirmation" + clone);
		ldl.disPlay(clone);

		System.out.println("\n\n");
		System.out.println("original list");
		System.out
				.println("starting node address for confirmation" + ldl.first);
		ldl.disPlay(ldl.first);

	}
}
