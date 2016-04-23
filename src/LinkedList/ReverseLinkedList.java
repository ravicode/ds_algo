package LinkedList;






public class ReverseLinkedList {

	static Link reverseLinkedList(Link current)
	{
		Link next=null;
		Link temp=null;
		while(current!=null)
		{
			next=current.getNext();
			current.setNext(temp);
			temp=current;
			current=next;
			
		}
		
		return temp;
	}
	
	
	static void print(Link current)
	{
		while(current!=null)
		{
			System.out.print (current.getData() + " ");
			current=current.getNext();
		}
	}
	static Link reverseLinkedListInPairs(Link current,int k)
	{
		Link next=null;
		Link temp=null;
		Link head=current;
		int count=0;
		while(current!=null && k>count)
		{
			next=current.getNext();
			current.setNext(temp);
			temp=current;
			current=next;
			count++;
			
		}
		//count=0;
		if(next!=null)
			head.setNext(reverseLinkedListInPairs(next,k));
		
		return temp;
	}
	
	public static void main(String[] args) {
		
		LinkedListInsDel li=LinkedListInsDel.LinkedListCreate();
		print(li.first);
		//Link first= reverseLinkedList(li.first);
		
		System.out.println();
		Link first1= reverseLinkedListInPairs(li.first,2);
		
		print(first1);
	}
}