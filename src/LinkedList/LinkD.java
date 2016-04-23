package LinkedList;

public class LinkD {

	private int data;
	private LinkD next;
	private LinkD previous;
	public int getData() {
		return data;
	}
	public void setData(int data) {
		this.data = data;
	}
	public LinkD getNext() {
		return next;
	}
	public void setNext(LinkD next) {
		this.next = next;
	}
	public LinkD getPrevious() {
		return previous;
	}
	public void setPrevious(LinkD previous) {
		this.previous = previous;
	}
	
	public LinkD(int iData) {
		data = iData;
	}

	
}
