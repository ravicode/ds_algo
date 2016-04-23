package LinkedList;

/*
 Given a singly linked list you have to subtract the value of first node from the last node and
 so on until you reach the middle node.
 Eg: Input: 5 -> 4 -> 3 -> 2 -> 1
 Output: 4 -> 2 -> 3 -> 2 -> 1*/

/*check list is palindrome or not*/

public class LinkedListSubtractNodeValue {

	public static void main(String[] args) {
		LinkedListInsDel ll = LinkedListInsDel.LinkedListCreate(); // palindrome

		ll.disPlay(ll.first);

		findMidElement(ll.first);
		System.out.println(checkPalin(ll.first, mid));

		ll.disPlay(ll.first);
	}

	static int mid = 1;

	public static void findMidElement(Link current) {
		Link current2Steps = current;

		while (current2Steps != null && current2Steps.getNext() != null) {

			current2Steps = current2Steps.getNext().getNext();

			current = current.getNext();

			mid++;

		}

		midLink = current;

	}

	static Link midLink = null;

	static boolean checkPalin(Link root, int count) {
		if (count == 0)
			return true;
		count--;
		checkPalin(root.getNext(), count);

		if (root.getNext().getData() == midLink.getData()) {

		} else {
			root.setData(root.getData() - midLink.getData());
		}
		midLink = midLink.getNext();

		return true;
	}
}
