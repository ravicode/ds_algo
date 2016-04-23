

package Sorting;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
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
public class SortValueColorWithList {

	public static void main(String[] args) {
		
		List<ValueColor> sortList = new ArrayList<ValueColor>();

		ValueColor ss = new ValueColor(2, 3);
		sortList.add(ss);

		ss = new ValueColor(1, 4);
		sortList.add(ss);

		ss = new ValueColor(4, 10);
		sortList.add(ss);
		
		ss = new ValueColor(3, 2);
		sortList.add(ss);

		ss = new ValueColor(5, 5);
		sortList.add(ss);


		Collections.sort(sortList, cmp);
		for (ValueColor s : sortList) {
			System.out.println(s.getColor() + " " + s.getValue());
		}

	}
		

	
	private static Comparator<ValueColor> cmp = new Comparator<ValueColor>() {

		@Override
		public int compare(ValueColor o1, ValueColor o2) {
			if(o1.color>o2.color)
				return 1;
			if(o1.color<o2.color)
				return -1;
			return 0;
			
		}

	};

		
}

class ValueColor
{
	int value;
	int color;
	public int getValue() {
		return value;
	}
	public void setValue(int value) {
		this.value = value;
	}
	public int getColor() {
		return color;
	}
	public void setColor(int color) {
		this.color = color;
	}
	public ValueColor(int value,int color)
	{
		this.value=value;
		this.color=color;
		
	}
}