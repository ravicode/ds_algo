package Stack;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

//mycodeschool youtube videos
public class InfixToPostFixConversion {

	public static void main(String[] args) {
		String expression = "A+B*C-D*E";
		char infix[] = expression.toCharArray();
		char postfix[]=infixToPostFixConversion(infix);
		System.out.println(Arrays.toString(postfix));
	}

	public static char[] infixToPostFixConversion(char infix[]) {
		Stack<Character> st = new Stack<Character>();

		char postfix[] = new char[infix.length];
		Map<Character, Integer> mp = new HashMap<Character, Integer>();
		mp.put('+', 1);
		mp.put('-', 1);
		mp.put('*', 2);
		mp.put('/', 2);
		int i = 0;
		for (char ch : infix) {
			if (mp.get(ch) == null) {
				postfix[i++] = ch;
			} else {
				if (st.isEmpty())
					st.push(ch);
				else {
					while (!st.isEmpty() && mp.get(ch) <= mp.get(st.peek())) {
						postfix[i++] = st.pop();

					}

					st.push(ch);

				}
			}
		}

		while (!st.isEmpty()) {
			postfix[i++] = st.pop();

		}
		return postfix;
		

	}
}
