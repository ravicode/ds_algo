package Stack;

import LinkedList.Link;



class LinkedListStack {
	Link current = null, first = null;

	public void insert(int data) {

		Link current_new = new Link(data);
		if (first == null)
		{
			first = current_new;
			current=current_new;
		}
		else {
			//current = first;
			/*while (current.next != null) {
				current = current.next;
			}*/
			current_new.setNext(current);
			current=current_new;
		}

	}

	public void display() {
		Link first = current;
		while (first != null) {
			System.out.println(first.getData());
			first = first.getNext();
		}
	}

	public int pop() {
		//int a = 0;

		Link po=current;
		current = current.getNext();//, pre = null;
		
		return po.getData();
	/*	while (current.next != null) {

			pre = current;
			current = current.next;
		}
		if (pre != null) {
			a = pre.next.data;
			pre.next = null;
		} else {
			a = current.data;
		}

		return a;*/
	}
}

public class StackImplWithLinkedList {

	public static void main(String[] args) {
		LinkedListStack l = new LinkedListStack();
		l.insert(5);
		l.insert(10);
		l.insert(15);
		//l.display();
		l.insert(20);
		// l.pop();
		System.out.println("popped data is= " + l.pop());
		System.out.println("popped data is= " + l.pop());
		System.out.println("popped data is= " + l.pop());

	}

}
