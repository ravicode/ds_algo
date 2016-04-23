package LinkedList;



public class LinkedListMidElement {

	public void findMidElement(Link current) {
		Link current2Steps = current;
		int mid = 0;
		while (current2Steps != null && current2Steps.getNext() != null) {

			current2Steps = current2Steps.getNext().getNext();

			current = (current.getNext());

			mid++;

		}

		System.out.println("mid pos=" + mid + " data=" + current.getData());

	}

	public static void main(String[] args) {

		LinkedListInsDel a = LinkedListInsDel.LinkedListCreate();
		LinkedListMidElement lMid = new LinkedListMidElement();
		lMid.findMidElement(a.first);
	}

}
