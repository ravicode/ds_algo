package LinkedList;

import javax.swing.JOptionPane;


public class DoubleLinkedListInsDel {
	public LinkD first;
	
	public LinkD last;

	public DoubleLinkedListInsDel() {
		first = null;
	}

	public boolean isEmpty() {
		return (first == null);
	}

	public void LinkedListInsDel(int iData) {

		LinkD dataNode = new LinkD(iData);

		if (isEmpty()) {
			first = dataNode;
			last = dataNode;
			return;
		}
		last.setNext(dataNode);
		dataNode.setPrevious(last);
		last = dataNode;
		

	}

	public void disPlayForward() {

		LinkD current = first;

		while (current != null) {

			System.out.print(current.getData()+" ");
			current = current.getNext();
		}
	}

	public void disPlayBackWard() {
		LinkD current = last;
		while (current != null) {

			System.out.print(current.getData()+" ");
			current = current.getPrevious();
		}
	}

	public void deleteLink(int deleteData) {
		LinkD current = first;
		LinkD pre = null;
		

		while (current.getData()!=deleteData) {
			pre=current;
			current=current.getNext();
		}
		
		if(current.getData()==deleteData)
		{
			pre.setNext(current.getNext());
			current.getNext().setPrevious(pre);
		}
		disPlayForward();
	}

	static DoubleLinkedListInsDel doubleLinkedList()
	{
DoubleLinkedListInsDel a = new DoubleLinkedListInsDel();
		
		a.LinkedListInsDel(1);
		a.LinkedListInsDel(-2);
		a.LinkedListInsDel(-3);
		a.LinkedListInsDel(4);
		a.LinkedListInsDel(5);
		a.LinkedListInsDel(-6);
		a.LinkedListInsDel(7);
		a.LinkedListInsDel(-8);
		return a;
	}
	public static void main(String[] args) {

		DoubleLinkedListInsDel a = new DoubleLinkedListInsDel();
		
		a.LinkedListInsDel(10);
		a.LinkedListInsDel(11);
		a.LinkedListInsDel(12);
		a.LinkedListInsDel(13);
		a.LinkedListInsDel(14);

		System.out.println("show Value forward");
		a.disPlayForward();

		System.out.println("\n\nshow Value backward");
		a.disPlayBackWard();

		String input = JOptionPane.showInputDialog(null, "Enter delete Value",
				null);
		System.out
				.println("\n \n***********Deleted Data ******* \n");
		a.deleteLink(Integer.parseInt(input));

		
	}

}
