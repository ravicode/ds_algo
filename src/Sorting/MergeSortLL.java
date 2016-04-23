package Sorting;

import LinkedList.Link;
import LinkedList.LinkedListInsDel;



public class MergeSortLL {

	public Link merge_sort(Link head) {
		if (head == null || head.getNext() == null) {
			return head;
		}
		Link middle = findMiddle(head); // get the middle of the list
		Link sHalf = middle.getNext();
		middle.setNext(null); // split the list into two halfs

		return merge(merge_sort(head), merge_sort(sHalf)); // recurse on that
	}

	static Link merge(Link first, Link last) {

		Link result = null;

		if (first == null)
			return last;
		else if (last == null)
			return first;

		if (first.getData() <= last.getData()) {
			result = first;
			result.setNext(merge(first.getNext(), last));
		}

		if (last.getData() <= first.getData()) {
			result = last;
			result.setNext(merge(first, last.getNext()));
		}

		return result;
	}

	Link findMiddle(Link head) {
		if (head == null || head.getNext()==null) {
			return head;
		}
		Link middle = head;
		Link middle2Steps = head;

		while (middle2Steps.getNext() != null
				&& middle2Steps.getNext().getNext() != null) {
			middle2Steps = middle2Steps.getNext().getNext();
			middle = middle.getNext();

		}

		return middle;
	}

	void printList(Link head) {
		while (head != null) {
			System.out.println(head.getData());
			head = head.getNext();
		}
	}

	/* Driver program to test above functions */
	public static void main(String[] args) {

		/* Sort the above created Linked List */

		LinkedListInsDel ll = LinkedListInsDel.LinkedListCreate();
	//	LinkedListInsDel ll = LinkedListInsDel.LinkedListCreate2();
		//LinkedListInsDel ll1 = LinkedListInsDel.LinkedListCreate1();

		

		MergeSortLL ms = new MergeSortLL();
	/* merge(ll.first,ll1.first);
	ms.printList(ll.first); */
		ms.printList(ll.first);
		ms.merge_sort(ll.first);

		System.out.println("\n Sorted Linked List is: \n");
		ms.printList(ll.first);

	}
}
