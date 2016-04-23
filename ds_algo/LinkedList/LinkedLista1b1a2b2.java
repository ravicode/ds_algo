package LinkedList;


class Link2 {
	public String data;
	public Link2 next;

	Link2() {

	}

	public Link2(String data) {
		this.data = data;

	}
}

class InsertLinkList {
	private Link2 first;

	InsertLinkList() {
		first = null;
	}

	public void intializeLink(String data) {
		Link2 a = new Link2(data);
		if (first == null) {
			first = a;
			a.next = null;
		} else {
			a.next = first;
			first = a;
		}

	}

	public void display(InsertLinkList lin) {
		while (first != null) {
			System.out.println(first.data);
			first = first.next;
		}
	}

	public void display1(InsertLinkList lin) {

		Link2 first1 = first;
		Link2 first3 = first;

		while (first1.next != null) {
			System.out.println(first3.data);
			first1 = first3.next.next.next;
			System.out.println(first1.data);
			first3 = first3.next;

		}
	}
}

public class LinkedLista1b1a2b2 {

	public static void main(String[] args) {

		InsertLinkList lin = new InsertLinkList();
		lin.intializeLink("b3");
		lin.intializeLink("b2");
		lin.intializeLink("b1");

		lin.intializeLink("a3");
		lin.intializeLink("a2");
		lin.intializeLink("a1");

		lin.display1(lin);
	}

}
