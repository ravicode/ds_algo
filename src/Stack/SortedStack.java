package Stack;

import java.util.Stack;

/*
 Given a stack output a sorted stack.(hint use recursion).*/

//http://www.geeksforgeeks.org/sort-a-stack-using-recursion/
public class SortedStack {

	Stack<Integer> st1 = new Stack<Integer>();
	Stack<Integer> st2 = new Stack<Integer>();

	public void add(int a) {
		if (st1.isEmpty())
			st1.push(a);
		else {
			if (a < st1.peek()) {
				while (!st1.isEmpty() && a < st1.peek()) {
					st2.push(st1.pop());
				}
				st1.push(a);

				while (!st2.isEmpty()) {
					st1.push(st2.pop());
				}
			} else
				st1.push(a);

		}

	}

	public static void main(String[] args) {
		SortedStack so = new SortedStack();

		so.add(2);
		so.add(1);
		so.add(4);
		so.add(6);
		so.add(9);
		so.add(0);

		// System.out.println(so.st1.size());
		for (int i : so.st1) {
			System.out.println(i);
		}

	}
}
