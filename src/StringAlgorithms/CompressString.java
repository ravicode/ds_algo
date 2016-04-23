package StringAlgorithms;

import java.util.Arrays;

/*Write a method to compress a given string “aabbbccc�? to “a2b3c3″ . 
 It should be an inplace compression, no extra space to be used.*/

//can be seen as print frequency of each of the character
//o(n)
public class CompressString {

	public static void main(String[] args) {
		String str = "aabbbcccgtttuuxxxxxaaapp";
		char ch[] = str.toCharArray();
	//	char ch1[] = new char[20];
		//int top = -1;
		int top1 = -1;
		int k = 1;

		for (int i = 0; i < str.length() - 1; i++) {
			if (ch[i] == ch[i + 1]) {
				k++;

			}
			if (ch[i] != ch[i + 1]) {

				/*ch1[++top] = ch[i];

			

				ch1[++top] = (char) ('0' + k);*/
				
				ch[++top1] = ch[i];
				ch[++top1] = (char) ('0' + k);
				
				k = 1;
			
			}

			if (i == str.length() - 2) {
				//ch1[++top] = ch[i + 1];

			
			//	ch1[++top] = (char) ('0' + k);
				
				
				ch[++top1] = ch[i];
				ch[++top1] = (char) ('0' + k);

			}

		}

		/*for (int i1 = 0; i1 <= top; i1++) {
		
				System.out.print(ch1[i1] + ",");
				
		}*/
System.out.println();
		for (int i1 = 0; i1 <= top1; i1++) {
			
			System.out.print(ch[i1]);
			
	}
		
	}

}
