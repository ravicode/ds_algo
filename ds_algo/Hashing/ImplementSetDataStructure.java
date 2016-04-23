package Hashing;

import java.util.HashSet;
import java.util.Set;



// it is implemented as hashmap  with key same as value internally.
/*Implement set data structure with insert, delete, get functionality.*/

//do it again

public class ImplementSetDataStructure {
	
	int size;
	int arr[];
	int pos;
	public ImplementSetDataStructure(int size)
	{
		this.size=size;
		arr=new int[size];
		pos=-1;
	}
	
	public void insert(int data)
	{
		boolean insert = true;
	    for (int i = 0; i < size; i++) {
	      if (arr[i]==(data)) {
	      //  values[i].setValue(value);
	        insert = false;
	      }
	    }
	    if (insert) {
	    //  ensureCapa();
	    	arr[++pos] =data;
	    }

	}
	
	public void delete(int data)
	{
		
		for (int i = 0; i < size; i++) {
		      if (arr[i]==data) {
		    	  arr[i] = 0;
		        pos--;
		       
		      }
		}

	}
	
	
	/*public int get(int pos)
	{
		
		return arr;
	}
*/
	
	public static void main(String[] args) {
		ImplementSetDataStructure imp=new ImplementSetDataStructure(10);
		imp.insert(1);
		imp.insert(2);
		imp.insert(3);
		imp.delete(2);
		
	for(int i:imp.arr)
	{
		System.out.println(i);
		
	}
}
}
