package Heap;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;


public class Testt_queue_with_comparator {
// by deafauly- queue remval is in ascending order
	public static void main(String[] args) {
		
		 
		Queue<Integer> q=new PriorityQueue<Integer>(6,myCom);
		q.add(12);
		q.add(174);
		q.add(122);
		q.add(154);
		q.add(13);
		
		System.out.println(q.peek()+"\n\n");
		
		/*System.out.println(q.remove()+"\n\n");
		System.out.println(q.remove()+"\n\n");

		System.out.println(q.remove()+"\n\n");

		System.out.println(q.remove()+"\n\n");

		System.out.println(q.remove()+"\n\n");
*/


		for(int i:q)
			System.out.println(i);
/*Deque<Integer> aa=new ArrayDeque<Integer>();
aa.add(122);
aa.add(154);
aa.add(13);*/

	}
		

	
	public static Comparator<Integer>  myCom= new Comparator<Integer>(){
		@Override
		public int compare(Integer o1, Integer o2) {
			// TODO Auto-generated method stub
			if(o1<o2)
				return 1;
			else if(o1>o2)
				return -1;
			
				return 0;
		}
	};

}
