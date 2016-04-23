package LinkedList;



public class Link {

	private int data;
	private Link next;

	
	public int getData() {
		return data;
	}

	public void setData(int data) {
		this.data = data;
	}

	public Link getNext() {
		return next;
	}

	public void setNext(Link next) {
		this.next = next;
	}

	public Link() {

	}

	public Link(int data) {
		this.data = data;
	}
	
	

}