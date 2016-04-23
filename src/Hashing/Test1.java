package Hashing;


import java.util.Hashtable;

import java.util.HashMap;


public class Test1
{
	public static void main(String[] args) {
	/*	Hashtable<String, String> ht=new Hashtable<String, String>();
		
		
		
		ht.put(null, null);
		ht.put("ra", null);*/
		
		try
		{
		HashMap<String, String> ht=new HashMap<String, String>();
		
		//HashMap<String, String> ht=new HashMap<String, String>();
		
		ht.put("dd", null);
		ht.put(null, "abcd");
		ht.put("ra", "fff");
		
		System.out.println(ht.entrySet() + ht.get(null));
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
}