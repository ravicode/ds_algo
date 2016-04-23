package Searching;

import java.util.Arrays;

/*You are given a sting. Find the character in that string which is not 
repeated and
which occur last in the sequence.
Eg.- aababaacdffgxc
Result � x*/

/*given a string return character whose count is 1 and position is right most�
		example :- aabccddefff so b and e count 1 :- so return e.*/

public class FindLastNotRepeatingCharacter {
	public static void main(String[] args) {
		String str="aababaacdffgxc";
		
		findLastNotRepeated(str);
	}
	
	static void findLastNotRepeated(String str)
	{
		char ch[] = str.toCharArray();

		int chInt[] = new int[125];

		for (int i = 0; i < ch.length; i++)
			chInt[ch[i]]++;

		int p = 0;
		for (int i = 0; i < ch.length; i++) {
			if (chInt[ch[i]] == 1) {
				p = i;

			}

		}
		System.out.println("last  not repeating chracter=" + ch[p]);
	}

}
