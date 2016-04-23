package LinkedList;

import LinkedList.Link;
import LinkedList.LinkedListInsDel;

/*Swap the data of alternate nodes of a list.*/

public class SwapData {
	
	public static void main(String[] args) {
		
		
LinkedListInsDel ll=LinkedListInsDel.LinkedListCreate();
		
		ll.disPlay(ll.first);
		Link head=ll.first;
		Link temp=head;
		/*Link head1=null;
		Link temp1=head,temp2;*/
		Link temp3=head;
		
		while(temp!=null)
		{
			
			
			int t=temp.getData();
			temp3=temp.getNext().getNext();
			temp.setData(temp3.getData());
			temp3.setData(t);
			temp=temp3.getNext();
			
		}
		
		System.out.println();
		
		ll.disPlay(ll.first);
	}

}
