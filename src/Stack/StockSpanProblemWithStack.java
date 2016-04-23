package Stack;

import java.util.Arrays;

import java.util.Stack;

//Question=Span= maximum number of consecutive prior days stock price was less than the current day or equal to current day

//two ways-  

//1) take i and j and j will move from i-1 to 0 and calculate when a[j]>a[i], then print(i-j)
//TC=o(n2)

//2 ) by using stacks as below:-  
//TC=o(n). we store index in stack and values below current maximum is of no use. so, we remove it .
// so, total iterations will be  only n time.
//https://www.youtube.com/watch?v=1Q94XEp1yfk
//https://www.youtube.com/watch?v=g1USSZVWDsY&index=2&list=PLBF3763AF2E1C572F ( last of video)

public class StockSpanProblemWithStack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int stockprice[] = { 100, 60, 70, 65, 110, 120 };

		int span[] = new int[stockprice.length];

		Stack<Integer> st = new Stack<Integer>();

		st.push(0);
		span[0] = 1;

		for (int i = 1; i < stockprice.length; i++) {

			while (!st.isEmpty() && stockprice[st.peek()] < stockprice[i]) {
				st.pop();
			}
			if (st.isEmpty()) {

				span[i] = i + 1;
			} else {
				span[i] = i - st.peek(); // stack stores index
				st.push(i);
			}

		}

		System.out.println(Arrays.toString(span));
	}

}
