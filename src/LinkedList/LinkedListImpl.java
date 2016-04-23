package LinkedList;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Scanner;


class Link1
{
	Link1 next;
	int data;
	
	Link1(int data)
	{
		this.data=data;
		
	}
}


class LinkedList
{
	int k=0;
	HashMap<Integer, Link1> ht=new HashMap<Integer, Link1>();
	Link1 current=null,first=null;
	
	public void insert(int data) {
		
		Link1 current_new=new Link1(data);
		if(first==null)
		{
			first=current_new;
			ht.put(++k,current_new);
		}
		else
		{
			current=first;
		while(current.next!=null)
		{
			current=current.next;
		}
			 current.next=current_new;
			 ht.put(++k,current_new);
		}
		
	}
	
	
	public void display()
	{
		Link1 current=first;
		while(current!=null)
		{
			System.out.println(current.data);
			current=current.next;
		}
	}
	
	public void displayPosition(int pos)
	{
		Link1 current=first;
		int i=1;
		while(current!=null)
		{
			
			if(i==pos)
			{
			System.out.println(current.data);
			break;
			}
			current=current.next;
			i++;
		}
	}
	
	
	public void displayHastable(int pos)
	{
		System.out.println((ht.get(pos).data));
	}
	
	public void connect(LinkedList l1)
	{
		LinkedList l=this;
		//l.display();
		
		Link1 current=l.first;
		while(current!=null)
		{
			//System.out.println(current.data);
			current=current.next;
			if(current.next==null)
			{
				current.next=l1.first;
				break;
			}
		}
		
		//current=l1.first;
		
		//System.out.println(l1.first.data);
		l.display();
	}
}

public class LinkedListImpl {
	
	
	
	
	public static void main(String[] args) {
		LinkedList l=new LinkedList();
		l.insert(5);
		l.insert(10);
		l.insert(15);
		//l.display();
		
//		Scanner in=new Scanner(System.in);
//		int pos=in.nextInt();
//		
//		l.displayPosition(pos);
		//l.displayHastable(2);
		
		
		LinkedList l1=new LinkedList();
		l1.insert(3);
		l1.insert(10);
		l1.insert(15);
		//l.display();
		
		l.connect(l1);
		//l.display();

		
	}

}
