package LinkedList;


/*
Implementation of a doubly-linked list using a single pointer. 
I didn�t know the answer at that time.
 He gave me a few hints and I was able to solve it. 
Then he asked me to code it. 
*/
/*
 http://www.geeksforgeeks.org/xor-linked-list-a-memory-efficient-doubly-linked-list-set-1/
 */

//  1(xor of null and 9)---- > 9(xor of 1 and 3)----->3(xor of 9 and 2)----->2(xor of 3 and null)
public class ImplementDoublyLINkedLIstUsingSinglePointer {
	
	Link head=null;
	Link last=null;
	Link pre=null;
	 void insert(int key)
	{
		 Link lin=new Link(key);
		 lin.setNext(null);
		if(head==null)
		{
			head=lin;
			last=head;
			pre=null;
		}
		else
		{
			pre=last;
		last.setNext(lin);
			//last.setNext(pre ^ lin);
			last=lin;
		}
	}
	
	 void display(Link lin)
	 {
		 while(lin!=null)
		 {
			 System.out.println(lin.getData());
			 lin=lin.getNext();
		 }
	 }
	public static void main(String[] args) {
		
		ImplementDoublyLINkedLIstUsingSinglePointer im=new ImplementDoublyLINkedLIstUsingSinglePointer();
		im.insert(5);
		im.insert(6);
		im.insert(7);
		im.insert(8);
		im.insert(9);
		
		im.display(im.head);
		
	}

}
