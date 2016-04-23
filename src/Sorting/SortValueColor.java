package Sorting;


import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
/* Q-1
 value color 
 1	4
 2	3
 3	2
 4	10
 5	5
 */
// sort color without disturbing relative value 
//
import java.util.TreeMap;

/*  
 Q-2
 value color 
 2	3
 1	4
 4	10
 3	2
 5	5
 */

//sort color without disturbing relative value  and then sort on value
public class SortValueColor implements Comparable<Integer> {

	public static void main(String[] args) {

		Map<Integer, Integer> hMap = new LinkedHashMap<Integer,Integer>();

		hMap.put(1, 12);
		hMap.put(2, 18);
		hMap.put(4, 7);
		hMap.put(3, 5);
		System.out.println("original map=" + hMap);

		Map<Integer,Integer> p = new TreeMap<Integer,Integer>(hMap);
		System.out.println("sort on value=" + p);

		Set<Integer> st = hMap.keySet();
		p = new LinkedHashMap<Integer,Integer>();
		for (int a : st)
			p.put(hMap.get(a), a);

		Map<Integer, Integer> p1 = new TreeMap<Integer,Integer>(p);
		st = p1.keySet();
		p = new LinkedHashMap<Integer,Integer>();
		for (int a : st)
			p.put(p1.get(a), a);

		System.out.println("sort on  color=" + p);

	}

	@Override
	public int compareTo(Integer o) {
		// TODO Auto-generated method stub

		return 0;
		// return 0;
	}

}
