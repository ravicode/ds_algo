package Basics_Java_Classes_Syntax;
import java.util.ArrayDeque;
import java.util.Comparator;
import java.util.Deque;
import java.util.PriorityQueue;
import java.util.Queue;


public class testt {
	
	public static void main(String[] args) {
		
		 
		Queue<Integer> q=new PriorityQueue<Integer>(5,myCom);
		q.add(12);
		q.add(174);
		q.add(122);
		q.add(154);
		q.add(13);

		System.out.println(q.peek()+"\n\n");
		
		for(int i:q)
			System.out.println(i);
/*Deque<Integer> aa=new ArrayDeque<Integer>();
aa.add(122);
aa.add(154);
aa.add(13);*/

	}
		

	//anonymous inner class
	public static Comparator<Integer>  myCom= new Comparator<Integer>(){
		@Override
		public int compare(Integer o1, Integer o2) {
			// TODO Auto-generated method stub
			if(o1>o2)
				return -1;
			else if(o1<o2)
				return 1;
			
				return 0;
		}
	};

}
