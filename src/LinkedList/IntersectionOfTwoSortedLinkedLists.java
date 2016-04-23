package LinkedList;

//1st quest: http://www.geeksforgeeks.org/intersection-of-two-sorted-linked-lists/

// TC= O(m+n)
public class IntersectionOfTwoSortedLinkedLists {

	public static void main(String[] args) {
		LinkedListInsDel a1 = LinkedListInsDel.LinkedListCreate2();
		LinkedListInsDel a2 = LinkedListInsDel.LinkedListCreate3();
		a1.disPlay(a1.first);
		System.out.println();
		a2.disPlay(a2.first);
		System.out.println("\nWithout extra space");
		IntersectionListWithOutExtraSpace(a1, a2);
		System.out.println("\nWith extra space");
		IntersectionListWithExtraSpace(a1, a2);

	}

	private static void IntersectionListWithOutExtraSpace(LinkedListInsDel a1,
			LinkedListInsDel a2) {
		Link current1 = a1.first;
		Link current2 = a2.first;

		// LinkedListInsDel a3 = new LinkedListInsDel();
		Link first = null;
		Link last = null;
		while (current1 != null && current2 != null) {

			if (current1.getData() == current2.getData()) {
				// a3.LinkedListInsDeletion(current2.getData());
				if (first == null) {
					first = current2;
					last = current2;
				} else {
					last.setNext(current2);
					last = current2;
				}
				current1 = current1.getNext();
				current2 = current2.getNext();

			} else {
				if (current1.getData() > current2.getData()) {
					// current1=current1.getNext();
					current2 = current2.getNext();

				}

				else if (current1.getData() < current2.getData()) {
					current1 = current1.getNext();
					// current2=current2.getNext();

				}

			}
		}
		a2.disPlay(first);
		// a3.disPlay(a3.first);
	}

	private static void IntersectionListWithExtraSpace(LinkedListInsDel a1,
			LinkedListInsDel a2) {
		Link current1 = a1.first;
		Link current2 = a2.first;

		LinkedListInsDel a3 = new LinkedListInsDel();

		while (current1 != null && current2 != null) {

			if (current1.getData() == current2.getData()) {
				a3.LinkedListInsDeletion(current2.getData());

				current1 = current1.getNext();
				current2 = current2.getNext();

			} else {
				if (current1.getData() > current2.getData()) {
					// current1=current1.getNext();
					current2 = current2.getNext();

				}

				else if (current1.getData() < current2.getData()) {
					current1 = current1.getNext();
					// current2=current2.getNext();

				}

			}
		}

		a3.disPlay(a3.first);
	}
}
