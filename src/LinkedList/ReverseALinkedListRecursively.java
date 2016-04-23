package LinkedList;


//Write a Recursive function to reverse a link list.


public class ReverseALinkedListRecursively {

	static Link temp = null;
	static Link next = null;
	static Link head=null;
	static void reverseLinkedList(Link current) {

		if(current.getNext()==null)
		{
			head=current;
			return ;
		}
		
		reverseLinkedList(current.getNext());
	
			Link next = current.getNext();
			next.setNext(current);
			current.setNext(null);
			

	}

	
	public static void main(String[] args) {

		LinkedListInsDel li = LinkedListInsDel.LinkedListCreate();
		li.disPlay(li.first);

		System.out.println();
		System.out.println("In Place Reverse");
		reverseLinkedList(li.first);
		li.disPlay(head);
		
	
}
}
