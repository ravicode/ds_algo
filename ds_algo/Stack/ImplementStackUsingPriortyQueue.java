package Stack;

import java.util.PriorityQueue;
import java.util.Queue;

public class ImplementStackUsingPriortyQueue {
	Queue<Integer> pq1 = new PriorityQueue<Integer>();
	Queue<Integer> pq2 = new PriorityQueue<Integer>();

	void push(int ele) {

		pq1.add(ele);
		
	}

	int pop() {
		while (pq1.size() != 1)
			pq2.add(pq1.poll());
		int ele = pq1.poll();

		while (!pq2.isEmpty())
			pq1.add(pq2.poll());
		return ele;
	}

	public static void main(String[] args) {

		ImplementStackUsingPriortyQueue ip = new ImplementStackUsingPriortyQueue();
		ip.push(12);
		ip.push(13);
		ip.push(14);

		int ele = ip.pop();
		System.out.println(ele);

		ele = ip.pop();
		System.out.println(ele);

		ip.push(19);
		ele = ip.pop();
		System.out.println(ele);

		// System.out.println(pq.poll());

		/*
		 * Stack<Integer> st=new Stack<Integer>(); st.push(12); st.push(13);
		 * System.out.println(st.pop());
		 */
	}

}
