package LinkedList;



/*How will you find the kth node from last in a list? Discussion on optimization*/

//find 3rd from last= 16

public class FindNthNodefromTheendInLinkedList {

	public static void main(String[] args) {
		LinkedListInsDel t = LinkedListInsDel.LinkedListCreate();
		t.disPlay(t.first);

		Link current = t.first, currentSlow = t.first;
		int c = 0;
		while (current != null) {
			c++;
			current = current.getNext();
			if (c > 3) {
				currentSlow = currentSlow.getNext();
			}

		}

		System.out.println("\n\n 3rd from last=" + currentSlow.getData());
	}

}
