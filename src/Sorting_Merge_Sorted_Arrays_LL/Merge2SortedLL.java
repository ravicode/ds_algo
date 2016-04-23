package Sorting_Merge_Sorted_Arrays_LL;

import LinkedList.Link;
import LinkedList.LinkedListInsDel;

public class Merge2SortedLL {

	static Link mergerList(Link a, Link b) {
		Link result = null;
		if (a == null)
			return b;
		if (b == null)
			return a;

		if (a.getData() >= b.getData()) {
			result = b;
			b.setNext(mergerList(a,b.getNext()));

		}

		else {
			result = a;
			a.setNext(mergerList(a.getNext(), b));

		}
		// System.out.println(result.getData());
		return result;
	}

	public static void main(String[] args) {

		LinkedListInsDel li1 = LinkedListInsDel.LinkedListCreate1();
		LinkedListInsDel li2 = LinkedListInsDel.LinkedListCreate2();

		Link p = mergerList(li1.first, li2.first);

		li1.disPlay(p);

	}
}
