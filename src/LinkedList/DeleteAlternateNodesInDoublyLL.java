package LinkedList;



//Delete alternate nodes in a doubly linked list.
public class DeleteAlternateNodesInDoublyLL {
	
	
	static void deleteAlternateNodes(Link current)
	{
		Link cur=current;
		while(cur.getNext()!=null && current.getNext().getNext()!=null)
		{
			
			//System.out.print(current.getData() +" ");
			cur=current.getNext().getNext();
			current.setNext(cur);
			current=current.getNext();
		}
		
	}
	
	static void printList(Link current)
	{
		while(current!=null)
		{
			System.out.print(current.getData() +" ");
			current=current.getNext();
		}
	}
	public static void main(String[] args) {
		
		LinkedListInsDel li=LinkedListInsDel.LinkedListCreate();
		
		printList(li.first);
		
		System.out.println();
deleteAlternateNodes(li.first);
		
		printList(li.first);
	}

}
