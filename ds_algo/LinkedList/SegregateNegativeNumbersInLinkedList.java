package LinkedList;

/*Given a linked list. Segregate all the positive numbers at the beginning and
all the negative numbers at the end.
I did it in O(N) time complexity.*/


public class SegregateNegativeNumbersInLinkedList {
	public static void main(String[] args) {
		DoubleLinkedListInsDel li=DoubleLinkedListInsDel.doubleLinkedList();
		li.disPlayForward();
		System.out.println();
		li.disPlayBackWard();
		LinkD fr=li.first;
		LinkD bk=li.last;
		
		while (fr!=bk) {
			//if (fr.getData() % 2 == 0) {
			if (fr.getData() > 0) {

				fr=fr.getNext();
			} else {
				int p = bk.getData();
				bk.setData(fr.getData());
				fr.setData(p);
				bk=bk.getPrevious();
			}

		}
		System.out.println();
		li.disPlayForward();
	}
}
