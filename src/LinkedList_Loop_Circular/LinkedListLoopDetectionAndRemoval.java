package LinkedList_Loop_Circular;


//  http://www.geeksforgeeks.org/detect-and-remove-loop-in-a-linked-list/
import LinkedList.Link;
import LinkedList.LinkedListInsDel;
import Trees.GetLevelOfANode;

public class LinkedListLoopDetectionAndRemoval {
	Link loopFoundAtNode = null;
	
	void makeCircular(Link current) {
		// int k=3;
		int c = 0;
		Link jointNode = null; // node number 3

		while (current.getNext() != null) {
			c++;
			// System.out.println("dd");
			current = current.getNext();
			if (c == 3) {
				jointNode = current;
				System.out.println("circular at=" + current.getData());
			}

		}

		if (current.getNext() == null)
			current.setNext(jointNode);
	}

	void checkCircular(Link current) {
		Link current2Steps = current.getNext();
		int p = 0;
		while (current2Steps.getNext().getNext() != null
				&& current != current2Steps) {
			current2Steps = current2Steps.getNext().getNext();
			current = current.getNext();
			// p++;
		}
		if (current == current2Steps) {
			System.out.println("circular");
			loopFoundAtNode = current;
			System.out.println("loop found at=" + current.getData());
		} else

			System.out.println("not circular");

		// System.out.println("number of iterations="+p);
	}

	int lengthOfLoop() {
		int count = 1;
		Link current = loopFoundAtNode.getNext();
		while (current != loopFoundAtNode) {
			count++;
			current = current.getNext();
		}
		System.out.println("\nLength of Loop=" + count);
		return count;
	}

	public static void main(String[] args) {
		LinkedListInsDel a = LinkedListInsDel.LinkedListCreate();

		LinkedListLoopDetectionAndRemoval ci = new LinkedListLoopDetectionAndRemoval();
		a.disPlay(a.first);

		System.out.println("\n\nMake list circular at position=" + 3);
		ci.makeCircular(a.first);

		System.out.println("\ncheck list circular found at node");
		ci.checkCircular(a.first);

		// System.out.println("\nLength of loop");
		int count=ci.lengthOfLoop();

		//System.out.println("\nFound starting node of Loop");
		//ci.findLoopStartingNode_checkOneByOne(a.first);

		
		//System.out.println("\nFound starting node of Loop by length of loop");
	//	ci.findLoopStartingNode_byFindingLengthOfLoop(a.first,count);

		
		System.out.println("\nFound starting node of Loop with slow and fast pointer at same speed");
		ci.findLoopStartingNode_byMeetOfFastAndSlowPointerWithSameSpeed(a.first);

		
		System.out.println("\nOriginal list after loop removal");
		a.disPlay(a.first);

		

	}

	/*
	 * Floyd’s Cycle detection algorithm terminates when fast and slow pointers
	 * meet at a common point. We also know that this common point is one of the
	 * loop nodes (2 or 3 or 4 or 5 in the above diagram). We store the address
	 * of this in a pointer variable say ptr2. Then we start from the head of
	 * the Linked List and check for nodes one by one if they are reachable from
	 * ptr2. When we find a node that is reachable, we know that this node is
	 * the starting node of the loop in Linked List and we can get pointer to
	 * the previous of this node.
	 */
	void findLoopStartingNode_checkOneByOne(Link current) {
		while (current != null) {
			Link currentLoop = loopFoundAtNode.getNext();
			Link pre = currentLoop;
			while (currentLoop != loopFoundAtNode) {
				if (current == currentLoop) {
					System.out.println(current.getData());
					pre.setNext(null); // set previous to null for removal of
										// loop
					break;
				}
				pre = currentLoop;
				currentLoop = currentLoop.getNext();
			}
			if (current == currentLoop) {

				break;
			}

			current = current.getNext();

		}

	}

	
/*	Method 2 (Better Solution)
	This method is also dependent on Floyd’s Cycle detection algorithm.
	1) Detect Loop using Floyd’s Cycle detection algo and get the pointer to a loop node.
	2) Count the number of nodes in loop. Let the count be k.
	3) Fix one pointer to the head and another to kth node from head.
	4) Move both pointers at the same pace, they will meet at loop starting node.
	5) Get pointer to the last node of loop and make next of it as NULL.
	
	*/
	void findLoopStartingNode_byFindingLengthOfLoop(Link current,int count) {
		Link head=current;
		
		int k=0;
		Link pre=null;
		while(k!=count)
		{
			current=current.getNext();
			k++;
		}
		
		while(head!=current)
		{
			pre=current;
			head=head.getNext();
			current=current.getNext();
		}
		
		if(head==current)
		{
			pre.setNext(null);
		}
		
		//System.out.println("ssd"+head.getData());

	}
	
	
	/*
	 * Method 3 (Optimized Method 2: Without Counting Nodes in Loop)
We do not need to count number of nodes in Loop. After detecting the loop, if we start slow pointer from head and move both slow and fast pointers at same speed until fast don’t meet, they would meet at the beginning of linked list.

How does this work?
Let slow and fast meet at some point after Floyd’s Cycle finding algorithm. Below diagram shows the situation when cycle is found.
	 */
	
	void findLoopStartingNode_byMeetOfFastAndSlowPointerWithSameSpeed(Link current) {
		Link head=current;
		
		int k=0;
		Link pre=null;
		Link temp=loopFoundAtNode.getNext();
				
		while(current!=temp)
		{
			pre=temp;
			current=current.getNext();
			temp=temp.getNext();
		}
		
		if(current==temp)
		{
			pre.setNext(null);
		}
		
		//System.out.println("ssd"+head.getData());

	}
	
}
