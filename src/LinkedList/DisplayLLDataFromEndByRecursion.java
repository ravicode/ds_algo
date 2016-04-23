package LinkedList;

public class DisplayLLDataFromEndByRecursion {
	
	public static  void displayFromBack(Link current)
	{
		if(current==null)
			return;
		displayFromBack(current.getNext());
		System.out.print(current.getData()+" ");
		
	}
	
	public static void main(String[] args) {
		LinkedListInsDel ld = LinkedListInsDel.LinkedListCreate();
		ld.disPlay(ld.first);
		System.out.println();
		displayFromBack(ld.first);
	}

}
