

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class FindRangeEachArrayContainingAtleats1Integer {

	public static void main(String[] args) {

		int a[] = { 1, 2, 3, 5 };
		int b[] = { 3, 5, 6, 7 };
		int c[] = { 2, 8, 9, 11 };

		Set<Integer> se = new HashSet<Integer>();

		for (int i = 0; i < a.length; i++) {
			se.add(a[i]);
		}
		for (int i = 0; i < b.length; i++) {
			se.add(b[i]);
		}
		for (int i = 0; i < c.length; i++) {
			se.add(c[i]);
		}
		int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;
		for (int a1 : se) {

			if (a1 > max)
				max = a1;

			if (a1 < min)
				min = a1;

		}

		System.out.println("Range is={ " + min + ",.....," + max + " } ");
	}

}
