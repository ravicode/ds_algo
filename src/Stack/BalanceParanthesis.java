package Stack;

import java.util.Stack;

public class BalanceParanthesis {

	public static void main(String[] args) {
		String str = "4*(5+6)+{(5+3)}";
		char ch[] = str.toCharArray();
		balParn(ch);
	}

	public static void balParn(char ch[]) {
		Stack<Character> st = new Stack<Character>();
		int i = 0;
		boolean flag = false;
		char p = 's';
		for (char c : ch) {
			flag = false;
			i++;
			if (c == '(' || c == '[' || c == '{')
				st.push(c);

			if (c == ')' || c == ']' || c == '}') {
				if (st.size() > 0) {
					if (c == ')') {
						p = st.pop();
						if (p == '(') {
							flag = true;

						}
					} else

					if (c == '}') {
						p = st.pop();
						if (p == '{') {
							flag = true;

						}
					} else

					if (c == ']') {
						p = st.pop();
						if (p == '[') {
							flag = true;

						}
					}

				}
			}
		}

		if (flag == false) {

			System.out.println("Not Balanced");

		} else
			System.out.println("Balanced");

	}

}
