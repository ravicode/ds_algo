package LinkedList;

import javax.swing.JOptionPane;

public class LinkedListInsDel {
	public Link first;
	private Link current;

	public LinkedListInsDel() {
		first = null;
	}

	public void LinkedListInsDeletion(int iData) {
		Link data = new Link(iData);
		// data.setData(iData);

		if (first == null) {
			first = data;
			current = data;
			return;
		}

		current.setNext(data);
		current = data;

	}

	public void disPlay(Link current) {

		while (current != null) {

			System.out.print(current.getData() + " ");
			current = current.getNext();
		}
		// System.out.println();
	}

	public void deleteLink(int deleteData) {
		Link current = first;

		Link pre = null;
		int i = 0;

		while (current.getNext() != null && current.getData() != deleteData) {
			pre = current;

			current = current.getNext();
		}

		if (current.getData() == deleteData) {
			pre.setNext(current.getNext());
			current = null;

		}

	}

	public int getCount() {
		Link current = first;
		int count = 0;

		while (current != null) {
			count++;
			current = current.getNext();
		}

		return count;
	}

	public void exchangeNode(int changePosFromFront) throws Exception {
		int count = getCount();
		// System.out.println("count="+count);
		if (changePosFromFront > count || changePosFromFront < 0) {
			System.out.println("No Swapping element");
			return;
		}
		int c = 1;
		Link current = first;
		int changePosFromBack = count - changePosFromFront + 1;
		// System.out.println("postion of back from front="+changePosFromBack);

		Link front = null, back = null;
		while (current != null) {
			c++;
			current = current.getNext();
			if (c == changePosFromFront)
				front = current;
			if (c == changePosFromBack)
				back = current;

		}

		int temp = front.getData();
		front.setData(back.getData());
		back.setData(temp);

	}

	public static LinkedListInsDel LinkedListCreate1() {
		LinkedListInsDel a1 = new LinkedListInsDel();
		a1.LinkedListInsDeletion(2);
		a1.LinkedListInsDeletion(4);
		a1.LinkedListInsDeletion(7);
		a1.LinkedListInsDeletion(8);
		a1.LinkedListInsDeletion(13);

		return a1;
	}

	public static LinkedListInsDel LinkedListCreate3() {
		LinkedListInsDel a2 = new LinkedListInsDel();
		a2.LinkedListInsDeletion(2);
		a2.LinkedListInsDeletion(4);
		a2.LinkedListInsDeletion(6);
		a2.LinkedListInsDeletion(10);
		// a2.LinkedListInsDeletion(13);

		return a2;
	}

	public static LinkedListInsDel LinkedListCreate2() {
		LinkedListInsDel a2 = new LinkedListInsDel();
		a2.LinkedListInsDeletion(1);
		a2.LinkedListInsDeletion(3);
		a2.LinkedListInsDeletion(6);
		a2.LinkedListInsDeletion(10);
		// a2.LinkedListInsDeletion(13);

		return a2;
	}

	public static LinkedListInsDel LinkedListCreatePalindrome() {
		LinkedListInsDel a3 = new LinkedListInsDel();
		a3.LinkedListInsDeletion(1);
		a3.LinkedListInsDeletion(3);
		a3.LinkedListInsDeletion(6);
		a3.LinkedListInsDeletion(10);
		a3.LinkedListInsDeletion(13);
		a3.LinkedListInsDeletion(10);
		a3.LinkedListInsDeletion(6);
		a3.LinkedListInsDeletion(3);
		a3.LinkedListInsDeletion(1);
		/*
		 * a3.LinkedListInsDeletion(0); a3.LinkedListInsDeletion(-1);
		 */

		return a3;
	}

	public static LinkedListInsDel LinkedListCreate() {
		LinkedListInsDel a = new LinkedListInsDel();
		a.LinkedListInsDeletion(10);
		a.LinkedListInsDeletion(11);
		a.LinkedListInsDeletion(12);
		a.LinkedListInsDeletion(13);
		a.LinkedListInsDeletion(14);
		a.LinkedListInsDeletion(20);
		a.LinkedListInsDeletion(16);
		a.LinkedListInsDeletion(17);
		a.LinkedListInsDeletion(18);
		// a.LinkedListInsDeletion(19);

		return a;
	}

	public static void main(String[] args) {

		/*
		 * LinkedListInsDel a = new LinkedListInsDel();
		 * a.LinkedListInsDeletion(10); a.LinkedListInsDeletion(11);
		 * a.LinkedListInsDeletion(12); a.LinkedListInsDeletion(13);
		 * a.LinkedListInsDeletion(14); a.LinkedListInsDeletion(15);
		 */
		LinkedListInsDel a = LinkedListInsDel.LinkedListCreate();

		a.disPlay(a.first);
		/*
		 * String input = JOptionPane.showInputDialog(null,
		 * "Enter delete Value");
		 * System.out.println("\n \n*************Deleted Data *************** \n"
		 * ); a.deleteLink(Integer.parseInt(input)); a.disPlay(a.first);
		 */
		System.out
				.println("\n \n********After exchanging position *********** \n");
		try {
			a.exchangeNode(2);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		a.disPlay(a.first);

	}

}