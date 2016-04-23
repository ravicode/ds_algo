package StringAlgorithms;
import java.util.Arrays;

//baADfc



public class findmissingCharacter {

	public static void main(String[] args) {
		int p[] = new int[125];
		String str = "uvwxz";
		
		str = str.toLowerCase();
		char ch[] = str.toCharArray();
		boolean flag = false;
		int start = 0;
		for (int i = 0; i < ch.length; i++) {
			p[ch[i]] = 1;

			if (p[ch[i]] == 1 && flag == false) {
				flag = true;
				start = ch[i];
			}

		}
		flag = false;
		for (int i = start; i < start + ch.length; i++) {
			if (p[i] == 0 && flag == false) {
				System.out.println((char) i);
				flag = true;
			}
		}

		// System.out.println(Arrays.toString(p));
	}
}
