package Trees;




//POJO Node for Tree


public class Node {
	private int key;
	private Node left;
	private Node right;
public boolean flag=false;
	
	private Node sib;
	public Node getSib() {
		return sib;
	}
	public void setSib(Node sib) {
		this.sib = sib;
	}

public Node()
{
	
}
	public int getKey() {
		return key;
	}


	public void setKey(int key) {
		this.key = key;
	}


	
	public Node getLeft() {
		return left;
	}


	public void setLeft(Node left) {
		this.left = left;
	}


	public Node getRight() {
		return right;
	}


	public void setRight(Node right) {
		this.right = right;
	}


	public Node(int k) {
		key = k;
		left=null;
		right=null;
	}
}
