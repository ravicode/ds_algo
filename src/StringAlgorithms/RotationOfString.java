package StringAlgorithms;

import java.util.AbstractQueue;
import java.util.LinkedList;
import java.util.concurrent.ArrayBlockingQueue;

//Write a program to print out all rotations of a string typed in. for eg. if the input    
//is �space� the output should be : space, paces, acesp, cespa, espac

public class RotationOfString {

	static void combinations(String str) {

		int len = str.length();

		String newString = "";

		for (int i = 0; i < len; i++) {
			newString = str.substring(i) + str.substring(0, i);

			System.out.println(newString);
		}

	}

	static String combinations1(String str, int count) {
		if (count < 1)
			return null;

		System.out.println(str);
		count--;

		return combinations1(str.substring(1) + str.substring(0, 1), count);

	}

	public static void main(String[] args) {

		combinations("space");
		System.out.println();
		combinations1("space", "space".length());

	}

}
