package LinkedList;

import java.util.Stack;

import LinkedList.Link;
import LinkedList.LinkedListInsDel;

/*check list is palindrome or not*/

public class CheckListIsPalidromeOrNot {

	static int mid = 0;
	static Link midLink = null;

	public static void main(String[] args) {
		LinkedListInsDel ll = LinkedListInsDel.LinkedListCreatePalindrome(); // palindrome

		ll.disPlay(ll.first);

		findMidElement(ll.first);
		System.out.println(checkPalin(ll.first, mid));
	}

	public static void findMidElement(Link current) {
		Link current2Steps = current;
		// int mid = 0;
		while (current2Steps != null && current2Steps.getNext() != null) {

			current2Steps = current2Steps.getNext().getNext();

			current = current.getNext();

			mid++;

		}
		midLink = current;
		// System.out.println(mid);
		// System.out.println("mid pos=" + mid + " data=" + current.getData());

	}

	static boolean checkPalin(Link root, int count) {
		if (count == 0)
			return true;
		count--;
		checkPalin(root.getNext(), count);
		midLink = midLink.getNext();
		if (!(root.getData() == midLink.getData()))
			return false;

		return true;
	}
}
