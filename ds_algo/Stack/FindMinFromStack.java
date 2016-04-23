package Stack;


import java.util.Stack;

public class FindMinFromStack {
	
	Stack<Integer> all=new Stack<Integer>();
	Stack<Integer> min=new Stack<Integer>();
	
	
	int getMinimum()
	{
		/*while(all.peek()!=min.peek())
		{
			all.pop();
		}
		*/
		/*if(all.peek()==min.peek())
		{
			all.pop();
		}*/
		int ele=0;
		if (min.empty()) {
			return 0;
			} else {
				ele = min.pop();
			//return true;
			}

		
//		System.out.println(all);
//		System.out.println(min);
		return ele;
			
	}
	
	
	void pushElements(int ele)
	{
		if(min.isEmpty())
			min.push(ele);
		else
		{
		if(min.peek()>ele)
			min.push(ele);
		
		}
		
		all.add(ele);
		
	}
	
	public static void main(String[] args) {
		
		FindMinFromStack fm= new FindMinFromStack();
		
	fm.pushElements(3);
	fm.pushElements(4);
	fm.pushElements(2);
	fm.pushElements(5);
	fm.pushElements(7);
	fm.pushElements(1);
	fm.pushElements(6);
	
	System.out.println(fm.all);
	System.out.println(fm.min);
	
	
	System.out.println(fm.getMinimum());
	System.out.println(fm.getMinimum());
	System.out.println(fm.getMinimum());
	fm.pushElements(1);
	System.out.println(fm.getMinimum());
	/*System.out.println(fm.getMinimum());*/
		
	}
	

}
