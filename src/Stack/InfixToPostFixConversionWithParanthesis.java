package Stack;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

//mycodeschool youtube videos
public class InfixToPostFixConversionWithParanthesis {

	public static void main(String[] args) {
		String expression = "((A+B)*C-D)*E";
		char infix[] = expression.toCharArray();
		infixToPostFixConversion(infix);
	}

	static void infixToPostFixConversion(char infix[]) {
		Stack<Character> st = new Stack<Character>();

		char postfix[] = new char[infix.length];
		Map<Character, Integer> mp = new HashMap<Character, Integer>();
		mp.put('+', 1);
		mp.put('-', 1);
		mp.put('*', 2);
		mp.put('/', 2);
		int i = 0;
		for (char ch : infix) {
			
			 if (mp.get(ch) == null && ch!='(' && ch!=')') {  //for operand
				postfix[i++] = ch;
			} else if((mp.get(ch)!= null)){   //for operator
				if (st.isEmpty())
					st.push(ch);
				else {
					while (!st.isEmpty() && st.peek()!='(' && mp.get(ch) <= mp.get(st.peek())) {
						postfix[i++] = st.pop();

					}

					st.push(ch);

				}
			}
			else if (ch == '(') {  // for paranthesis
					st.push(ch);
				} else
					if (ch == ')') {  // for paranthesis
						while (!st.isEmpty() && st.peek()!='(' ) {
							postfix[i++] = st.pop();
							
						}
						st.pop();
					}
				
		}

		while (!st.isEmpty()) {
			postfix[i++] = st.pop();

		}
		System.out.println(Arrays.toString(postfix));

	}
}
