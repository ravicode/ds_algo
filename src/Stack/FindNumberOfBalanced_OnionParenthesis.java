package Stack;

import java.util.Stack;

/*Given a number n find the number of balanced parentheses 
 * expressions of that length.

Input: 2

Output: 1 which is (),

Input: 4

Output: 2 which are (()) and ()().

I gave a complex solution involving segment tree in which he 
pointed out the mistakes and then asked to write a code to check if a given expression is balanced or not.

*/


/*Given an expression consisting of opening and closing parentheses you need to find the 
 * number of onions present in it.
Onion is any structure of the form ()

() � onion of size 1

(()) � onion of size 2

((())) � onion of size 3

So suppose if input is (()()) so output will be 2 because there are only two onions present in it

Again Complete coding of the two functions was needed*/
public class FindNumberOfBalanced_OnionParenthesis {
	
	
	public static void main(String[] args) {
		
		String str="(()())";
		char ch[]=str.toCharArray();
		int k=0;
		Stack<Character> st=new Stack<Character>();
		for(int i=0;i<ch.length;i++)
		{
			if(ch[i]=='(')
				st.push(ch[i]);
			
			if(ch[i]==')')
			{
			char pair=	st.pop();
			
			if(pair=='(')
				k++;
			}
		}
		
		System.out.println("pairs="+k);
	}

}
