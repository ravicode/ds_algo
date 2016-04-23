package Searching;

/*
 Code : Find the second non-repeating character in a string.*/

public class FindSecondNonRepeating {

	public static void main(String[] args) {
		String st = "aabxxcdefg";

		char ch[] = st.toCharArray();

		boolean flag = false;
		int c[] = new int[256];

		for (int i = 0; i < ch.length; i++)
			c[ch[i]]++;

		for (int i = 0; i < ch.length; i++) {
			if (c[ch[i]] == 1 && flag == true) {
				System.out.println(ch[i]);
				flag = true;
				break;
			}

			if (c[ch[i]] == 1 && flag == false) {
			
				flag = true;
				continue;
			}

			
		}

	}

}
