package LinkedList;

/*Given two sorted list,
 *  find the Kth largest element from the combined sorted list.*/
// tc = o(n);

public class MergeTwoSortedListANdFindkthElement {

	static Link mergeList(Link a, Link b) {
		Link result = null;
		if (a == null)
			return b;

		if (b == null)
			return a;

		if (b.getData() >= a.getData()) {
			result = a;
			a.setNext(mergeList(a.getNext(), b));

		} else {
			result = b;
			b.setNext(mergeList(a, b.getNext()));
		}

		return result;
	}

	public static void main(String[] args) {
		LinkedListInsDel a1 = LinkedListInsDel.LinkedListCreate1();
		LinkedListInsDel a2 = LinkedListInsDel.LinkedListCreate2();
		Link r = mergeList(a1.first, a2.first);
		a1.disPlay(r);

		System.out.println();
		Link r_iter = mergeList_iterative(a1.first, a2.first);
		a1.disPlay(r_iter);

	}

	private static Link mergeList_iterative(Link current1, Link current2) {
		/*
		 * Link current1 = a1.first; Link current2 = a2.first;
		 */
		Link a3 = null;
		Link last = null;
		LinkedListInsDel ll = new LinkedListInsDel();
		//int count = 0;
		while (current1 != null && current2 != null) {
			/*if (count == 4) {
				System.out.println(last.getData());
			}

			count++;*/
			if (current1.getData() == current2.getData()) {
				// a3.LinkedListInsDeletion(current2.getData());

				if (a3 == null) {
					a3 = current1;
					last = current1;

				}

				else {
					last.setNext(current1);
					last = current1;
				}

				current1 = current1.getNext();
				current2 = current2.getNext();

			} else {
				if (current1.getData() > current2.getData()) {
					// current1=current1.getNext();
					if (a3 == null) {
						a3 = current2;
						last = current2;

					}

					else {
						last.setNext(current2);
						last = current2;
					}
					current2 = current2.getNext();

				}

				else if (current1.getData() < current2.getData()) {

					if (a3 == null) {
						a3 = current1;
						last = current1;

					}

					else {
						last.setNext(current1);
						last = current1;
					}
					current1 = current1.getNext();
					// current2=current2.getNext();

				}

			}
		}

		// ll.disPlay(a3);
		return a3;
	}

}
