package Stack;


public class ReversePolishNotation {

	int size = 5;
	int top = -1;

	int stack[];

	ReversePolishNotation() {
		stack = new int[5];

	}

	void display() {
		//for (int i = 0; i <= top; i++)
			//System.out.println(stack[i]);
		System.out.println(stack[0]);
	}

	public static void main(String[] args) {
		String arr[] = { "2", "1", "+", "7", "*" };
		ReversePolishNotation rr = new ReversePolishNotation();

		for (int i = 0; i < arr.length; i++) {
			if (arr[i].equals("+")) {

				int a = rr.pop();
				int b = rr.pop();
				int c = a + b;

				rr.push(c);
				continue;
			}
			if (arr[i].equals("*")) {
				int a = rr.pop();
				int b = rr.pop();
				int c = a * b;
				rr.push(c);
				continue;
			}
			rr.push(Integer.parseInt(arr[i]));

		}

		rr.display();

	}

	void push(int a) {
		stack[++top] = a;

	}

	int pop() {
		return stack[top--];
	}
}
