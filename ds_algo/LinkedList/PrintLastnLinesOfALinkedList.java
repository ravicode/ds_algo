package LinkedList;

///Print the last n lines of a file 
//(Hint : treat it like a linked list)

//use recursion
public class PrintLastnLinesOfALinkedList {

	static void findlast10Lines(String str) {
		
		int t = str.length();

		
		recurs(str,t);
	}

	static void recurs(String str,int t) {

		int k = 0;
		int c = 0;

		for (c = t - 1; c > 0; c--) {
			if (str.charAt(c) == '\n')
				k++;

			if (k == 10)
				break;

		}

		System.out.println(str.substring(c, t));

	}

	public static void main(String[] args) {
		String str = "str1\nstr2\nstr3\nstr4\nstr5\nstr6\nstr7\nstr8\nstr9"
				+ "\nstr10\nstr11\nstr12\nstr13\nstr14\nstr15\nstr16\nstr17"
				+ "\nstr18\nstr19\nstr20\nstr21\nstr22\nstr23\nstr24\nstr25";

		findlast10Lines(str);

	}

}
