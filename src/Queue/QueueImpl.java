package Queue;



import java.util.Arrays;

import Queue.QueueImpl;

public class QueueImpl {
	
	private int size;
	private int[] stackArr;
	static private int front;
	static private int rear;


	public QueueImpl(int size) {
		this.size = size;
		stackArr = new int[size];
		front = -1;
		rear = -1;

	}

	boolean isEmpty() {
		if (front == -1 && rear == -1) {

			return true;
		}
		return false;
	}

	public void enque(int element) throws Exception {

		if (rear == size-1) {
			throw new Exception("Queue OverFlow Error");
		} else if (isEmpty()) {
			front = rear = 0;
		} else {
			rear = (rear + 1);

		}
		stackArr[rear] = element;
	}

	public int deque() throws Exception {
		int ele = 0;
		if (isEmpty()) {
			throw new Exception("Queue Underflow Error");
		} else if (front == rear) {
			ele = stackArr[front];
			front = rear = -1;
		} else {
			front = (front + 1);
			ele = stackArr[front];
		}

		return ele;
	}

	public int front() throws Exception {

		if (front == -1) {
			throw new Exception("Queue is Empty");
		} else {
			System.out.print("Position of front pointer=" + front
					+ " and value is=");
			return stackArr[front];
		}
	}

	public int rear() throws Exception {

		if (rear == -1) {
			throw new Exception("Queue is Empty");
		} else {
			System.out.print("Position of rear pointer=" + rear
					+ " and value is=");
			return stackArr[rear];
		}

	}

	public static void main(String args[]) {
		QueueImpl st = new QueueImpl(5);

		try {
			st.enque(5);
			st.enque(10);
			st.enque(15);
			st.enque(25);
			st.enque(24);

			st.deque();
//
//			st.enque(26);

			/*
			 * st.deque(); st.deque(); st.deque(); st.deque(); st.deque();
			 */

			System.out.println(front + " " + rear);

		} catch (Exception e) {
			e.printStackTrace();
		}

		System.out.println(Arrays.toString(st.stackArr));
	}

}
