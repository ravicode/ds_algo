package Stack;

import java.util.Stack;

//tushaRoy video youtube  

// o(n)

public class AreaOfAHistogram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int barHeights[] = { 2, 1, 2 };

		Stack<Integer> stIndex = new Stack<Integer>();

		int finalSize = 0;
		int area = 0;
		int i = 0;
		for (i = 0; i < barHeights.length;) {
			if (stIndex.isEmpty()
					|| barHeights[stIndex.peek()] <= barHeights[i]) {
			
				stIndex.push(i++);

			} else

			{
				int top = stIndex.pop();
				if (stIndex.isEmpty()) {
					area = barHeights[top] * i;
				} else
					area = barHeights[top] * (i - stIndex.peek() - 1);
				if (area > finalSize)
					finalSize = area;
			}

		}
		while (!stIndex.isEmpty()) {

			int top = stIndex.pop();
			if (stIndex.isEmpty()) {
				area = barHeights[top] * i;
			} else
				area = barHeights[top] * (i - stIndex.peek() - 1);
			if (area > finalSize)
				finalSize = area;

		}
		System.out.println(finalSize);
	}

}
