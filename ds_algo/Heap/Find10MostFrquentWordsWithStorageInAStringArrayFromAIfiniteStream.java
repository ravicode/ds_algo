package Heap;

import java.util.Arrays;
import java.util.HashMap;

//You have a file with million words in it. 
//Find most frequent 10 word in that file.
//Note:- that you can store all word in memory.
//(Note : Min-Heap + List )

//t.c- klogn

// Similar Question-  * Given a file with millions of words, need to find top K words on the basis of occurrence.


public class Find10MostFrquentWordsWithStorageInAStringArrayFromAIfiniteStream {

	static HashMap<String, Integer> mp = new HashMap<String, Integer>();

	public static void main(String[] args) {
	//	mp.put("AA", 55);  -- when it will be given, then E will go
		mp.put("A", 50);
		mp.put("B", 24);
		mp.put("C", 25);
		mp.put("D", 26);
		mp.put("E", 27);
		mp.put("F", 28);
		mp.put("G", 29);
		mp.put("H", 30);
		mp.put("I", 31);
		mp.put("J", 36);

		mp.put("K", 40);
		// mp.put("L",20);
		mp.put("L", 33);

		man();

	}

	static void makeHeap(String arr[], int i) { // logn
		int left = 2 * i + 1;
		int right = 2 * i + 2;
		int smallest;
		if ((left < arr.length) && (mp.get(arr[left]) < mp.get(arr[i]))) {
			smallest = left;
		} else
			smallest = i;

		if ((right < arr.length) && (mp.get(arr[right]) < mp.get(arr[smallest]))) {
			smallest = right;
		}

		if (smallest != i) {
			swap(arr, smallest, i);
			// System.out.println(Arrays.toString(arr));
			makeHeap(arr, smallest);
		}

	}

	static void swap(String arr[], int smallest, int i) {
		String t = arr[smallest];
		arr[smallest] = arr[i];
		arr[i] = t;
	}

	public static void man() {
		// int[] arr = { 4, 1, 3, 2, 16, 9, 10, 14, 8, 7 };

		String st[] = new String[10];
		String st1[] = new String[mp.size() - 10];
		int top = -1;
		int top2 = -1;
		for (String a : mp.keySet()) {
			if (top < 9)
				st[++top] = a;
			else
				st1[++top2] = a;
		}

		int len = 10;

		for (int i = (len - 1) / 2; i >= 0; i--) {

			makeHeap(st, i);
		}

		// System.out.println(Arrays.toString(st));

		for (int j = 0; j < st1.length; j++) {

			if (mp.get(st[0]) < mp.get(st1[j]))
				st[0] = st1[j];

			makeHeap(st, 0); // logn // so total tc= nlogn

		}

		System.out.println(Arrays.toString(st));

	}

}
