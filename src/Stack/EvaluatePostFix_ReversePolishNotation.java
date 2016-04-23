package Stack;
/*
Test cases :
	 a) 1+2*3 will be evaluated to 9.
	 b) 4-2+6*3 will be evaluated to 20.
	 c) 1++2 will be evaluated to -1(INVALID).
	 Also, in the string spaces can occur. 
	 For that case we need to ignore the spaces. Like :- 1*2 -1 is equals to 1.
	 */
import java.util.Arrays;
import java.util.Stack;

//mycodeschool youtube videos
public class EvaluatePostFix_ReversePolishNotation {

	public static void main(String[] args) {
		String expression = "2*3+5*4-9";
		char infix[] = expression.toCharArray();
		char postfix[] = InfixToPostFixConversion
				.infixToPostFixConversion(infix);
		System.out.println(Arrays.toString(postfix));
		int sum = evaluate(postfix);
		System.out.println("Evaluation=" + sum);
	}

	static int evaluate(char postfix[]) {
		Stack<Integer> st = new Stack<Integer>();
		for (char ch : postfix) {
			int c = 0;
			if (ch == '*' || ch == '+' || ch == '-') {
				int a1 = st.pop();
				int a2 = st.pop();
				if (ch == '*')
					c = a1 * a2;
				if (ch == '+')
					c = a1 + a2;
				if (ch == '-')
					c = Math.abs(a1 - a2);
				st.push(c);
			} else
				st.push(Integer.parseInt("0" + ch));
		}
		return st.pop();
	}
}
