package StringAlgorithms;

/*Given a regular expression, and a string, validate the string against the regular
 expression
 e.x.
 Regular expression : ab*bbc*c
 Pattern : abbbc VALID
 Pattern : abc NOT VALID 
 */
public class ValidateStringWithPattern {

	public static void main(String[] args) {

		char ch1[] = "ab*bbc*c".toCharArray();
		char ch2[] = "abc".toCharArray();
		char ch3[] = "abkbbcppc".toCharArray();
		;

		if (checkRegular(ch1, ch3)) {
			System.out.println("match");
		} else {
			System.out.println("dnt match");
		}
	}

	static boolean checkRegular(char ch1[], char ch2[]) {
		int len = ch1.length;
		int i = 0;
		int y = 0;

		while (y != len) {

			if (ch1[i] == '*' && y<ch2.length-1)
			{
				i++;
				y++;
			}
			else			if (ch1[i] == ch2[y] ) {
				i++;
				y++;

			} else {

				return false;
			}

		}
		return true;
	}
}
